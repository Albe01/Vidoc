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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DaFileGuidaPerChiaveAnagraficaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaFileGuidaPerChiaveAnagraficaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeFileGuida" type="{}NomeFileGuidaType"/>
 *         &lt;element name="DtAgg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaFileGuidaPerChiaveAnagraficaType", propOrder = {
    "nomeFileGuida",
    "dtAgg"
})
public class DaFileGuidaPerChiaveAnagraficaType {

    @XmlElement(name = "NomeFileGuida", required = true)
    protected String nomeFileGuida;
    @XmlElement(name = "DtAgg")
    protected XMLGregorianCalendar dtAgg;

    /**
     * Gets the value of the nomeFileGuida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFileGuida() {
        return nomeFileGuida;
    }

    /**
     * Sets the value of the nomeFileGuida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFileGuida(String value) {
        this.nomeFileGuida = value;
    }

    /**
     * Gets the value of the dtAgg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAgg() {
        return dtAgg;
    }

    /**
     * Sets the value of the dtAgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAgg(XMLGregorianCalendar value) {
        this.dtAgg = value;
    }

}
