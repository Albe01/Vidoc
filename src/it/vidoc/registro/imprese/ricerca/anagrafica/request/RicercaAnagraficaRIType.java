//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 05:57:20 PM CEST 
//


package it.vidoc.registro.imprese.ricerca.anagrafica.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RicercaAnagraficaRIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RicercaAnagraficaRIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ListaImpreseRI" type="{}ListaImpreseRIType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RicercaAnagraficaRIType", propOrder = {
    "listaImpreseRI"
})
public class RicercaAnagraficaRIType {

    @XmlElement(name = "ListaImpreseRI")
    protected ListaImpreseRIType listaImpreseRI;

    /**
     * Gets the value of the listaImpreseRI property.
     * 
     * @return
     *     possible object is
     *     {@link ListaImpreseRIType }
     *     
     */
    public ListaImpreseRIType getListaImpreseRI() {
        return listaImpreseRI;
    }

    /**
     * Sets the value of the listaImpreseRI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaImpreseRIType }
     *     
     */
    public void setListaImpreseRI(ListaImpreseRIType value) {
        this.listaImpreseRI = value;
    }

}
