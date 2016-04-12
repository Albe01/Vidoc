package it.vidoc.utils;

import java.io.InputStream;
import java.io.Writer;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class JaxbController {

	public JaxbController() {
		// TODO Auto-generated constructor stub
	}
	
//	unMarshall (con validazione dell’XML sull’XSD)
	public <T> T unMarshall(Class<T> classe, InputStream in, InputStream xsd) throws JAXBException, SAXException {
 
		JAXBContext jc = JAXBContext.newInstance(classe);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
 
		Source schemaSource = new StreamSource(xsd);
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
 
		//Schema schema = sf.newSchema(schemaSource);
 
		//unmarshaller.setSchema(schema);
 
		@SuppressWarnings("unchecked")
		T result = (T) unmarshaller.unmarshal(in);
 
		return (T) result;
	}
 
//	Marshall (verso una stringa)
	public <T> void marshall(T root, Writer writer, Boolean formatted_output) throws JAXBException {
 
		JAXBContext jc = JAXBContext.newInstance(root.getClass());
 
		Marshaller marshaller = jc.createMarshaller();
		if (formatted_output) {
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);			
		} else {
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
		}

		marshaller.marshal(root, writer);
 
	}	

	
	
	
//	Esempio di utilizzo
//
//	Supponiamo di avere:
//
//	-Un insieme di classi che mappano l’XML di cui LaMiaRadiceXML mappa l’elemento radice
//	-Uno schema XSD test.xsd (da cui abbiamo creato le classi)
//	-Un file XMl test.xml
//	
//	
//	unMarshall (con validazione dell’XML sull’XSD)
//
//				ObjectFactory factory = new ObjectFactory();
//				LaMiaRadiceXML root = factory.createLaMiaRadiceXML();
//	 
//				InputStream in = getClass().getResourceAsStream("/test.xml");
//				InputStream xsd = getClass().getResourceAsStream("/test.xsd");
//	 
//				JaxbController jb = new JaxbController();
//	 
//				try {
//	 
//					root = jb.unMarshall(LaMiaRootXML.class, in, xsd);
//	 
//				} catch (JAXBException e) {
//					e.printStackTrace();
//				} catch (SAXException e) {
//					e.printStackTrace();
//				}
//	
//	
//	
//	
//	
//	Marshall (verso una stringa)
//
//	 
//				ObjectFactory factory = new ObjectFactory();
//				LaMiaRadiceXML root = factory.createLaMiaRadiceXML();		
//	 
//				root.setTitolo("La montagna incantata");	
//	 
//				JaxbController jb = new JaxbController();
//	 
//				StringWriter sw = new StringWriter();
//	 
//				try {
//					jb.marshall(LaMiaRadiceXML, sw);
//				} catch (JAXBException e) {
//					e.printStackTrace();
//				}
//	 
//				System.out.println(sw.toString());
}
