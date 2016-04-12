//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:16:18 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputRIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputRIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ListaOutputRI" type="{}ListaOutputRIType"/>
 *         &lt;element name="InformazioniImpresaXml" type="{}InformazioniImpresaXmlType"/>
 *         &lt;element name="InformazioniImpresaPdf" type="{}InformazioniImpresaPdfType"/>
 *         &lt;element name="InformazioniImpresaTesto" type="{}InformazioniImpresaTestoType"/>
 *         &lt;element name="InformazioniImpresaHtml" type="{}InformazioniImpresaHtmlType"/>
 *         &lt;element name="DocumentoBilancio" type="{}DocumentoBilancioType"/>
 *         &lt;element name="Statuto" type="{}StatutoType"/>
 *         &lt;element name="InformazioniImpresaXmlDiff" type="{}InformazioniImpresaXmlDiffType"/>
 *         &lt;element name="InformazioniImpresaTestoDiff" type="{}InformazioniImpresaTestoDiffType"/>
 *         &lt;element name="InformazioniImpresaHtmlDiff" type="{}InformazioniImpresaHtmlDiffType"/>
 *         &lt;element name="VisureXmlDiff" type="{}VisureXmlDiffType"/>
 *         &lt;element name="VisureTestoDiff" type="{}VisureTestoDiffType"/>
 *         &lt;element name="BlocchiXmlDiff" type="{}BlocchiXmlDiffType"/>
 *         &lt;element name="BlocchiTestoDiff" type="{}BlocchiTestoDiffType"/>
 *         &lt;element name="RicercaContrattoReteXml" type="{}RicercaContrattoReteXmlType"/>
 *         &lt;element name="InformazioniReteImpresaXml" type="{}InformazioniReteImpresaXmlType"/>
 *         &lt;element name="InformazioniReteImpresaPdf" type="{}InformazioniReteImpresaPdfType"/>
 *         &lt;element name="InformazioniReteImpresaHtml" type="{}InformazioniReteImpresaHtmlType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputRIType", propOrder = {
    "listaOutputRI",
    "informazioniImpresaXml",
    "informazioniImpresaPdf",
    "informazioniImpresaTesto",
    "informazioniImpresaHtml",
    "documentoBilancio",
    "statuto",
    "informazioniImpresaXmlDiff",
    "informazioniImpresaTestoDiff",
    "informazioniImpresaHtmlDiff",
    "visureXmlDiff",
    "visureTestoDiff",
    "blocchiXmlDiff",
    "blocchiTestoDiff",
    "ricercaContrattoReteXml",
    "informazioniReteImpresaXml",
    "informazioniReteImpresaPdf",
    "informazioniReteImpresaHtml"
})
public class OutputRIType {

    @XmlElement(name = "ListaOutputRI")
    protected ListaOutputRIType listaOutputRI;
    @XmlElement(name = "InformazioniImpresaXml")
    protected InformazioniImpresaXmlType informazioniImpresaXml;
    @XmlElement(name = "InformazioniImpresaPdf")
    protected InformazioniImpresaPdfType informazioniImpresaPdf;
    @XmlElement(name = "InformazioniImpresaTesto")
    protected InformazioniImpresaTestoType informazioniImpresaTesto;
    @XmlElement(name = "InformazioniImpresaHtml")
    protected InformazioniImpresaHtmlType informazioniImpresaHtml;
    @XmlElement(name = "DocumentoBilancio")
    protected DocumentoBilancioType documentoBilancio;
    @XmlElement(name = "Statuto")
    protected StatutoType statuto;
    @XmlElement(name = "InformazioniImpresaXmlDiff")
    protected InformazioniImpresaXmlDiffType informazioniImpresaXmlDiff;
    @XmlElement(name = "InformazioniImpresaTestoDiff")
    protected InformazioniImpresaTestoDiffType informazioniImpresaTestoDiff;
    @XmlElement(name = "InformazioniImpresaHtmlDiff")
    protected InformazioniImpresaHtmlDiffType informazioniImpresaHtmlDiff;
    @XmlElement(name = "VisureXmlDiff")
    protected VisureXmlDiffType visureXmlDiff;
    @XmlElement(name = "VisureTestoDiff")
    protected VisureTestoDiffType visureTestoDiff;
    @XmlElement(name = "BlocchiXmlDiff")
    protected BlocchiXmlDiffType blocchiXmlDiff;
    @XmlElement(name = "BlocchiTestoDiff")
    protected BlocchiTestoDiffType blocchiTestoDiff;
    @XmlElement(name = "RicercaContrattoReteXml")
    protected RicercaContrattoReteXmlType ricercaContrattoReteXml;
    @XmlElement(name = "InformazioniReteImpresaXml")
    protected InformazioniReteImpresaXmlType informazioniReteImpresaXml;
    @XmlElement(name = "InformazioniReteImpresaPdf")
    protected InformazioniReteImpresaPdfType informazioniReteImpresaPdf;
    @XmlElement(name = "InformazioniReteImpresaHtml")
    protected InformazioniReteImpresaHtmlType informazioniReteImpresaHtml;

    /**
     * Gets the value of the listaOutputRI property.
     * 
     * @return
     *     possible object is
     *     {@link ListaOutputRIType }
     *     
     */
    public ListaOutputRIType getListaOutputRI() {
        return listaOutputRI;
    }

    /**
     * Sets the value of the listaOutputRI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaOutputRIType }
     *     
     */
    public void setListaOutputRI(ListaOutputRIType value) {
        this.listaOutputRI = value;
    }

    /**
     * Gets the value of the informazioniImpresaXml property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniImpresaXmlType }
     *     
     */
    public InformazioniImpresaXmlType getInformazioniImpresaXml() {
        return informazioniImpresaXml;
    }

    /**
     * Sets the value of the informazioniImpresaXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniImpresaXmlType }
     *     
     */
    public void setInformazioniImpresaXml(InformazioniImpresaXmlType value) {
        this.informazioniImpresaXml = value;
    }

    /**
     * Gets the value of the informazioniImpresaPdf property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniImpresaPdfType }
     *     
     */
    public InformazioniImpresaPdfType getInformazioniImpresaPdf() {
        return informazioniImpresaPdf;
    }

    /**
     * Sets the value of the informazioniImpresaPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniImpresaPdfType }
     *     
     */
    public void setInformazioniImpresaPdf(InformazioniImpresaPdfType value) {
        this.informazioniImpresaPdf = value;
    }

    /**
     * Gets the value of the informazioniImpresaTesto property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniImpresaTestoType }
     *     
     */
    public InformazioniImpresaTestoType getInformazioniImpresaTesto() {
        return informazioniImpresaTesto;
    }

    /**
     * Sets the value of the informazioniImpresaTesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniImpresaTestoType }
     *     
     */
    public void setInformazioniImpresaTesto(InformazioniImpresaTestoType value) {
        this.informazioniImpresaTesto = value;
    }

    /**
     * Gets the value of the informazioniImpresaHtml property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniImpresaHtmlType }
     *     
     */
    public InformazioniImpresaHtmlType getInformazioniImpresaHtml() {
        return informazioniImpresaHtml;
    }

    /**
     * Sets the value of the informazioniImpresaHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniImpresaHtmlType }
     *     
     */
    public void setInformazioniImpresaHtml(InformazioniImpresaHtmlType value) {
        this.informazioniImpresaHtml = value;
    }

    /**
     * Gets the value of the documentoBilancio property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoBilancioType }
     *     
     */
    public DocumentoBilancioType getDocumentoBilancio() {
        return documentoBilancio;
    }

    /**
     * Sets the value of the documentoBilancio property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoBilancioType }
     *     
     */
    public void setDocumentoBilancio(DocumentoBilancioType value) {
        this.documentoBilancio = value;
    }

    /**
     * Gets the value of the statuto property.
     * 
     * @return
     *     possible object is
     *     {@link StatutoType }
     *     
     */
    public StatutoType getStatuto() {
        return statuto;
    }

    /**
     * Sets the value of the statuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutoType }
     *     
     */
    public void setStatuto(StatutoType value) {
        this.statuto = value;
    }

    /**
     * Gets the value of the informazioniImpresaXmlDiff property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniImpresaXmlDiffType }
     *     
     */
    public InformazioniImpresaXmlDiffType getInformazioniImpresaXmlDiff() {
        return informazioniImpresaXmlDiff;
    }

    /**
     * Sets the value of the informazioniImpresaXmlDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniImpresaXmlDiffType }
     *     
     */
    public void setInformazioniImpresaXmlDiff(InformazioniImpresaXmlDiffType value) {
        this.informazioniImpresaXmlDiff = value;
    }

    /**
     * Gets the value of the informazioniImpresaTestoDiff property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniImpresaTestoDiffType }
     *     
     */
    public InformazioniImpresaTestoDiffType getInformazioniImpresaTestoDiff() {
        return informazioniImpresaTestoDiff;
    }

    /**
     * Sets the value of the informazioniImpresaTestoDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniImpresaTestoDiffType }
     *     
     */
    public void setInformazioniImpresaTestoDiff(InformazioniImpresaTestoDiffType value) {
        this.informazioniImpresaTestoDiff = value;
    }

    /**
     * Gets the value of the informazioniImpresaHtmlDiff property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniImpresaHtmlDiffType }
     *     
     */
    public InformazioniImpresaHtmlDiffType getInformazioniImpresaHtmlDiff() {
        return informazioniImpresaHtmlDiff;
    }

    /**
     * Sets the value of the informazioniImpresaHtmlDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniImpresaHtmlDiffType }
     *     
     */
    public void setInformazioniImpresaHtmlDiff(InformazioniImpresaHtmlDiffType value) {
        this.informazioniImpresaHtmlDiff = value;
    }

    /**
     * Gets the value of the visureXmlDiff property.
     * 
     * @return
     *     possible object is
     *     {@link VisureXmlDiffType }
     *     
     */
    public VisureXmlDiffType getVisureXmlDiff() {
        return visureXmlDiff;
    }

    /**
     * Sets the value of the visureXmlDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisureXmlDiffType }
     *     
     */
    public void setVisureXmlDiff(VisureXmlDiffType value) {
        this.visureXmlDiff = value;
    }

    /**
     * Gets the value of the visureTestoDiff property.
     * 
     * @return
     *     possible object is
     *     {@link VisureTestoDiffType }
     *     
     */
    public VisureTestoDiffType getVisureTestoDiff() {
        return visureTestoDiff;
    }

    /**
     * Sets the value of the visureTestoDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisureTestoDiffType }
     *     
     */
    public void setVisureTestoDiff(VisureTestoDiffType value) {
        this.visureTestoDiff = value;
    }

    /**
     * Gets the value of the blocchiXmlDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BlocchiXmlDiffType }
     *     
     */
    public BlocchiXmlDiffType getBlocchiXmlDiff() {
        return blocchiXmlDiff;
    }

    /**
     * Sets the value of the blocchiXmlDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlocchiXmlDiffType }
     *     
     */
    public void setBlocchiXmlDiff(BlocchiXmlDiffType value) {
        this.blocchiXmlDiff = value;
    }

    /**
     * Gets the value of the blocchiTestoDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BlocchiTestoDiffType }
     *     
     */
    public BlocchiTestoDiffType getBlocchiTestoDiff() {
        return blocchiTestoDiff;
    }

    /**
     * Sets the value of the blocchiTestoDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlocchiTestoDiffType }
     *     
     */
    public void setBlocchiTestoDiff(BlocchiTestoDiffType value) {
        this.blocchiTestoDiff = value;
    }

    /**
     * Gets the value of the ricercaContrattoReteXml property.
     * 
     * @return
     *     possible object is
     *     {@link RicercaContrattoReteXmlType }
     *     
     */
    public RicercaContrattoReteXmlType getRicercaContrattoReteXml() {
        return ricercaContrattoReteXml;
    }

    /**
     * Sets the value of the ricercaContrattoReteXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link RicercaContrattoReteXmlType }
     *     
     */
    public void setRicercaContrattoReteXml(RicercaContrattoReteXmlType value) {
        this.ricercaContrattoReteXml = value;
    }

    /**
     * Gets the value of the informazioniReteImpresaXml property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniReteImpresaXmlType }
     *     
     */
    public InformazioniReteImpresaXmlType getInformazioniReteImpresaXml() {
        return informazioniReteImpresaXml;
    }

    /**
     * Sets the value of the informazioniReteImpresaXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniReteImpresaXmlType }
     *     
     */
    public void setInformazioniReteImpresaXml(InformazioniReteImpresaXmlType value) {
        this.informazioniReteImpresaXml = value;
    }

    /**
     * Gets the value of the informazioniReteImpresaPdf property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniReteImpresaPdfType }
     *     
     */
    public InformazioniReteImpresaPdfType getInformazioniReteImpresaPdf() {
        return informazioniReteImpresaPdf;
    }

    /**
     * Sets the value of the informazioniReteImpresaPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniReteImpresaPdfType }
     *     
     */
    public void setInformazioniReteImpresaPdf(InformazioniReteImpresaPdfType value) {
        this.informazioniReteImpresaPdf = value;
    }

    /**
     * Gets the value of the informazioniReteImpresaHtml property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniReteImpresaHtmlType }
     *     
     */
    public InformazioniReteImpresaHtmlType getInformazioniReteImpresaHtml() {
        return informazioniReteImpresaHtml;
    }

    /**
     * Sets the value of the informazioniReteImpresaHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniReteImpresaHtmlType }
     *     
     */
    public void setInformazioniReteImpresaHtml(InformazioniReteImpresaHtmlType value) {
        this.informazioniReteImpresaHtml = value;
    }

}