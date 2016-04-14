package it.vidoc.win.controller;

import java.io.IOException;
import java.text.DecimalFormat;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventQueue;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

import it.vidoc.utils.DatiSessione;

@SuppressWarnings("rawtypes")
public class WinPreventivoController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;
	private DatiSessione datiSessione = null;


	private Window winPreventivo;
	private Label lblPreventivo;
	private Checkbox chbNonMostrare;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");
	}

	@SuppressWarnings("unchecked")
	public void onClick$btnOk(Event event) throws IOException {
		datiSessione.setPreventivoAccettato("S");
		session.setAttribute("datisessione", datiSessione);
        EventQueue eventQueue = EventQueues.lookup("interactive", EventQueues.DESKTOP, false);
        eventQueue.publish(new Event("", null, null));
        winPreventivo.detach();

	}

	@SuppressWarnings("unchecked")
	public void onClick$btnCancel(Event event) throws IOException {
		//Clients.showNotification("Richiesta annullata dall'utente", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
		datiSessione.setPreventivoAccettato("N");
		session.setAttribute("datisessione", datiSessione);
        EventQueue eventQueue = EventQueues.lookup("interactive", EventQueues.DESKTOP, false);
        eventQueue.publish(new Event("", null, null));
        winPreventivo.detach();
	}

	public void onCheck$chbNonMostrare(Event event) throws IOException {
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
	}
	
	
	public void onCreate() {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		lblPreventivo.setValue("Il costo della richiesta sara' di €" + formatter.format(datiSessione.getPrezzo()) + " oltre IVA");
	}

}
