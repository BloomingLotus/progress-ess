//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 01:55:55 PM ICT 
//


package progrss.hrpersonal.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnListObjectOfMT_ResignationCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnListObjectOfMT_ResignationCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}ReturnMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obj" type="{http://tempuri.org/}ArrayOfMT_ResignationCategory" minOccurs="0"/&gt;
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
@XmlType(name = "ReturnListObjectOfMT_ResignationCategory", propOrder = {
    "obj",
    "totalItemCount"
})
public class ReturnListObjectOfMTResignationCategory
    extends ReturnMessage
{

    protected ArrayOfMTResignationCategory obj;
    @XmlElement(name = "TotalItemCount")
    protected int totalItemCount;

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMTResignationCategory }
     *     
     */
    public ArrayOfMTResignationCategory getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMTResignationCategory }
     *     
     */
    public void setObj(ArrayOfMTResignationCategory value) {
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
