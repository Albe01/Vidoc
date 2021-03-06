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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registro-preziosi element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="registro-preziosi">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;choice>
 *             &lt;element ref="{}qualifica" minOccurs="0"/>
 *             &lt;element ref="{}qualifiche" minOccurs="0"/>
 *           &lt;/choice>
 *           &lt;element ref="{}autorizzazione-ps" minOccurs="0"/>
 *           &lt;element ref="{}tassa-cg" minOccurs="0"/>
 *           &lt;element ref="{}marchio" minOccurs="0"/>
 *           &lt;element ref="{}cancellazione-ruolo" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="dt-domanda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "qualifica",
    "qualifiche",
    "autorizzazionePs",
    "tassaCg",
    "marchio",
    "cancellazioneRuolo"
})
@XmlRootElement(name = "registro-preziosi")
public class RegistroPreziosi {

    protected Qualifica qualifica;
    protected Qualifiche qualifiche;
    @XmlElement(name = "autorizzazione-ps")
    protected AutorizzazionePs autorizzazionePs;
    @XmlElement(name = "tassa-cg")
    protected TassaCg tassaCg;
    protected String marchio;
    @XmlElement(name = "cancellazione-ruolo")
    protected CancellazioneRuolo cancellazioneRuolo;
    @XmlAttribute(name = "dt-domanda")
    protected String dtDomanda;
    @XmlAttribute
    protected String n;

    /**
     * Gets the value of the qualifica property.
     * 
     * @return
     *     possible object is
     *     {@link Qualifica }
     *     
     */
    public Qualifica getQualifica() {
        return qualifica;
    }

    /**
     * Sets the value of the qualifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qualifica }
     *     
     */
    public void setQualifica(Qualifica value) {
        this.qualifica = value;
    }

    /**
     * Gets the value of the qualifiche property.
     * 
     * @return
     *     possible object is
     *     {@link Qualifiche }
     *     
     */
    public Qualifiche getQualifiche() {
        return qualifiche;
    }

    /**
     * Sets the value of the qualifiche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qualifiche }
     *     
     */
    public void setQualifiche(Qualifiche value) {
        this.qualifiche = value;
    }

    /**
     * Gets the value of the autorizzazionePs property.
     * 
     * @return
     *     possible object is
     *     {@link AutorizzazionePs }
     *     
     */
    public AutorizzazionePs getAutorizzazionePs() {
        return autorizzazionePs;
    }

    /**
     * Sets the value of the autorizzazionePs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutorizzazionePs }
     *     
     */
    public void setAutorizzazionePs(AutorizzazionePs value) {
        this.autorizzazionePs = value;
    }

    /**
     * Gets the value of the tassaCg property.
     * 
     * @return
     *     possible object is
     *     {@link TassaCg }
     *     
     */
    public TassaCg getTassaCg() {
        return tassaCg;
    }

    /**
     * Sets the value of the tassaCg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TassaCg }
     *     
     */
    public void setTassaCg(TassaCg value) {
        this.tassaCg = value;
    }

    /**
     * Gets the value of the marchio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarchio() {
        return marchio;
    }

    /**
     * Sets the value of the marchio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarchio(String value) {
        this.marchio = value;
    }

    /**
     * Gets the value of the cancellazioneRuolo property.
     * 
     * @return
     *     possible object is
     *     {@link CancellazioneRuolo }
     *     
     */
    public CancellazioneRuolo getCancellazioneRuolo() {
        return cancellazioneRuolo;
    }

    /**
     * Sets the value of the cancellazioneRuolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellazioneRuolo }
     *     
     */
    public void setCancellazioneRuolo(CancellazioneRuolo value) {
        this.cancellazioneRuolo = value;
    }

    /**
     * Gets the value of the dtDomanda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtDomanda() {
        return dtDomanda;
    }

    /**
     * Sets the value of the dtDomanda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDomanda(String value) {
        this.dtDomanda = value;
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

}
