//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.27 at 11:18:10 AM CEST 
//


package it.vidoc.registro.protesti.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerChiaveAnagraficaHtmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerChiaveAnagraficaHtmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KAnagrafica" type="{}KAnagraficaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerChiaveAnagraficaHtmlType", propOrder = {
    "kAnagrafica"
})
public class PerChiaveAnagraficaHtmlType {

    @XmlElement(name = "KAnagrafica", required = true)
    protected String kAnagrafica;

    /**
     * Gets the value of the kAnagrafica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKAnagrafica() {
        return kAnagrafica;
    }

    /**
     * Sets the value of the kAnagrafica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKAnagrafica(String value) {
        this.kAnagrafica = value;
    }

}
