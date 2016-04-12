package it.vidoc.authentication;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

import it.vidoc.utils.DatiSessione;

public class CheckLogin {
	private static Session sess = null;
	private static DatiSessione datiSessione = null;

	public static synchronized Boolean checkLogin() {
		Boolean ret = true;
		sess = Sessions.getCurrent();
		datiSessione = (DatiSessione) sess.getAttribute("datisessione");
		if (datiSessione == null || datiSessione.getUser() == null || datiSessione.getLstUserabilitazioni() == null) {
			Executions.sendRedirect("/zulpages/login.zul");
			ret = false;
		}
		return ret;
	}
}
