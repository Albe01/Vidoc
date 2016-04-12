package test.jaxb;

import it.vidoc.registro.protesti.request.ObjectFactory;
import it.vidoc.registro.protesti.request.PerChiaveAnagraficaType;
import it.vidoc.registro.protesti.request.RegistroProtestiType;
import it.vidoc.registro.protesti.request.VisuraEffettoType;
import it.vidoc.registro.protesti.visura.effetto.response.Risposta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Date;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class TestJaxb {

	public TestJaxb() {
	}


	public static void main(String[] args) {
		String alberto;
		

		String filePathInp = null;
		String filePathOut = null;
		String context = null;
		JaxbUnmarshal unmarshall = null;
		JaxbMarshal marshall = null;
		Risposta risposta = null;
		
		filePathInp = "C:/Users/a.deblasio/Desktop/InfoCamereXSD/Registro Informatico Protesti/Esempi/ve.xml";		
		filePathOut = "C:/Users/a.deblasio/Desktop/InfoCamereXSD/Registro Informatico Protesti/Esempi/JAXBoutputFile.xml";
		context = "it.vidoc.registro.protesti.visura.effetto.response";

		
		
	    // VISURA da fileXML a classe	    
	    unmarshall = new JaxbUnmarshal(filePathInp, context);
	    risposta = (Risposta) unmarshall.getUnmarshalledObjectFromFile();
	    StampGenericXML.staticStampGenericXML(risposta, context);
	    alberto = null;
	    
	    
	    // VISURA da stringaXML a classe
	    String riga = "";
	    String stringaXML = "";
		File fileInput = new File(filePathInp);
		if (fileInput.isFile()) {
			try {
				BufferedReader input = new BufferedReader(new FileReader(fileInput));
				while ((riga = input.readLine()) != null) {
					stringaXML = stringaXML + riga;
				}
			} catch (IOException ioException) {
			}
		}
	    unmarshall = new JaxbUnmarshal(null, context);
		risposta = (Risposta) unmarshall.getUnmarshalledObjectFromString(stringaXML);
	    StampGenericXML.staticStampGenericXML(risposta, context);
	    alberto = null;
	    
	    
	    // VISURA da classe a file XML
	    marshall = new JaxbMarshal(filePathOut, context);
	    marshall.getMarshalledFile(risposta);
	    alberto = null;
	    
	    // VISURA da classe a stringa XML
	    marshall = new JaxbMarshal(null, context);
	    String xmlReturn = marshall.getMarshalledString(risposta);
	    alberto = null;
	    
	    
	    
	    
	    it.vidoc.registro.protesti.request.PerChiaveAnagraficaType ka = new it.vidoc.registro.protesti.request.PerChiaveAnagraficaType();
	    ka.setKAnagrafica("123456789");
	    
	    it.vidoc.registro.protesti.request.VisuraEffettoType ve = new it.vidoc.registro.protesti.request.VisuraEffettoType();
	    ve.setPerChiaveAnagrafica(ka);
	    
	    it.vidoc.registro.protesti.request.RegistroProtestiType rp = new it.vidoc.registro.protesti.request.RegistroProtestiType();
	    rp.setVisuraEffetto(ve);
	  
//		Request ko manca xmlroot	    
	    context = "it.vidoc.registro.protesti.request";
	    marshall = new JaxbMarshal(filePathInp, context);
	    xmlReturn = marshall.getMarshalledString(rp);
	    alberto = null;
	    
	    
//		Request OK anche senza xmlroot	    
	    ObjectFactory objectFactory = new ObjectFactory();
	    JAXBElement<RegistroProtestiType> je = objectFactory.createRegistroProtesti(rp);
	    xmlReturn = marshall.getMarshalledString(je);
	    alberto = null;

	    
	    
//		Response OK con xmlroot	    
	    context = "it.vidoc.registro.protesti.visura.effetto.response";
	    marshall = new JaxbMarshal(filePathInp, context);
	    xmlReturn = marshall.getMarshalledString(risposta);
	    alberto = null;

//	    StampGenericXML.staticStampGenericXML(risposta, context);
	}
}
