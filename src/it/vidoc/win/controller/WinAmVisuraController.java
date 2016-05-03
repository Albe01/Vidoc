package it.vidoc.win.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Window;

import it.vidoc.mybatis.javamodel.Anagrafiche;
import it.vidoc.mybatis.javamodel.Effetti;
import it.vidoc.mybatis.javamodel.Infcomuni;
import it.vidoc.mybatis.sqlquery.SqlAnagrafiche;
import it.vidoc.mybatis.sqlquery.SqlEffetti;
import it.vidoc.mybatis.sqlquery.SqlInfComuni;
import it.vidoc.utils.DatiSessione;
import it.vidoc.utils.LoadNewPage;

@SuppressWarnings("rawtypes")
public class WinAmVisuraController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;
	private DatiSessione datiSessione = null;

	private List<Effetti> listEffetti = null;
	private Anagrafiche anagrafiche = null;

	private Listbox lbVisura;
	private Label lblNom, lblCodFisc, lblNato, lblIndir;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");

		Effetti where = new Effetti();
		where.setKanagra(datiSessione.getAMkanagraVis());
		listEffetti = new SqlEffetti().selectByExample(where, "dataiscrizione desc");
		riempiLbVisura(listEffetti);
	}

	public void onCreate() throws IOException {
	}

	public void riempiLbVisura(List<Effetti> listEffetti) {
		anagrafiche = new SqlAnagrafiche().selectByPrimaryKey(datiSessione.getAMkanagraVis());
		if (anagrafiche != null) {
			if (anagrafiche.getNominativo() != null) {
				lblNom.setValue(anagrafiche.getNominativo());	
			}
			if (anagrafiche.getCodicefiscale() != null) {
				lblCodFisc.setValue(anagrafiche.getCodicefiscale());	
			}
			String natoA = "";
			if (!"".equals(anagrafiche.getCodicecomunenascita()) &&  anagrafiche.getCodicecomunenascita() != null) {
				Infcomuni infcomuni = new SqlInfComuni().selectByPrimaryKey(anagrafiche.getCodicecomunenascita());
				if (infcomuni != null) {
					natoA = infcomuni.getDenomcomune() + " (" + infcomuni.getSiglaprovincia() + ") ";  
				}
			}
			if (!"".equals(anagrafiche.getDatanascita()) &&  anagrafiche.getDatanascita() != null) {
				natoA = natoA +
						" il " +
						anagrafiche.getDatanascita().substring(6,8) +
						"/" +
						anagrafiche.getDatanascita().substring(4,6) +
						"/" +
						anagrafiche.getDatanascita().substring(0,4);
			}
			lblNato.setValue(natoA);
			
			String indirizzo = "";
			if (!"".equals(anagrafiche.getIndirizzoresidenza()) && anagrafiche.getIndirizzoresidenza() != null) {
				indirizzo = anagrafiche.getIndirizzoresidenza(); 
				lblIndir.setValue(indirizzo);
			}
			if (!"".equals(anagrafiche.getCodicecomuneresidenza()) &&  anagrafiche.getCodicecomuneresidenza() != null) {
				Infcomuni infcomuni = new SqlInfComuni().selectByPrimaryKey(anagrafiche.getCodicecomuneresidenza());
				if (infcomuni != null) {
					indirizzo = indirizzo +
							" - " +
							infcomuni.getDenomcomune() + " (" + infcomuni.getSiglaprovincia() + ") ";  
					lblIndir.setValue(indirizzo);
				}
			}
		}

		lbVisura.getItems().clear();
		DecimalFormat decimalFormat = new DecimalFormat("#,###,###,##0.00");

		for (int i = 0; i < listEffetti.size(); i++) {
			Listitem riga = new Listitem();
			Listcell cella = new Listcell();

			cella = new Listcell();
			cella.setLabel(listEffetti.get(i).getTipoeffetto());
			if (listEffetti.get(i).getTipoeffetto().trim().equals("A")) {
				cella.setLabel("Assegno");
			}
			if (listEffetti.get(i).getTipoeffetto().trim().equals("C")) {
				cella.setLabel("Cambiale");
			}
			if (listEffetti.get(i).getTipoeffetto().trim().equals("T")) {
				cella.setLabel("Tratta");
			}

			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(listEffetti.get(i).getDatalevata().substring(6, 8) + "/"
					+ listEffetti.get(i).getDatalevata().substring(4, 6) + "/"
					+ listEffetti.get(i).getDatalevata().substring(0, 4));
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(listEffetti.get(i).getDataiscrizione().substring(6, 8) + "/"
					+ listEffetti.get(i).getDataiscrizione().substring(4, 6) + "/"
					+ listEffetti.get(i).getDataiscrizione().substring(0, 4));
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(listEffetti.get(i).getCciaapubblicazione());
			riga.appendChild(cella);

			cella = new Listcell();
			if (listEffetti.get(i).getCodicevaluta().trim().equals("EU")) {
				cella.setLabel(String.valueOf(decimalFormat.format(listEffetti.get(i).getImporto())));
			} else {
				cella.setLabel(String.valueOf(decimalFormat.format(listEffetti.get(i).getImportocorrente())));
			}
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(String.valueOf(i + 1));
			riga.appendChild(cella);

			lbVisura.appendChild(riga);
		}
	}

	public void onClick$btnIndietro(Event event) throws IOException {
		LoadNewPage.loadNewPage("/zulpages/AMlista.zul");
	}

//	public void onClick$iconpdf(Event event) throws IOException {
	public void onClick$btnPdf(Event event) throws IOException {		
//		Executions.getCurrent().sendRedirect("/zulpages/GenericDocument.zul", "_blank");
		Window dialog = (Window) Executions.createComponents("/zulpages/GenericDocument.zul", null, null);
		dialog.doModal();
	}

}
