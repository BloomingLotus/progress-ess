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
 * <p>Java class for ArrayOfList_EmployeeCertificationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfList_EmployeeCertificationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List_EmployeeCertificationInfo" type="{http://tempuri.org/}List_EmployeeCertificationInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfList_EmployeeCertificationInfo", propOrder = {
    "listEmployeeCertificationInfo"
})
public class ArrayOfListEmployeeCertificationInfo {

    @XmlElement(name = "List_EmployeeCertificationInfo", nillable = true)
    protected List<ListEmployeeCertificationInfo> listEmployeeCertificationInfo;

    /**
     * Gets the value of the listEmployeeCertificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listEmployeeCertificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListEmployeeCertificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListEmployeeCertificationInfo }
     * 
     * 
     */
    public List<ListEmployeeCertificationInfo> getListEmployeeCertificationInfo() {
        if (listEmployeeCertificationInfo == null) {
            listEmployeeCertificationInfo = new ArrayList<ListEmployeeCertificationInfo>();
        }
        return this.listEmployeeCertificationInfo;
    }

}
