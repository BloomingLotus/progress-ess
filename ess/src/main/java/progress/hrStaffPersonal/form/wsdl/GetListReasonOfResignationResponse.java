//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 03:48:48 PM ICT 
//


package progress.hrStaffPersonal.form.wsdl;

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
 *         &lt;element name="GetListReasonOfResignationResult" type="{http://tempuri.org/}ReturnListObjectOfMT_ReasonOfResignation" minOccurs="0"/&gt;
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
    "getListReasonOfResignationResult"
})
@XmlRootElement(name = "GetListReasonOfResignationResponse")
public class GetListReasonOfResignationResponse {

    @XmlElement(name = "GetListReasonOfResignationResult")
    protected ReturnListObjectOfMTReasonOfResignation getListReasonOfResignationResult;

    /**
     * Gets the value of the getListReasonOfResignationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnListObjectOfMTReasonOfResignation }
     *     
     */
    public ReturnListObjectOfMTReasonOfResignation getGetListReasonOfResignationResult() {
        return getListReasonOfResignationResult;
    }

    /**
     * Sets the value of the getListReasonOfResignationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnListObjectOfMTReasonOfResignation }
     *     
     */
    public void setGetListReasonOfResignationResult(ReturnListObjectOfMTReasonOfResignation value) {
        this.getListReasonOfResignationResult = value;
    }

}
