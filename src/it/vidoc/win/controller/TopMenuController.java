package it.vidoc.win.controller;

import it.vidoc.utils.DatiSessione;
import it.vidoc.utils.LoadNewPage;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Menuitem;

@SuppressWarnings("rawtypes")
public class TopMenuController extends GenericForwardComposer {
	private static final long serialVersionUID = 2897957930521909961L;
	private Session session = null;
	private DatiSessione datiSessione = null;
	
	private Menuitem menuitemAreaRis;
	
	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		try {
			session = Sessions.getCurrent();
			datiSessione = (DatiSessione) session.getAttribute("datisessione");
			if (datiSessione.getLstUserrole().get(0).getRole().equalsIgnoreCase("SUSER")) {
				menuitemAreaRis.setDisabled(false);
			}
		} catch (Exception e) {
			Clients.showNotification("Errore. Mancano dati sessione.", Clients.NOTIFICATION_TYPE_ERROR, null, null, 10000, true);
			Executions.sendRedirect("/index.zul");
		}
	}

	public void onClick$menuitemRiDen(Event event){
//		LoadNewPage.loadNewPage("/zulpages/RIricden.zul");
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
	}
	
	public void onClick$menuitemRiCF(Event event){
//		LoadNewPage.loadNewPage("/zulpages/RIriccofi.zul");		
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);		
	}
	
	public void onClick$menuitemRiNRea(Event event){
//		LoadNewPage.loadNewPage("/zulpages/RIricnrea.zul");	
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);		
	}
	
	public void onClick$menuitemRpRic(Event event){
//		LoadNewPage.loadNewPage("/zulpages/RPricerca.zul");		
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);		
	}
	public void onClick$menuitemRpVis(Event event){
//		LoadNewPage.loadNewPage("/zulpages/RPricerca.zul");		
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);		
	}
	public void onClick$menuitemAmRic(Event event){
		LoadNewPage.loadNewPage("/zulpages/AMricerca.zul");		
	}
	public void onClick$menuitemAmDtAgg(Event event){
		LoadNewPage.loadNewPage("/zulpages/AMdateagg.zul");		
	}
	public void onClick$menuitemDownLoad(Event event){
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);		
	}
	public void onClick$menuitemlogOper(Event event){
		LoadNewPage.loadNewPage("/zulpages/LogOperazioni.zul");		
	}
	public void onClick$menuitemAreaRis(Event event){
		LoadNewPage.loadNewPage("/zulpages/BackEnd.zul");		
	}
	public void onClick$menuitemHelp(Event event){
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);		
	}

}
