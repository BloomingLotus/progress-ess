//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 12:41:20 PM ICT 
//


package progress.hrsso.wsdl;

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
 *         &lt;element name="GetStaffProfileByNameResult" type="{http://tempuri.org/}ResultObjectOfvPEMS_SPStaffProfile" minOccurs="0"/&gt;
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
    "getStaffProfileByNameResult"
})
@XmlRootElement(name = "GetStaffProfileByNameResponse")
public class GetStaffProfileByNameResponse {

    @XmlElement(name = "GetStaffProfileByNameResult")
    protected ResultObjectOfvPEMSSPStaffProfile getStaffProfileByNameResult;

    /**
     * Gets the value of the getStaffProfileByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultObjectOfvPEMSSPStaffProfile }
     *     
     */
    public ResultObjectOfvPEMSSPStaffProfile getGetStaffProfileByNameResult() {
        return getStaffProfileByNameResult;
    }

    /**
     * Sets the value of the getStaffProfileByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObjectOfvPEMSSPStaffProfile }
     *     
     */
    public void setGetStaffProfileByNameResult(ResultObjectOfvPEMSSPStaffProfile value) {
        this.getStaffProfileByNameResult = value;
    }

}