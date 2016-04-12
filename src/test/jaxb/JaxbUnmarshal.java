package test.jaxb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshal {
	String filePath;
    String context;
    JAXBContext jaxbContext;
    InputStream InpStr;
    
    public JaxbUnmarshal(String filePath, String context){
        this.filePath=filePath;
        this.context=context;
        try {
            jaxbContext = JAXBContext.newInstance (context);
        } catch (JAXBException e) {         
            e.printStackTrace();
        }
    }
    
    public Object getUnmarshalledObjectFromFile(){
    	Unmarshaller unmarshaller=null;
    	Object objectJAXB=null;
	    try {           
	        unmarshaller = jaxbContext.createUnmarshaller ();       
	        objectJAXB = unmarshaller.unmarshal( new FileInputStream(filePath));
	        } catch (JAXBException e) {         
	            e.printStackTrace();
	        } catch (FileNotFoundException e) {         
	            e.printStackTrace();
	        }           
	    return objectJAXB;
    }
    
    public Object getUnmarshalledObjectFromString(String stringaXML){
    	Unmarshaller unmarshaller=null;
    	Object objectJAXB=null;
	    try {           
	        unmarshaller = jaxbContext.createUnmarshaller ();       
	        objectJAXB = unmarshaller.unmarshal( new StringReader(stringaXML));
	        } catch (JAXBException e) {         
	            e.printStackTrace();
	        }           
	    return objectJAXB;
    }

    
    
    
    
}
