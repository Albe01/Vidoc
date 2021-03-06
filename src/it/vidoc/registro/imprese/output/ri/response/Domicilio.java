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
 * <p>Java class for domicilio element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="domicilio">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="c-stato" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="cap" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="comune" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="frazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-civico" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="presso" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="stato" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="via" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "domicilio")
public class Domicilio {

    @XmlAttribute(name = "c-stato")
    protected String cStato;
    @XmlAttribute
    protected String cap;
    @XmlAttribute
    protected String comune;
    @XmlAttribute
    protected String frazione;
    @XmlAttribute(name = "n-civico")
    protected String nCivico;
    @XmlAttribute
    protected String presso;
    @XmlAttribute
    protected String provincia;
    @XmlAttribute
    protected String stato;
    @XmlAttribute
    protected String via;

    /**
     * Gets the value of the cStato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStato() {
        return cStato;
    }

    /**
     * Sets the value of the cStato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStato(String value) {
        this.cStato = value;
    }

    /**
     * Gets the value of the cap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCap() {
        return cap;
    }

    /**
     * Sets the value of the cap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCap(String value) {
        this.cap = value;
    }

    /**
     * Gets the value of the comune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComune() {
        return comune;
    }

    /**
     * Sets the value of the comune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Gets the value of the frazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrazione() {
        return frazione;
    }

    /**
     * Sets the value of the frazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrazione(String value) {
        this.frazione = value;
    }

    /**
     * Gets the value of the nCivico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCivico() {
        return nCivico;
    }

    /**
     * Sets the value of the nCivico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCivico(String value) {
        this.nCivico = value;
    }

    /**
     * Gets the value of the presso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresso() {
        return presso;
    }

    /**
     * Sets the value of the presso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresso(String value) {
        this.presso = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStato() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStato(String value) {
        this.stato = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVia() {
        return via;
    }

    /**
     * Sets the value of the via property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVia(String value) {
        this.via = value;
    }

}
