//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riquadro element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="riquadro">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}tipo-atto" minOccurs="0"/>
 *           &lt;element ref="{}composizione-quote" minOccurs="0"/>
 *           &lt;element ref="{}vincoli-quote" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{}titolari" minOccurs="0"/>
 *           &lt;element ref="{}diritti-partecipazione" minOccurs="0"/>
 *           &lt;element ref="{}note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;attribute name="c" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-annotazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-evento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="n-ricorrenze" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "content"
})
@XmlRootElement(name = "riquadro")
public class Riquadro {

    @XmlElementRefs({
        @XmlElementRef(name = "vincoli-quote", type = JAXBElement.class),
        @XmlElementRef(name = "composizione-quote", type = ComposizioneQuote.class),
        @XmlElementRef(name = "diritti-partecipazione", type = DirittiPartecipazione.class),
        @XmlElementRef(name = "tipo-atto", type = TipoAtto.class),
        @XmlElementRef(name = "titolari", type = Titolari.class),
        @XmlElementRef(name = "note", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute
    protected String c;
    @XmlAttribute(name = "dt-annotazione")
    protected String dtAnnotazione;
    @XmlAttribute(name = "dt-evento")
    protected String dtEvento;
    @XmlAttribute(name = "n-ricorrenze")
    protected String nRicorrenze;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * {@link ComposizioneQuote }
     * {@link DirittiPartecipazione }
     * {@link TipoAtto }
     * {@link Titolari }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC(String value) {
        this.c = value;
    }

    /**
     * Gets the value of the dtAnnotazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAnnotazione() {
        return dtAnnotazione;
    }

    /**
     * Sets the value of the dtAnnotazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAnnotazione(String value) {
        this.dtAnnotazione = value;
    }

    /**
     * Gets the value of the dtEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEvento() {
        return dtEvento;
    }

    /**
     * Sets the value of the dtEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEvento(String value) {
        this.dtEvento = value;
    }

    /**
     * Gets the value of the nRicorrenze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRicorrenze() {
        return nRicorrenze;
    }

    /**
     * Sets the value of the nRicorrenze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRicorrenze(String value) {
        this.nRicorrenze = value;
    }

}