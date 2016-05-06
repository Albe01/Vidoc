package it.vidoc.report;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zkoss.util.media.AMedia;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
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
	private final Logger logger = Logger.getLogger(getClass());
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
		
		
		String fileBuild = "//it//vidoc//report//source//" + JASPER_FILENAME + ".jasper";
		InputStream inBuild = getClass().getResourceAsStream(fileBuild);
		if (inBuild != null) {
			jasperReport = (JasperReport) JRLoader.loadObject(inBuild);
		} else {
			String fileSource = "//it//vidoc//report//source//" + JASPER_FILENAME + ".jrxml";
			InputStream inSource = getClass().getResourceAsStream(fileSource);
			jasperReport = JasperCompileManager.compileReport(inSource);
		}
		
		
		
		//Compilazione report
//		JasperCompileManager.compileReportToFile(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jrxml");
//		String fileJasper = JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jasper";
//		logger.info("Jasper - fileJasper=" + fileJasper);
//		boolean exist = (new File(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jasper")).exists();
//		if (!exist) {
//			logger.info("Jasper - fileJasper non esiste compilo");
//			//jasperReport = JasperCompileManager.compileReport(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jrxml");
//			JasperCompileManager.compileReportToFile(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jrxml");
//			logger.info("Jasper - dopo compila Jasper");
//		} else {
//			logger.info("Jasper - fileJasper gia' esiste");
//		}
//
//		jasperReport = (JasperReport) JRLoader.loadObjectFromFile(JASPER_REPORT_FOLDER + File.separator + JASPER_FILENAME + ".jasper");

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
