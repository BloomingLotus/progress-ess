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
 * <p>Java class for List_EmployeeRewardAndPenalty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_EmployeeRewardAndPenalty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StaffCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENTitleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="THFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="THTitleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="THFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="THLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositionLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeRewardAndPenaltyID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RewardAndPenaltyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RewardAndPenaltyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RewardAndPenaltyTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AttachmentFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsReward" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UpdatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PublishedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PublishedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PublishedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_EmployeeRewardAndPenalty", propOrder = {
    "employeeID",
    "staffCode",
    "enFullName",
    "enTitleName",
    "enFirstName",
    "enLastName",
    "thFullName",
    "thTitleName",
    "thFirstName",
    "thLastName",
    "positionName",
    "positionLevelName",
    "departmentName",
    "company",
    "statusName",
    "employeeTypeName",
    "employeeRewardAndPenaltyID",
    "rewardAndPenaltyDate",
    "rewardAndPenaltyName",
    "rewardAndPenaltyTypeName",
    "attachmentID",
    "attachmentFullname",
    "isReward",
    "createdBy",
    "createdDate",
    "createdByName",
    "updatedDate",
    "updatedBy",
    "updatedByName",
    "isActive",
    "publishedDate",
    "publishedBy",
    "publishedByName"
})
public class ListEmployeeRewardAndPenalty {

    @XmlElement(name = "EmployeeID", required = true, type = Integer.class, nillable = true)
    protected Integer employeeID;
    @XmlElement(name = "StaffCode")
    protected String staffCode;
    @XmlElement(name = "ENFullName")
    protected String enFullName;
    @XmlElement(name = "ENTitleName")
    protected String enTitleName;
    @XmlElement(name = "ENFirstName")
    protected String enFirstName;
    @XmlElement(name = "ENLastName")
    protected String enLastName;
    @XmlElement(name = "THFullName")
    protected String thFullName;
    @XmlElement(name = "THTitleName")
    protected String thTitleName;
    @XmlElement(name = "THFirstName")
    protected String thFirstName;
    @XmlElement(name = "THLastName")
    protected String thLastName;
    @XmlElement(name = "PositionName")
    protected String positionName;
    @XmlElement(name = "PositionLevelName")
    protected String positionLevelName;
    @XmlElement(name = "DepartmentName")
    protected String departmentName;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "StatusName")
    protected String statusName;
    @XmlElement(name = "EmployeeTypeName")
    protected String employeeTypeName;
    @XmlElement(name = "EmployeeRewardAndPenaltyID")
    protected int employeeRewardAndPenaltyID;
    @XmlElement(name = "RewardAndPenaltyDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rewardAndPenaltyDate;
    @XmlElement(name = "RewardAndPenaltyName")
    protected String rewardAndPenaltyName;
    @XmlElement(name = "RewardAndPenaltyTypeName")
    protected String rewardAndPenaltyTypeName;
    @XmlElement(name = "AttachmentID", required = true, type = Integer.class, nillable = true)
    protected Integer attachmentID;
    @XmlElement(name = "AttachmentFullname")
    protected String attachmentFullname;
    @XmlElement(name = "IsReward", required = true, type = Boolean.class, nillable = true)
    protected Boolean isReward;
    @XmlElement(name = "CreatedBy", required = true, type = Integer.class, nillable = true)
    protected Integer createdBy;
    @XmlElement(name = "CreatedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreatedByName")
    protected String createdByName;
    @XmlElement(name = "UpdatedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    @XmlElement(name = "UpdatedBy", required = true, type = Integer.class, nillable = true)
    protected Integer updatedBy;
    @XmlElement(name = "UpdatedByName")
    protected String updatedByName;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "PublishedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishedDate;
    @XmlElement(name = "PublishedBy", required = true, type = Integer.class, nillable = true)
    protected Integer publishedBy;
    @XmlElement(name = "PublishedByName")
    protected String publishedByName;

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeID(Integer value) {
        this.employeeID = value;
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
     * Gets the value of the enTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTitleName() {
        return enTitleName;
    }

    /**
     * Sets the value of the enTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTitleName(String value) {
        this.enTitleName = value;
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
     * Gets the value of the thTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHTitleName() {
        return thTitleName;
    }

    /**
     * Sets the value of the thTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHTitleName(String value) {
        this.thTitleName = value;
    }

    /**
     * Gets the value of the thFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHFirstName() {
        return thFirstName;
    }

    /**
     * Sets the value of the thFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHFirstName(String value) {
        this.thFirstName = value;
    }

    /**
     * Gets the value of the thLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHLastName() {
        return thLastName;
    }

    /**
     * Sets the value of the thLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHLastName(String value) {
        this.thLastName = value;
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
     * Gets the value of the positionLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionLevelName() {
        return positionLevelName;
    }

    /**
     * Sets the value of the positionLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionLevelName(String value) {
        this.positionLevelName = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the employeeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeTypeName() {
        return employeeTypeName;
    }

    /**
     * Sets the value of the employeeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeTypeName(String value) {
        this.employeeTypeName = value;
    }

    /**
     * Gets the value of the employeeRewardAndPenaltyID property.
     * 
     */
    public int getEmployeeRewardAndPenaltyID() {
        return employeeRewardAndPenaltyID;
    }

    /**
     * Sets the value of the employeeRewardAndPenaltyID property.
     * 
     */
    public void setEmployeeRewardAndPenaltyID(int value) {
        this.employeeRewardAndPenaltyID = value;
    }

    /**
     * Gets the value of the rewardAndPenaltyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRewardAndPenaltyDate() {
        return rewardAndPenaltyDate;
    }

    /**
     * Sets the value of the rewardAndPenaltyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRewardAndPenaltyDate(XMLGregorianCalendar value) {
        this.rewardAndPenaltyDate = value;
    }

    /**
     * Gets the value of the rewardAndPenaltyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardAndPenaltyName() {
        return rewardAndPenaltyName;
    }

    /**
     * Sets the value of the rewardAndPenaltyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardAndPenaltyName(String value) {
        this.rewardAndPenaltyName = value;
    }

    /**
     * Gets the value of the rewardAndPenaltyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardAndPenaltyTypeName() {
        return rewardAndPenaltyTypeName;
    }

    /**
     * Sets the value of the rewardAndPenaltyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardAndPenaltyTypeName(String value) {
        this.rewardAndPenaltyTypeName = value;
    }

    /**
     * Gets the value of the attachmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttachmentID() {
        return attachmentID;
    }

    /**
     * Sets the value of the attachmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttachmentID(Integer value) {
        this.attachmentID = value;
    }

    /**
     * Gets the value of the attachmentFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFullname() {
        return attachmentFullname;
    }

    /**
     * Sets the value of the attachmentFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFullname(String value) {
        this.attachmentFullname = value;
    }

    /**
     * Gets the value of the isReward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReward() {
        return isReward;
    }

    /**
     * Sets the value of the isReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReward(Boolean value) {
        this.isReward = value;
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
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
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

}
