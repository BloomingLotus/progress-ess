//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 01:52:57 PM ICT 
//


package progress.hrEmployeeInfo.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfList_EmployeeSkillInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfList_EmployeeSkillInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List_EmployeeSkillInfo" type="{http://tempuri.org/}List_EmployeeSkillInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfList_EmployeeSkillInfo", propOrder = {
    "listEmployeeSkillInfo"
})
public class ArrayOfListEmployeeSkillInfo {

    @XmlElement(name = "List_EmployeeSkillInfo", nillable = true)
    protected List<ListEmployeeSkillInfo> listEmployeeSkillInfo;

    /**
     * Gets the value of the listEmployeeSkillInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listEmployeeSkillInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListEmployeeSkillInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListEmployeeSkillInfo }
     * 
     * 
     */
    public List<ListEmployeeSkillInfo> getListEmployeeSkillInfo() {
        if (listEmployeeSkillInfo == null) {
            listEmployeeSkillInfo = new ArrayList<ListEmployeeSkillInfo>();
        }
        return this.listEmployeeSkillInfo;
    }

}