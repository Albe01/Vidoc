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
 * <p>Java class for InformazioniImpresaTestoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformazioniImpresaTestoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PerChiaveReaTesto" type="{}PerChiaveReaTestoType"/>
 *         &lt;element name="PerCodFiscSedeTesto" type="{}PerCodFiscSedeTestoType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformazioniImpresaTestoType", propOrder = {
    "perChiaveReaTesto",
    "perCodFiscSedeTesto"
})
public class InformazioniImpresaTestoType {

    @XmlElement(name = "PerChiaveReaTesto")
    protected PerChiaveReaTestoType perChiaveReaTesto;
    @XmlElement(name = "PerCodFiscSedeTesto")
    protected PerCodFiscSedeTestoType perCodFiscSedeTesto;

    /**
     * Gets the value of the perChiaveReaTesto property.
     * 
     * @return
     *     possible object is
     *     {@link PerChiaveReaTestoType }
     *     
     */
    public PerChiaveReaTestoType getPerChiaveReaTesto() {
        return perChiaveReaTesto;
    }

    /**
     * Sets the value of the perChiaveReaTesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerChiaveReaTestoType }
     *     
     */
    public void setPerChiaveReaTesto(PerChiaveReaTestoType value) {
        this.perChiaveReaTesto = value;
    }

    /**
     * Gets the value of the perCodFiscSedeTesto property.
     * 
     * @return
     *     possible object is
     *     {@link PerCodFiscSedeTestoType }
     *     
     */
    public PerCodFiscSedeTestoType getPerCodFiscSedeTesto() {
        return perCodFiscSedeTesto;
    }

    /**
     * Sets the value of the perCodFiscSedeTesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCodFiscSedeTestoType }
     *     
     */
    public void setPerCodFiscSedeTesto(PerCodFiscSedeTestoType value) {
        this.perCodFiscSedeTesto = value;
    }

}
