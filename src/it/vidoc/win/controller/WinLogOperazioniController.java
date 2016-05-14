package it.vidoc.win.controller;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Image;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Window;

import it.vidoc.mybatis.javamodel.Account;
import it.vidoc.mybatis.javamodel.Elencodocumenti;
import it.vidoc.mybatis.javamodel.Listino;
import it.vidoc.mybatis.sqlquery.SqlAccount;
import it.vidoc.mybatis.sqlquery.SqlElencoDocumenti;
import it.vidoc.mybatis.sqlquery.SqlListino;
import it.vidoc.utils.Costants.BANCA_DATI;
import it.vidoc.utils.Costants.RICHIESTA;
import it.vidoc.utils.Costants.RISPOSTA;
import it.vidoc.utils.DatiSessione;

@SuppressWarnings("rawtypes")
public class WinLogOperazioniController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;;
	private DatiSessione datiSessione = null;

	private Listbox lbListaLogOper;
	private Panel pnlLogOperazioni;
	private Datebox dataDa, dataA;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");
		dataDa.setValue(new Date());
		dataA.setValue(new Date());
	}

	public void onCreate() {
		pnlLogOperazioni.setVisible(false);
		pnlLogOperazioni.setOpen(false);
		lbListaLogOper.getItems().clear();
	}

	public void onClick$btnOk(Event event) {
		if ("".equals(dataDa.getText()) || dataDa.getText() == null || "".equals(dataA.getText())
				|| dataA.getText() == null) {
			Clients.showNotification("Date obbligatorie", Clients.NOTIFICATION_TYPE_WARNING, null, null, 5000, true);
			return;
		}
		if (dataDa.getValue().after(new Date()) || dataA.getValue().after(new Date())) {
			Clients.showNotification("Data errata (non puo' contenere date future).", Clients.NOTIFICATION_TYPE_WARNING,
					null, null, 5000, true);
			return;
		}
		if (dataDa.getValue().after(dataA.getValue())) {
			Clients.showNotification("Dat incongruenti.", Clients.NOTIFICATION_TYPE_WARNING, null, null, 5000, true);
			return;
		}
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyyMMdd");

		Account account = new Account();
		account.setUsername(datiSessione.getUser().getUsername());
		List<Account> lstAccount = new SqlAccount().selectByExample(account, dt1.format(dataDa.getValue()),
				dt1.format(dataA.getValue()), "data, time");
		riempiLbLogOper(lstAccount);
	}

	public void onChange$dataDa(Event event) {
		onCreate();
	}

	public void onClick$dataDa(Event event) {
		onCreate();
	}

	public void onSelect$dataDa(Event event) {
		onCreate();
	}

	public void riempiLbLogOper(List<Account> lstAccount) {
		pnlLogOperazioni.setVisible(true);
		pnlLogOperazioni.setOpen(true);
		lbListaLogOper.getItems().clear();
		DecimalFormat decimalFormat = new DecimalFormat("#,###,###,##0.00");

		for (int i = 0; i < lstAccount.size(); i++) {
			Listino listino = new SqlListino().selectByPrimaryKey(lstAccount.get(i).getProgrrigalistino());
			Elencodocumenti elencodocumenti = new Elencodocumenti();
			elencodocumenti.setProgrrigaaccount(lstAccount.get(i).getProgrriga());
			List<Elencodocumenti> lstElencodocumenti = new SqlElencoDocumenti().selectByExampleWithBlobs(elencodocumenti, null);

			Listitem riga = new Listitem();
			Listcell cella = new Listcell();

			cella = new Listcell();
			cella.setLabel(lstAccount.get(i).getData().substring(6, 8) + // gg
					"/" + lstAccount.get(i).getData().substring(4, 6) + // mm
					"/" + lstAccount.get(i).getData().substring(0, 4) + // aaaa
					" " + lstAccount.get(i).getTime());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);
			
			cella = new Listcell();
			cella.setLabel("");
			if (lstElencodocumenti.size() > 0) {
				cella.setLabel(lstElencodocumenti.get(0).getRiferimenti());
				cella.setStyle("white-space:nowrap;overflow:hidden");
			}
			riga.appendChild(cella);
			
			cella = new Listcell();
			cella.setLabel(BANCA_DATI.valueOf(listino.getCodicebancadati()).value());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(RICHIESTA.valueOf(listino.getCodicerichiesta()).value());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(RISPOSTA.valueOf(listino.getCodicerisposta()).value());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(listino.getPosneg());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(listino.getOnldiff());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(decimalFormat.format(lstAccount.get(i).getPrezzo()));
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(decimalFormat.format(lstAccount.get(i).getDirittisegreteria()));
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			if (lstElencodocumenti.size() > 0) {
				cella = new Listcell();
				Image img = new Image();
				img.setSrc("/images/View_Document.png");
				img.setParent(cella);
				riga.appendChild(cella);

				cella = new Listcell();
				cella.setLabel("X");
				cella.setStyle("white-space:nowrap;overflow:hidden");
				riga.appendChild(cella);
			} else {
				cella = new Listcell();
				riga.appendChild(cella);
				cella = new Listcell();
				riga.appendChild(cella);
			}

			cella = new Listcell();
			cella.setLabel(lstAccount.get(i).getProgrriga().toString());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			lbListaLogOper.appendChild(riga);
		}
	}

	public void onSelect$lbListaLogOper(Event event) {
		Listcell listcell;
		listcell = (Listcell) lbListaLogOper.getSelectedItem().getChildren().get(11);
		if (!"".equals(listcell.getLabel()) && listcell.getLabel() != null) {
			listcell = (Listcell) lbListaLogOper.getSelectedItem().getChildren().get(11); // rigaAccount
			datiSessione.setRigaAccount(Integer.parseInt(listcell.getLabel()));
			session.setAttribute("datisessione", datiSessione);
			Window dialog = (Window) Executions.createComponents("/zulpages/GenericDocument.zul", null, null);
			dialog.doModal();

			lbListaLogOper.getSelectedItem().setSelected(false);
//			Executions.getCurrent().sendRedirect("/zulpages/GenericDocument.zul", "_blank");
			// Executions.getCurrent().sendRedirect("D:/temp/73016_precompilato_DBLLRT60A17F839C.pdf", "_blank");
		}
	}

}
