//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persona-giuridica-privata element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="persona-giuridica-privata">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="dt-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="ente" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-accertamento-requisiti" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="registro" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "persona-giuridica-privata")
public class PersonaGiuridicaPrivata {

    @XmlAttribute(name = "dt-iscrizione")
    protected String dtIscrizione;
    @XmlAttribute
    protected String ente;
    @XmlAttribute(name = "f-accertamento-requisiti")
    protected String fAccertamentoRequisiti;
    @XmlAttribute
    protected String n;
    @XmlAttribute
    protected String registro;

    /**
     * Gets the value of the dtIscrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtIscrizione() {
        return dtIscrizione;
    }

    /**
     * Sets the value of the dtIscrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtIscrizione(String value) {
        this.dtIscrizione = value;
    }

    /**
     * Gets the value of the ente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnte() {
        return ente;
    }

    /**
     * Sets the value of the ente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnte(String value) {
        this.ente = value;
    }

    /**
     * Gets the value of the fAccertamentoRequisiti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAccertamentoRequisiti() {
        return fAccertamentoRequisiti;
    }

    /**
     * Sets the value of the fAccertamentoRequisiti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAccertamentoRequisiti(String value) {
        this.fAccertamentoRequisiti = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the registro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * Sets the value of the registro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistro(String value) {
        this.registro = value;
    }

}