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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnListObjectOfMT_OrganizationDivision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnListObjectOfMT_OrganizationDivision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}ReturnMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obj" type="{http://tempuri.org/}ArrayOfMT_OrganizationDivision" minOccurs="0"/&gt;
 *         &lt;element name="TotalItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnListObjectOfMT_OrganizationDivision", propOrder = {
    "obj",
    "totalItemCount"
})
public class ReturnListObjectOfMTOrganizationDivision
    extends ReturnMessage
{

    protected ArrayOfMTOrganizationDivision obj;
    @XmlElement(name = "TotalItemCount")
    protected int totalItemCount;

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMTOrganizationDivision }
     *     
     */
    public ArrayOfMTOrganizationDivision getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMTOrganizationDivision }
     *     
     */
    public void setObj(ArrayOfMTOrganizationDivision value) {
        this.obj = value;
    }

    /**
     * Gets the value of the totalItemCount property.
     * 
     */
    public int getTotalItemCount() {
        return totalItemCount;
    }

    /**
     * Sets the value of the totalItemCount property.
     * 
     */
    public void setTotalItemCount(int value) {
        this.totalItemCount = value;
    }

}
