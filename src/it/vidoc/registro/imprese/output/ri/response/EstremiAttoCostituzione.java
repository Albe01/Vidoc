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
 * <p>Java class for estremi-atto-costituzione element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="estremi-atto-costituzione">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="c-tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-registrazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="localita-notaio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="localita-ufficio-registro" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-registrazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-repertorio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="notaio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia-notaio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia-ufficio-registro" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "estremi-atto-costituzione")
public class EstremiAttoCostituzione {

    @XmlAttribute(name = "c-tipo")
    protected String cTipo;
    @XmlAttribute(name = "dt-registrazione")
    protected String dtRegistrazione;
    @XmlAttribute(name = "localita-notaio")
    protected String localitaNotaio;
    @XmlAttribute(name = "localita-ufficio-registro")
    protected String localitaUfficioRegistro;
    @XmlAttribute(name = "n-registrazione")
    protected String nRegistrazione;
    @XmlAttribute(name = "n-repertorio")
    protected String nRepertorio;
    @XmlAttribute
    protected String notaio;
    @XmlAttribute(name = "provincia-notaio")
    protected String provinciaNotaio;
    @XmlAttribute(name = "provincia-ufficio-registro")
    protected String provinciaUfficioRegistro;
    @XmlAttribute
    protected String tipo;

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
     * Gets the value of the localitaNotaio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalitaNotaio() {
        return localitaNotaio;
    }

    /**
     * Sets the value of the localitaNotaio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalitaNotaio(String value) {
        this.localitaNotaio = value;
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
     * Gets the value of the nRepertorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRepertorio() {
        return nRepertorio;
    }

    /**
     * Sets the value of the nRepertorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRepertorio(String value) {
        this.nRepertorio = value;
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
     * Gets the value of the provinciaNotaio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaNotaio() {
        return provinciaNotaio;
    }

    /**
     * Sets the value of the provinciaNotaio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaNotaio(String value) {
        this.provinciaNotaio = value;
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

}
