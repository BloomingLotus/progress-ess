//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 03:48:29 PM ICT 
//


package progress.hrStaffPersonal.wsdl;

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
 *         &lt;element name="GetItemEmployeePersonalResult" type="{http://tempuri.org/}ReturnObjectOfEmployeePersonalInfo" minOccurs="0"/&gt;
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
    "getItemEmployeePersonalResult"
})
@XmlRootElement(name = "GetItemEmployeePersonalResponse")
public class GetItemEmployeePersonalResponse {

    @XmlElement(name = "GetItemEmployeePersonalResult")
    protected ReturnObjectOfEmployeePersonalInfo getItemEmployeePersonalResult;

    /**
     * Gets the value of the getItemEmployeePersonalResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnObjectOfEmployeePersonalInfo }
     *     
     */
    public ReturnObjectOfEmployeePersonalInfo getGetItemEmployeePersonalResult() {
        return getItemEmployeePersonalResult;
    }

    /**
     * Sets the value of the getItemEmployeePersonalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnObjectOfEmployeePersonalInfo }
     *     
     */
    public void setGetItemEmployeePersonalResult(ReturnObjectOfEmployeePersonalInfo value) {
        this.getItemEmployeePersonalResult = value;
    }

}
