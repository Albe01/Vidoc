//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.24 at 08:35:14 PM CEST 
//


package it.vidoc.registro.protesti.visura.effetto.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InformazioniEffettoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformazioniEffettoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DtLevata" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SglPrvLevata" type="{}CciaaType" minOccurs="0"/>
 *         &lt;element name="DescPrvLevata" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="CodComLevata" type="{}CodComType" minOccurs="0"/>
 *         &lt;element name="DescComLevata" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="DtScadenzaEffetto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CodScadenzaEffetto" type="{}CodScadenzaEffettoType" minOccurs="0"/>
 *         &lt;element name="DescScadenzaEffetto" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="CodTipoEffetto" type="{}CodTipoEffettoType" minOccurs="0"/>
 *         &lt;element name="DescTipoEffetto" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="ImportoValutaLevata" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CodValutaLevata" type="{}CodValutaType" minOccurs="0"/>
 *         &lt;element name="DescValutaLevata" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="ImportoValutaCorrente" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CodValutaCorrente" type="{}CodValutaType" minOccurs="0"/>
 *         &lt;element name="DescValutaCorrente" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="CodMancatoPagSanp" type="{}CodMancatoPagSanpType" minOccurs="0"/>
 *         &lt;element name="DescMancatoPagSanp" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="CodMancatoPagRepr" type="{}CodMancatoPagReprType" minOccurs="0"/>
 *         &lt;element name="DescMancatoPagRepr" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="CodStatoEffetto" type="{}CodStatoEffettoType" minOccurs="0"/>
 *         &lt;element name="DescStatoEffetto" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="NRepertorio" type="{}NRepertorioType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformazioniEffettoType", propOrder = {
    "dtLevata",
    "sglPrvLevata",
    "descPrvLevata",
    "codComLevata",
    "descComLevata",
    "dtScadenzaEffetto",
    "codScadenzaEffetto",
    "descScadenzaEffetto",
    "codTipoEffetto",
    "descTipoEffetto",
    "importoValutaLevata",
    "codValutaLevata",
    "descValutaLevata",
    "importoValutaCorrente",
    "codValutaCorrente",
    "descValutaCorrente",
    "codMancatoPagSanp",
    "descMancatoPagSanp",
    "codMancatoPagRepr",
    "descMancatoPagRepr",
    "codStatoEffetto",
    "descStatoEffetto",
    "nRepertorio"
})
public class InformazioniEffettoType {

    @XmlElement(name = "DtLevata")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtLevata;
    @XmlElement(name = "SglPrvLevata")
    protected String sglPrvLevata;
    @XmlElement(name = "DescPrvLevata")
    protected String descPrvLevata;
    @XmlElement(name = "CodComLevata")
    protected String codComLevata;
    @XmlElement(name = "DescComLevata")
    protected String descComLevata;
    @XmlElement(name = "DtScadenzaEffetto")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtScadenzaEffetto;
    @XmlElement(name = "CodScadenzaEffetto")
    protected String codScadenzaEffetto;
    @XmlElement(name = "DescScadenzaEffetto")
    protected String descScadenzaEffetto;
    @XmlElement(name = "CodTipoEffetto")
    protected String codTipoEffetto;
    @XmlElement(name = "DescTipoEffetto")
    protected String descTipoEffetto;
    @XmlElement(name = "ImportoValutaLevata")
    protected Float importoValutaLevata;
    @XmlElement(name = "CodValutaLevata")
    protected String codValutaLevata;
    @XmlElement(name = "DescValutaLevata")
    protected String descValutaLevata;
    @XmlElement(name = "ImportoValutaCorrente")
    protected Float importoValutaCorrente;
    @XmlElement(name = "CodValutaCorrente")
    protected String codValutaCorrente;
    @XmlElement(name = "DescValutaCorrente")
    protected String descValutaCorrente;
    @XmlElement(name = "CodMancatoPagSanp")
    protected String codMancatoPagSanp;
    @XmlElement(name = "DescMancatoPagSanp")
    protected String descMancatoPagSanp;
    @XmlElement(name = "CodMancatoPagRepr")
    protected String codMancatoPagRepr;
    @XmlElement(name = "DescMancatoPagRepr")
    protected String descMancatoPagRepr;
    @XmlElement(name = "CodStatoEffetto")
    protected String codStatoEffetto;
    @XmlElement(name = "DescStatoEffetto")
    protected String descStatoEffetto;
    @XmlElement(name = "NRepertorio")
    protected String nRepertorio;

    /**
     * Gets the value of the dtLevata property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtLevata() {
        return dtLevata;
    }

    /**
     * Sets the value of the dtLevata property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtLevata(XMLGregorianCalendar value) {
        this.dtLevata = value;
    }

    /**
     * Gets the value of the sglPrvLevata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSglPrvLevata() {
        return sglPrvLevata;
    }

    /**
     * Sets the value of the sglPrvLevata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSglPrvLevata(String value) {
        this.sglPrvLevata = value;
    }

    /**
     * Gets the value of the descPrvLevata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPrvLevata() {
        return descPrvLevata;
    }

    /**
     * Sets the value of the descPrvLevata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPrvLevata(String value) {
        this.descPrvLevata = value;
    }

    /**
     * Gets the value of the codComLevata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodComLevata() {
        return codComLevata;
    }

    /**
     * Sets the value of the codComLevata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodComLevata(String value) {
        this.codComLevata = value;
    }

    /**
     * Gets the value of the descComLevata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescComLevata() {
        return descComLevata;
    }

    /**
     * Sets the value of the descComLevata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescComLevata(String value) {
        this.descComLevata = value;
    }

    /**
     * Gets the value of the dtScadenzaEffetto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtScadenzaEffetto() {
        return dtScadenzaEffetto;
    }

    /**
     * Sets the value of the dtScadenzaEffetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtScadenzaEffetto(XMLGregorianCalendar value) {
        this.dtScadenzaEffetto = value;
    }

    /**
     * Gets the value of the codScadenzaEffetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodScadenzaEffetto() {
        return codScadenzaEffetto;
    }

    /**
     * Sets the value of the codScadenzaEffetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodScadenzaEffetto(String value) {
        this.codScadenzaEffetto = value;
    }

    /**
     * Gets the value of the descScadenzaEffetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescScadenzaEffetto() {
        return descScadenzaEffetto;
    }

    /**
     * Sets the value of the descScadenzaEffetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescScadenzaEffetto(String value) {
        this.descScadenzaEffetto = value;
    }

    /**
     * Gets the value of the codTipoEffetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoEffetto() {
        return codTipoEffetto;
    }

    /**
     * Sets the value of the codTipoEffetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoEffetto(String value) {
        this.codTipoEffetto = value;
    }

    /**
     * Gets the value of the descTipoEffetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoEffetto() {
        return descTipoEffetto;
    }

    /**
     * Sets the value of the descTipoEffetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoEffetto(String value) {
        this.descTipoEffetto = value;
    }

    /**
     * Gets the value of the importoValutaLevata property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImportoValutaLevata() {
        return importoValutaLevata;
    }

    /**
     * Sets the value of the importoValutaLevata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImportoValutaLevata(Float value) {
        this.importoValutaLevata = value;
    }

    /**
     * Gets the value of the codValutaLevata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodValutaLevata() {
        return codValutaLevata;
    }

    /**
     * Sets the value of the codValutaLevata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodValutaLevata(String value) {
        this.codValutaLevata = value;
    }

    /**
     * Gets the value of the descValutaLevata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescValutaLevata() {
        return descValutaLevata;
    }

    /**
     * Sets the value of the descValutaLevata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescValutaLevata(String value) {
        this.descValutaLevata = value;
    }

    /**
     * Gets the value of the importoValutaCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImportoValutaCorrente() {
        return importoValutaCorrente;
    }

    /**
     * Sets the value of the importoValutaCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImportoValutaCorrente(Float value) {
        this.importoValutaCorrente = value;
    }

    /**
     * Gets the value of the codValutaCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodValutaCorrente() {
        return codValutaCorrente;
    }

    /**
     * Sets the value of the codValutaCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodValutaCorrente(String value) {
        this.codValutaCorrente = value;
    }

    /**
     * Gets the value of the descValutaCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescValutaCorrente() {
        return descValutaCorrente;
    }

    /**
     * Sets the value of the descValutaCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescValutaCorrente(String value) {
        this.descValutaCorrente = value;
    }

    /**
     * Gets the value of the codMancatoPagSanp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMancatoPagSanp() {
        return codMancatoPagSanp;
    }

    /**
     * Sets the value of the codMancatoPagSanp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMancatoPagSanp(String value) {
        this.codMancatoPagSanp = value;
    }

    /**
     * Gets the value of the descMancatoPagSanp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMancatoPagSanp() {
        return descMancatoPagSanp;
    }

    /**
     * Sets the value of the descMancatoPagSanp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMancatoPagSanp(String value) {
        this.descMancatoPagSanp = value;
    }

    /**
     * Gets the value of the codMancatoPagRepr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMancatoPagRepr() {
        return codMancatoPagRepr;
    }

    /**
     * Sets the value of the codMancatoPagRepr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMancatoPagRepr(String value) {
        this.codMancatoPagRepr = value;
    }

    /**
     * Gets the value of the descMancatoPagRepr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMancatoPagRepr() {
        return descMancatoPagRepr;
    }

    /**
     * Sets the value of the descMancatoPagRepr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMancatoPagRepr(String value) {
        this.descMancatoPagRepr = value;
    }

    /**
     * Gets the value of the codStatoEffetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStatoEffetto() {
        return codStatoEffetto;
    }

    /**
     * Sets the value of the codStatoEffetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStatoEffetto(String value) {
        this.codStatoEffetto = value;
    }

    /**
     * Gets the value of the descStatoEffetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescStatoEffetto() {
        return descStatoEffetto;
    }

    /**
     * Sets the value of the descStatoEffetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescStatoEffetto(String value) {
        this.descStatoEffetto = value;
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

}
