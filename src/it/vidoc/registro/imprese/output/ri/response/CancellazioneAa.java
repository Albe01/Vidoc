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
 * <p>Java class for cancellazione-aa element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="cancellazione-aa">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="c-causale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="causale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-cessazione" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-delibera" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="dt-domanda-accertamento" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "cancellazione-aa")
public class CancellazioneAa {

    @XmlAttribute(name = "c-causale")
    protected String cCausale;
    @XmlAttribute
    protected String causale;
    @XmlAttribute(name = "dt-cessazione")
    protected String dtCessazione;
    @XmlAttribute(name = "dt-delibera")
    protected String dtDelibera;
    @XmlAttribute(name = "dt-domanda-accertamento")
    protected String dtDomandaAccertamento;

    /**
     * Gets the value of the cCausale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCausale() {
        return cCausale;
    }

    /**
     * Sets the value of the cCausale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCausale(String value) {
        this.cCausale = value;
    }

    /**
     * Gets the value of the causale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausale() {
        return causale;
    }

    /**
     * Sets the value of the causale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausale(String value) {
        this.causale = value;
    }

    /**
     * Gets the value of the dtCessazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtCessazione() {
        return dtCessazione;
    }

    /**
     * Sets the value of the dtCessazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtCessazione(String value) {
        this.dtCessazione = value;
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

}
