package it.vidoc.win.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Textbox;

import fi.jawsy.jawwa.zk.gritter.Gritter;
import it.vidoc.mybatis.javamodel.User;
import it.vidoc.mybatis.javamodel.Userrole;
import it.vidoc.mybatis.sqlquery.SqlElencoListini;
import it.vidoc.mybatis.sqlquery.SqlUser;
import it.vidoc.mybatis.sqlquery.SqlUserRole;
import it.vidoc.report.GestioneReport;
import it.vidoc.utils.DatiSessione;
import it.vidoc.utils.StringEncrypter;
import net.sf.jasperreports.engine.JRException;

@SuppressWarnings("rawtypes")
public class WinLoginController extends GenericForwardComposer {
	private static final long serialVersionUID = -4395868321111092273L;
	private Textbox account;
	private Textbox password;
	
	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		account.setFocus(true);
		
//		prove();
		
		
	}

	public void onClick$pwdDimenticata(Event event) {
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
		
	}

	public void onClick$serveAiuto(Event event) {
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
		
	}

	public void onClick$btnLogin(Event event) {
		String nm = account.getValue();
		String pd = password.getValue();
		it.vidoc.mybatis.javamodel.User user = new User();		
		try {nm = account.getValue();} catch (Exception e) {nm = null;}
		try {pd = password.getValue();} catch (Exception e) {pd = null;}		
		if (!"".equals(nm) &&  !"".equals(pd) && nm != null && pd != null) {
			user = new SqlUser().selectByPrimaryKey(nm);
			String encryptedString;
			try {
				StringEncrypter encrypter =  new StringEncrypter(StringEncrypter.DES_ENCRYPTION_SCHEME, StringEncrypter.DEFAULT_ENCRYPTION_KEY );
				encryptedString = encrypter.encrypt(pd);
			} catch (Exception e) {
				Clients.showNotification("Error in Encrypter", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
				return;
			}
			if(user == null || !user.getPassword().equals(encryptedString)){
				Clients.showNotification("Nome utente e/o password errati.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);				
				return;
			}
		} else {
			Clients.showNotification("Nome utente e/o password omesso.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);			
			return;
		}
		Boolean lockUser = false;
		if (user.getAccountexpired() == true) {
			Clients.showNotification("L'account e' scaduto.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);			
			lockUser = true;
		} else if (user.getAccountlocked() == true) {
			Clients.showNotification("L'account e' bloccato.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
			lockUser = true;
		} else if (user.getCredentialsexpired() == true) {
			Clients.showNotification("Le credenziali sono scadute.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
			lockUser = true;
		} else if (user.getEnabled() == false) {
			Clients.showNotification("Utente non abilitato.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
			lockUser = true;
		}
		if (lockUser == true) {
			return;
		}
		Userrole Userrole = new Userrole();
		Userrole.setUsername(nm);
		List<Userrole> lstUserarole = new SqlUserRole().selectByExample(Userrole, null);
		if (lstUserarole.size() == 0) {
			Clients.showNotification("Utente privo di abilitazioni.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
			return;
		}
		
		Session sess = Sessions.getCurrent();
		DatiSessione datiSessione = new DatiSessione();
		datiSessione.setUser(user);
		datiSessione.setLstUserrole(lstUserarole);
		datiSessione.setListinoUtentiAttivo(new SqlElencoListini().selectNumListinoAttivo("UTENTE"));
		datiSessione.setListinoInternoAttivo(new SqlElencoListini().selectNumListinoAttivo("INTERNO"));
		sess.setAttribute("datisessione",datiSessione);
		
		
//		try {
//			Execution exec = Executions.getCurrent();
//		    HttpServletResponse response = (HttpServletResponse)exec.getNativeResponse();
//			response.sendRedirect(response.encodeRedirectURL("/home.zul"));
//			exec.setVoided(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		Executions.sendRedirect("/zulpages/home.zul");
		
	}
	
	
	private void prove () {
		
		
		
		Integer xx = new SqlElencoListini().selectNumListinoAttivo("UTENTE");
		
		Map<String, Object> parametri = new HashMap<String, Object>();
		parametri.put("KANAGRA", 1);
		GestioneReport rep = new GestioneReport();
		try {
			Map<String, Object> dati = rep.getReportParam("AMVisura", null, parametri);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "Zksample1 Notification");
		map.put("message", "<br>Hello i'm a notification based on ZK-Gritter.<br><br>Many thanks to gekkio for writting the implementation.");
		map.put("autoClosing", false);
		
		String title = "title is missing";
		String message = "msg is missing";
		String image = null;
		boolean autoClosing = false;
		int delayTime = new Integer(6000);

		if (map.containsKey("title"))
			title = (String) map.get("title");
		if (map.containsKey("message"))
			message = (String) map.get("message");
		if (map.containsKey("image"))
			image = (String) map.get("image");
		if (map.containsKey("autoClosing"))
			autoClosing = (Boolean) map.get("autoClosing");
		if (map.containsKey("delayTime"))
			delayTime = (Integer) map.get("delayTime");

		// show notification
		if (image != null)
			Gritter.notification().withTitle(title).withText(message).withSticky(autoClosing).withTime(delayTime).withSclass("gritter-red").withImage(image).show();
		else
			Gritter.notification().withTitle(title).withText(message).withSticky(autoClosing).withTime(delayTime).withSclass("gritter-red").show();
		
		map.put("title", "Zksample2 Notification");
		map.put("message", "<br>Hello i'm a notification based on ZK-Gritter.<br><br>Many thanks to gekkio for writting the implementation.");
		map.put("autoClosing", false);
		
		if (map.containsKey("title"))
			title = (String) map.get("title");
		if (map.containsKey("message"))
			message = (String) map.get("message");
		if (map.containsKey("image"))
			image = (String) map.get("image");
		if (map.containsKey("autoClosing"))
			autoClosing = (Boolean) map.get("autoClosing");
		if (map.containsKey("delayTime"))
			delayTime = (Integer) map.get("delayTime");

		// show notification
		if (image != null)
			Gritter.notification().withTitle(title).withText(message).withSticky(autoClosing).withTime(delayTime).withSclass("gritter-red").withImage(image).show();
		else
			Gritter.notification().withTitle(title).withText(message).withSticky(autoClosing).withTime(delayTime).withSclass("gritter-red").show();
		
		
//		Map<String, Object> parametri = new HashMap<String, Object>();
//		parametri.put("KANAGRA", new Long(975253286));
//		try {
//			GestioneReport rep = new GestioneReport();
//			Map<String, Object> dati = rep.getReportParam("AMVisura", null, parametri);
//			
//			Elencodocumenti elencodocumenti = new Elencodocumenti();
//			elencodocumenti.setProgrrigaaccount(44);
//			elencodocumenti.setTipodocumento("pdf");
//			elencodocumenti.setDocumento((byte[]) dati.get("documentByte"));
//			new ManageDbWithJDBC().insertElencoDocumenti(elencodocumenti);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}


		
		
//		List<AmedeodateaggExt> lst = new SqlAmedeodateagg().selectDateAgg();
//		
//		String albe = null;
		
//		File file = new File("d:/temp/20160420_094643.jpg");
//		byte[] dataByte = new byte[(int) file.length()];
//		DataInputStream dis = new DataInputStream(new FileInputStream(file));
//		dis.readFully(dataByte);  // read from file into byte[] array
//		dis.close();
//		Elencodocumenti elencodocumenti = new Elencodocumenti();
//		elencodocumenti.setProgrrigaaccount(44);
//		elencodocumenti.setTipodocumento("pdf");
//		elencodocumenti.setDocumento(dataByte);
//		new ManageDbWithJDBC().insertElencoDocumenti(elencodocumenti);
		
		
//		File pdfFile = new File("d:/temp/elencodocumenti.sql");
//		byte[] pdfData = new byte[(int) pdfFile.length()];
//		DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
//		dis.readFully(pdfData);  // read from file into byte[] array
//		dis.close();
//		Elencodocumenti elencodocumenti = new Elencodocumenti();
//		elencodocumenti.setProgrrigaaccount(99);
//		elencodocumenti.setTipodocumento("pdf");
//		elencodocumenti.setDocumento(pdfData);
//		new SqlElencoDocumenti().insert(elencodocumenti);

		
	}
}
