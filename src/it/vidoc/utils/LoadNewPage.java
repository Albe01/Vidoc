package it.vidoc.utils;

import java.util.Collection;
import java.util.Iterator;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Borderlayout;
import org.zkoss.zul.Center;

@SuppressWarnings("rawtypes")
public class LoadNewPage  extends GenericForwardComposer{
	private static final long serialVersionUID = -1553487093595613008L;
	public static void loadNewPage(String pageZul){
		Page page = null;
		String idWin = null;
		Borderlayout borderlayout;
		Collection c = Executions.getCurrent().getDesktop().getPages();
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			page = (Page) iterator.next();
			idWin = page.getFirstRoot().getId();
//			System.out.println(page.getId());
			// your <? page xxxx ?> in include file will be ignore, coz ZK page
			// is just like your "PAGE" only seen ONE !!
		}
		borderlayout = (Borderlayout) page.getFellow(idWin).getFellow("blayout");
		
//		//get an instance of the borderlayout defined in the zul-file
//		Borderlayout bl = (Borderlayout) this.page.getFellow("winMain").getFellow("blayout");
//
		//get an instance of the searched CENTER layout area 
		Center center = borderlayout.getCenter();
		//center.setFlex(true);

		//clear the center child comps 
		center.getChildren().clear();

		//create the page and put it in the center layout area	
		Executions.createComponents(pageZul, center, null);	
	}
}	
