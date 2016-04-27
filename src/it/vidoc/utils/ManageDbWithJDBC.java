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
	
	public void insertElencoDocumenti (String data, int progrrigaaccount, String riferimenti, String tipodocumento, FileInputStream documento) {
		String sqlStatement = "INSERT elencodocumenti "
		        + "(data, progrrigaaccount, riferimenti, tipodocumento, documento)"
				+ "values (?, ?, ?, ?, ?)";
		try {
			conn = MyBatisConnectionFactory.getSqlSession().getConnection();
			pstmt = conn.prepareStatement(sqlStatement);
			

			if ("".equals(data) || data == null) {
				pstmt.setString(1, new SimpleDateFormat("yyyyMMdd").format(new Date()));	
			} else {
				pstmt.setString(1, data);
			}
			pstmt.setInt(2, progrrigaaccount);
			pstmt.setString(3, riferimenti);
			pstmt.setString(4, tipodocumento);
			pstmt.setBinaryStream(5, documento);
			
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
		        + "(data, progrrigaaccount, riferimenti, tipodocumento, documento)"
				+ "values (?, ?, ?, ?, ?)";
		try {
			conn = MyBatisConnectionFactory.getSqlSession().getConnection();
			pstmt = conn.prepareStatement(sqlStatement);

			if ("".equals(elencodocumenti.getData()) || elencodocumenti.getData() == null) {
				pstmt.setString(1, new SimpleDateFormat("yyyyMMdd").format(new Date()));	
			} else {
				pstmt.setString(1, elencodocumenti.getData());
			}
			pstmt.setInt(2, elencodocumenti.getProgrrigaaccount());
			pstmt.setString(3, elencodocumenti.getRiferimenti());
			pstmt.setString(4, elencodocumenti.getTipodocumento());
			pstmt.setBytes(5, elencodocumenti.getDocumento());
			
			pstmt.executeUpdate();
			conn.commit();
			conn.close();
		} catch (Exception e) {
			logger.error(new Object(){}.getClass().getEnclosingMethod().getName() + " " + e.getMessage());
		}
	}

	public void updateElencoDocumenti (Elencodocumenti elencodocumenti) {
		String sqlStatement = "UPDATE elencodocumenti "
				+ "set documento = ? "
		        + "where progrriga = ?";
		try {
			conn = MyBatisConnectionFactory.getSqlSession().getConnection();
			pstmt = conn.prepareStatement(sqlStatement);

			pstmt.setBytes(1, elencodocumenti.getDocumento());
			pstmt.setInt(2, elencodocumenti.getProgrriga());
			
			pstmt.executeUpdate();
			conn.commit();
			conn.close();
		} catch (Exception e) {
			logger.error(new Object(){}.getClass().getEnclosingMethod().getName() + " " + e.getMessage());
		}
	}


}
