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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trasferimento element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="trasferimento">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}estremi-impresa"/>
 *           &lt;element ref="{}estremi-pratica"/>
 *           &lt;element ref="{}riquadri"/>
 *         &lt;/sequence>
 *         &lt;attribute name="f-successivo-ultimo-es" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "estremiImpresa",
    "estremiPratica",
    "riquadri"
})
@XmlRootElement(name = "trasferimento")
public class Trasferimento {

    @XmlElement(name = "estremi-impresa", required = true)
    protected EstremiImpresa estremiImpresa;
    @XmlElement(name = "estremi-pratica", required = true)
    protected EstremiPratica estremiPratica;
    @XmlElement(required = true)
    protected Riquadri riquadri;
    @XmlAttribute(name = "f-successivo-ultimo-es")
    protected String fSuccessivoUltimoEs;

    /**
     * Gets the value of the estremiImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link EstremiImpresa }
     *     
     */
    public EstremiImpresa getEstremiImpresa() {
        return estremiImpresa;
    }

    /**
     * Sets the value of the estremiImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstremiImpresa }
     *     
     */
    public void setEstremiImpresa(EstremiImpresa value) {
        this.estremiImpresa = value;
    }

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
     * Gets the value of the riquadri property.
     * 
     * @return
     *     possible object is
     *     {@link Riquadri }
     *     
     */
    public Riquadri getRiquadri() {
        return riquadri;
    }

    /**
     * Sets the value of the riquadri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Riquadri }
     *     
     */
    public void setRiquadri(Riquadri value) {
        this.riquadri = value;
    }

    /**
     * Gets the value of the fSuccessivoUltimoEs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSuccessivoUltimoEs() {
        return fSuccessivoUltimoEs;
    }

    /**
     * Sets the value of the fSuccessivoUltimoEs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSuccessivoUltimoEs(String value) {
        this.fSuccessivoUltimoEs = value;
    }

}
