//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.24 at 08:33:16 PM CEST 
//


package it.vidoc.registro.protesti.lista.ufficiali.levatori.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaUfficialiLevatoriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaUfficialiLevatoriType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UfficialeLevatore" type="{}UfficialeLevatoreType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaUfficialiLevatoriType", propOrder = {
    "ufficialeLevatore"
})
public class ListaUfficialiLevatoriType {

    @XmlElement(name = "UfficialeLevatore", required = true)
    protected List<UfficialeLevatoreType> ufficialeLevatore;

    /**
     * Gets the value of the ufficialeLevatore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ufficialeLevatore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUfficialeLevatore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UfficialeLevatoreType }
     * 
     * 
     */
    public List<UfficialeLevatoreType> getUfficialeLevatore() {
        if (ufficialeLevatore == null) {
            ufficialeLevatore = new ArrayList<UfficialeLevatoreType>();
        }
        return this.ufficialeLevatore;
    }

}
