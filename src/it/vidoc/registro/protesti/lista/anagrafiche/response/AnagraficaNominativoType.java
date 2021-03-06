//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.24 at 08:31:49 PM CEST 
//


package it.vidoc.registro.protesti.lista.anagrafiche.response;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AnagraficaNominativoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnagraficaNominativoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProgressivoAnagrafica" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="KAnagrafica" type="{}KAnagraficaType"/>
 *         &lt;element name="Fonte" type="{}FonteType" maxOccurs="2"/>
 *         &lt;element name="Nominativo" type="{}NominativoType"/>
 *         &lt;element name="CodFisc" type="{}CodFiscType" minOccurs="0"/>
 *         &lt;element name="CodStaRes" type="{}CodStaType" minOccurs="0"/>
 *         &lt;element name="DescStaRes" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="SglPrvRes" type="{}CciaaType" minOccurs="0"/>
 *         &lt;element name="DescPrvRes" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="CodComRes" type="{}CodComType" minOccurs="0"/>
 *         &lt;element name="DescComRes" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="IndirizzoRes" type="{}IndirizzoType" minOccurs="0"/>
 *         &lt;element name="DtNascita" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CodStaNas" type="{}CodStaType" minOccurs="0"/>
 *         &lt;element name="DescStaNas" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="SglPrvNas" type="{}CciaaType" minOccurs="0"/>
 *         &lt;element name="DescPrvNas" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="CodComNas" type="{}CodComType" minOccurs="0"/>
 *         &lt;element name="DescComNas" type="{}DescrizioneType" minOccurs="0"/>
 *         &lt;element name="LuogoNas" type="{}LuogoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnagraficaNominativoType", propOrder = {
    "content"
})
public class AnagraficaNominativoType {

    @XmlElementRefs({
        @XmlElementRef(name = "CodFisc", type = JAXBElement.class),
        @XmlElementRef(name = "CodStaNas", type = JAXBElement.class),
        @XmlElementRef(name = "KAnagrafica", type = JAXBElement.class),
        @XmlElementRef(name = "CodStaRes", type = JAXBElement.class),
        @XmlElementRef(name = "SglPrvNas", type = JAXBElement.class),
        @XmlElementRef(name = "IndirizzoRes", type = JAXBElement.class),
        @XmlElementRef(name = "DescPrvNas", type = JAXBElement.class),
        @XmlElementRef(name = "DescPrvRes", type = JAXBElement.class),
        @XmlElementRef(name = "CodComNas", type = JAXBElement.class),
        @XmlElementRef(name = "DescComNas", type = JAXBElement.class),
        @XmlElementRef(name = "CodComRes", type = JAXBElement.class),
        @XmlElementRef(name = "DescComRes", type = JAXBElement.class),
        @XmlElementRef(name = "DescStaNas", type = JAXBElement.class),
        @XmlElementRef(name = "Fonte", type = JAXBElement.class),
        @XmlElementRef(name = "DescStaRes", type = JAXBElement.class),
        @XmlElementRef(name = "DtNascita", type = JAXBElement.class),
        @XmlElementRef(name = "ProgressivoAnagrafica", type = JAXBElement.class),
        @XmlElementRef(name = "SglPrvRes", type = JAXBElement.class),
        @XmlElementRef(name = "Nominativo", type = JAXBElement.class),
        @XmlElementRef(name = "LuogoNas", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FonteType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
