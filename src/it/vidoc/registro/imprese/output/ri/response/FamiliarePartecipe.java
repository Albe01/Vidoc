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
 * <p>Java class for familiare-partecipe element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="familiare-partecipe">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="c-fiscale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="f-coltivatore-diretto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "familiare-partecipe")
public class FamiliarePartecipe {

    @XmlAttribute(name = "c-fiscale")
    protected String cFiscale;
    @XmlAttribute
    protected String cognome;
    @XmlAttribute(name = "f-coltivatore-diretto")
    protected String fColtivatoreDiretto;
    @XmlAttribute
    protected String nome;

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
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Gets the value of the fColtivatoreDiretto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFColtivatoreDiretto() {
        return fColtivatoreDiretto;
    }

    /**
     * Sets the value of the fColtivatoreDiretto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFColtivatoreDiretto(String value) {
        this.fColtivatoreDiretto = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

}