//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:16:18 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RicercaContrattoReteXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RicercaContrattoReteXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RicPerChiaveContrattoXml" type="{}RicPerChiaveContrattoXmlType"/>
 *         &lt;element name="RicPerCodFiscContrattoXml" type="{}RicPerCodFiscContrattoXmlType"/>
 *         &lt;element name="RicPerDenomContrattoXml" type="{}RicPerDenomContrattoXmlType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RicercaContrattoReteXmlType", propOrder = {
    "ricPerChiaveContrattoXml",
    "ricPerCodFiscContrattoXml",
    "ricPerDenomContrattoXml"
})
public class RicercaContrattoReteXmlType {

    @XmlElement(name = "RicPerChiaveContrattoXml")
    protected RicPerChiaveContrattoXmlType ricPerChiaveContrattoXml;
    @XmlElement(name = "RicPerCodFiscContrattoXml")
    protected RicPerCodFiscContrattoXmlType ricPerCodFiscContrattoXml;
    @XmlElement(name = "RicPerDenomContrattoXml")
    protected RicPerDenomContrattoXmlType ricPerDenomContrattoXml;

    /**
     * Gets the value of the ricPerChiaveContrattoXml property.
     * 
     * @return
     *     possible object is
     *     {@link RicPerChiaveContrattoXmlType }
     *     
     */
    public RicPerChiaveContrattoXmlType getRicPerChiaveContrattoXml() {
        return ricPerChiaveContrattoXml;
    }

    /**
     * Sets the value of the ricPerChiaveContrattoXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link RicPerChiaveContrattoXmlType }
     *     
     */
    public void setRicPerChiaveContrattoXml(RicPerChiaveContrattoXmlType value) {
        this.ricPerChiaveContrattoXml = value;
    }

    /**
     * Gets the value of the ricPerCodFiscContrattoXml property.
     * 
     * @return
     *     possible object is
     *     {@link RicPerCodFiscContrattoXmlType }
     *     
     */
    public RicPerCodFiscContrattoXmlType getRicPerCodFiscContrattoXml() {
        return ricPerCodFiscContrattoXml;
    }

    /**
     * Sets the value of the ricPerCodFiscContrattoXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link RicPerCodFiscContrattoXmlType }
     *     
     */
    public void setRicPerCodFiscContrattoXml(RicPerCodFiscContrattoXmlType value) {
        this.ricPerCodFiscContrattoXml = value;
    }

    /**
     * Gets the value of the ricPerDenomContrattoXml property.
     * 
     * @return
     *     possible object is
     *     {@link RicPerDenomContrattoXmlType }
     *     
     */
    public RicPerDenomContrattoXmlType getRicPerDenomContrattoXml() {
        return ricPerDenomContrattoXml;
    }

    /**
     * Sets the value of the ricPerDenomContrattoXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link RicPerDenomContrattoXmlType }
     *     
     */
    public void setRicPerDenomContrattoXml(RicPerDenomContrattoXmlType value) {
        this.ricPerDenomContrattoXml = value;
    }

}
