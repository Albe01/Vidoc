package it.vidoc.win.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.EventQueue;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Window;

import it.vidoc.contabilizzazione.Contabilizza;
import it.vidoc.mybatis.javamodel.Anagrafiche;
import it.vidoc.mybatis.javamodel.Elencodocumenti;
import it.vidoc.mybatis.javamodel.Infcomuni;
import it.vidoc.mybatis.sqlquery.SqlAnagrafiche;
import it.vidoc.mybatis.sqlquery.SqlElencoDocumenti;
import it.vidoc.mybatis.sqlquery.SqlInfComuni;
import it.vidoc.report.GestioneReport;
import it.vidoc.utils.Costants;
import it.vidoc.utils.DatiSessione;
import it.vidoc.utils.LoadNewPage;
import it.vidoc.utils.ManageDbWithJDBC;

@SuppressWarnings("rawtypes")
public class WinAmListaController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;
	private DatiSessione datiSessione = null;
	private EventQueue eventQueue;
	private int listaSize = 7;

	private Integer totPagLis = 0;
	private Panel pnlAMLista;
	private Listbox lbListaAnag;
	private Intbox inbNpagLis;
	private Label lblFoo1Lis;
	private Label lblNumSogg;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");

		inbNpagLis.addEventListener(Events.ON_OK, new EventListener() {
			public void onEvent(Event iEvent) throws Exception {
				try {
					// Clients.showNotification("inbNpagLis=" +
					// inbNpagLis.getValue(), "warning", null, null, 0, true);
					onClick$btnGoPageLis(null);
				} catch (Exception e) {
				}
			}
		});

		int numPagLis = 1;
		try {
			numPagLis = datiSessione.getAMnumPagLis();
			if (numPagLis == 0) {
				numPagLis = 1;
			}
		} catch (Exception e) {
			numPagLis = 1;
		}
		riempiLbAnagra(numPagLis, datiSessione.getAMLstKanagra());
	}

	public void riempiLbAnagra(Integer pagina, List<Long> lstKanagra) {
		pnlAMLista.setOpen(true);
		lbListaAnag.getItems().clear();
		DecimalFormat decimalFormat = new DecimalFormat("#,###,###,##0.00");

		Integer iniLb = 0;
		Integer finLb = 0;
		if (pagina == 1) {
			iniLb = 0;
			finLb = listaSize;
		} else {
			iniLb = ((pagina - 1) * listaSize);
		}
		finLb = iniLb + listaSize;
		if (finLb > lstKanagra.size()) {
			finLb = lstKanagra.size();
		}

		for (int i = iniLb; i < finLb; i++) {
			// Anagrafiche anagrafiche = new
			// SqlAnagrafiche().getPKAnagrafiche(result.get(i));
			Anagrafiche anagrafiche = new SqlAnagrafiche().selectByPrimaryKey(lstKanagra.get(i));
			Listitem riga = new Listitem();
			Listcell cella = new Listcell();

			cella = new Listcell();
			cella.setLabel(anagrafiche.getNominativo());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(anagrafiche.getCodicefiscale());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(anagrafiche.getIndirizzoresidenza());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			// cella = new Listcell();
			// cella.setLabel(anagrafiche.getSiglaprovinciaresidenza());
			// riga.appendChild(cella);

			cella = new Listcell();
			Infcomuni infcomuni = new Infcomuni();
			infcomuni.setCodistat(anagrafiche.getCodistatprvres() + anagrafiche.getCodistatcomres());
			List<Infcomuni> lstCom = new SqlInfComuni().selectByExample(infcomuni, null);
			if (lstCom.size() > 0) {
				cella.setLabel(
						lstCom.get(0).getDenomcomune().trim() + " (" + anagrafiche.getSiglaprovinciaresidenza() + ")");
			}
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(anagrafiche.getDataulteff().substring(6, 8) + "/"
					+ anagrafiche.getDataulteff().substring(4, 6) + "/" + anagrafiche.getDataulteff().substring(0, 4));
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(String.valueOf(anagrafiche.getNumtoteff()));
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(String.valueOf(decimalFormat.format(anagrafiche.getImptoteff())));
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(String.valueOf(i + 1));
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(String.valueOf(anagrafiche.getKanagra()));
			riga.appendChild(cella);

			lbListaAnag.appendChild(riga);
		}

		inbNpagLis.setValue(pagina);
		totPagLis = 0;
		if ((lstKanagra.size() % listaSize) == 0) {
			totPagLis = lstKanagra.size() / listaSize;
		} else {
			totPagLis = (lstKanagra.size() / listaSize + 1);
		}
		if (totPagLis == 0) {
			totPagLis = 1;
		}

		lblFoo1Lis.setValue("di " + totPagLis);
		lblNumSogg.setValue("(N. soggetti trovati: " + lstKanagra.size() + ")");
	}

	public void onClick$btnIndietro(Event event) throws IOException {
		LoadNewPage.loadNewPage("/zulpages/AMricerca.zul");
	}

	public void onClick$btnGoPageLis(Event event) throws IOException {
		if (inbNpagLis.getValue() < 1) {
			inbNpagLis.setValue(1);
		}
		if (inbNpagLis.getValue() > totPagLis) {
			inbNpagLis.setValue(totPagLis);
		}
		riempiLbAnagra(inbNpagLis.getValue(), datiSessione.getAMLstKanagra());
	}

	public void onClick$btnPagPrecLis(Event event) {
		if ((inbNpagLis.getValue() - 1) < 1) {
			inbNpagLis.setValue(1);
		} else {
			inbNpagLis.setValue((inbNpagLis.getValue() - 1));
		}

		riempiLbAnagra(inbNpagLis.getValue(), datiSessione.getAMLstKanagra());

	}

	public void onClick$btnPagSuccLis(Event event) {
		if ((inbNpagLis.getValue() + 1) > totPagLis) {
			inbNpagLis.setValue(totPagLis);
		} else {
			inbNpagLis.setValue((inbNpagLis.getValue() + 1));
		}
		riempiLbAnagra(inbNpagLis.getValue(), datiSessione.getAMLstKanagra());
	}

	@SuppressWarnings("unchecked")
	public void onSelect$lbListaAnag(Event event) {
		Listcell listcell = (Listcell) lbListaAnag.getSelectedItem().getChildren().get(8);

		eventQueue = EventQueues.lookup("interactive", EventQueues.DESKTOP, true);
		eventQueue.subscribe(new EventListener() {
			public void onEvent(Event event) throws Exception {
				if (!"".equals(datiSessione.getPreventivoAccettato()) && datiSessione.getPreventivoAccettato() != null
						&& datiSessione.getPreventivoAccettato().equalsIgnoreCase("S")) {
					
					eventQueue.unsubscribe(this);
					
					Contabilizza account = new Contabilizza();
					Integer rigaAccount = account.registraAccountUtente();
					
					Map<String, Object> parametri = new HashMap<String, Object>();
					parametri.put("KANAGRA", datiSessione.getAMkanagraVis());
					try {
						GestioneReport rep = new GestioneReport();
						Map<String, Object> dati = rep.getReportParam("AMVisura", null, parametri);
						
						Elencodocumenti elencodocumenti = new Elencodocumenti();
						elencodocumenti.setProgrrigaaccount(rigaAccount);
						String rif = "";
						String tmpCel = ((Listcell) lbListaAnag.getSelectedItem().getChildren().get(0)).getLabel();
						if ( !"".equals(tmpCel) && tmpCel != null) {
							rif = rif + tmpCel;
						}
//						tmpCel =((Listcell) lbListaAnag.getSelectedItem().getChildren().get(1)).getLabel();
//						if ( !"".equals(tmpCel) && tmpCel != null) {
//							rif = rif + tmpCel;
//						}
						elencodocumenti.setRiferimenti(rif);
						elencodocumenti.setTipodocumento("pdf");
						new SqlElencoDocumenti().insertReturnID(elencodocumenti);
						Integer rigaElencoDocumenti = elencodocumenti.getProgrriga(); 
								
						elencodocumenti.setDocumento((byte[]) dati.get("documentByte"));
						new ManageDbWithJDBC().updateElencoDocumenti(elencodocumenti);
						
						datiSessione.setRigaElencoDocumenti(rigaElencoDocumenti);
						datiSessione.setRigaAccount(rigaAccount);
						session.setAttribute("datisessione", datiSessione);
					} catch (Exception e) {
						e.printStackTrace();
					}
					LoadNewPage.loadNewPage("/zulpages/AMvisura.zul");
				}
				try {
					// serve a riattivare EventListener
					lbListaAnag.getSelectedItem().setSelected(false);
				} catch (Exception e) {
				}
			}
		});

		datiSessione.setAMkanagraVis(Long.parseLong(listcell.getLabel()));
		datiSessione.setAMnumPagLis(inbNpagLis.getValue());
		datiSessione.setCodiceBancaDati(Costants.AMEDcodiceBancaDati);
		datiSessione.setCodiceRichiesta(Costants.AMEDcodiceRichiestaVisura);
		datiSessione.setCodiceRisposta(Costants.AMEDcodiceRispostaVisura);
		datiSessione.setOnlDiff(Costants.RequestOnLine);
		session.setAttribute("datisessione", datiSessione);
		Contabilizza account = new Contabilizza();
		if (account.calcolaPrezzoUtente() > 0) {
			datiSessione.setPrezzo(account.calcolaPrezzoUtente());
			session.setAttribute("datisessione", datiSessione);
			Window dialog = (Window) Executions.createComponents("/zulpages/Preventivo.zul", null, null);
			dialog.doModal();
		} else {
			LoadNewPage.loadNewPage("/zulpages/AMvisura.zul");
		}
	}

	public void onCreate() {
	}

}
