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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for carica element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="carica">
 *   &lt;complexType>
 *     &lt;simpleContent>
 *       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *         &lt;attribute name="c-carica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-durata" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="descrizione-durata" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-atto-nomina" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-fine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-iscrizione-libro-soci" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-nomina" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-presentazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-riferimento-bilancio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-anni-esercizio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="p-carica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/extension>
 *     &lt;/simpleContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "carica")
public class Carica {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "c-carica")
    protected String cCarica;
    @XmlAttribute(name = "c-durata")
    protected String cDurata;
    @XmlAttribute(name = "descrizione-durata")
    protected String descrizioneDurata;
    @XmlAttribute(name = "dt-atto-nomina")
    protected String dtAttoNomina;
    @XmlAttribute(name = "dt-fine")
    protected String dtFine;
    @XmlAttribute(name = "dt-iscrizione")
    protected String dtIscrizione;
    @XmlAttribute(name = "dt-iscrizione-libro-soci")
    protected String dtIscrizioneLibroSoci;
    @XmlAttribute(name = "dt-nomina")
    protected String dtNomina;
    @XmlAttribute(name = "dt-presentazione")
    protected String dtPresentazione;
    @XmlAttribute(name = "dt-riferimento-bilancio")
    protected String dtRiferimentoBilancio;
    @XmlAttribute(name = "n-anni-esercizio")
    protected String nAnniEsercizio;
    @XmlAttribute(name = "p-carica")
    protected String pCarica;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the cCarica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCarica() {
        return cCarica;
    }

    /**
     * Sets the value of the cCarica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCarica(String value) {
        this.cCarica = value;
    }

    /**
     * Gets the value of the cDurata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDurata() {
        return cDurata;
    }

    /**
     * Sets the value of the cDurata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDurata(String value) {
        this.cDurata = value;
    }

    /**
     * Gets the value of the descrizioneDurata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneDurata() {
        return descrizioneDurata;
    }

    /**
     * Sets the value of the descrizioneDurata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneDurata(String value) {
        this.descrizioneDurata = value;
    }

    /**
     * Gets the value of the dtAttoNomina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAttoNomina() {
        return dtAttoNomina;
    }

    /**
     * Sets the value of the dtAttoNomina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAttoNomina(String value) {
        this.dtAttoNomina = value;
    }

    /**
     * Gets the value of the dtFine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtFine() {
        return dtFine;
    }

    /**
     * Sets the value of the dtFine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtFine(String value) {
        this.dtFine = value;
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
     * Gets the value of the dtIscrizioneLibroSoci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtIscrizioneLibroSoci() {
        return dtIscrizioneLibroSoci;
    }

    /**
     * Sets the value of the dtIscrizioneLibroSoci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtIscrizioneLibroSoci(String value) {
        this.dtIscrizioneLibroSoci = value;
    }

    /**
     * Gets the value of the dtNomina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtNomina() {
        return dtNomina;
    }

    /**
     * Sets the value of the dtNomina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtNomina(String value) {
        this.dtNomina = value;
    }

    /**
     * Gets the value of the dtPresentazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtPresentazione() {
        return dtPresentazione;
    }

    /**
     * Sets the value of the dtPresentazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtPresentazione(String value) {
        this.dtPresentazione = value;
    }

    /**
     * Gets the value of the dtRiferimentoBilancio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRiferimentoBilancio() {
        return dtRiferimentoBilancio;
    }

    /**
     * Sets the value of the dtRiferimentoBilancio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRiferimentoBilancio(String value) {
        this.dtRiferimentoBilancio = value;
    }

    /**
     * Gets the value of the nAnniEsercizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAnniEsercizio() {
        return nAnniEsercizio;
    }

    /**
     * Sets the value of the nAnniEsercizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAnniEsercizio(String value) {
        this.nAnniEsercizio = value;
    }

    /**
     * Gets the value of the pCarica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCarica() {
        return pCarica;
    }

    /**
     * Sets the value of the pCarica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCarica(String value) {
        this.pCarica = value;
    }

}
