//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 11:30:40 AM ICT 
//


package progress.hrStaffGeneral.wsdl;

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
 *         &lt;element name="GetItemGeneralDetailDataResult" type="{http://tempuri.org/}ReturnObjectOfList_EmployeeInfo_GeneralDetail" minOccurs="0"/&gt;
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
    "getItemGeneralDetailDataResult"
})
@XmlRootElement(name = "GetItemGeneralDetailDataResponse")
public class GetItemGeneralDetailDataResponse {

    @XmlElement(name = "GetItemGeneralDetailDataResult")
    protected ReturnObjectOfListEmployeeInfoGeneralDetail getItemGeneralDetailDataResult;

    /**
     * Gets the value of the getItemGeneralDetailDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnObjectOfListEmployeeInfoGeneralDetail }
     *     
     */
    public ReturnObjectOfListEmployeeInfoGeneralDetail getGetItemGeneralDetailDataResult() {
        return getItemGeneralDetailDataResult;
    }

    /**
     * Sets the value of the getItemGeneralDetailDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnObjectOfListEmployeeInfoGeneralDetail }
     *     
     */
    public void setGetItemGeneralDetailDataResult(ReturnObjectOfListEmployeeInfoGeneralDetail value) {
        this.getItemGeneralDetailDataResult = value;
    }

}