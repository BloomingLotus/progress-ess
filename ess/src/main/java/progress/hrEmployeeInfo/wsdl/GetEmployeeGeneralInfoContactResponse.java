//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 01:52:57 PM ICT 
//


package progress.hrEmployeeInfo.wsdl;

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
 *         &lt;element name="getEmployeeGeneralInfo_ContactResult" type="{http://tempuri.org/}ReturnObjectOfList_EmployeePersonalInfo_Contact" minOccurs="0"/&gt;
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
    "getEmployeeGeneralInfoContactResult"
})
@XmlRootElement(name = "getEmployeeGeneralInfo_ContactResponse")
public class GetEmployeeGeneralInfoContactResponse {

    @XmlElement(name = "getEmployeeGeneralInfo_ContactResult")
    protected ReturnObjectOfListEmployeePersonalInfoContact getEmployeeGeneralInfoContactResult;

    /**
     * Gets the value of the getEmployeeGeneralInfoContactResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnObjectOfListEmployeePersonalInfoContact }
     *     
     */
    public ReturnObjectOfListEmployeePersonalInfoContact getGetEmployeeGeneralInfoContactResult() {
        return getEmployeeGeneralInfoContactResult;
    }

    /**
     * Sets the value of the getEmployeeGeneralInfoContactResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnObjectOfListEmployeePersonalInfoContact }
     *     
     */
    public void setGetEmployeeGeneralInfoContactResult(ReturnObjectOfListEmployeePersonalInfoContact value) {
        this.getEmployeeGeneralInfoContactResult = value;
    }

}