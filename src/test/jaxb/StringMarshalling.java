//consente di convertire un oggetto JAXB in una comune stringa di testo


package test.jaxb;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class StringMarshalling {

	 static public String getXMLString(String context, Object objectJAXB){
	        StringWriter xml = new StringWriter();
	        String xmlString = new String();
	        try {
	            JAXBContext jaxbLocalContext = JAXBContext.newInstance (context);
	            jaxbLocalContext.createMarshaller().marshal(objectJAXB, xml);
	            xmlString = xml.toString();         
	        } catch (JAXBException e1) {            
	            e1.printStackTrace();
	        }
	        return xmlString;
	    }   
}
