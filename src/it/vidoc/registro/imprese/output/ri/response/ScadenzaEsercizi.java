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
 * <p>Java class for scadenza-esercizi element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="scadenza-esercizi">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="dt-primo-esercizio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="esercizi-successivi" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="giorni-proroga-bilancio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="mesi-proroga-bilancio" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "scadenza-esercizi")
public class ScadenzaEsercizi {

    @XmlAttribute(name = "dt-primo-esercizio")
    protected String dtPrimoEsercizio;
    @XmlAttribute(name = "esercizi-successivi")
    protected String eserciziSuccessivi;
    @XmlAttribute(name = "giorni-proroga-bilancio")
    protected String giorniProrogaBilancio;
    @XmlAttribute(name = "mesi-proroga-bilancio")
    protected String mesiProrogaBilancio;

    /**
     * Gets the value of the dtPrimoEsercizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtPrimoEsercizio() {
        return dtPrimoEsercizio;
    }

    /**
     * Sets the value of the dtPrimoEsercizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtPrimoEsercizio(String value) {
        this.dtPrimoEsercizio = value;
    }

    /**
     * Gets the value of the eserciziSuccessivi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEserciziSuccessivi() {
        return eserciziSuccessivi;
    }

    /**
     * Sets the value of the eserciziSuccessivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEserciziSuccessivi(String value) {
        this.eserciziSuccessivi = value;
    }

    /**
     * Gets the value of the giorniProrogaBilancio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiorniProrogaBilancio() {
        return giorniProrogaBilancio;
    }

    /**
     * Sets the value of the giorniProrogaBilancio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiorniProrogaBilancio(String value) {
        this.giorniProrogaBilancio = value;
    }

    /**
     * Gets the value of the mesiProrogaBilancio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesiProrogaBilancio() {
        return mesiProrogaBilancio;
    }

    /**
     * Sets the value of the mesiProrogaBilancio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesiProrogaBilancio(String value) {
        this.mesiProrogaBilancio = value;
    }

}
