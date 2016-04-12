package it.vidoc.listeners;

import java.io.Reader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//@WebListener
public class CustomServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		
	      System.out.println("aaaaaaaaaaaaaaaa");
		
		ServletContext ctx = event.getServletContext();  
        
	     String resource = "MyBatisSqlMapConfig.xml";
	     try{
	      //load mybatis configuration 
	      Reader reader = Resources.getResourceAsReader(resource);      
	      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	      ctx.setAttribute("sqlSessionFactory", sqlSessionFactory);
	     }
	     catch(Exception e){
	      System.out.println("FATAL ERROR: myBatis could not be initialized");
	      System.exit(1);
	     }  		
	}
}
