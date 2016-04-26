package it.vidoc.report;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.zkoss.util.media.AMedia;
import org.zkoss.zk.ui.Sessions;

import it.vidoc.utils.MyBatisConnectionFactory;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.util.JRLoader;

public class GestioneReport {
	private final String PATH_WEBCONTENT = Sessions.getCurrent().getWebApp().getRealPath("/");
	private final String JASPER_REPORT_FOLDER = PATH_WEBCONTENT + "report";
	
	private JRResultSetDataSource getReportConnectionQuery(String query) throws SQLException {

		Connection connection;  
		Statement statement;  
		ResultSet resultSet;  
		
		connection = MyBatisConnectionFactory.getSqlSession().getConnection();
		
		statement = connection.createStatement();  
		  
		resultSet = statement.executeQuery(query);  
		JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(resultSet);  

		return resultSetDataSource;
	}

	private Connection getReportConnection() throws SQLException {
		Connection connection;  
		connection = MyBatisConnectionFactory.getSqlSession().getConnection();
		return connection;
	}

	
	public HashMap<String, Object> getReportParam(String JASPER_FILENAME, String query, Map<String, Object> parametri) throws JRException, SQLException {
		JasperReport jasperReport = null;
		JasperPrint jasperPrint = null;
		
		//Compilazione report
		JasperCompileManager.compileReportToFile(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jrxml");
//		boolean exist = (new File(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jasper")).exists();
//		if (!exist) {
//			//jasperReport = JasperCompileManager.compileReport(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jrxml");
//			JasperCompileManager.compileReportToFile(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jrxml");
//		}

		jasperReport = (JasperReport) JRLoader.loadObjectFromFile(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jasper");

		AMedia aMedia = null;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		
		// Creo HASH MAP dei parametri 
		for (Map.Entry<String, Object> entry : parametri.entrySet()) {
		    String key = entry.getKey();
		    if (entry.getValue() instanceof String) {
		    	String value = (String) entry.getValue();
		    	parameterMap.put(key, value);
			}
		    if (entry.getValue() instanceof Long) {
		    	Long value = (Long) entry.getValue();
		    	parameterMap.put(key, value);
			}
		}
		parameterMap.put("PATH_WEBCONTENT", PATH_WEBCONTENT);
		
		Connection conn = null ;
		JRResultSetDataSource connResult = null;
		byte[] buf = null;
		
		if (query == null) {
			conn = getReportConnection();
		} else {
			connResult = getReportConnectionQuery(query);
		}

		HashMap<String, Object> ret = new HashMap<String, Object>();
		
		if (query == null) {
			buf = JasperRunManager.runReportToPdf(jasperReport, parameterMap, conn);
			jasperPrint = JasperFillManager.fillReport(jasperReport, parameterMap, conn);
			
		} else {
			buf = JasperRunManager.runReportToPdf(jasperReport, parameterMap, connResult);
			jasperPrint = JasperFillManager.fillReport(jasperReport, parameterMap, connResult);
		}

		InputStream mediaIS = new ByteArrayInputStream(buf);
		aMedia = new AMedia(JASPER_FILENAME + ".pdf", "pdf", "application/pdf", mediaIS);
		
		ret.put("aMedia", aMedia);
		ret.put("jasperReport", jasperReport);
		ret.put("jasperPrint", jasperPrint);
		ret.put("documentByte", buf);
		return ret;
	}
}
