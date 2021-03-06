//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.24 at 08:35:14 PM CEST 
//


package it.vidoc.registro.protesti.visura.effetto.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisuraEffettoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisuraEffettoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnagraficaNominativo" type="{}AnagraficaType" minOccurs="0"/>
 *         &lt;element name="ArchivioStorico" type="{}ArchivioStoricoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegistroProtesti" type="{}RegistroProtestiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisuraEffettoType", propOrder = {
    "anagraficaNominativo",
    "archivioStorico",
    "registroProtesti"
})
public class VisuraEffettoType {

    @XmlElement(name = "AnagraficaNominativo")
    protected AnagraficaType anagraficaNominativo;
    @XmlElement(name = "ArchivioStorico")
    protected List<ArchivioStoricoType> archivioStorico;
    @XmlElement(name = "RegistroProtesti")
    protected List<RegistroProtestiType> registroProtesti;

    /**
     * Gets the value of the anagraficaNominativo property.
     * 
     * @return
     *     possible object is
     *     {@link AnagraficaType }
     *     
     */
    public AnagraficaType getAnagraficaNominativo() {
        return anagraficaNominativo;
    }

    /**
     * Sets the value of the anagraficaNominativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnagraficaType }
     *     
     */
    public void setAnagraficaNominativo(AnagraficaType value) {
        this.anagraficaNominativo = value;
    }

    /**
     * Gets the value of the archivioStorico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archivioStorico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchivioStorico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchivioStoricoType }
     * 
     * 
     */
    public List<ArchivioStoricoType> getArchivioStorico() {
        if (archivioStorico == null) {
            archivioStorico = new ArrayList<ArchivioStoricoType>();
        }
        return this.archivioStorico;
    }

    /**
     * Gets the value of the registroProtesti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registroProtesti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroProtesti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroProtestiType }
     * 
     * 
     */
    public List<RegistroProtestiType> getRegistroProtesti() {
        if (registroProtesti == null) {
            registroProtesti = new ArrayList<RegistroProtestiType>();
        }
        return this.registroProtesti;
    }

}
