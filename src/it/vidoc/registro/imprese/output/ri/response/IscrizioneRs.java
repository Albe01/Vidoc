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
 * <p>Java class for iscrizione-rs element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="iscrizione-rs">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="dt-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="localita-tribunale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-fascicolo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-rs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-volume" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia-tribunale" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "iscrizione-rs")
public class IscrizioneRs {

    @XmlAttribute(name = "dt-iscrizione")
    protected String dtIscrizione;
    @XmlAttribute(name = "localita-tribunale")
    protected String localitaTribunale;
    @XmlAttribute(name = "n-fascicolo")
    protected String nFascicolo;
    @XmlAttribute(name = "n-rs")
    protected String nRs;
    @XmlAttribute(name = "n-volume")
    protected String nVolume;
    @XmlAttribute(name = "provincia-tribunale")
    protected String provinciaTribunale;

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
     * Gets the value of the localitaTribunale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalitaTribunale() {
        return localitaTribunale;
    }

    /**
     * Sets the value of the localitaTribunale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalitaTribunale(String value) {
        this.localitaTribunale = value;
    }

    /**
     * Gets the value of the nFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNFascicolo() {
        return nFascicolo;
    }

    /**
     * Sets the value of the nFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNFascicolo(String value) {
        this.nFascicolo = value;
    }

    /**
     * Gets the value of the nRs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRs() {
        return nRs;
    }

    /**
     * Sets the value of the nRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRs(String value) {
        this.nRs = value;
    }

    /**
     * Gets the value of the nVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVolume() {
        return nVolume;
    }

    /**
     * Sets the value of the nVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVolume(String value) {
        this.nVolume = value;
    }

    /**
     * Gets the value of the provinciaTribunale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaTribunale() {
        return provinciaTribunale;
    }

    /**
     * Sets the value of the provinciaTribunale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaTribunale(String value) {
        this.provinciaTribunale = value;
    }

}
