//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 01:52:57 PM ICT 
//


package progress.hrEmployeeInfo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import progress.hrStaffGeneral.wsdl.ReturnMessage;


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
 *         &lt;element name="getWaitForApproveMessageResult" type="{http://tempuri.org/}ReturnMessage" minOccurs="0"/&gt;
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
    "getWaitForApproveMessageResult"
})
@XmlRootElement(name = "getWaitForApproveMessageResponse")
public class GetWaitForApproveMessageResponse {

    protected ReturnMessage getWaitForApproveMessageResult;

    /**
     * Gets the value of the getWaitForApproveMessageResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessage }
     *     
     */
    public ReturnMessage getGetWaitForApproveMessageResult() {
        return getWaitForApproveMessageResult;
    }

    /**
     * Sets the value of the getWaitForApproveMessageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessage }
     *     
     */
    public void setGetWaitForApproveMessageResult(ReturnMessage value) {
        this.getWaitForApproveMessageResult = value;
    }

}
