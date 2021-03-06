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
 * <p>Java class for estremi-atto element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="estremi-atto">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="altre-indicazioni" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-registrazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="localita-ufficio-registro" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-registrazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="notaio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia-ufficio-registro" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tribunale" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "estremi-atto")
public class EstremiAtto {

    @XmlAttribute(name = "altre-indicazioni")
    protected String altreIndicazioni;
    @XmlAttribute(name = "c-tipo")
    protected String cTipo;
    @XmlAttribute(name = "dt-registrazione")
    protected String dtRegistrazione;
    @XmlAttribute(name = "localita-ufficio-registro")
    protected String localitaUfficioRegistro;
    @XmlAttribute(name = "n-registrazione")
    protected String nRegistrazione;
    @XmlAttribute
    protected String notaio;
    @XmlAttribute(name = "provincia-ufficio-registro")
    protected String provinciaUfficioRegistro;
    @XmlAttribute
    protected String tipo;
    @XmlAttribute
    protected String tribunale;

    /**
     * Gets the value of the altreIndicazioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltreIndicazioni() {
        return altreIndicazioni;
    }

    /**
     * Sets the value of the altreIndicazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltreIndicazioni(String value) {
        this.altreIndicazioni = value;
    }

    /**
     * Gets the value of the cTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipo() {
        return cTipo;
    }

    /**
     * Sets the value of the cTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipo(String value) {
        this.cTipo = value;
    }

    /**
     * Gets the value of the dtRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRegistrazione() {
        return dtRegistrazione;
    }

    /**
     * Sets the value of the dtRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRegistrazione(String value) {
        this.dtRegistrazione = value;
    }

    /**
     * Gets the value of the localitaUfficioRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalitaUfficioRegistro() {
        return localitaUfficioRegistro;
    }

    /**
     * Sets the value of the localitaUfficioRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalitaUfficioRegistro(String value) {
        this.localitaUfficioRegistro = value;
    }

    /**
     * Gets the value of the nRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRegistrazione() {
        return nRegistrazione;
    }

    /**
     * Sets the value of the nRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRegistrazione(String value) {
        this.nRegistrazione = value;
    }

    /**
     * Gets the value of the notaio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaio() {
        return notaio;
    }

    /**
     * Sets the value of the notaio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaio(String value) {
        this.notaio = value;
    }

    /**
     * Gets the value of the provinciaUfficioRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaUfficioRegistro() {
        return provinciaUfficioRegistro;
    }

    /**
     * Sets the value of the provinciaUfficioRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaUfficioRegistro(String value) {
        this.provinciaUfficioRegistro = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the tribunale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTribunale() {
        return tribunale;
    }

    /**
     * Sets the value of the tribunale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTribunale(String value) {
        this.tribunale = value;
    }

}
