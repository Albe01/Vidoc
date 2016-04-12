package it.vidoc.servlet;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import it.vidoc.mybatis.javamodel.Infcomuni;
import it.vidoc.mybatis.sqlquery.SqlInfComuni;

@SuppressWarnings("serial")
public class MyServlet  extends HttpServlet {
	
	public void init() throws ServletException {
		System.out.println("----------");
        System.out.println("---------- Ciao ----------");
        System.out.println("----------");
        Infcomuni infcomuni = new Infcomuni();
        infcomuni.setCodicecomune("999");
//		List<Infcomuni> lstPrv = new SqlInfComuni().getProvincie();
		List<Infcomuni> lstPrv = new SqlInfComuni().selectByExample(infcomuni, "denomcomune");
        System.out.println("----------");
	}

}
