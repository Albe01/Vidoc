//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attestazione-qualificazioni element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="attestazione-qualificazioni">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}categorie-opere" minOccurs="0"/>
 *           &lt;element ref="{}attestazione" minOccurs="0"/>
 *         &lt;/sequence>
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
    "categorieOpere",
    "attestazione"
})
@XmlRootElement(name = "attestazione-qualificazioni")
public class AttestazioneQualificazioni {

    @XmlElement(name = "categorie-opere")
    protected CategorieOpere categorieOpere;
    protected Attestazione attestazione;

    /**
     * Gets the value of the categorieOpere property.
     * 
     * @return
     *     possible object is
     *     {@link CategorieOpere }
     *     
     */
    public CategorieOpere getCategorieOpere() {
        return categorieOpere;
    }

    /**
     * Sets the value of the categorieOpere property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategorieOpere }
     *     
     */
    public void setCategorieOpere(CategorieOpere value) {
        this.categorieOpere = value;
    }

    /**
     * Gets the value of the attestazione property.
     * 
     * @return
     *     possible object is
     *     {@link Attestazione }
     *     
     */
    public Attestazione getAttestazione() {
        return attestazione;
    }

    /**
     * Sets the value of the attestazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attestazione }
     *     
     */
    public void setAttestazione(Attestazione value) {
        this.attestazione = value;
    }

}
