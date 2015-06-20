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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for List_EmployeePersonalInfo_Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_EmployeePersonalInfo_Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OfficePhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeExtensionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkSiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkSiteFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeEmail1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeEmail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomePhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublishedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PublishedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublishedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ContactMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UpdatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spouseTHFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spouseTHLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spouseMobilePhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="childrenStudy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_EmployeePersonalInfo_Contact", propOrder = {
    "employeeID",
    "officePhoneNo",
    "officeExtensionNo",
    "officeFaxNo",
    "workSiteName",
    "workSiteFloor",
    "officeEmail1",
    "officeEmail2",
    "homePhoneNo",
    "mobilePhoneNo",
    "publishedDate",
    "publishedByName",
    "publishedBy",
    "contactMemo",
    "createdByName",
    "createdBy",
    "createdDate",
    "updatedDate",
    "updatedByName",
    "updatedBy",
    "contactName",
    "contactNo",
    "contactRelationship",
    "spouseTHFirstName",
    "spouseTHLastName",
    "spouseMobilePhoneNo",
    "children",
    "childrenStudy"
})
public class ListEmployeePersonalInfoContact {

    @XmlElement(name = "EmployeeID")
    protected int employeeID;
    @XmlElement(name = "OfficePhoneNo")
    protected String officePhoneNo;
    @XmlElement(name = "OfficeExtensionNo")
    protected String officeExtensionNo;
    @XmlElement(name = "OfficeFaxNo")
    protected String officeFaxNo;
    @XmlElement(name = "WorkSiteName")
    protected String workSiteName;
    @XmlElement(name = "WorkSiteFloor")
    protected String workSiteFloor;
    @XmlElement(name = "OfficeEmail1")
    protected String officeEmail1;
    @XmlElement(name = "OfficeEmail2")
    protected String officeEmail2;
    @XmlElement(name = "HomePhoneNo")
    protected String homePhoneNo;
    @XmlElement(name = "MobilePhoneNo")
    protected String mobilePhoneNo;
    @XmlElement(name = "PublishedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishedDate;
    @XmlElement(name = "PublishedByName")
    protected String publishedByName;
    @XmlElement(name = "PublishedBy", required = true, type = Integer.class, nillable = true)
    protected Integer publishedBy;
    @XmlElement(name = "ContactMemo")
    protected String contactMemo;
    @XmlElement(name = "CreatedByName")
    protected String createdByName;
    @XmlElement(name = "CreatedBy", required = true, type = Integer.class, nillable = true)
    protected Integer createdBy;
    @XmlElement(name = "CreatedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "UpdatedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    @XmlElement(name = "UpdatedByName")
    protected String updatedByName;
    @XmlElement(name = "UpdatedBy", required = true, type = Integer.class, nillable = true)
    protected Integer updatedBy;
    protected String contactName;
    protected String contactNo;
    protected String contactRelationship;
    protected String spouseTHFirstName;
    protected String spouseTHLastName;
    protected String spouseMobilePhoneNo;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer children;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer childrenStudy;

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
     * Gets the value of the officePhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhoneNo() {
        return officePhoneNo;
    }

    /**
     * Sets the value of the officePhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhoneNo(String value) {
        this.officePhoneNo = value;
    }

    /**
     * Gets the value of the officeExtensionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeExtensionNo() {
        return officeExtensionNo;
    }

    /**
     * Sets the value of the officeExtensionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeExtensionNo(String value) {
        this.officeExtensionNo = value;
    }

    /**
     * Gets the value of the officeFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeFaxNo() {
        return officeFaxNo;
    }

    /**
     * Sets the value of the officeFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeFaxNo(String value) {
        this.officeFaxNo = value;
    }

    /**
     * Gets the value of the workSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkSiteName() {
        return workSiteName;
    }

    /**
     * Sets the value of the workSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkSiteName(String value) {
        this.workSiteName = value;
    }

    /**
     * Gets the value of the workSiteFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkSiteFloor() {
        return workSiteFloor;
    }

    /**
     * Sets the value of the workSiteFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkSiteFloor(String value) {
        this.workSiteFloor = value;
    }

    /**
     * Gets the value of the officeEmail1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeEmail1() {
        return officeEmail1;
    }

    /**
     * Sets the value of the officeEmail1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeEmail1(String value) {
        this.officeEmail1 = value;
    }

    /**
     * Gets the value of the officeEmail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeEmail2() {
        return officeEmail2;
    }

    /**
     * Sets the value of the officeEmail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeEmail2(String value) {
        this.officeEmail2 = value;
    }

    /**
     * Gets the value of the homePhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneNo() {
        return homePhoneNo;
    }

    /**
     * Sets the value of the homePhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneNo(String value) {
        this.homePhoneNo = value;
    }

    /**
     * Gets the value of the mobilePhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNo() {
        return mobilePhoneNo;
    }

    /**
     * Sets the value of the mobilePhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNo(String value) {
        this.mobilePhoneNo = value;
    }

    /**
     * Gets the value of the publishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishedDate() {
        return publishedDate;
    }

    /**
     * Sets the value of the publishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishedDate(XMLGregorianCalendar value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the publishedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedByName() {
        return publishedByName;
    }

    /**
     * Sets the value of the publishedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedByName(String value) {
        this.publishedByName = value;
    }

    /**
     * Gets the value of the publishedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPublishedBy() {
        return publishedBy;
    }

    /**
     * Sets the value of the publishedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPublishedBy(Integer value) {
        this.publishedBy = value;
    }

    /**
     * Gets the value of the contactMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMemo() {
        return contactMemo;
    }

    /**
     * Sets the value of the contactMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMemo(String value) {
        this.contactMemo = value;
    }

    /**
     * Gets the value of the createdByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByName() {
        return createdByName;
    }

    /**
     * Sets the value of the createdByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByName(String value) {
        this.createdByName = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatedBy(Integer value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the updatedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedByName() {
        return updatedByName;
    }

    /**
     * Sets the value of the updatedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedByName(String value) {
        this.updatedByName = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpdatedBy(Integer value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * Sets the value of the contactNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNo(String value) {
        this.contactNo = value;
    }

    /**
     * Gets the value of the contactRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRelationship() {
        return contactRelationship;
    }

    /**
     * Sets the value of the contactRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRelationship(String value) {
        this.contactRelationship = value;
    }

    /**
     * Gets the value of the spouseTHFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseTHFirstName() {
        return spouseTHFirstName;
    }

    /**
     * Sets the value of the spouseTHFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseTHFirstName(String value) {
        this.spouseTHFirstName = value;
    }

    /**
     * Gets the value of the spouseTHLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseTHLastName() {
        return spouseTHLastName;
    }

    /**
     * Sets the value of the spouseTHLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseTHLastName(String value) {
        this.spouseTHLastName = value;
    }

    /**
     * Gets the value of the spouseMobilePhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseMobilePhoneNo() {
        return spouseMobilePhoneNo;
    }

    /**
     * Sets the value of the spouseMobilePhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseMobilePhoneNo(String value) {
        this.spouseMobilePhoneNo = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildren(Integer value) {
        this.children = value;
    }

    /**
     * Gets the value of the childrenStudy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildrenStudy() {
        return childrenStudy;
    }

    /**
     * Sets the value of the childrenStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildrenStudy(Integer value) {
        this.childrenStudy = value;
    }

}
