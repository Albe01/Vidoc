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
 * <p>Java class for PerChiaveContrattoPdfType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerChiaveContrattoPdfType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroRegistrazione" type="{}NumeroRegistrazionePdfType"/>
 *         &lt;element name="NumeroRepertorio" type="{}NumeroRepertorioPdfType"/>
 *         &lt;element name="IdeRich" type="{}IdeRichType" minOccurs="0"/>
 *         &lt;element name="Documento" type="{}DocumentoContrattoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerChiaveContrattoPdfType", propOrder = {
    "numeroRegistrazione",
    "numeroRepertorio",
    "ideRich",
    "documento"
})
public class PerChiaveContrattoPdfType {

    @XmlElement(name = "NumeroRegistrazione", required = true)
    protected String numeroRegistrazione;
    @XmlElement(name = "NumeroRepertorio", required = true)
    protected String numeroRepertorio;
    @XmlElement(name = "IdeRich")
    protected String ideRich;
    @XmlElement(name = "Documento", required = true)
    protected DocumentoContrattoType documento;

    /**
     * Gets the value of the numeroRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistrazione() {
        return numeroRegistrazione;
    }

    /**
     * Sets the value of the numeroRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistrazione(String value) {
        this.numeroRegistrazione = value;
    }

    /**
     * Gets the value of the numeroRepertorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRepertorio() {
        return numeroRepertorio;
    }

    /**
     * Sets the value of the numeroRepertorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRepertorio(String value) {
        this.numeroRepertorio = value;
    }

    /**
     * Gets the value of the ideRich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeRich() {
        return ideRich;
    }

    /**
     * Sets the value of the ideRich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeRich(String value) {
        this.ideRich = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoContrattoType }
     *     
     */
    public DocumentoContrattoType getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoContrattoType }
     *     
     */
    public void setDocumento(DocumentoContrattoType value) {
        this.documento = value;
    }

}
