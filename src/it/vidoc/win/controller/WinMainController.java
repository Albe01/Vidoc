package it.vidoc.win.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.A;
import org.zkoss.zul.Label;

import it.vidoc.authentication.CheckLogin;
import it.vidoc.utils.DatiSessione;

@SuppressWarnings("rawtypes")
public class WinMainController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;
	private DatiSessione datiSessione = null;
	
	
	private A iconuser;
	private Label user;
	private Label datatime;
	
	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		if (CheckLogin.checkLogin() == false) {
			return;
		}
//		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
//		datatime.setValue(dateFormat.format(new Date()));
		
		try {
			session = Sessions.getCurrent();
			datiSessione = (DatiSessione) session.getAttribute("datisessione");
		} catch (Exception e) {
			Clients.showNotification("Errore. Mancano dati sessione.", Clients.NOTIFICATION_TYPE_ERROR, null, null, 10000, true);
			Executions.sendRedirect("/index.zul");
		}

		user.setValue(datiSessione.getUser().getCognome());
		for (int i = 0; i < datiSessione.getLstUserrole().size(); i++) {
			user.setValue(datiSessione.getUser().getCognome() +  " (" + datiSessione.getLstUserrole().get(0).getRole() + ")");
		}
		
		try {
			if (datiSessione.getUser().getSesso().equalsIgnoreCase("f")) {
				iconuser.setImage("/images/User-Female-icon.png");
			}
		} catch (Exception e) {
		}
		
	}
	
}
