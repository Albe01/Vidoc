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
 * <p>Java class for InformazioniReteImpresaPdfType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformazioniReteImpresaPdfType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;choice>
 *           &lt;element name="PerChiaveContrattoPdf" type="{}PerChiaveContrattoPdfType"/>
 *           &lt;element name="PerCodFiscContrattoPdf" type="{}PerCodFiscContrattoPdfType"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformazioniReteImpresaPdfType", propOrder = {
    "perChiaveContrattoPdf",
    "perCodFiscContrattoPdf"
})
public class InformazioniReteImpresaPdfType {

    @XmlElement(name = "PerChiaveContrattoPdf")
    protected PerChiaveContrattoPdfType perChiaveContrattoPdf;
    @XmlElement(name = "PerCodFiscContrattoPdf")
    protected PerCodFiscContrattoPdfType perCodFiscContrattoPdf;

    /**
     * Gets the value of the perChiaveContrattoPdf property.
     * 
     * @return
     *     possible object is
     *     {@link PerChiaveContrattoPdfType }
     *     
     */
    public PerChiaveContrattoPdfType getPerChiaveContrattoPdf() {
        return perChiaveContrattoPdf;
    }

    /**
     * Sets the value of the perChiaveContrattoPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerChiaveContrattoPdfType }
     *     
     */
    public void setPerChiaveContrattoPdf(PerChiaveContrattoPdfType value) {
        this.perChiaveContrattoPdf = value;
    }

    /**
     * Gets the value of the perCodFiscContrattoPdf property.
     * 
     * @return
     *     possible object is
     *     {@link PerCodFiscContrattoPdfType }
     *     
     */
    public PerCodFiscContrattoPdfType getPerCodFiscContrattoPdf() {
        return perCodFiscContrattoPdf;
    }

    /**
     * Sets the value of the perCodFiscContrattoPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCodFiscContrattoPdfType }
     *     
     */
    public void setPerCodFiscContrattoPdf(PerCodFiscContrattoPdfType value) {
        this.perCodFiscContrattoPdf = value;
    }

}
