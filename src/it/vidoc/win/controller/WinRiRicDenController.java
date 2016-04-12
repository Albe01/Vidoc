package it.vidoc.win.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

@SuppressWarnings("rawtypes")
public class WinRiRicDenController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private String alberto;
	protected Combobox cmbVarOrd;
	protected Combobox cmbTipOrd;
	protected Combobox cmbPrv;
	protected Textbox txbDen;
	
	
	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		cmbVarOrd.getItems().clear();
		Comboitem ci;
		ci = new Comboitem();
		ci.setValue("");
		ci.setLabel("");
		cmbVarOrd.appendChild(ci);
		   
		ci = new Comboitem();
		ci.setValue("Denominazione");
		ci.setLabel("Denominazione");
		cmbVarOrd.appendChild(ci);
		
		ci = new Comboitem();
		ci.setValue("Codice Forma Giuridica");
		ci.setLabel("Codice Forma Giuridica");
		cmbVarOrd.appendChild(ci);
		
		ci = new Comboitem();
		ci.setValue("CCIAA / N.REA");
		ci.setLabel("CCIAA / N.REA");
		cmbVarOrd.appendChild(ci);
		
		ci = new Comboitem();
		ci.setValue("Codice Fiscale Impresa");
		ci.setLabel("Codice Fiscale Impresa");
		cmbVarOrd.appendChild(ci);

		ci = new Comboitem();
		ci.setValue("Fonte");
		ci.setLabel("Fonte");
		cmbVarOrd.appendChild(ci);
		cmbVarOrd.setSelectedIndex(0);

// 		
		cmbTipOrd.getItems().clear();
		ci = new Comboitem();
		ci.setValue("");
		ci.setLabel("");
		cmbTipOrd.appendChild(ci);
		   
		ci = new Comboitem();
		ci.setValue("Crescente");
		ci.setLabel("Crescente");
		cmbTipOrd.appendChild(ci);
		   
		ci = new Comboitem();
		ci.setValue("Decrescente");
		ci.setLabel("Decrescente");
		cmbTipOrd.appendChild(ci);
		cmbTipOrd.setSelectedIndex(0);
		
	}

	
	public void onClick$btnIniRic(Event event){
		if ((txbDen.getValue().length()) < 1) {
			Clients.showNotification("Denominazione obbligatoria", "warning", null, null, 0, true);
//			Clients.showNotification("Denominazione obbligatoria", true);
//			Clients.showNotification("Denominazione obbligatoria", txbDen);
			
//			Messagebox.show("Denominazione obbligatoria", "Attenzione", Messagebox.OK, Messagebox.EXCLAMATION);	
			return;
		}
//		if (cmbPrv.getSelectedItem().getValue() == "") {
//			Messagebox.show("Denominazione obbligatoria", "Attenzione", Messagebox.OK, Messagebox.EXCLAMATION);
//			return;
//		}
		
	}
}
