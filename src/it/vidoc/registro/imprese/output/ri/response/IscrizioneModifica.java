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
 * <p>Java class for iscrizione-modifica element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="iscrizione-modifica">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="c-tipo-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-deposito" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-rettifica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-rettifica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "iscrizione-modifica")
public class IscrizioneModifica {

    @XmlAttribute(name = "c-tipo-iscrizione")
    protected String cTipoIscrizione;
    @XmlAttribute(name = "dt-deposito")
    protected String dtDeposito;
    @XmlAttribute(name = "dt-iscrizione")
    protected String dtIscrizione;
    @XmlAttribute(name = "dt-rettifica")
    protected String dtRettifica;
    @XmlAttribute(name = "f-rettifica")
    protected String fRettifica;
    @XmlAttribute(name = "tipo-iscrizione")
    protected String tipoIscrizione;

    /**
     * Gets the value of the cTipoIscrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoIscrizione() {
        return cTipoIscrizione;
    }

    /**
     * Sets the value of the cTipoIscrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoIscrizione(String value) {
        this.cTipoIscrizione = value;
    }

    /**
     * Gets the value of the dtDeposito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtDeposito() {
        return dtDeposito;
    }

    /**
     * Sets the value of the dtDeposito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDeposito(String value) {
        this.dtDeposito = value;
    }

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
     * Gets the value of the dtRettifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRettifica() {
        return dtRettifica;
    }

    /**
     * Sets the value of the dtRettifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRettifica(String value) {
        this.dtRettifica = value;
    }

    /**
     * Gets the value of the fRettifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRettifica() {
        return fRettifica;
    }

    /**
     * Sets the value of the fRettifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRettifica(String value) {
        this.fRettifica = value;
    }

    /**
     * Gets the value of the tipoIscrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIscrizione() {
        return tipoIscrizione;
    }

    /**
     * Sets the value of the tipoIscrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIscrizione(String value) {
        this.tipoIscrizione = value;
    }

}