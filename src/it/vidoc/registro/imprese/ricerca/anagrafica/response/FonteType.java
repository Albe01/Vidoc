//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 05:59:41 PM CEST 
//


package it.vidoc.registro.imprese.ricerca.anagrafica.response;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for FonteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FonteType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RD"/>
 *     &lt;enumeration value="RI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum FonteType {

    PR,
    RD,
    RI;

    public String value() {
        return name();
    }

    public static FonteType fromValue(String v) {
        return valueOf(v);
    }

}
