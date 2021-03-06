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
 * <p>Java class for iscrizione-ri element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="iscrizione-ri">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}sezioni" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-n-iscrizione-ri-old" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-annotazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-annotazione-ri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-annotazione-ri-old" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-c-fiscale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-iscrizione-ri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-iscrizione-ri-old" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia-ri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sezioni"
})
@XmlRootElement(name = "iscrizione-ri")
public class IscrizioneRi {

    protected Sezioni sezioni;
    @XmlAttribute(name = "c-n-iscrizione-ri-old")
    protected String cnIscrizioneRiOld;
    @XmlAttribute(name = "dt-annotazione")
    protected String dtAnnotazione;
    @XmlAttribute(name = "dt-iscrizione")
    protected String dtIscrizione;
    @XmlAttribute(name = "n-annotazione-ri")
    protected String nAnnotazioneRi;
    @XmlAttribute(name = "n-annotazione-ri-old")
    protected String nAnnotazioneRiOld;
    @XmlAttribute(name = "n-c-fiscale")
    protected String ncFiscale;
    @XmlAttribute(name = "n-iscrizione-ri")
    protected String nIscrizioneRi;
    @XmlAttribute(name = "n-iscrizione-ri-old")
    protected String nIscrizioneRiOld;
    @XmlAttribute(name = "provincia-ri")
    protected String provinciaRi;

    /**
     * Gets the value of the sezioni property.
     * 
     * @return
     *     possible object is
     *     {@link Sezioni }
     *     
     */
    public Sezioni getSezioni() {
        return sezioni;
    }

    /**
     * Sets the value of the sezioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sezioni }
     *     
     */
    public void setSezioni(Sezioni value) {
        this.sezioni = value;
    }

    /**
     * Gets the value of the cnIscrizioneRiOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNIscrizioneRiOld() {
        return cnIscrizioneRiOld;
    }

    /**
     * Sets the value of the cnIscrizioneRiOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNIscrizioneRiOld(String value) {
        this.cnIscrizioneRiOld = value;
    }

    /**
     * Gets the value of the dtAnnotazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAnnotazione() {
        return dtAnnotazione;
    }

    /**
     * Sets the value of the dtAnnotazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAnnotazione(String value) {
        this.dtAnnotazione = value;
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
     * Gets the value of the nAnnotazioneRi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAnnotazioneRi() {
        return nAnnotazioneRi;
    }

    /**
     * Sets the value of the nAnnotazioneRi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAnnotazioneRi(String value) {
        this.nAnnotazioneRi = value;
    }

    /**
     * Gets the value of the nAnnotazioneRiOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAnnotazioneRiOld() {
        return nAnnotazioneRiOld;
    }

    /**
     * Sets the value of the nAnnotazioneRiOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAnnotazioneRiOld(String value) {
        this.nAnnotazioneRiOld = value;
    }

    /**
     * Gets the value of the ncFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCFiscale() {
        return ncFiscale;
    }

    /**
     * Sets the value of the ncFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCFiscale(String value) {
        this.ncFiscale = value;
    }

    /**
     * Gets the value of the nIscrizioneRi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIscrizioneRi() {
        return nIscrizioneRi;
    }

    /**
     * Sets the value of the nIscrizioneRi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIscrizioneRi(String value) {
        this.nIscrizioneRi = value;
    }

    /**
     * Gets the value of the nIscrizioneRiOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIscrizioneRiOld() {
        return nIscrizioneRiOld;
    }

    /**
     * Sets the value of the nIscrizioneRiOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIscrizioneRiOld(String value) {
        this.nIscrizioneRiOld = value;
    }

    /**
     * Gets the value of the provinciaRi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaRi() {
        return provinciaRi;
    }

    /**
     * Sets the value of the provinciaRi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaRi(String value) {
        this.provinciaRi = value;
    }

}
