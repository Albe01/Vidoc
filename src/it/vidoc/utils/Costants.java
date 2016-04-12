package it.vidoc.utils;

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
		REMI("Registro Imprese"), 
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

}
