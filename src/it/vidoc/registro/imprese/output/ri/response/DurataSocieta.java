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
 * <p>Java class for durata-societa element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="durata-societa">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}scadenza-esercizi" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-tipo-proroga" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-termine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-durata-indeterminata" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-anni-proroga-tacita" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo-proroga" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "scadenzaEsercizi"
})
@XmlRootElement(name = "durata-societa")
public class DurataSocieta {

    @XmlElement(name = "scadenza-esercizi")
    protected ScadenzaEsercizi scadenzaEsercizi;
    @XmlAttribute(name = "c-tipo-proroga")
    protected String cTipoProroga;
    @XmlAttribute(name = "dt-termine")
    protected String dtTermine;
    @XmlAttribute(name = "f-durata-indeterminata")
    protected String fDurataIndeterminata;
    @XmlAttribute(name = "n-anni-proroga-tacita")
    protected String nAnniProrogaTacita;
    @XmlAttribute(name = "tipo-proroga")
    protected String tipoProroga;

    /**
     * Gets the value of the scadenzaEsercizi property.
     * 
     * @return
     *     possible object is
     *     {@link ScadenzaEsercizi }
     *     
     */
    public ScadenzaEsercizi getScadenzaEsercizi() {
        return scadenzaEsercizi;
    }

    /**
     * Sets the value of the scadenzaEsercizi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScadenzaEsercizi }
     *     
     */
    public void setScadenzaEsercizi(ScadenzaEsercizi value) {
        this.scadenzaEsercizi = value;
    }

    /**
     * Gets the value of the cTipoProroga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoProroga() {
        return cTipoProroga;
    }

    /**
     * Sets the value of the cTipoProroga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoProroga(String value) {
        this.cTipoProroga = value;
    }

    /**
     * Gets the value of the dtTermine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtTermine() {
        return dtTermine;
    }

    /**
     * Sets the value of the dtTermine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtTermine(String value) {
        this.dtTermine = value;
    }

    /**
     * Gets the value of the fDurataIndeterminata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDurataIndeterminata() {
        return fDurataIndeterminata;
    }

    /**
     * Sets the value of the fDurataIndeterminata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDurataIndeterminata(String value) {
        this.fDurataIndeterminata = value;
    }

    /**
     * Gets the value of the nAnniProrogaTacita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAnniProrogaTacita() {
        return nAnniProrogaTacita;
    }

    /**
     * Sets the value of the nAnniProrogaTacita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAnniProrogaTacita(String value) {
        this.nAnniProrogaTacita = value;
    }

    /**
     * Gets the value of the tipoProroga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProroga() {
        return tipoProroga;
    }

    /**
     * Sets the value of the tipoProroga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProroga(String value) {
        this.tipoProroga = value;
    }

}
