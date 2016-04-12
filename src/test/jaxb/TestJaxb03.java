package test.jaxb;

import it.vidoc.registro.protesti.visura.effetto.response.ObjectFactory;
import it.vidoc.registro.protesti.visura.effetto.response.Risposta;
import it.vidoc.utils.JaxbController;

import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

public class TestJaxb03 {
	
	public static void main(String[] args) {
		new TestJaxb03().execute();
		
		
	}

	private void execute () {
		ObjectFactory factory = new ObjectFactory();
		Risposta risposta = factory.createRisposta();

		InputStream in = getClass().getResourceAsStream("/xmlEsempi/ve.xml");
		InputStream xsd = getClass().getResourceAsStream("/xsdEsempi/VisuraEffettoUnico.xsd");
		JaxbController jb = new JaxbController();
		 
		try {
		 
			risposta = jb.unMarshall(Risposta.class, in, xsd);
		 
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}		

		
		
		
		
		
		StringWriter sw = new StringWriter();
		try {
			jb.marshall(risposta, sw, false);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	 
		System.out.println(sw.toString());

		
		
		
		
	}

}
