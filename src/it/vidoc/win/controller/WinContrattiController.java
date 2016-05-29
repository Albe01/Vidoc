package it.vidoc.win.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Doublebox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Groupbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Textbox;

import it.vidoc.mybatis.javamodel.Contratto;
import it.vidoc.mybatis.javamodel.Infcomuni;
import it.vidoc.mybatis.javamodel.Listino;
import it.vidoc.mybatis.javamodel.Matrixabilitazioni;
import it.vidoc.mybatis.sqlquery.SqlContratto;
import it.vidoc.mybatis.sqlquery.SqlInfComuni;
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
	SqlContratto sqlContratto = new SqlContratto();
	SqlInfComuni sqlInfComuni = new SqlInfComuni();
	SqlMatrixAbilitazioni sqlMatrixAbilitazioni = new SqlMatrixAbilitazioni();
	SqlListino sqlListino = new SqlListino();

	private String tipoOperazione;

	private Textbox txbContratto, txbNom, txbCF, txbTel, txbIndir, txbRif, txbEmail;
	private Datebox dataDa, dataA;
	private Listbox lbAbilContratto;
	private Combobox cmbContr, cmbTipoContr, cmbComune, cmbProvincia;
	private Groupbox grbContratto, grbAbilContratto;
	private Button btnSave, btnNext, btnPrev;
	private Grid gridContratto;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");
	}

	public void onCreate() {
		grbContratto.setVisible(false);
		grbAbilContratto.setVisible(false);
		btnPrev.setVisible(false);
		btnNext.setVisible(false);
		btnSave.setVisible(false);

		Contratto object = new Contratto();
		List<Contratto> lst = sqlContratto.selectByExample(object, "null");

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

		Infcomuni infcomuni = new Infcomuni();
		infcomuni.setCodicecomune("999");
		List<Infcomuni> lstPrv = sqlInfComuni.selectByExample(infcomuni, "denomcomune");

		cmbProvincia.getItems().clear();
		ci = new Comboitem();
		ci.setLabel("-----");
		cmbProvincia.appendChild(ci);
		for (int i = 0; i < lstPrv.size(); i++) {
			ci = new Comboitem();
			ci.setLabel(lstPrv.get(i).getDenomcomune());
			ci.setValue(lstPrv.get(i).getSiglaprovincia());
			cmbProvincia.appendChild(ci);
		}
		cmbProvincia.setSelectedIndex(0);

		cmbComune.getItems().clear();
		ci = new Comboitem();
		ci.setLabel("-----");
		cmbComune.appendChild(ci);
		cmbComune.setSelectedIndex(0);

		riempiLbAbilContratto(new Contratto());
	}

	public void riempiDatiContratto(Contratto contratto) {
		if (getTipoOperazione().equalsIgnoreCase("INS") || contratto == null) {
			txbContratto.setValue("");
			cmbTipoContr.setSelectedIndex(0);
			dataDa.setValue(new Date());
			dataA.setValue(null);
			txbNom.setValue("");
			txbCF.setValue("");
			txbTel.setValue("");
			txbIndir.setValue("");
			riempiCbProvincia();
			riempiCbComuni("XYZ");
			txbRif.setValue("");
			txbEmail.setValue("");
		} else {
			txbContratto.setValue(contratto.getCodcontratto());
			for (Comboitem item : cmbTipoContr.getItems()) {
				if (contratto.getTipocontratto().equalsIgnoreCase((String) (item).getValue())) {
					cmbTipoContr.setSelectedItem(item);
					break;
				}
			}
			dataDa.setValue(Costants.parseDate(contratto.getDatainiziovalidita(), "yyyyMMdd"));
			dataA.setValue(Costants.parseDate(contratto.getDatafinevalidita(), "yyyyMMdd"));
			txbNom.setValue(contratto.getNominativo());
			txbCF.setValue(contratto.getCodicefiscale());
			txbTel.setValue(contratto.getTelefono());
			txbIndir.setValue(contratto.getIndirizzo());

			riempiCbProvincia();
			for (Comboitem item : cmbProvincia.getItems()) {
				if (contratto.getProvincia().equalsIgnoreCase((String) (item).getValue())) {
					cmbProvincia.setSelectedItem(item);
					break;
				}
			}
			riempiCbComuni(contratto.getProvincia());
			for (Comboitem item : cmbComune.getItems()) {
				if (contratto.getComune().equalsIgnoreCase((String) (item).getValue())) {
					cmbComune.setSelectedItem(item);
					break;
				}
			}
			txbRif.setValue(contratto.getRiferimento());
			txbEmail.setValue(contratto.getEmail());
		}
	}

	public void riempiLbAbilContratto(Contratto contratto) {
		lbAbilContratto.getItems().clear();
		String bancaDati = "";
		Label lb;
		Double przScontato;
		Doublebox db;
		DecimalFormat decimalFormat = new DecimalFormat("#,#00.0000");
		Listino where = new Listino();
		List<Listino> lstListino = new ArrayList<Listino>();

		List<Matrixabilitazioni> lstAbil = sqlMatrixAbilitazioni.selectByExample(new Matrixabilitazioni(),
				"codicebancadati, codicerichiesta");
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
			lstListino = sqlListino.selectByExample(where, null);
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
				przScontato = (lstListino.get(0).getPrezzo())
						- (lstListino.get(0).getPrezzo() * new Double(000.0000) / 100);
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
			lstListino = sqlListino.selectByExample(where, null);
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
				przScontato = (lstListino.get(0).getPrezzo())
						- (lstListino.get(0).getPrezzo() * new Double(000.0000) / 100);
				cella.setLabel(decimalFormat.format(przScontato));
				cella.setStyle("white-space:nowrap;overflow:hidden;");
			} else {
				cella.setLabel("");
			}
			riga.appendChild(cella);

			// cella = new Listcell();
			// Checkbox chb = new Checkbox();
			// chb.setChecked(true);
			// cella.appendChild(chb);
			// cella.setStyle("white-space:nowrap;overflow:hidden;");
			// riga.appendChild(cella);

			lbAbilContratto.appendChild(riga);
		}
	}

	public void onClick$btnNewContr(Event event) {
		setTipoOperazione("INS");
		riempiLbAbilContratto(new Contratto());
		riempiDatiContratto(new Contratto());
		grbContratto.getCaption().setLabel("Inserimento nuovo contratto");
		grbContratto.setVisible(true);
		grbAbilContratto.setVisible(false);
		btnSave.setVisible(true);
		btnNext.setVisible(true);
		btnPrev.setVisible(false);
	}

	// public void onClick$btnCopiaContr(Event event) {
	// setTipoOperazione("DUP");
	// if ((cmbContr.getSelectedItem() == null) ||
	// (cmbContr.getSelectedItem().getLabel().startsWith("--"))) {
	// Clients.showNotification("Selezionare un contratto",
	// Clients.NOTIFICATION_TYPE_WARNING, null, null, 5000, true);
	// return;
	// }
	// riempiDatiContratto(cmbContr.getSelectedItem().getValue().toString());
	// }

	public void onClick$btnEditContr(Event event) {
		setTipoOperazione("UPD");
		if ((cmbContr.getSelectedItem() == null) || (cmbContr.getSelectedItem().getLabel().startsWith("--"))) {
			Clients.showNotification("Selezionare un contratto", Clients.NOTIFICATION_TYPE_WARNING, null, null, 5000,
					true);
			return;
		}
		Contratto object = new Contratto();
		object.setCodcontratto(cmbContr.getSelectedItem().getValue().toString());
		List<Contratto> lst = sqlContratto.selectByExample(object, null);

		riempiDatiContratto(lst.get(0));
		grbContratto.getCaption().setLabel("Modifica contratto - " + cmbContr.getSelectedItem().getValue().toString() + " - " + txbNom.getValue());
		riempiLbAbilContratto(new Contratto());
		grbContratto.setVisible(true);
		grbAbilContratto.setVisible(false);
		btnNext.setVisible(true);
		btnSave.setVisible(true);
		btnPrev.setVisible(false);
	}

	public void onClick$btnNext(Event event) {
		grbContratto.setVisible(false);
		grbAbilContratto.setVisible(true);
		if (getTipoOperazione().equalsIgnoreCase("INS")) {
			grbAbilContratto.getCaption().setLabel(
					"Inserimento abilitazioni contratto - " + txbContratto.getValue() + " - " + txbNom.getValue());
		} else {
			grbAbilContratto.getCaption().setLabel(
					"Modifica abilitazioni contratto - " + txbContratto.getValue() + " - " + txbNom.getValue());
		}
		btnNext.setVisible(false);
		btnSave.setVisible(true);
		btnPrev.setVisible(true);
	}

	public void onClick$btnPrev(Event event) {
		grbContratto.setVisible(true);
		grbAbilContratto.setVisible(false);
		btnSave.setVisible(true);
		btnNext.setVisible(true);
		btnPrev.setVisible(false);
	}

	public void onSelect$cmbProvincia(Event event) {
		if ((cmbProvincia.getSelectedItem() == null) || (cmbProvincia.getSelectedItem().getLabel().startsWith("---"))) {
			cmbComune.getItems().clear();
			Comboitem ciCom = new Comboitem();
			ciCom.setLabel("-----");
			ciCom.setValue("-----");
			cmbComune.appendChild(ciCom);
			cmbComune.setSelectedIndex(0);
		} else {
			riempiCbComuni(cmbProvincia.getSelectedItem().getValue().toString());
		}
	}

	public void riempiCbComuni(String siglaProvincia) {
		List<Infcomuni> lstCom = sqlInfComuni.selectComuniOfPrv(siglaProvincia);
		cmbComune.getItems().clear();
		Comboitem ci = new Comboitem();
		ci.setLabel("-----");
		ci.setValue("-----");
		cmbComune.appendChild(ci);
		for (int i = 0; i < lstCom.size(); i++) {
			ci = new Comboitem();
			ci.setLabel(lstCom.get(i).getDenomcomune());
			ci.setValue(lstCom.get(i).getDenomcomune());
			cmbComune.appendChild(ci);
		}
		cmbComune.setSelectedIndex(0);
	}

	public void riempiCbProvincia() {
		Infcomuni infcomuni = new Infcomuni();
		infcomuni.setCodicecomune("999");
		List<Infcomuni> lstCom = sqlInfComuni.selectByExample(infcomuni, "denomcomune");
		cmbProvincia.getItems().clear();
		Comboitem ci = new Comboitem();
		ci.setLabel("-----");
		ci.setValue("-----");
		cmbProvincia.appendChild(ci);
		for (int i = 0; i < lstCom.size(); i++) {
			ci = new Comboitem();
			ci.setLabel(lstCom.get(i).getDenomcomune());
			ci.setValue(lstCom.get(i).getSiglaprovincia());
			cmbProvincia.appendChild(ci);
		}
		cmbProvincia.setSelectedIndex(0);
	}

	public String getTipoOperazione() {
		return tipoOperazione;
	}

	public void setTipoOperazione(String tipoOperazione) {
		this.tipoOperazione = tipoOperazione;
	}

}
