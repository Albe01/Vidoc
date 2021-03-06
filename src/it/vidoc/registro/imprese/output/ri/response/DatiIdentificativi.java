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
 * <p>Java class for dati-identificativi element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="dati-identificativi">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}tipi-procedure-concorsuali" minOccurs="0"/>
 *           &lt;element ref="{}forma-giuridica" minOccurs="0"/>
 *           &lt;element ref="{}indirizzo-localizzazione" minOccurs="0"/>
 *           &lt;element ref="{}indirizzo-posta-certificata" minOccurs="0"/>
 *           &lt;element ref="{}telefono" minOccurs="0"/>
 *           &lt;element ref="{}telex" minOccurs="0"/>
 *           &lt;element ref="{}telefax" minOccurs="0"/>
 *           &lt;element ref="{}sito-internet" minOccurs="0"/>
 *           &lt;element ref="{}email" minOccurs="0"/>
 *           &lt;element ref="{}legal-mail" minOccurs="0"/>
 *           &lt;element ref="{}altre-funzioni-sede" minOccurs="0"/>
 *           &lt;element ref="{}estremi-sede" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-fiscale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="c-fonte" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="cciaa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="denominazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="descrizione-tipo-impresa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="descrizione-tipo-soggetto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-mod-ultimo-protocollo-evaso" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-ultimo-protocollo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-aggiornamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-sede-intercamerale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="fonte" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-rd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-rea" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="partita-iva" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="stato-ditta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="stato-impresa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo-impresa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="tipo-soggetto" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "tipiProcedureConcorsuali",
    "formaGiuridica",
    "indirizzoLocalizzazione",
    "indirizzoPostaCertificata",
    "telefono",
    "telex",
    "telefax",
    "sitoInternet",
    "email",
    "legalMail",
    "altreFunzioniSede",
    "estremiSede"
})
@XmlRootElement(name = "dati-identificativi")
public class DatiIdentificativi {

    @XmlElement(name = "tipi-procedure-concorsuali")
    protected TipiProcedureConcorsuali tipiProcedureConcorsuali;
    @XmlElement(name = "forma-giuridica")
    protected FormaGiuridica formaGiuridica;
    @XmlElement(name = "indirizzo-localizzazione")
    protected IndirizzoLocalizzazione indirizzoLocalizzazione;
    @XmlElement(name = "indirizzo-posta-certificata")
    protected IndirizzoPostaCertificata indirizzoPostaCertificata;
    protected Telefono telefono;
    protected String telex;
    protected Telefax telefax;
    @XmlElement(name = "sito-internet")
    protected String sitoInternet;
    protected String email;
    @XmlElement(name = "legal-mail")
    protected String legalMail;
    @XmlElement(name = "altre-funzioni-sede")
    protected String altreFunzioniSede;
    @XmlElement(name = "estremi-sede")
    protected EstremiSede estremiSede;
    @XmlAttribute(name = "c-fiscale")
    protected String cFiscale;
    @XmlAttribute(name = "c-fonte")
    protected String cFonte;
    @XmlAttribute
    protected String cciaa;
    @XmlAttribute
    protected String denominazione;
    @XmlAttribute(name = "descrizione-tipo-impresa")
    protected String descrizioneTipoImpresa;
    @XmlAttribute(name = "descrizione-tipo-soggetto")
    protected String descrizioneTipoSoggetto;
    @XmlAttribute(name = "dt-mod-ultimo-protocollo-evaso")
    protected String dtModUltimoProtocolloEvaso;
    @XmlAttribute(name = "dt-ultimo-protocollo")
    protected String dtUltimoProtocollo;
    @XmlAttribute(name = "f-aggiornamento")
    protected String fAggiornamento;
    @XmlAttribute(name = "f-sede-intercamerale")
    protected String fSedeIntercamerale;
    @XmlAttribute
    protected String fonte;
    @XmlAttribute(name = "n-rd")
    protected String nRd;
    @XmlAttribute(name = "n-rea")
    protected String nRea;
    @XmlAttribute(name = "partita-iva")
    protected String partitaIva;
    @XmlAttribute(name = "stato-ditta")
    protected String statoDitta;
    @XmlAttribute(name = "stato-impresa")
    protected String statoImpresa;
    @XmlAttribute(name = "tipo-impresa")
    protected String tipoImpresa;
    @XmlAttribute(name = "tipo-soggetto")
    protected String tipoSoggetto;

    /**
     * Gets the value of the tipiProcedureConcorsuali property.
     * 
     * @return
     *     possible object is
     *     {@link TipiProcedureConcorsuali }
     *     
     */
    public TipiProcedureConcorsuali getTipiProcedureConcorsuali() {
        return tipiProcedureConcorsuali;
    }

    /**
     * Sets the value of the tipiProcedureConcorsuali property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipiProcedureConcorsuali }
     *     
     */
    public void setTipiProcedureConcorsuali(TipiProcedureConcorsuali value) {
        this.tipiProcedureConcorsuali = value;
    }

    /**
     * Gets the value of the formaGiuridica property.
     * 
     * @return
     *     possible object is
     *     {@link FormaGiuridica }
     *     
     */
    public FormaGiuridica getFormaGiuridica() {
        return formaGiuridica;
    }

    /**
     * Sets the value of the formaGiuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaGiuridica }
     *     
     */
    public void setFormaGiuridica(FormaGiuridica value) {
        this.formaGiuridica = value;
    }

    /**
     * Gets the value of the indirizzoLocalizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoLocalizzazione }
     *     
     */
    public IndirizzoLocalizzazione getIndirizzoLocalizzazione() {
        return indirizzoLocalizzazione;
    }

    /**
     * Sets the value of the indirizzoLocalizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoLocalizzazione }
     *     
     */
    public void setIndirizzoLocalizzazione(IndirizzoLocalizzazione value) {
        this.indirizzoLocalizzazione = value;
    }

    /**
     * Gets the value of the indirizzoPostaCertificata property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoPostaCertificata }
     *     
     */
    public IndirizzoPostaCertificata getIndirizzoPostaCertificata() {
        return indirizzoPostaCertificata;
    }

    /**
     * Sets the value of the indirizzoPostaCertificata property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoPostaCertificata }
     *     
     */
    public void setIndirizzoPostaCertificata(IndirizzoPostaCertificata value) {
        this.indirizzoPostaCertificata = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link Telefono }
     *     
     */
    public Telefono getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefono }
     *     
     */
    public void setTelefono(Telefono value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the telex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelex() {
        return telex;
    }

    /**
     * Sets the value of the telex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelex(String value) {
        this.telex = value;
    }

    /**
     * Gets the value of the telefax property.
     * 
     * @return
     *     possible object is
     *     {@link Telefax }
     *     
     */
    public Telefax getTelefax() {
        return telefax;
    }

    /**
     * Sets the value of the telefax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefax }
     *     
     */
    public void setTelefax(Telefax value) {
        this.telefax = value;
    }

    /**
     * Gets the value of the sitoInternet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitoInternet() {
        return sitoInternet;
    }

    /**
     * Sets the value of the sitoInternet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitoInternet(String value) {
        this.sitoInternet = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the legalMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalMail() {
        return legalMail;
    }

    /**
     * Sets the value of the legalMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalMail(String value) {
        this.legalMail = value;
    }

    /**
     * Gets the value of the altreFunzioniSede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltreFunzioniSede() {
        return altreFunzioniSede;
    }

    /**
     * Sets the value of the altreFunzioniSede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltreFunzioniSede(String value) {
        this.altreFunzioniSede = value;
    }

    /**
     * Gets the value of the estremiSede property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiSede }
     *     
     */
    public EstremiSede getEstremiSede() {
        return estremiSede;
    }

    /**
     * Sets the value of the estremiSede property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiSede }
     *     
     */
    public void setEstremiSede(EstremiSede value) {
        this.estremiSede = value;
    }

    /**
     * Gets the value of the cFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFiscale() {
        return cFiscale;
    }

    /**
     * Sets the value of the cFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFiscale(String value) {
        this.cFiscale = value;
    }

    /**
     * Gets the value of the cFonte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFonte() {
        return cFonte;
    }

    /**
     * Sets the value of the cFonte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFonte(String value) {
        this.cFonte = value;
    }

    /**
     * Gets the value of the cciaa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCciaa() {
        return cciaa;
    }

    /**
     * Sets the value of the cciaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCciaa(String value) {
        this.cciaa = value;
    }

    /**
     * Gets the value of the denominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Sets the value of the denominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Gets the value of the descrizioneTipoImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneTipoImpresa() {
        return descrizioneTipoImpresa;
    }

    /**
     * Sets the value of the descrizioneTipoImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneTipoImpresa(String value) {
        this.descrizioneTipoImpresa = value;
    }

    /**
     * Gets the value of the descrizioneTipoSoggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneTipoSoggetto() {
        return descrizioneTipoSoggetto;
    }

    /**
     * Sets the value of the descrizioneTipoSoggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneTipoSoggetto(String value) {
        this.descrizioneTipoSoggetto = value;
    }

    /**
     * Gets the value of the dtModUltimoProtocolloEvaso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtModUltimoProtocolloEvaso() {
        return dtModUltimoProtocolloEvaso;
    }

    /**
     * Sets the value of the dtModUltimoProtocolloEvaso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtModUltimoProtocolloEvaso(String value) {
        this.dtModUltimoProtocolloEvaso = value;
    }

    /**
     * Gets the value of the dtUltimoProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtUltimoProtocollo() {
        return dtUltimoProtocollo;
    }

    /**
     * Sets the value of the dtUltimoProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtUltimoProtocollo(String value) {
        this.dtUltimoProtocollo = value;
    }

    /**
     * Gets the value of the fAggiornamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAggiornamento() {
        return fAggiornamento;
    }

    /**
     * Sets the value of the fAggiornamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAggiornamento(String value) {
        this.fAggiornamento = value;
    }

    /**
     * Gets the value of the fSedeIntercamerale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSedeIntercamerale() {
        return fSedeIntercamerale;
    }

    /**
     * Sets the value of the fSedeIntercamerale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSedeIntercamerale(String value) {
        this.fSedeIntercamerale = value;
    }

    /**
     * Gets the value of the fonte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonte() {
        return fonte;
    }

    /**
     * Sets the value of the fonte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonte(String value) {
        this.fonte = value;
    }

    /**
     * Gets the value of the nRd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRd() {
        return nRd;
    }

    /**
     * Sets the value of the nRd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRd(String value) {
        this.nRd = value;
    }

    /**
     * Gets the value of the nRea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRea() {
        return nRea;
    }

    /**
     * Sets the value of the nRea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRea(String value) {
        this.nRea = value;
    }

    /**
     * Gets the value of the partitaIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitaIva() {
        return partitaIva;
    }

    /**
     * Sets the value of the partitaIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitaIva(String value) {
        this.partitaIva = value;
    }

    /**
     * Gets the value of the statoDitta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoDitta() {
        return statoDitta;
    }

    /**
     * Sets the value of the statoDitta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoDitta(String value) {
        this.statoDitta = value;
    }

    /**
     * Gets the value of the statoImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoImpresa() {
        return statoImpresa;
    }

    /**
     * Sets the value of the statoImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoImpresa(String value) {
        this.statoImpresa = value;
    }

    /**
     * Gets the value of the tipoImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImpresa() {
        return tipoImpresa;
    }

    /**
     * Sets the value of the tipoImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImpresa(String value) {
        this.tipoImpresa = value;
    }

    /**
     * Gets the value of the tipoSoggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSoggetto() {
        return tipoSoggetto;
    }

    /**
     * Sets the value of the tipoSoggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSoggetto(String value) {
        this.tipoSoggetto = value;
    }

}
