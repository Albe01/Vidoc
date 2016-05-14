package it.vidoc.win.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Doublebox;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;

import it.vidoc.mybatis.javamodel.Account;
import it.vidoc.mybatis.javamodel.Elencodocumenti;
import it.vidoc.mybatis.javamodel.Listino;
import it.vidoc.mybatis.javamodel.Matrixabilitazioni;
import it.vidoc.mybatis.sqlquery.SqlElencoDocumenti;
import it.vidoc.mybatis.sqlquery.SqlListino;
import it.vidoc.mybatis.sqlquery.SqlMatrixAbilitazioni;
import it.vidoc.utils.DatiSessione;
import it.vidoc.utils.Costants.BANCA_DATI;
import it.vidoc.utils.Costants.RICHIESTA;
import it.vidoc.utils.Costants.RISPOSTA;

@SuppressWarnings("rawtypes")
public class WinContrattiController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;;
	private DatiSessione datiSessione = null;
	
	private Listbox lbAbilContratto;
	
	private Label lblPrzListino04, lblPrzScontato04;
	private Doublebox dbbSconto04;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");
		
		riempiLbAbilContratto();
	}


	public void riempiLbAbilContratto() {
		lbAbilContratto.getItems().clear();
		DecimalFormat decimalFormat = new DecimalFormat("#,###,###,##0.00");
		Listino where = new Listino();
		List<Listino> lstListino = new ArrayList<Listino>();
		Matrixabilitazioni matrixabilitazioni = new Matrixabilitazioni();
		List<Matrixabilitazioni> lstAbil = new SqlMatrixAbilitazioni().selectByExample(matrixabilitazioni, "progrriga");
		
//		Listino where = new Listino();
//		where.setNumerolistino(datiSessione.getListinoUtentiAttivo());
//		where.setCodicelistino("UTENTE");
//		where.setOnldiff("O");
//		where.setPosneg("+");
//		List<Listino> lstListino = new SqlListino().selectByExample(where, null);
//		Map<String, Double> mapPrz = new HashMap<String, Double>();
//		for (int i = 0; i < lstListino.size(); i++) {
//			mapPrz.put(lstListino.get(i).getCodicerichiesta(), lstListino.get(i).getPrezzo());
//			
//		}

		for (int i = 0; i < lstAbil.size(); i++) {
			Listitem riga = new Listitem();
			Listcell cella = new Listcell();

			cella = new Listcell();
			cella.setLabel(BANCA_DATI.valueOf(lstAbil.get(i).getCodicebancadati()).value());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);
			
			cella = new Listcell();
			cella.setLabel("");
			where = new Listino();
			where.setNumerolistino(datiSessione.getListinoUtentiAttivo());
			where.setCodicelistino("UTENTE");
			where.setCodicebancadati(lstAbil.get(i).getCodicebancadati());
			where.setCodicerichiesta(lstAbil.get(i).getCodicerichiesta());
			where.setOnldiff("O");
			where.setPosneg("+");
			lstListino = new SqlListino().selectByExample(where, null);
			if (lstListino.size() > 0) {
				cella.setLabel(RICHIESTA.valueOf(lstAbil.get(i).getCodicerichiesta()).value());
				cella.setStyle("white-space:nowrap;overflow:hidden");
			}
			riga.appendChild(cella);
			
			cella = new Listcell();
			if (lstListino.size() > 0) {
				cella.setLabel(decimalFormat.format(lstListino.get(0).getPrezzo()));
				cella.setStyle("white-space:nowrap;overflow:hidden");
			}
			riga.appendChild(cella);

			cella = new Listcell();
			Doublebox db = new Doublebox();
			db.setValue(new Double(000.0000));
			cella.appendChild(db);
			riga.appendChild(cella);

			lbAbilContratto.appendChild(riga);
		}
	}

	
	
	public void onCreate() {
//		Listino where = new Listino();
//		where.setNumerolistino(datiSessione.getListinoUtentiAttivo());
//		where.setCodicelistino("UTENTE");
//		where.setOnldiff("O");
//		where.setPosneg("+");
//		List<Listino> lst = new SqlListino().selectByExample(where, null);
//		Map<String, Double> mapPrz = new HashMap<String, Double>();
//		for (int i = 0; i < lst.size(); i++) {
//			mapPrz.put(lst.get(i).getCodicerichiesta(), lst.get(i).getPrezzo());
//			
//		}
//		lblPrzListino04.setValue(String.format(Locale.ITALY, "%1$,.4f", mapPrz.get("AMLI01")));
//		dbbSconto04.setValue(new Double(10.9999));
		
	}
	
	   public void onChange$dbbSconto04(Event event) {
//		   Double sconto = dbbSconto04.getValue();
//		   if (sconto > 0) {
//			   Double przListino = Double.parseDouble(lblPrzListino04.getValue().replace(",", "."));
//			   Double przScontato = (przListino) - (przListino * sconto / 100);
//			   lblPrzScontato04.setValue(String.format(Locale.ITALY, "%1$,.4f", przScontato));
//		   }
	   }
 

}
