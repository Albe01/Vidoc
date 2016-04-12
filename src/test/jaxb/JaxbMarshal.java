package test.jaxb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbMarshal {  
    String filePath;
    String context;
    JAXBContext jaxbContext;
 
    public JaxbMarshal(String filePath, String context){
        this.filePath=filePath;
        this.context=context;
        try {
            jaxbContext = JAXBContext.newInstance(context);
        } catch (JAXBException e) {         
            e.printStackTrace();
        }
    }       
    
    public void getMarshalledFile(Object object){       
        Marshaller marshaller=null;     
        try {           
            marshaller = jaxbContext.createMarshaller ();           
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
            marshaller.marshal(object, new FileOutputStream(filePath));
        } catch (JAXBException e) {         
            e.printStackTrace();
        } catch (FileNotFoundException e) {         
            e.printStackTrace();
        }                       
    }
    
    
    public String getMarshalledString(Object object){
    	final StringWriter stringWriter = new StringWriter();
        Marshaller marshaller=null;     
        try {           
            marshaller = jaxbContext.createMarshaller ();           
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
            marshaller.marshal(object, stringWriter);
        } catch (JAXBException e) {         
            e.printStackTrace();
        }
        return stringWriter.toString();
    }
}