package test.jaxb;
import it.vidoc.registro.protesti.request.ObjectFactory;
import it.vidoc.registro.protesti.request.RegistroProtestiType;

import javax.xml.bind.*;
 
public class TestJaxb02 {
 
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance("it.vidoc.registro.protesti.request");
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 

	    it.vidoc.registro.protesti.request.PerChiaveAnagraficaType ka = new it.vidoc.registro.protesti.request.PerChiaveAnagraficaType();
	    ka.setKAnagrafica("123456789");
	    
	    it.vidoc.registro.protesti.request.VisuraEffettoType ve = new it.vidoc.registro.protesti.request.VisuraEffettoType();
	    ve.setPerChiaveAnagrafica(ka);
	    
	    it.vidoc.registro.protesti.request.RegistroProtestiType rp = new it.vidoc.registro.protesti.request.RegistroProtestiType();
	    rp.setVisuraEffetto(ve);

 
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<RegistroProtestiType> je =  objectFactory.createRegistroProtesti(rp);
        marshaller.marshal(je, System.out);
    }
    
}