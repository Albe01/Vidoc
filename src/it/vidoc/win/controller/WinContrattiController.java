package it.vidoc.win.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Doublebox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Textbox;

import it.vidoc.mybatis.javamodel.Contratto;
import it.vidoc.mybatis.javamodel.Listino;
import it.vidoc.mybatis.javamodel.Matrixabilitazioni;
import it.vidoc.mybatis.sqlquery.SqlContratto;
import it.vidoc.mybatis.sqlquery.SqlListino;
import it.vidoc.mybatis.sqlquery.SqlMatrixAbilitazioni;
import it.vidoc.utils.Costants;
import it.vidoc.utils.Costants.BANCA_DATI;
import it.vidoc.utils.Costants.RICHIESTA;
import it.vidoc.utils.DatiSessione;

@SuppressWarnings("rawtypes")
public class WinContrattiController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;;
	private DatiSessione datiSessione = null;
	
	private String tipoOperazione;
	
	private Textbox txbContratto, txbNom, txbCF, txbTel, txbIndir, txbComune, txbProvincia, txbRif, txbEmail;
	private Datebox dataDa, dataA;
	private Listbox lbAbilContratto;
	private Combobox cmbContr, cmbTipoContr;
	
	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");
		riempiLbAbilContratto();
	}

	public void onCreate() {
        Contratto object = new Contratto();
		List<Contratto> lst = new SqlContratto().selectByExample(object, null);

		cmbContr.getItems().clear();
		Comboitem ci = new Comboitem();
		ci.setLabel("-----");
		cmbContr.appendChild(ci);
		for (int i = 0; i < lst.size(); i++) {
			ci = new Comboitem();
			ci.setLabel(lst.get(i).getCodcontratto() + " - " + lst.get(i).getNominativo());
			ci.setValue(lst.get(i).getCodcontratto());
			cmbContr.appendChild(ci);
		}
		cmbContr.setSelectedIndex(0);
		
		
		cmbTipoContr.getItems().clear();
		ci = new Comboitem();
		ci.setLabel("-----");
		cmbTipoContr.appendChild(ci);
		ci = new Comboitem();
		ci.setLabel("Prepagato");
		ci.setValue("P");
		cmbTipoContr.appendChild(ci);
		ci = new Comboitem();
		ci.setLabel("Consumo");
		ci.setValue("C");
		cmbTipoContr.appendChild(ci);
		cmbTipoContr.setSelectedIndex(0);

	}

	public void riempiDatiContratto(String codContratto) {
        Contratto object = new Contratto();
        object.setCodcontratto(codContratto);
		List<Contratto> lst = new SqlContratto().selectByExample(object, null);
		if (lst.size() > 0) {
			txbContratto.setValue(codContratto);
			if (getTipoOperazione().equalsIgnoreCase("DUP")) {
				txbContratto.setValue("");	
			}
			for (Comboitem item : cmbTipoContr.getItems()) {
		        if (lst.get(0).getTipocontratto().equalsIgnoreCase((String) (item).getValue())) {
		        	cmbTipoContr.setSelectedItem(item);
		            break;
		        }
		    }
			dataDa.setValue(Costants.parseDate(lst.get(0).getDatainiziovalidita(), "yyyyMMdd"));
			dataA.setValue(Costants.parseDate(lst.get(0).getDatafinevalidita(), "yyyyMMdd"));
			txbNom.setValue(lst.get(0).getNominativo());
			txbCF.setValue(lst.get(0).getCodicefiscale());
			txbTel.setValue(lst.get(0).getTelefono());
			txbIndir.setValue(lst.get(0).getIndirizzo());
			txbComune.setValue(lst.get(0).getComune());
			txbProvincia.setValue(lst.get(0).getProvincia());
			txbRif.setValue(lst.get(0).getRiferimento());
			txbEmail.setValue(lst.get(0).getEmail());
		}
	}
	
	
	public void riempiLbAbilContratto() {
		lbAbilContratto.getItems().clear();
		String bancaDati = "";
		Label lb;
		Double przScontato;
		Doublebox db;
		DecimalFormat decimalFormat = new DecimalFormat("#,#00.0000");
		Listino where = new Listino();
		List<Listino> lstListino = new ArrayList<Listino>();
		Matrixabilitazioni matrixabilitazioni = new Matrixabilitazioni();
		List<Matrixabilitazioni> lstAbil = new SqlMatrixAbilitazioni().selectByExample(matrixabilitazioni, "codicebancadati, codicerichiesta");
		
		for (int i = 0; i < lstAbil.size(); i++) {
			Listitem riga = new Listitem();
			Listcell cella = new Listcell();

			if (lstAbil.get(i).getCodicebancadati().equalsIgnoreCase(bancaDati)) {
				cella = new Listcell();
				cella.setLabel("");
				cella.setStyle("white-space:nowrap;overflow:hidden;");
				riga.appendChild(cella);
			} else {
				bancaDati = lstAbil.get(i).getCodicebancadati();
				cella = new Listcell();
				cella.setLabel(BANCA_DATI.valueOf(bancaDati).value());
				cella.setStyle("white-space:nowrap;overflow:hidden;font-weight:bold;");
				riga.appendChild(cella);
			}
			
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
				cella.setStyle("white-space:nowrap;overflow:hidden;");
			}
			riga.appendChild(cella);
			
// On-Line			
			// prezzo listino
			cella = new Listcell();
			if (lstListino.size() > 0 && lstListino.get(0).getPrezzo() > 0) {
				cella.setLabel(decimalFormat.format(lstListino.get(0).getPrezzo()));
			} else {
				cella.setLabel("");
			}
			cella.setStyle("white-space:nowrap;overflow:hidden;");
			riga.appendChild(cella);

			// sconto %
			cella = new Listcell();
			if (lstListino.size() > 0 && lstListino.get(0).getPrezzo() > 0) {
				db = new Doublebox();
				db.setFormat("#00.0000");
				db.setValue(new Double(000.0000));
				cella.appendChild(db);
				cella.setStyle("white-space:nowrap;overflow:hidden;");			
				riga.appendChild(cella);
			} else {
				cella.setLabel("");
				cella.setStyle("white-space:nowrap;overflow:hidden;");	
				cella.disableClientUpdate(true);
				riga.appendChild(cella);
			}
			
			// prezzo scontato
			cella = new Listcell();
			if (lstListino.size() > 0 && lstListino.get(0).getPrezzo() > 0) {
				przScontato = (lstListino.get(0).getPrezzo()) - (lstListino.get(0).getPrezzo() * new Double(000.0000) / 100);
				cella.setLabel(decimalFormat.format(przScontato));
				cella.setStyle("white-space:nowrap;overflow:hidden;");			
			} else {
				cella.setLabel("");
			}
			riga.appendChild(cella);
			

// Differita			
			// prezzo listino
			cella = new Listcell();
			where = new Listino();
			where.setNumerolistino(datiSessione.getListinoUtentiAttivo());
			where.setCodicelistino("UTENTE");
			where.setCodicebancadati(lstAbil.get(i).getCodicebancadati());
			where.setCodicerichiesta(lstAbil.get(i).getCodicerichiesta());
			where.setOnldiff("D");
			where.setPosneg("+");
			lstListino = new SqlListino().selectByExample(where, null);
			if (lstListino.size() > 0 && lstListino.get(0).getPrezzo() > 0) {
				cella.setLabel(decimalFormat.format(lstListino.get(0).getPrezzo()));
			} else {
				cella.setLabel("");
			}
			cella.setStyle("white-space:nowrap;overflow:hidden;");
			riga.appendChild(cella);

			// sconto %
			cella = new Listcell();
			if (lstListino.size() > 0 && lstListino.get(0).getPrezzo() > 0) {
				db = new Doublebox();
				db.setFormat("#,#00.0000");
				db.setValue(new Double(000.0000));
				cella.appendChild(db);
				cella.setStyle("white-space:nowrap;overflow:hidden;");			
				riga.appendChild(cella);
			} else {
				lb = new Label();
				cella.appendChild(lb);
				cella.setStyle("white-space:nowrap;overflow:hidden;");	
				cella.disableClientUpdate(true);
				riga.appendChild(cella);
			}
			
			// prezzo scontato
			cella = new Listcell();
			przScontato = new Double(000.0000);
			if (lstListino.size() > 0 && lstListino.get(0).getPrezzo() > 0) {
				przScontato = (lstListino.get(0).getPrezzo()) - (lstListino.get(0).getPrezzo() * new Double(000.0000) / 100);
				cella.setLabel(decimalFormat.format(przScontato));
				cella.setStyle("white-space:nowrap;overflow:hidden;");
			} else {
				cella.setLabel("");
			}
			riga.appendChild(cella);
			
//			cella = new Listcell();
//			Checkbox chb = new Checkbox();
//			chb.setChecked(true);
//			cella.appendChild(chb);
//			cella.setStyle("white-space:nowrap;overflow:hidden;");			
//			riga.appendChild(cella);
			
			lbAbilContratto.appendChild(riga);
		}
	}

	public void onClick$btnNewContr(Event event) {
		setTipoOperazione("INS");
		riempiLbAbilContratto();
	}

	public void onClick$btnCopiaContr(Event event) {
		setTipoOperazione("DUP");
		if ((cmbContr.getSelectedItem() == null) || (cmbContr.getSelectedItem().getLabel().startsWith("--"))) {
			Clients.showNotification("Selezionare un contratto", Clients.NOTIFICATION_TYPE_WARNING, null, null, 5000, true);
			return;
		}
		riempiDatiContratto(cmbContr.getSelectedItem().getValue().toString());
	}
	
	public void onClick$btnEditContr(Event event) {
		setTipoOperazione("UPD");
		if ((cmbContr.getSelectedItem() == null) || (cmbContr.getSelectedItem().getLabel().startsWith("--"))) {
			Clients.showNotification("Selezionare un contratto", Clients.NOTIFICATION_TYPE_WARNING, null, null, 5000, true);
			return;
		}
		riempiDatiContratto(cmbContr.getSelectedItem().getValue().toString());
	}

	public String getTipoOperazione() {
		return tipoOperazione;
	}

	public void setTipoOperazione(String tipoOperazione) {
		this.tipoOperazione = tipoOperazione;
	}

}
