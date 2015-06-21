//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 01:52:57 PM ICT 
//


package progress.hrEmployeeInfo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_EmployeeInfoHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_EmployeeInfoHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EmployeeImageSource" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeImageFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StaffCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleENName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="THFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_EmployeeInfoHeader", propOrder = {
    "employeeID",
    "employeeImageSource",
    "employeeImageFilename",
    "staffCode",
    "titleENName",
    "enFirstName",
    "enLastName",
    "enFullName",
    "thFullName",
    "departmentCode",
    "positionName",
    "divisionName"
})
public class ListEmployeeInfoHeader {

    @XmlElement(name = "EmployeeID")
    protected int employeeID;
    @XmlElement(name = "EmployeeImageSource")
    protected byte[] employeeImageSource;
    @XmlElement(name = "EmployeeImageFilename")
    protected String employeeImageFilename;
    @XmlElement(name = "StaffCode")
    protected String staffCode;
    @XmlElement(name = "TitleENName")
    protected String titleENName;
    @XmlElement(name = "ENFirstName")
    protected String enFirstName;
    @XmlElement(name = "ENLastName")
    protected String enLastName;
    @XmlElement(name = "ENFullName")
    protected String enFullName;
    @XmlElement(name = "THFullName")
    protected String thFullName;
    @XmlElement(name = "DepartmentCode")
    protected String departmentCode;
    @XmlElement(name = "PositionName")
    protected String positionName;
    @XmlElement(name = "DivisionName")
    protected String divisionName;

    /**
     * Gets the value of the employeeID property.
     * 
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     */
    public void setEmployeeID(int value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the employeeImageSource property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEmployeeImageSource() {
        return employeeImageSource;
    }

    /**
     * Sets the value of the employeeImageSource property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEmployeeImageSource(byte[] value) {
        this.employeeImageSource = value;
    }

    /**
     * Gets the value of the employeeImageFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeImageFilename() {
        return employeeImageFilename;
    }

    /**
     * Sets the value of the employeeImageFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeImageFilename(String value) {
        this.employeeImageFilename = value;
    }

    /**
     * Gets the value of the staffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffCode() {
        return staffCode;
    }

    /**
     * Sets the value of the staffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffCode(String value) {
        this.staffCode = value;
    }

    /**
     * Gets the value of the titleENName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleENName() {
        return titleENName;
    }

    /**
     * Sets the value of the titleENName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleENName(String value) {
        this.titleENName = value;
    }

    /**
     * Gets the value of the enFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENFirstName() {
        return enFirstName;
    }

    /**
     * Sets the value of the enFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENFirstName(String value) {
        this.enFirstName = value;
    }

    /**
     * Gets the value of the enLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENLastName() {
        return enLastName;
    }

    /**
     * Sets the value of the enLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENLastName(String value) {
        this.enLastName = value;
    }

    /**
     * Gets the value of the enFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENFullName() {
        return enFullName;
    }

    /**
     * Sets the value of the enFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENFullName(String value) {
        this.enFullName = value;
    }

    /**
     * Gets the value of the thFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHFullName() {
        return thFullName;
    }

    /**
     * Sets the value of the thFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHFullName(String value) {
        this.thFullName = value;
    }

    /**
     * Gets the value of the departmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentCode(String value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the positionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * Sets the value of the positionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionName(String value) {
        this.positionName = value;
    }

    /**
     * Gets the value of the divisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * Sets the value of the divisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionName(String value) {
        this.divisionName = value;
    }

}