package it.vidoc.win.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Textbox;

import it.vidoc.mybatis.javaclient.AnagraficheMapper;
import it.vidoc.mybatis.javamodel.Anagrafiche;
import it.vidoc.utils.MyBatisConnectionFactory;
import it.vidoc.utils.RpCercaParoleAnag;

@SuppressWarnings("rawtypes")
public class WinRpRicercaController extends GenericForwardComposer {
	private static final long serialVersionUID = 6204566952879868705L;
	private String alberto;
	private List<Anagrafiche> listAnag = null;
	private AnagraficheMapper anagraficheMapper = null;
	private Anagrafiche anagrafiche = null;
	private ArrayList<Long> result = null;
	private SqlSession sqlSession = null;
	private Long startQuery = 0L;
	private Long endQuery = 0L;
	private Long startList = 0L;
	private Long endList = 0L;
	private Integer totPag = 0;
	
	private Textbox txbNom;
	private Combobox cmbPrv;
	private Textbox txbSprv;
	private Panel pnlRPRicerca;
	private Panel pnlRPLista;
	private Listbox lbListaAnag;
	private Hbox HbxRPLista;
	private Label lblNumSogg;
	private Intbox inbNpag;
	private Label lblFoo1;
	
	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}


	public void onClick$btnIniRic(Event event) throws IOException{
		if (txbNom.getValue().length() < 2) {
			Clients.showNotification("Nominativo obbligatorio", "warning", null, null, 0, true);			
			return;
		}
		
		MyBatisConnectionFactory.openSqlSessionFactory();
		MyBatisConnectionFactory.openSqlSession();
		sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		ArrayList<Long> listKanagra1 = new ArrayList<Long>();
		ArrayList<Long> listKanagra2 = new ArrayList<Long>();
		result = new ArrayList<Long>();
		String[] arrNome = txbNom.getValue().split(" ");
		
		startQuery = System.currentTimeMillis();
		for (int i = 0; i < arrNome.length; i++) {
			if (i == 0) {
				RpCercaParoleAnag rpCercaParoleAnag = new RpCercaParoleAnag(); 
				listKanagra1 = rpCercaParoleAnag.RpCercaParoleAnag(arrNome[i].trim());
				result.clear();
				result.addAll(listKanagra1);
			} else {
				RpCercaParoleAnag rpCercaParoleAnag = new RpCercaParoleAnag(); 
				listKanagra2 = rpCercaParoleAnag.RpCercaParoleAnag(arrNome[i].trim());
				listKanagra1.retainAll(listKanagra2);
				result.clear();
				result.addAll(listKanagra1);
			}
		}
		endQuery = System.currentTimeMillis();
		
		if (result.size() > 0) {
			
			riempiLb(1);

			String durationQuery = String.valueOf((endQuery - startQuery) / 1000) + "," + String.valueOf((endQuery - startQuery) % 1000);
			String durationList = String.valueOf((endList - startList) / 1000) + "," + String.valueOf((endList - startList) % 1000);
			
			pnlRPLista.setOpen(true);
			pnlRPLista.setVisible(true);
			
			lblNumSogg.setValue("(N. soggetti trovati: " + result.size() + " in " + durationQuery + " secondi)");
			pnlRPRicerca.setOpen(false);
			pnlRPRicerca.setVisible(false);
		} else {
			Clients.showNotification("Nessun soggeto trovato con i dati indicati", "warning", null, null, 0, true);
		}		
			
			
		MyBatisConnectionFactory.closeSqlSession();
	}

   public void riempiLb(Integer pagina) {
		pnlRPLista.setOpen(true);
		lbListaAnag.getItems().clear();
		DecimalFormat df = new DecimalFormat( "#,###,###,##0.00" );
		
		
		
		Integer iniLb = 0;
		Integer finLb = 0;
		startList = System.currentTimeMillis();
		if (pagina == 1) {
			iniLb = 0;
		} else {
			iniLb = ((pagina - 1) * 12) - 1;
		}
		finLb = iniLb + 11;
		if (finLb > result.size()) {
			finLb = result.size();
		}

		for (int i = iniLb; i < finLb; i++) {
			anagraficheMapper = sqlSession.getMapper(AnagraficheMapper.class);			
			anagrafiche = new Anagrafiche();
			anagrafiche = anagraficheMapper.selectByPrimaryKey(result.get(i));	
			Listitem riga = new Listitem();
			
			Listcell cella = new Listcell();
			cella.setLabel(String.valueOf(i + 1));
			riga.appendChild(cella);

			cella = new Listcell();
			cella.setLabel(String.valueOf(anagrafiche.getKanagra()));
			riga.appendChild(cella);
			
			cella = new Listcell();
			cella.setLabel(anagrafiche.getNominativo());
			riga.appendChild(cella);		

			cella = new Listcell();
			cella.setLabel(anagrafiche.getCodicefiscale());
			riga.appendChild(cella);		

			cella = new Listcell();
			cella.setLabel(anagrafiche.getIndirizzoresidenza());
			riga.appendChild(cella);		

			cella = new Listcell();
			cella.setLabel(anagrafiche.getSiglaprovinciaresidenza());
			riga.appendChild(cella);		

			cella = new Listcell();
//			cella.setLabel(anagrafiche.getDataulteff());
			cella.setLabel(anagrafiche.getDataulteff().substring(6, 8) + "/" + anagrafiche.getDataulteff().substring(4, 6) + "/" + anagrafiche.getDataulteff().substring(0, 4));
			
			riga.appendChild(cella);		

			cella = new Listcell();
			cella.setLabel(String.valueOf(anagrafiche.getNumtoteff()));
			riga.appendChild(cella);		
			
			cella = new Listcell();
//			cella.setLabel(String.valueOf(anagrafiche.getImptoteff()));
			cella.setLabel(String.valueOf(df.format(anagrafiche.getImptoteff())));
			
			riga.appendChild(cella);		

			
			lbListaAnag.appendChild(riga);
		 }
		inbNpag.setValue(pagina);
		totPag = 0;
		if ((result.size() % 12) == 0) {
			totPag = result.size() / 12;
		} else {
			totPag = (result.size() / 12) + 1;
		}
		if (totPag == 0) {
			totPag = 1;
		}
		
		lblFoo1.setValue("di " + totPag);
		endList = System.currentTimeMillis();
   }  
	
	
	public void onClick$btnNewRic(Event event) throws IOException{
		pnlRPLista.setVisible(false);
		pnlRPRicerca.setOpen(true);
		pnlRPRicerca.setVisible(true);
		
	}

	public void onClick$btnGoPage(Event event) throws IOException{
		if (inbNpag.getValue() < 1) {
			inbNpag.setValue(1);
		}
		if (inbNpag.getValue() > totPag) {
			inbNpag.setValue(totPag);
		}

		MyBatisConnectionFactory.openSqlSession();
		sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		riempiLb(inbNpag.getValue());
		
		MyBatisConnectionFactory.closeSqlSession();
	}
	
	public void onClick$btnPagPrec(Event event) {
		if ((inbNpag.getValue() - 1) < 1) {
			inbNpag.setValue(1);
		} else {
			inbNpag.setValue((inbNpag.getValue() - 1));
		}
		MyBatisConnectionFactory.openSqlSession();
		sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		riempiLb(inbNpag.getValue());
		
		MyBatisConnectionFactory.closeSqlSession();
	}

	public void onClick$btnPagSucc(Event event) {
		if ((inbNpag.getValue() + 1) > totPag) {
			inbNpag.setValue(totPag);
		} else {
			inbNpag.setValue((inbNpag.getValue() + 1));
		}
		MyBatisConnectionFactory.openSqlSession();
		sqlSession = MyBatisConnectionFactory.getSqlSession();
		
		riempiLb(inbNpag.getValue());
		
		MyBatisConnectionFactory.closeSqlSession();
		
	}

	
	public void onCreate() {
	   pnlRPLista.setOpen(false);
	   pnlRPLista.setVisible(false);
   }
	
   public void onChanging$txbNom(Event event) {
	   lbListaAnag.getItems().clear();
	   pnlRPLista.setOpen(false);
	   pnlRPLista.setVisible(false);	   
   }  

}
