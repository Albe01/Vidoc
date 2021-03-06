//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:18:12 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for annotazione-libro-soci element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="annotazione-libro-soci">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}estremi-pratica" minOccurs="0"/>
 *           &lt;element ref="{}estremi-pratica-riconfermata" minOccurs="0"/>
 *           &lt;element ref="{}riquadri-trasferimento" minOccurs="0"/>
 *           &lt;element ref="{}note" maxOccurs="unbounded" minOccurs="0"/>
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
    "estremiPratica",
    "estremiPraticaRiconfermata",
    "riquadriTrasferimento",
    "note"
})
@XmlRootElement(name = "annotazione-libro-soci")
public class AnnotazioneLibroSoci {

    @XmlElement(name = "estremi-pratica")
    protected EstremiPratica estremiPratica;
    @XmlElement(name = "estremi-pratica-riconfermata")
    protected EstremiPraticaRiconfermata estremiPraticaRiconfermata;
    @XmlElement(name = "riquadri-trasferimento")
    protected RiquadriTrasferimento riquadriTrasferimento;
    @XmlElement(required = true)
    protected List<String> note;

    /**
     * Gets the value of the estremiPratica property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiPratica }
     *     
     */
    public EstremiPratica getEstremiPratica() {
        return estremiPratica;
    }

    /**
     * Sets the value of the estremiPratica property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiPratica }
     *     
     */
    public void setEstremiPratica(EstremiPratica value) {
        this.estremiPratica = value;
    }

    /**
     * Gets the value of the estremiPraticaRiconfermata property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiPraticaRiconfermata }
     *     
     */
    public EstremiPraticaRiconfermata getEstremiPraticaRiconfermata() {
        return estremiPraticaRiconfermata;
    }

    /**
     * Sets the value of the estremiPraticaRiconfermata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiPraticaRiconfermata }
     *     
     */
    public void setEstremiPraticaRiconfermata(EstremiPraticaRiconfermata value) {
        this.estremiPraticaRiconfermata = value;
    }

    /**
     * Gets the value of the riquadriTrasferimento property.
     * 
     * @return
     *     possible object is
     *     {@link RiquadriTrasferimento }
     *     
     */
    public RiquadriTrasferimento getRiquadriTrasferimento() {
        return riquadriTrasferimento;
    }

    /**
     * Sets the value of the riquadriTrasferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiquadriTrasferimento }
     *     
     */
    public void setRiquadriTrasferimento(RiquadriTrasferimento value) {
        this.riquadriTrasferimento = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNote() {
        if (note == null) {
            note = new ArrayList<String>();
        }
        return this.note;
    }

}
