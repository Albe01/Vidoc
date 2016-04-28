package it.vidoc.win.controller;

import java.io.IOException;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.EventQueue;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import it.vidoc.contabilizzazione.Contabilizza;
import it.vidoc.mybatis.javamodel.Infcomuni;
import it.vidoc.mybatis.sqlquery.SqlInfComuni;
import it.vidoc.utils.AmCercaSoggetto;
import it.vidoc.utils.Costants;
import it.vidoc.utils.DatiSessione;
import it.vidoc.utils.LoadNewPage;

@SuppressWarnings("rawtypes")
public class WinAmRicercaController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;
	private DatiSessione datiSessione = null;
	private EventQueue eventQueue;

	private List<Long> result = null;
	
	private Textbox txbNom;
	private Combobox cmbPrv;
	private Combobox cmbCom;
	private Textbox txbSprv;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");
	}

	public void onCreate() throws IOException {
        Infcomuni infcomuni = new Infcomuni();
        infcomuni.setCodicecomune("999");
		List<Infcomuni> lstPrv = new SqlInfComuni().selectByExample(infcomuni, "denomcomune");

		cmbPrv.getItems().clear();
		Comboitem ciPrv = new Comboitem();
		ciPrv.setLabel("-----");
		cmbPrv.appendChild(ciPrv);
		for (int i = 0; i < lstPrv.size(); i++) {
			ciPrv = new Comboitem();
			ciPrv.setLabel(lstPrv.get(i).getDenomcomune());
			ciPrv.setValue(lstPrv.get(i).getSiglaprovincia());
			cmbPrv.appendChild(ciPrv);
		}
		cmbPrv.setSelectedIndex(0);
		
		cmbCom.getItems().clear();
		Comboitem ciCom = new Comboitem();
		ciCom.setLabel("-----");
		cmbCom.appendChild(ciCom);
		cmbCom.setSelectedIndex(0);
		
		if (!"".equals(datiSessione.getAMnome()) && datiSessione.getAMnome() != null) {
			txbNom.setValue(datiSessione.getAMnome());
		}
		if (!"".equals(datiSessione.getAMsiglaProvincia()) && datiSessione.getAMsiglaProvincia() != null) {
			txbSprv.setValue(datiSessione.getAMsiglaProvincia());
			for (int i = 0; i < cmbPrv.getItems().size(); i++) {
				String value = null;;
				try {value = cmbPrv.getItems().get(i).getValue().toString();} catch (Exception e) {value = null;}				
				if(value != null && value.equals(datiSessione.getAMsiglaProvincia()) ){
					cmbPrv.setSelectedIndex(i);
					break;
				}
			}
		}
		if (!"".equals(datiSessione.getAMcodiceComune()) && datiSessione.getAMcodiceComune() != null) {
			String siglaProvincia = null;
			try {siglaProvincia = cmbPrv.getSelectedItem().getValue().toString();} catch (Exception e) {siglaProvincia = null;}
			if (siglaProvincia != null) {
				riempiCbComuni(siglaProvincia);
				for (int i = 0; i < cmbCom.getItems().size(); i++) {
					String value = null;;
					try {value = cmbCom.getItems().get(i).getValue().toString();} catch (Exception e) {value = null;}				
					if(value != null && value.equals(datiSessione.getAMcodiceComune()) ){
						cmbCom.setSelectedIndex(i);
						break;
					}
				}
			}
		}
   }


	@SuppressWarnings("unchecked")
	public void onClick$imgIniRic(Event event) throws IOException{		
		if (txbNom.getValue().length() < 2) {
			Clients.showNotification("Nominativo obbligatorio", Clients.NOTIFICATION_TYPE_WARNING, null, null, 5000, true);			
			return;
		}
		if (txbSprv.getValue().toString().length() > 0) {
			List<Infcomuni> lstPrv = new SqlInfComuni().selectComuniOfPrv(txbSprv.getValue().toString());
			if (lstPrv.size() < 1) {
				Clients.showNotification("Sigla provincia errata o omessa", Clients.NOTIFICATION_TYPE_WARNING, null, null, 5000, true);
				return;
			}
		}
		
		eventQueue = EventQueues.lookup("interactive", EventQueues.DESKTOP, true);
 		eventQueue.subscribe(new EventListener() {
            public void onEvent(Event event) throws Exception {
                if (!"".equals(datiSessione.getPreventivoAccettato()) &&
                		datiSessione.getPreventivoAccettato() != null &&
                		datiSessione.getPreventivoAccettato().equalsIgnoreCase("S")) {
                	eventQueue.unsubscribe(this);
                	ricercaSoggetto();
                }
//              eventQueue.unsubscribe(this);
            }
        });
		
		datiSessione.setCodiceBancaDati(Costants.AMEDcodiceBancaDati);
		datiSessione.setCodiceRichiesta(Costants.AMEDcodiceRichiestaLista);
		datiSessione.setCodiceRisposta(Costants.AMEDcodiceRispostaLista);
		datiSessione.setOnlDiff(Costants.RequestOnLine);
		session.setAttribute("datisessione", datiSessione);
		Contabilizza account = new Contabilizza();
		if (account.calcolaPrezzoUtente() > 0) {
			datiSessione.setPrezzo(account.calcolaPrezzoUtente());
			session.setAttribute("datisessione", datiSessione);
			Window dialog = (Window)Executions.createComponents("/zulpages/Preventivo.zul", null, null);
			dialog.doModal();
		} else {
			ricercaSoggetto();
		}
	}

   public void onChanging$txbNom(Event event) {
   }
   
   public void onSelect$cmbPrv(Event event){
	   if ((cmbPrv.getSelectedItem() == null) || (cmbPrv.getSelectedItem().getLabel().equals("-----"))) {
			cmbCom.getItems().clear();
			Comboitem ciCom = new Comboitem();
			ciCom.setLabel("-----");
			ciCom.setValue("-----");
			cmbCom.appendChild(ciCom);
			cmbCom.setSelectedIndex(0);
			txbSprv.setValue("");
	   } else {
		   	riempiCbComuni(cmbPrv.getSelectedItem().getValue().toString());
		   
			txbSprv.setValue(cmbPrv.getSelectedItem().getValue().toString());
	   }
   }
   
   
   public void onChanging$cmbPrv(Event event){
		cmbCom.getItems().clear();
		Comboitem ciCom = new Comboitem();
		ciCom.setLabel("-----");
		cmbCom.appendChild(ciCom);
		cmbCom.setSelectedIndex(0);
		txbSprv.setValue("");
   }

   public void onChanging$txbSprv(Event event){
		cmbPrv.setSelectedIndex(0);
	   
		cmbCom.getItems().clear();
		Comboitem ciCom = new Comboitem();
		ciCom.setLabel("-----");
		cmbCom.appendChild(ciCom);
		cmbCom.setSelectedIndex(0);
   }

   public void riempiCbComuni(String siglaProvincia) {
		List<Infcomuni> lstCom = new SqlInfComuni().selectComuniOfPrv(cmbPrv.getSelectedItem().getValue().toString());
		cmbCom.getItems().clear();
		Comboitem ciCom = new Comboitem();
		ciCom.setLabel("-----");
		ciCom.setValue("-----");
		cmbCom.appendChild(ciCom);
		for (int i = 0; i < lstCom.size(); i++) {
			ciCom = new Comboitem();
			ciCom.setLabel(lstCom.get(i).getDenomcomune());
			ciCom.setValue(lstCom.get(i).getInfcodicecomune());
			cmbCom.appendChild(ciCom);
		}
		cmbCom.setSelectedIndex(0);
   }
   
   private void ricercaSoggetto () {
		String nome = null;
		String indirizzo = null;
		String codiceComune = null;
		String siglaProvincia = null;
		try {nome = txbNom.getValue().toString();} catch (Exception e) {nome = null;}
		try {codiceComune = cmbCom.getSelectedItem().getValue().toString();} catch (Exception e) {codiceComune = null;}
		try {siglaProvincia = txbSprv.getValue().toString();} catch (Exception e) {siglaProvincia = null;}
		result = new AmCercaSoggetto().amCercaSoggetto(nome, indirizzo, siglaProvincia, codiceComune);
		
		Contabilizza account = new Contabilizza();
		account.registraAccountUtente();
		
		if (result.size() > 0) {
			datiSessione.setAMnome(nome);
			datiSessione.setAMindirizzo(indirizzo);
			datiSessione.setAMsiglaProvincia(siglaProvincia);
			datiSessione.setAMcodiceComune(codiceComune);
			datiSessione.setAMLstKanagra(result);
			session.setAttribute("datisessione", datiSessione);
			LoadNewPage.loadNewPage("/zulpages/AMlista.zul");
		} else {
			Clients.showNotification("Nessun soggeto trovato con i dati indicati", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
		}
   }
}
