//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 03:49:23 PM ICT 
//


package progress.hrStaffWorkingInfo.form.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for List_EmployeeWorkInfo_Form complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="List_EmployeeWorkInfo_Form"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeWorkTransactionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UpdatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartWorkingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="InitialProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ResignationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="WorkingExperienceBeforeEntryYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkingExperienceBeforeEntryMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupportDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsLongTerm" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PublishedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PublishedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublishedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkingHereYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkingHereMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SupportToDepartmentID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_EmployeeWorkInfo_Form_WorkingInfo_Form", propOrder = {
    "employeeWorkTransactionID",
    "updatedDate",
    "updatedByName",
    "updatedBy",
    "createdDate",
    "createdByName",
    "createdBy",
    "employeeID",
    "startWorkingDate",
    "initialProjectName",
    "admissionDate",
    "resignationDate",
    "cancellationDate",
    "workingExperienceBeforeEntryYear",
    "workingExperienceBeforeEntryMonth",
    "departmentName",
    "supportDescription",
    "isLongTerm",
    "publishedDate",
    "publishedByName",
    "publishedBy",
    "workingHereYear",
    "workingHereMonth",
    "supportToDepartmentID",
    "departmentCode"
})
public class ListEmployeeWorkInfoForm {

    @XmlElement(name = "EmployeeWorkTransactionID", required = true, type = Integer.class, nillable = true)
    protected Integer employeeWorkTransactionID;
    @XmlElement(name = "UpdatedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    @XmlElement(name = "UpdatedByName")
    protected String updatedByName;
    @XmlElement(name = "UpdatedBy", required = true, type = Integer.class, nillable = true)
    protected Integer updatedBy;
    @XmlElement(name = "CreatedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreatedByName")
    protected String createdByName;
    @XmlElement(name = "CreatedBy", required = true, type = Integer.class, nillable = true)
    protected Integer createdBy;
    @XmlElement(name = "EmployeeID")
    protected int employeeID;
    @XmlElement(name = "StartWorkingDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startWorkingDate;
    @XmlElement(name = "InitialProjectName")
    protected String initialProjectName;
    @XmlElement(name = "AdmissionDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admissionDate;
    @XmlElement(name = "ResignationDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resignationDate;
    @XmlElement(name = "CancellationDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "WorkingExperienceBeforeEntryYear", required = true, type = Integer.class, nillable = true)
    protected Integer workingExperienceBeforeEntryYear;
    @XmlElement(name = "WorkingExperienceBeforeEntryMonth", required = true, type = Integer.class, nillable = true)
    protected Integer workingExperienceBeforeEntryMonth;
    @XmlElement(name = "DepartmentName")
    protected String departmentName;
    @XmlElement(name = "SupportDescription")
    protected String supportDescription;
    @XmlElement(name = "IsLongTerm", required = true, type = Boolean.class, nillable = true)
    protected Boolean isLongTerm;
    @XmlElement(name = "PublishedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishedDate;
    @XmlElement(name = "PublishedByName")
    protected String publishedByName;
    @XmlElement(name = "PublishedBy", required = true, type = Integer.class, nillable = true)
    protected Integer publishedBy;
    @XmlElement(name = "WorkingHereYear", required = true, type = Integer.class, nillable = true)
    protected Integer workingHereYear;
    @XmlElement(name = "WorkingHereMonth", required = true, type = Integer.class, nillable = true)
    protected Integer workingHereMonth;
    @XmlElement(name = "SupportToDepartmentID", required = true, type = Integer.class, nillable = true)
    protected Integer supportToDepartmentID;
    @XmlElement(name = "DepartmentCode")
    protected String departmentCode;

    /**
     * Gets the value of the employeeWorkTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeWorkTransactionID() {
        return employeeWorkTransactionID;
    }

    /**
     * Sets the value of the employeeWorkTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeWorkTransactionID(Integer value) {
        this.employeeWorkTransactionID = value;
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
     * Gets the value of the startWorkingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartWorkingDate() {
        return startWorkingDate;
    }

    /**
     * Sets the value of the startWorkingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartWorkingDate(XMLGregorianCalendar value) {
        this.startWorkingDate = value;
    }

    /**
     * Gets the value of the initialProjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialProjectName() {
        return initialProjectName;
    }

    /**
     * Sets the value of the initialProjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialProjectName(String value) {
        this.initialProjectName = value;
    }

    /**
     * Gets the value of the admissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmissionDate() {
        return admissionDate;
    }

    /**
     * Sets the value of the admissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmissionDate(XMLGregorianCalendar value) {
        this.admissionDate = value;
    }

    /**
     * Gets the value of the resignationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResignationDate() {
        return resignationDate;
    }

    /**
     * Sets the value of the resignationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResignationDate(XMLGregorianCalendar value) {
        this.resignationDate = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the workingExperienceBeforeEntryYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkingExperienceBeforeEntryYear() {
        return workingExperienceBeforeEntryYear;
    }

    /**
     * Sets the value of the workingExperienceBeforeEntryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkingExperienceBeforeEntryYear(Integer value) {
        this.workingExperienceBeforeEntryYear = value;
    }

    /**
     * Gets the value of the workingExperienceBeforeEntryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkingExperienceBeforeEntryMonth() {
        return workingExperienceBeforeEntryMonth;
    }

    /**
     * Sets the value of the workingExperienceBeforeEntryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkingExperienceBeforeEntryMonth(Integer value) {
        this.workingExperienceBeforeEntryMonth = value;
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
     * Gets the value of the supportDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportDescription() {
        return supportDescription;
    }

    /**
     * Sets the value of the supportDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportDescription(String value) {
        this.supportDescription = value;
    }

    /**
     * Gets the value of the isLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLongTerm() {
        return isLongTerm;
    }

    /**
     * Sets the value of the isLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLongTerm(Boolean value) {
        this.isLongTerm = value;
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
     * Gets the value of the workingHereYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkingHereYear() {
        return workingHereYear;
    }

    /**
     * Sets the value of the workingHereYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkingHereYear(Integer value) {
        this.workingHereYear = value;
    }

    /**
     * Gets the value of the workingHereMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkingHereMonth() {
        return workingHereMonth;
    }

    /**
     * Sets the value of the workingHereMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkingHereMonth(Integer value) {
        this.workingHereMonth = value;
    }

    /**
     * Gets the value of the supportToDepartmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupportToDepartmentID() {
        return supportToDepartmentID;
    }

    /**
     * Sets the value of the supportToDepartmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupportToDepartmentID(Integer value) {
        this.supportToDepartmentID = value;
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

}
