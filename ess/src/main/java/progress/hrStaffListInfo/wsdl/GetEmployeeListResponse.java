//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.31 at 03:21:22 PM ICT 
//


package progress.hrStaffListInfo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getEmployeeListResult" type="{http://tempuri.org/}ReturnListObjectOfList_EmployeeList" minOccurs="0"/&gt;
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
    "getEmployeeListResult"
})
@XmlRootElement(name = "getEmployeeListResponse")
public class GetEmployeeListResponse {

    protected ReturnListObjectOfListEmployeeList getEmployeeListResult;

    /**
     * Gets the value of the getEmployeeListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnListObjectOfListEmployeeList }
     *     
     */
    public ReturnListObjectOfListEmployeeList getGetEmployeeListResult() {
        return getEmployeeListResult;
    }

    /**
     * Sets the value of the getEmployeeListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnListObjectOfListEmployeeList }
     *     
     */
    public void setGetEmployeeListResult(ReturnListObjectOfListEmployeeList value) {
        this.getEmployeeListResult = value;
    }

}
