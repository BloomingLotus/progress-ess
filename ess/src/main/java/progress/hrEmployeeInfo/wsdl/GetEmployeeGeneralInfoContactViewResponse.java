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
 *         &lt;element name="getEmployeeGeneralInfo_ContactViewResult" type="{http://tempuri.org/}ReturnObjectOfList_EmployeePersonalInfo_Contact" minOccurs="0"/&gt;
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
    "getEmployeeGeneralInfoContactViewResult"
})
@XmlRootElement(name = "getEmployeeGeneralInfo_ContactViewResponse")
public class GetEmployeeGeneralInfoContactViewResponse {

    @XmlElement(name = "getEmployeeGeneralInfo_ContactViewResult")
    protected ReturnObjectOfListEmployeePersonalInfoContact getEmployeeGeneralInfoContactViewResult;

    /**
     * Gets the value of the getEmployeeGeneralInfoContactViewResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnObjectOfListEmployeePersonalInfoContact }
     *     
     */
    public ReturnObjectOfListEmployeePersonalInfoContact getGetEmployeeGeneralInfoContactViewResult() {
        return getEmployeeGeneralInfoContactViewResult;
    }

    /**
     * Sets the value of the getEmployeeGeneralInfoContactViewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnObjectOfListEmployeePersonalInfoContact }
     *     
     */
    public void setGetEmployeeGeneralInfoContactViewResult(ReturnObjectOfListEmployeePersonalInfoContact value) {
        this.getEmployeeGeneralInfoContactViewResult = value;
    }

}
