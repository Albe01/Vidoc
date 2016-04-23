package it.vidoc.win.controller;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Panel;

import it.vidoc.mybatis.javamodel.ext.AmedeodateaggExt;
import it.vidoc.mybatis.sqlquery.SqlAmedeodateagg;
import it.vidoc.utils.DatiSessione;

@SuppressWarnings("rawtypes")
public class WinAmDateAggController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private Session session = null;;
	private DatiSessione datiSessione = null;

	private Listbox lbListaDateAgg;
	private Panel pnlAMDateAgg;

	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");
		
		List<AmedeodateaggExt> lstAmDateAgg = new SqlAmedeodateagg().selectDateAgg();
		riempilbListaDateAgg(lstAmDateAgg);
	}



	public void riempilbListaDateAgg(List<AmedeodateaggExt> lstAmDateAgg) {
		pnlAMDateAgg.setVisible(true);
		pnlAMDateAgg.setOpen(true);
		lbListaDateAgg.getItems().clear();

		for (int i = 0; i < lstAmDateAgg.size(); i++) {
			Listitem riga = new Listitem();
			Listcell cella = new Listcell();

			cella = new Listcell();
			cella.setLabel(lstAmDateAgg.get(i).getDenomcomune());
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);
			
			cella = new Listcell();
			cella.setLabel(lstAmDateAgg.get(i).getDatamin().substring(6, 8) + "/" + 
					lstAmDateAgg.get(i).getDatamin().substring(4, 6) + "/" +
					lstAmDateAgg.get(i).getDatamin().substring(0, 4));
			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(lstAmDateAgg.get(i).getDatamax().substring(6, 8) + "/" + 
					lstAmDateAgg.get(i).getDatamax().substring(4, 6) + "/" +
					lstAmDateAgg.get(i).getDatamax().substring(0, 4));

			cella.setStyle("white-space:nowrap;overflow:hidden");
			riga.appendChild(cella);
			
			i++;
			if (i < lstAmDateAgg.size()) {
				cella = new Listcell();
				cella.setLabel(lstAmDateAgg.get(i).getDenomcomune());
				cella.setStyle("white-space:nowrap;overflow:hidden");
				riga.appendChild(cella);
				
				cella = new Listcell();
				cella.setLabel(lstAmDateAgg.get(i).getDatamin().substring(6, 8) + "/" + 
						lstAmDateAgg.get(i).getDatamin().substring(4, 6) + "/" +
						lstAmDateAgg.get(i).getDatamin().substring(0, 4));
				cella.setStyle("white-space:nowrap;overflow:hidden");
				riga.appendChild(cella);

				cella = new Listcell();
				cella.setLabel(lstAmDateAgg.get(i).getDatamax().substring(6, 8) + "/" + 
						lstAmDateAgg.get(i).getDatamax().substring(4, 6) + "/" +
						lstAmDateAgg.get(i).getDatamax().substring(0, 4));

				cella.setStyle("white-space:nowrap;overflow:hidden");
				riga.appendChild(cella);
			}

			lbListaDateAgg.appendChild(riga);
		}
	}


	public void onCreate() {
	}

}
