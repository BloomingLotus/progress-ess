//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.31 at 03:21:22 PM ICT 
//


package progress.hrStaffListInfo.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMT_OrganizationDepartment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMT_OrganizationDepartment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MT_OrganizationDepartment" type="{http://tempuri.org/}MT_OrganizationDepartment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMT_OrganizationDepartment", propOrder = {
    "mtOrganizationDepartment"
})
public class ArrayOfMTOrganizationDepartment {

    @XmlElement(name = "MT_OrganizationDepartment", nillable = true)
    protected List<MTOrganizationDepartment> mtOrganizationDepartment;

    /**
     * Gets the value of the mtOrganizationDepartment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtOrganizationDepartment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMTOrganizationDepartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MTOrganizationDepartment }
     * 
     * 
     */
    public List<MTOrganizationDepartment> getMTOrganizationDepartment() {
        if (mtOrganizationDepartment == null) {
            mtOrganizationDepartment = new ArrayList<MTOrganizationDepartment>();
        }
        return this.mtOrganizationDepartment;
    }

}
