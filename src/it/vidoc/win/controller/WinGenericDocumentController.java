package it.vidoc.win.controller;

import java.io.IOException;
import java.util.List;

import org.zkoss.util.media.AMedia;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventQueue;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Html;
import org.zkoss.zul.Iframe;
import org.zkoss.zul.Window;

import it.vidoc.mybatis.javamodel.Elencodocumenti;
import it.vidoc.mybatis.sqlquery.SqlElencoDocumenti;
import it.vidoc.utils.DatiSessione;

@SuppressWarnings("rawtypes")
public class WinGenericDocumentController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;
	private DatiSessione datiSessione = null;
	private List<Elencodocumenti> lstElencodocumenti;

	private Window winGenericDocument;
	private Iframe iframe;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");

		Elencodocumenti elencodocumenti = new Elencodocumenti();
		elencodocumenti.setProgrrigaaccount(datiSessione.getRigaAccount());
		lstElencodocumenti = new SqlElencoDocumenti().selectByExampleWithBlobs(elencodocumenti, null);

//		String path = "D:/temp/73016_precompilato_DBLLRT60A17F839C.pdf";
//		File f = new File(path);
//		byte[] buffer = new byte[(int) f.length()];
//		FileInputStream fs = new FileInputStream(f);
//		fs.read(buffer);
//	    fs.close();
//	    ByteArrayInputStream is = new ByteArrayInputStream(buffer);
//	    AMedia amedia = new AMedia(path, "pdf", "application/pdf", is);
	    AMedia amedia = null;
	    if (lstElencodocumenti.get(0).getTipodocumento().equalsIgnoreCase("html")) {
//   			amedia = new AMedia("", "html", "text/xml;charset=UTF-8", lstElencodocumenti.get(0).getDocumento());	    			
	    	amedia = new AMedia("", "html", "text/html", lstElencodocumenti.get(0).getDocumento());	
		} else if (lstElencodocumenti.get(0).getTipodocumento().equalsIgnoreCase("pdf")) {
			amedia = new AMedia("", "pdf", "application/pdf", lstElencodocumenti.get(0).getDocumento());
			
//			File pdfFile = new File("d:/temp/73016_precompilato_DBLLRT60A17F839C.pdf");
//			byte[] pdfData = new byte[(int) pdfFile.length()];
//			DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
//			dis.readFully(pdfData);  // read from file into byte[] array
//			dis.close();
//			amedia = new AMedia("", "pdf", "application/pdf", pdfData);
			
		}
	    iframe.setContent(amedia);
	}

	@SuppressWarnings("unchecked")
	public void onClick$iconexit(Event event) throws IOException {
//		EventQueue eventQueue = EventQueues.lookup("interactive", EventQueues.DESKTOP, false);
//		eventQueue.publish(new Event("", null, null));
		winGenericDocument.detach();
	}

	public void onClick$icondownload(Event event) throws IOException {
	}

	public void onClick$iconprint(Event event) throws IOException {
	}

	public void onClick$iconpdf(Event event) throws IOException {
	}

	public void onCreate() {
	}
}
