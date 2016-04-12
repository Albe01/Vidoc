package test.jaxb;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class StringUnmarshalling {

	String text;
    String context;
    JAXBContext jaxbContext;    
    public static Object getObject(String context, String stringToConvert, boolean displayStamp){
        Unmarshaller unmarshaller=null;
        Object objectJAXB=null;     
        try {   
            JAXBContext jaxbContext = JAXBContext.newInstance (context);
            unmarshaller = jaxbContext.createUnmarshaller();    
            StringBuffer xmlString = new StringBuffer(stringToConvert);
            objectJAXB = unmarshaller.unmarshal(new StringReader(xmlString.toString()));
        } catch (JAXBException e) {         
            e.printStackTrace();
        }       
        return objectJAXB;
    }   
}
