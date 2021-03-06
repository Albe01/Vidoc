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
 * <p>Java class for dati-artigiani element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="dati-artigiani">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}attivita-aa" minOccurs="0"/>
 *           &lt;element ref="{}informazioni-supplementari-aa" minOccurs="0"/>
 *           &lt;element ref="{}cancellazione-aa" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="c-categoria" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-delibera" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-domanda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-domanda-accertamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-iscrizione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-iscrizione-accertamento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "attivitaAa",
    "informazioniSupplementariAa",
    "cancellazioneAa"
})
@XmlRootElement(name = "dati-artigiani")
public class DatiArtigiani {

    @XmlElement(name = "attivita-aa")
    protected AttivitaAa attivitaAa;
    @XmlElement(name = "informazioni-supplementari-aa")
    protected String informazioniSupplementariAa;
    @XmlElement(name = "cancellazione-aa")
    protected CancellazioneAa cancellazioneAa;
    @XmlAttribute(name = "c-categoria")
    protected String cCategoria;
    @XmlAttribute
    protected String categoria;
    @XmlAttribute(name = "dt-delibera")
    protected String dtDelibera;
    @XmlAttribute(name = "dt-domanda")
    protected String dtDomanda;
    @XmlAttribute(name = "dt-domanda-accertamento")
    protected String dtDomandaAccertamento;
    @XmlAttribute(name = "dt-iscrizione")
    protected String dtIscrizione;
    @XmlAttribute(name = "dt-iscrizione-accertamento")
    protected String dtIscrizioneAccertamento;
    @XmlAttribute
    protected String n;
    @XmlAttribute
    protected String provincia;

    /**
     * Gets the value of the attivitaAa property.
     * 
     * @return
     *     possible object is
     *     {@link AttivitaAa }
     *     
     */
    public AttivitaAa getAttivitaAa() {
        return attivitaAa;
    }

    /**
     * Sets the value of the attivitaAa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttivitaAa }
     *     
     */
    public void setAttivitaAa(AttivitaAa value) {
        this.attivitaAa = value;
    }

    /**
     * Gets the value of the informazioniSupplementariAa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformazioniSupplementariAa() {
        return informazioniSupplementariAa;
    }

    /**
     * Sets the value of the informazioniSupplementariAa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformazioniSupplementariAa(String value) {
        this.informazioniSupplementariAa = value;
    }

    /**
     * Gets the value of the cancellazioneAa property.
     * 
     * @return
     *     possible object is
     *     {@link CancellazioneAa }
     *     
     */
    public CancellazioneAa getCancellazioneAa() {
        return cancellazioneAa;
    }

    /**
     * Sets the value of the cancellazioneAa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellazioneAa }
     *     
     */
    public void setCancellazioneAa(CancellazioneAa value) {
        this.cancellazioneAa = value;
    }

    /**
     * Gets the value of the cCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCategoria() {
        return cCategoria;
    }

    /**
     * Sets the value of the cCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCategoria(String value) {
        this.cCategoria = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the dtDelibera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtDelibera() {
        return dtDelibera;
    }

    /**
     * Sets the value of the dtDelibera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDelibera(String value) {
        this.dtDelibera = value;
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
     * Gets the value of the dtDomandaAccertamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtDomandaAccertamento() {
        return dtDomandaAccertamento;
    }

    /**
     * Sets the value of the dtDomandaAccertamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDomandaAccertamento(String value) {
        this.dtDomandaAccertamento = value;
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
     * Gets the value of the dtIscrizioneAccertamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtIscrizioneAccertamento() {
        return dtIscrizioneAccertamento;
    }

    /**
     * Sets the value of the dtIscrizioneAccertamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtIscrizioneAccertamento(String value) {
        this.dtIscrizioneAccertamento = value;
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

}
