//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 11:30:40 AM ICT 
//


package progress.hrStaffGeneral.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnObjectOfList_EmployeeInfo_GeneralForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnObjectOfList_EmployeeInfo_GeneralForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}ReturnMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obj" type="{http://tempuri.org/}List_EmployeeInfo_GeneralForm" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnObjectOfList_EmployeeInfo_GeneralForm", propOrder = {
    "obj"
})
public class ReturnObjectOfListEmployeeInfoGeneralForm
    extends ReturnMessage
{

    protected ListEmployeeInfoGeneralForm obj;

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link ListEmployeeInfoGeneralForm }
     *     
     */
    public ListEmployeeInfoGeneralForm getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEmployeeInfoGeneralForm }
     *     
     */
    public void setObj(ListEmployeeInfoGeneralForm value) {
        this.obj = value;
    }

}
