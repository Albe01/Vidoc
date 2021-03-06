//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 06:16:18 PM CEST 
//


package it.vidoc.registro.imprese.output.ri.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerCodFiscSedeXmlDiffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerCodFiscSedeXmlDiffType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PerCodFiscSedeDiffType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Documento" type="{}DocumentoVisuXmlType"/>
 *           &lt;element name="ListaBlocchi" type="{}ListaBlocchiType" maxOccurs="20"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerCodFiscSedeXmlDiffType", propOrder = {
    "documento",
    "listaBlocchi"
})
public class PerCodFiscSedeXmlDiffType
    extends PerCodFiscSedeDiffType
{

    @XmlElement(name = "Documento")
    protected DocumentoVisuXmlType documento;
    @XmlElement(name = "ListaBlocchi", required = true)
    protected List<ListaBlocchiType> listaBlocchi;

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoVisuXmlType }
     *     
     */
    public DocumentoVisuXmlType getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoVisuXmlType }
     *     
     */
    public void setDocumento(DocumentoVisuXmlType value) {
        this.documento = value;
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

}
