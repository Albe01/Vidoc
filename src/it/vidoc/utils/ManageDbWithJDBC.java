package it.vidoc.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import it.vidoc.mybatis.javamodel.Elencodocumenti;

public class ManageDbWithJDBC {
	private final Logger logger = Logger.getLogger(getClass());
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	public void insertElencoDocumenti (int progrrigaaccount, String data, String tipodocumento, FileInputStream documento) {
		String sqlStatement = "INSERT elencodocumenti "
		        + "(progrrigaaccount, data, tipodocumento, documento)"
				+ "values (?, ?, ?, ?)";
		try {
			conn = MyBatisConnectionFactory.getSqlSession().getConnection();
			pstmt = conn.prepareStatement(sqlStatement);
			pstmt.setInt(1, progrrigaaccount);
			if ("".equals(data) || data == null) {
				pstmt.setString(2, new SimpleDateFormat("yyyyMMdd").format(new Date()));	
			} else {
				pstmt.setString(2, data);
			}
			pstmt.setString(3, tipodocumento);
			pstmt.setBinaryStream(4, documento);
			pstmt.executeUpdate();
			conn.commit();
			conn.close();
		} catch (Exception e) {
			logger.error(new Object(){}.getClass().getEnclosingMethod().getName() + " " + e.getMessage());
		} finally {
			try {
				if (documento != null) {
					documento.close();						
				}
			} catch (Exception e2) {
				logger.error(new Object(){}.getClass().getEnclosingMethod().getName() + " " + e2.getMessage());
			}
		}
	}

	public void insertElencoDocumenti (Elencodocumenti elencodocumenti) {
		String sqlStatement = "INSERT elencodocumenti "
		        + "(progrrigaaccount, data, tipodocumento, documento)"
				+ "values (?, ?, ?, ?)";
		try {
			conn = MyBatisConnectionFactory.getSqlSession().getConnection();
			pstmt = conn.prepareStatement(sqlStatement);
			pstmt.setInt(1, elencodocumenti.getProgrrigaaccount());
			if ("".equals(elencodocumenti.getData()) || elencodocumenti.getData() == null) {
				pstmt.setString(2, new SimpleDateFormat("yyyyMMdd").format(new Date()));	
			} else {
				pstmt.setString(2, elencodocumenti.getData());
			}
			pstmt.setString(3, elencodocumenti.getTipodocumento());
			pstmt.setBytes(4, elencodocumenti.getDocumento());
			pstmt.executeUpdate();
			conn.commit();
			conn.close();
		} catch (Exception e) {
			logger.error(new Object(){}.getClass().getEnclosingMethod().getName() + " " + e.getMessage());
		}
	}


}
