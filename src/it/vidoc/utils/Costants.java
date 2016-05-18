package it.vidoc.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Costants {

	public final static String AMEDcodiceBancaDati = "AMED";
	public final static String AMEDcodiceRichiestaLista = "AMLI01";
	public final static String AMEDcodiceRispostaLista = "AMLI01";
	public final static String AMEDcodiceRichiestaVisura = "AMVI01";
	public final static String AMEDcodiceRispostaVisura = "AMVI01";
	
	public final static String RequestOnLine = "O";
	public final static String RequestDiff = "D";
	public final static String RequestPositova = "+";
	public final static String RequestNegativa = "-";
	
	public enum BANCA_DATI {      
		AMED("Protesti Amedeo"), 
		REIM("Registro Imprese"),
		REGP("Registro Protesti"),
		BOND("Bilanci Ottici"),
		;

	    private String name;

		private BANCA_DATI(String stringVal) {
		    name = stringVal;
		}
		public String value(){
		    return name;
		}
		
		public String key(){
		    return this.toString();
		}
	}	

	public enum RICHIESTA {      
		AMLI01("Ricerca Anagrafica"), 
		AMVI01("Visura Protesti"),
		VATTU("Visura Ordinaria"),
		VSTOR("Visura Storica"),
		FATTU("Fscicolo"),
		FSTOR("Fascicolo Storico"),
		PRLIS1("Ricerca Anagrafica"),
		PRVIS1("Visura Protesti"),
		BDLST1("Ricerca Anagrafica"),
		BDLST2("Lista Prospetti di Bilancio"),
		BDPAG("Pagina di Bilancio"),
		BDRICH("Bilancio Ottico"),
		;

	    private String name;

		private RICHIESTA(String stringVal) {
		    name = stringVal;
		}
		public String value(){
		    return name;
		}
		
		public String key(){
		    return this.toString();
		}
	}	

	public enum RISPOSTA {      
		AMLI01("Ricerca Anagrafica"), 
		AMVI01("Visura Protesti"), 
		VATTU("Visura Ordinaria"),
		VSTOR("Visura Storica"),
		FATTU("Fscicolo"),
		FSTOR("Fascicolo Storico"),
		PRLIS1("Ricerca Anagrafica"),
		PRVIS1("Visura Protesti"),
		BDLST1("Ricerca Anagrafica"),
		BDLST2("Lista Prospetti di Bilancio"),
		BDPAG("Pagina di Bilancio"),
		BDRICH("Bilancio Ottico"),
		;

	    private String name;

		private RISPOSTA(String stringVal) {
		    name = stringVal;
		}
		public String value(){
		    return name;
		}
		
		public String key(){
		    return this.toString();
		}
	}	
	
	public static synchronized String getTmpDir(){
		String tmpDir = "";
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			tmpDir = "C:" + File.separator + "Windows" + File.separator + "Temp";
		} else {
			tmpDir = File.separator + "/tmp";
		}
		return tmpDir;
//		return("C:" + File.separator + "temp");
	}
	
	public static synchronized Boolean appendToFileTXT(String riga, FileWriter fileWriter){
		try {
			fileWriter.append(riga);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static synchronized FileWriter createFileTxtAppend(String nomeFileCompleto) {
		FileWriter fileWriter = null;
		File file = new File(nomeFileCompleto);
		file.delete();
		try {
			fileWriter = new FileWriter(file,true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileWriter;
	}

	public static synchronized Boolean deleteFileFromFS(String fileName) {
		try {
			File file = new File(fileName);
			return file.delete();
//			System.out.println((file.delete()) ? "successfully deleted" : "failed to be deleted");
		} catch(Exception e1) {
		}
		return false;
	}

	public static synchronized Date parseDate(String date, String format) {
		Date data = null;
	    SimpleDateFormat formatter = new SimpleDateFormat(format);
	    try {
	    	data =  formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    return data;
	}
}
