//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:16:18 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.request;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PerChiaveReaXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerChiaveReaXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cciaa" type="{}CciaaType"/>
 *         &lt;element name="NRea" type="{}NReaType"/>
 *         &lt;element name="FUlCessate" type="{}FUlCessateType" minOccurs="0"/>
 *         &lt;element name="DtInfoStoricheMin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DtInfoStoricheMax" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DtAtto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IdeRich" type="{}IdeRichType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="ListaBlocchi" type="{}ListaBlocchiType" maxOccurs="20"/>
 *           &lt;element name="Documento" type="{}DocumentoXmlType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerChiaveReaXmlType", propOrder = {
    "cciaa",
    "nRea",
    "fUlCessate",
    "dtInfoStoricheMin",
    "dtInfoStoricheMax",
    "dtAtto",
    "ideRich",
    "listaBlocchi",
    "documento"
})
public class PerChiaveReaXmlType {

    @XmlElement(name = "Cciaa", required = true)
    protected String cciaa;
    @XmlElement(name = "NRea", required = true)
    protected BigInteger nRea;
    @XmlElement(name = "FUlCessate")
    protected FUlCessateType fUlCessate;
    @XmlElement(name = "DtInfoStoricheMin")
    protected XMLGregorianCalendar dtInfoStoricheMin;
    @XmlElement(name = "DtInfoStoricheMax")
    protected XMLGregorianCalendar dtInfoStoricheMax;
    @XmlElement(name = "DtAtto")
    protected XMLGregorianCalendar dtAtto;
    @XmlElement(name = "IdeRich")
    protected String ideRich;
    @XmlElement(name = "ListaBlocchi", required = true)
    protected List<ListaBlocchiType> listaBlocchi;
    @XmlElement(name = "Documento")
    protected DocumentoXmlType documento;

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
     * Gets the value of the nRea property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNRea() {
        return nRea;
    }

    /**
     * Sets the value of the nRea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNRea(BigInteger value) {
        this.nRea = value;
    }

    /**
     * Gets the value of the fUlCessate property.
     * 
     * @return
     *     possible object is
     *     {@link FUlCessateType }
     *     
     */
    public FUlCessateType getFUlCessate() {
        return fUlCessate;
    }

    /**
     * Sets the value of the fUlCessate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUlCessateType }
     *     
     */
    public void setFUlCessate(FUlCessateType value) {
        this.fUlCessate = value;
    }

    /**
     * Gets the value of the dtInfoStoricheMin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtInfoStoricheMin() {
        return dtInfoStoricheMin;
    }

    /**
     * Sets the value of the dtInfoStoricheMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtInfoStoricheMin(XMLGregorianCalendar value) {
        this.dtInfoStoricheMin = value;
    }

    /**
     * Gets the value of the dtInfoStoricheMax property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtInfoStoricheMax() {
        return dtInfoStoricheMax;
    }

    /**
     * Sets the value of the dtInfoStoricheMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtInfoStoricheMax(XMLGregorianCalendar value) {
        this.dtInfoStoricheMax = value;
    }

    /**
     * Gets the value of the dtAtto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAtto() {
        return dtAtto;
    }

    /**
     * Sets the value of the dtAtto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAtto(XMLGregorianCalendar value) {
        this.dtAtto = value;
    }

    /**
     * Gets the value of the ideRich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeRich() {
        return ideRich;
    }

    /**
     * Sets the value of the ideRich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeRich(String value) {
        this.ideRich = value;
    }

    /**
     * Gets the value of the listaBlocchi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaBlocchi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaBlocchi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaBlocchiType }
     * 
     * 
     */
    public List<ListaBlocchiType> getListaBlocchi() {
        if (listaBlocchi == null) {
            listaBlocchi = new ArrayList<ListaBlocchiType>();
        }
        return this.listaBlocchi;
    }

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoXmlType }
     *     
     */
    public DocumentoXmlType getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoXmlType }
     *     
     */
    public void setDocumento(DocumentoXmlType value) {
        this.documento = value;
    }

}
