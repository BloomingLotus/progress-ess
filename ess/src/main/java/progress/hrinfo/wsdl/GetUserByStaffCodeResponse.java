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
 *         &lt;element name="GetUserByStaffCodeResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "getUserByStaffCodeResult"
})
@XmlRootElement(name = "GetUserByStaffCodeResponse")
public class GetUserByStaffCodeResponse {

    @XmlElement(name = "GetUserByStaffCodeResult")
    protected Object getUserByStaffCodeResult;

    /**
     * Gets the value of the getUserByStaffCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGetUserByStaffCodeResult() {
        return getUserByStaffCodeResult;
    }

    /**
     * Sets the value of the getUserByStaffCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGetUserByStaffCodeResult(Object value) {
        this.getUserByStaffCodeResult = value;
    }

}
