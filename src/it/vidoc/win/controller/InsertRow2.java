package it.vidoc.win.controller;
//package it.vidoc.win.controller;
//
//import it.vidoc.mybatis.javaclient.CdsMapper;
//import it.vidoc.mybatis.javamodel.Cds;
//import it.vidoc.mybatis.javamodel.CdsExample;
//import it.vidoc.mybatis.javamodel.CdsExample.Criteria;
//import it.vidoc.utils.MyBatisConnectionFactory;
//
//import java.io.Reader;
//import java.util.List;
//
//import org.apache.catalina.core.ApplicationContext;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.zkoss.zk.ui.Component;
//import org.zkoss.zk.ui.event.Event;
//import org.zkoss.zk.ui.util.GenericForwardComposer;
//import org.zkoss.zul.Button;
//import org.zkoss.zul.Combobox;
//import org.zkoss.zul.Div;
//import org.zkoss.zul.Grid;
//import org.zkoss.zul.Hbox;
//import org.zkoss.zul.Label;
//import org.zkoss.zul.Row;
//import org.zkoss.zul.Rows;
//import org.zkoss.zul.Textbox;
//import org.zkoss.zul.Toolbarbutton;
//import org.zkoss.zul.Vbox;
//
//
//
//@SuppressWarnings("rawtypes")
//public class InsertRow2 extends GenericForwardComposer{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	Button b_OK;
//	Textbox name;
//	Textbox email;
//	Label l_name;
//	Label l_email;
//	//Row row;
//	//Rows rows;
//	Toolbarbutton toolbarbutton;
//
//	protected Grid grid;
//	protected Label lab;
//	protected Combobox cmb;
//	protected Div div;
//	protected Rows rows;
//	protected Row row;
//	protected Hbox hbox;
//	protected Vbox vbox;
//
//	protected Cds cds = null;
//	protected String xxx = null;
//	protected List<Cds> lst = null;
//	
//	@SuppressWarnings("unchecked")
//	public void doAfterCompose(Component comp) throws Exception {
//		super.doAfterCompose(comp);
//
//		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) MyBatisConnectionFactory.myBatisConnectionFactory();		
//		SqlSession session = sqlSessionFactory.openSession();
//        try {
//            CdsMapper cdsmapper = session.getMapper(CdsMapper.class);
//            
//            cds = cdsmapper.selectByPrimaryKey((long) 1);
//            xxx = cds.getInterpret();
//            lst = cdsmapper.selectByExample(null);
//            cds = lst.get(0);
//            
//            CdsExample example = new CdsExample();
//            Criteria criteria = example.createCriteria();
//            criteria.Albe01("%l%");
//            lst = cdsmapper.selectByExample(example);            
//        } finally {
//            session.close();
//        }		
//	}
//	
//	public void onClick$b_OK(Event event){
////		l_name = new Label(name.getValue());
////		l_email = new Label (email.getValue());
////		toolbarbutton = new Toolbarbutton("delete");
////		row = new Row();
////		l_name.setParent(row);
////		l_email.setParent(row);
////		toolbarbutton.setParent(row);
////		row.setParent(rows);
//		
//		row = new Row();
//		lab = new Label("immagine");
//		lab.setParent(row);
//		
//		vbox = new Vbox();
//		
//		hbox = new Hbox();
//		
//		Label lab1 = null;
//
//		lab1 = new Label("111111");
//		lab1.setParent(hbox);
//		lab1 = new Label("111111");
//		lab1.setParent(hbox);
//		lab1 = new Label("111111");
//		lab1.setParent(hbox);
//		hbox.setParent(vbox);
//		
//		
//		hbox = new Hbox();
//		lab1 = new Label("22222");
//		lab1.setParent(hbox);
//		lab1 = new Label("2222");
//		lab1.setParent(hbox);
//		lab1 = new Label("2222");
//		lab1.setParent(hbox);
//		
//		Textbox txb = null;
//		txb = new Textbox();
//		txb.setReadonly(true);
//		txb.setParent(hbox);
//		
//		hbox.setParent(vbox);
//
//		vbox.setParent(row);
//
//		row.setParent(rows);
//
//	}

//}