//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modelli-trascrizioni element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="modelli-trascrizioni">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}modelli" minOccurs="0"/>
 *           &lt;element ref="{}trascrizioni-ri" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modelli",
    "trascrizioniRi"
})
@XmlRootElement(name = "modelli-trascrizioni")
public class ModelliTrascrizioni {

    protected Modelli modelli;
    @XmlElement(name = "trascrizioni-ri")
    protected TrascrizioniRi trascrizioniRi;

    /**
     * Gets the value of the modelli property.
     * 
     * @return
     *     possible object is
     *     {@link Modelli }
     *     
     */
    public Modelli getModelli() {
        return modelli;
    }

    /**
     * Sets the value of the modelli property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modelli }
     *     
     */
    public void setModelli(Modelli value) {
        this.modelli = value;
    }

    /**
     * Gets the value of the trascrizioniRi property.
     * 
     * @return
     *     possible object is
     *     {@link TrascrizioniRi }
     *     
     */
    public TrascrizioniRi getTrascrizioniRi() {
        return trascrizioniRi;
    }

    /**
     * Sets the value of the trascrizioniRi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrascrizioniRi }
     *     
     */
    public void setTrascrizioniRi(TrascrizioniRi value) {
        this.trascrizioniRi = value;
    }

}
