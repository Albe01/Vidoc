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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for albi-ruoli-licenze element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="albi-ruoli-licenze">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}dati-artigiani" minOccurs="0"/>
 *           &lt;element ref="{}riconoscimenti-professionali" minOccurs="0"/>
 *           &lt;element ref="{}abilitazioni-impiantisti" minOccurs="0"/>
 *           &lt;element ref="{}abilitazione-pulizia" minOccurs="0"/>
 *           &lt;element ref="{}abilitazione-facchinaggio" minOccurs="0"/>
 *           &lt;element ref="{}ruoli" minOccurs="0"/>
 *           &lt;element ref="{}registro-preziosi" minOccurs="0"/>
 *           &lt;element ref="{}denunce-inizio-attivita" minOccurs="0"/>
 *           &lt;element ref="{}licenze" minOccurs="0"/>
 *           &lt;element ref="{}requisiti-morali-professionali" minOccurs="0"/>
 *           &lt;element ref="{}commercio-dettaglio" minOccurs="0"/>
 *           &lt;element ref="{}societa-cooperativa" minOccurs="0"/>
 *           &lt;element ref="{}assegnatari-marchio" minOccurs="0"/>
 *         &lt;/choice>
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
@XmlRootElement(name = "albi-ruoli-licenze")
public class AlbiRuoliLicenze {

    @XmlElementRefs({
        @XmlElementRef(name = "abilitazione-pulizia", type = AbilitazionePulizia.class),
        @XmlElementRef(name = "ruoli", type = Ruoli.class),
        @XmlElementRef(name = "registro-preziosi", type = RegistroPreziosi.class),
        @XmlElementRef(name = "societa-cooperativa", type = SocietaCooperativa.class),
        @XmlElementRef(name = "denunce-inizio-attivita", type = DenunceInizioAttivita.class),
        @XmlElementRef(name = "dati-artigiani", type = DatiArtigiani.class),
        @XmlElementRef(name = "riconoscimenti-professionali", type = RiconoscimentiProfessionali.class),
        @XmlElementRef(name = "requisiti-morali-professionali", type = RequisitiMoraliProfessionali.class),
        @XmlElementRef(name = "licenze", type = Licenze.class),
        @XmlElementRef(name = "assegnatari-marchio", type = AssegnatariMarchio.class),
        @XmlElementRef(name = "commercio-dettaglio", type = CommercioDettaglio.class),
        @XmlElementRef(name = "abilitazione-facchinaggio", type = AbilitazioneFacchinaggio.class),
        @XmlElementRef(name = "abilitazioni-impiantisti", type = AbilitazioniImpiantisti.class)
    })
    @XmlMixed
    protected List<Object> content;

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
     * {@link AbilitazionePulizia }
     * {@link Ruoli }
     * {@link RegistroPreziosi }
     * {@link SocietaCooperativa }
     * {@link String }
     * {@link DenunceInizioAttivita }
     * {@link DatiArtigiani }
     * {@link RiconoscimentiProfessionali }
     * {@link RequisitiMoraliProfessionali }
     * {@link Licenze }
     * {@link AssegnatariMarchio }
     * {@link CommercioDettaglio }
     * {@link AbilitazioneFacchinaggio }
     * {@link AbilitazioniImpiantisti }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
