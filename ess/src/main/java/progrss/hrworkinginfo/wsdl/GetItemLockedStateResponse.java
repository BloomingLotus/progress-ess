//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 01:57:35 PM ICT 
//


package progrss.hrworkinginfo.wsdl;

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
 *         &lt;element name="GetItemLockedStateResult" type="{http://tempuri.org/}ReturnLockState" minOccurs="0"/&gt;
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
    "getItemLockedStateResult"
})
@XmlRootElement(name = "GetItemLockedStateResponse")
public class GetItemLockedStateResponse {

    @XmlElement(name = "GetItemLockedStateResult")
    protected ReturnLockState getItemLockedStateResult;

    /**
     * Gets the value of the getItemLockedStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLockState }
     *     
     */
    public ReturnLockState getGetItemLockedStateResult() {
        return getItemLockedStateResult;
    }

    /**
     * Sets the value of the getItemLockedStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLockState }
     *     
     */
    public void setGetItemLockedStateResult(ReturnLockState value) {
        this.getItemLockedStateResult = value;
    }

}
