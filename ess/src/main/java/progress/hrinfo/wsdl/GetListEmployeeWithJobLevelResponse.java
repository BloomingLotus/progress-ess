//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 12:50:31 PM ICT 
//


package progress.hrinfo.wsdl;

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
 *         &lt;element name="GetListEmployeeWithJobLevelResult" type="{http://tempuri.org/}ReturnListObjectOfList_EmployeeListWithJobLevel" minOccurs="0"/&gt;
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
    "getListEmployeeWithJobLevelResult"
})
@XmlRootElement(name = "GetListEmployeeWithJobLevelResponse")
public class GetListEmployeeWithJobLevelResponse {

    @XmlElement(name = "GetListEmployeeWithJobLevelResult")
    protected ReturnListObjectOfListEmployeeListWithJobLevel getListEmployeeWithJobLevelResult;

    /**
     * Gets the value of the getListEmployeeWithJobLevelResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnListObjectOfListEmployeeListWithJobLevel }
     *     
     */
    public ReturnListObjectOfListEmployeeListWithJobLevel getGetListEmployeeWithJobLevelResult() {
        return getListEmployeeWithJobLevelResult;
    }

    /**
     * Sets the value of the getListEmployeeWithJobLevelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnListObjectOfListEmployeeListWithJobLevel }
     *     
     */
    public void setGetListEmployeeWithJobLevelResult(ReturnListObjectOfListEmployeeListWithJobLevel value) {
        this.getListEmployeeWithJobLevelResult = value;
    }

}
