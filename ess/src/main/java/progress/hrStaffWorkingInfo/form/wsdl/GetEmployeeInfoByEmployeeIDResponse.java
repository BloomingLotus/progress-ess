//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.09 at 06:10:37 PM ICT 
//


package progress.hrStaffWorkingInfo.form.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import progress.hrStaffGeneral.form.wsdl.ReturnObjectOfEmployeeInfo;


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
 *         &lt;element name="GetEmployeeInfoByEmployeeIDResult" type="{http://tempuri.org/}ReturnObjectOfEmployeeInfo" minOccurs="0"/&gt;
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
    "getEmployeeInfoByEmployeeIDResult"
})
@XmlRootElement(name = "GetEmployeeInfoByEmployeeIDResponse")
public class GetEmployeeInfoByEmployeeIDResponse {

    @XmlElement(name = "GetEmployeeInfoByEmployeeIDResult")
    protected ReturnObjectOfEmployeeInfo getEmployeeInfoByEmployeeIDResult;

    /**
     * Gets the value of the getEmployeeInfoByEmployeeIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnObjectOfEmployeeInfo }
     *     
     */
    public ReturnObjectOfEmployeeInfo getGetEmployeeInfoByEmployeeIDResult() {
        return getEmployeeInfoByEmployeeIDResult;
    }

    /**
     * Sets the value of the getEmployeeInfoByEmployeeIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnObjectOfEmployeeInfo }
     *     
     */
    public void setGetEmployeeInfoByEmployeeIDResult(ReturnObjectOfEmployeeInfo value) {
        this.getEmployeeInfoByEmployeeIDResult = value;
    }

}
