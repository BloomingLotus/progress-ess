//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 01:53:31 PM ICT 
//


package progrss.hreducation.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetListDegreeResult" type="{http://tempuri.org/}ReturnListObjectOfMT_ListOfValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getListDegreeResult"
})
@XmlRootElement(name = "GetListDegreeResponse")
public class GetListDegreeResponse {

    @XmlElement(name = "GetListDegreeResult")
    protected ReturnListObjectOfMTListOfValue getListDegreeResult;

    /**
     * Gets the value of the getListDegreeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnListObjectOfMTListOfValue }
     *     
     */
    public ReturnListObjectOfMTListOfValue getGetListDegreeResult() {
        return getListDegreeResult;
    }

    /**
     * Sets the value of the getListDegreeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnListObjectOfMTListOfValue }
     *     
     */
    public void setGetListDegreeResult(ReturnListObjectOfMTListOfValue value) {
        this.getListDegreeResult = value;
    }

}