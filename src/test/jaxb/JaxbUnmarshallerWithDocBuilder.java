package test.jaxb;
import it.vidoc.registro.imprese.output.ri.response.TestataType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;

import org.w3c.dom.Document;


public class JaxbUnmarshallerWithDocBuilder {
    public static void main(String args[]){
        try{
            JAXBContext jc = JAXBContext.newInstance("com.kartikshah.api.account.wsdl");
            Unmarshaller u = jc.createUnmarshaller();
 
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder db = dbf.newDocumentBuilder();
//            Document doc = db.parse(JaxbUnmarshallerWithDocBuilder.class.getResource("account.xml"));
//            Node fooSubtree = doc.getFirstChild();
 
//            JAXBElement<TestataType> account = u.unmarshal( fooSubtree, TestataType.class);
        }
        catch (Exception e){
            // ... Omitted for brevity
        }
    }
}