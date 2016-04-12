package it.vidoc.servlet;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import it.vidoc.mybatis.javamodel.Infcomuni;
import it.vidoc.mybatis.javamodel.Logelab;
import it.vidoc.mybatis.sqlquery.SqlInfComuni;
import it.vidoc.mybatis.sqlquery.SqlLogElab;

@SuppressWarnings("serial")
public class MyServlet1  extends HttpServlet {
	
	public void init() throws ServletException {
		List<Logelab> lst = new SqlLogElab().selectByExample(new Logelab(), "progrriga");
	}

}
