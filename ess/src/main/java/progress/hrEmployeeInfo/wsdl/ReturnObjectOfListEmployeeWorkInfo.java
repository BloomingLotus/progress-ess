//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 01:52:57 PM ICT 
//


package progress.hrEmployeeInfo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import progress.hrStaffGeneral.wsdl.ReturnMessage;


/**
 * <p>Java class for ReturnObjectOfList_EmployeeWorkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnObjectOfList_EmployeeWorkInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}ReturnMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obj" type="{http://tempuri.org/}List_EmployeeWorkInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnObjectOfList_EmployeeWorkInfo", propOrder = {
    "obj"
})
public class ReturnObjectOfListEmployeeWorkInfo
    extends ReturnMessage
{

    protected ListEmployeeWorkInfo obj;

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link ListEmployeeWorkInfo }
     *     
     */
    public ListEmployeeWorkInfo getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEmployeeWorkInfo }
     *     
     */
    public void setObj(ListEmployeeWorkInfo value) {
        this.obj = value;
    }

}