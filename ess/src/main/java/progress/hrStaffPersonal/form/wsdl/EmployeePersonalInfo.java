//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 03:48:48 PM ICT 
//


package progress.hrStaffPersonal.form.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmployeePersonalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeePersonalInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IDCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TAXNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReligionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MartialStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MartialRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MartialStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReligionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalityID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RaceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalaryAccountBankID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SalaryAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoorAccessCardKeyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentAdmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartmentCancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DepartmentResignationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IsIncludedInPerformanceIndex" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReasonOfResignationDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReasonOfResignationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReasonOfResignationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IDCardTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PublishedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PublishedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublishedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SourceTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LockedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LockedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LockedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeePersonalInfo_Personal_Form", propOrder = {
    "employeeID",
    "idCardNo",
    "taxNo",
    "birthDate",
    "religionID",
    "martialStatusID",
    "martialRemark",
    "martialStatusName",
    "religionName",
    "nationalityName",
    "nationalityID",
    "raceID",
    "raceName",
    "salaryAccountBankID",
    "salaryAccountNo",
    "doorAccessCardKeyNo",
    "departmentAdmissionDate",
    "departmentCancellationDate",
    "departmentResignationDate",
    "isIncludedInPerformanceIndex",
    "reasonOfResignationDetail",
    "reasonOfResignationName",
    "reasonOfResignationID",
    "idCardTypeID",
    "publishedDate",
    "publishedByName",
    "publishedBy",
    "sourceTypeID",
    "lockedDate",
    "lockedByName",
    "lockedBy"
})
public class EmployeePersonalInfo {

    @XmlElement(name = "EmployeeID")
    protected int employeeID;
    @XmlElement(name = "IDCardNo")
    protected String idCardNo;
    @XmlElement(name = "TAXNo")
    protected String taxNo;
    @XmlElement(name = "BirthDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "ReligionID", required = true, type = Integer.class, nillable = true)
    protected Integer religionID;
    @XmlElement(name = "MartialStatusID", required = true, type = Integer.class, nillable = true)
    protected Integer martialStatusID;
    @XmlElement(name = "MartialRemark")
    protected String martialRemark;
    @XmlElement(name = "MartialStatusName")
    protected String martialStatusName;
    @XmlElement(name = "ReligionName")
    protected String religionName;
    @XmlElement(name = "NationalityName")
    protected String nationalityName;
    @XmlElement(name = "NationalityID", required = true, type = Integer.class, nillable = true)
    protected Integer nationalityID;
    @XmlElement(name = "RaceID", required = true, type = Integer.class, nillable = true)
    protected Integer raceID;
    @XmlElement(name = "RaceName")
    protected String raceName;
    @XmlElement(name = "SalaryAccountBankID", required = true, type = Integer.class, nillable = true)
    protected Integer salaryAccountBankID;
    @XmlElement(name = "SalaryAccountNo")
    protected String salaryAccountNo;
    @XmlElement(name = "DoorAccessCardKeyNo")
    protected String doorAccessCardKeyNo;
    @XmlElement(name = "DepartmentAdmissionDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departmentAdmissionDate;
    @XmlElement(name = "DepartmentCancellationDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departmentCancellationDate;
    @XmlElement(name = "DepartmentResignationDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departmentResignationDate;
    @XmlElement(name = "IsIncludedInPerformanceIndex", required = true, type = Boolean.class, nillable = true)
    protected Boolean isIncludedInPerformanceIndex;
    @XmlElement(name = "ReasonOfResignationDetail")
    protected String reasonOfResignationDetail;
    @XmlElement(name = "ReasonOfResignationName")
    protected String reasonOfResignationName;
    @XmlElement(name = "ReasonOfResignationID", required = true, type = Integer.class, nillable = true)
    protected Integer reasonOfResignationID;
    @XmlElement(name = "IDCardTypeID", required = true, type = Integer.class, nillable = true)
    protected Integer idCardTypeID;
    @XmlElement(name = "PublishedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishedDate;
    @XmlElement(name = "PublishedByName")
    protected String publishedByName;
    @XmlElement(name = "PublishedBy", required = true, type = Integer.class, nillable = true)
    protected Integer publishedBy;
    @XmlElement(name = "SourceTypeID")
    protected int sourceTypeID;
    @XmlElement(name = "LockedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lockedDate;
    @XmlElement(name = "LockedByName")
    protected String lockedByName;
    @XmlElement(name = "LockedBy", required = true, type = Integer.class, nillable = true)
    protected Integer lockedBy;

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
     * Gets the value of the idCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCardNo() {
        return idCardNo;
    }

    /**
     * Sets the value of the idCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCardNo(String value) {
        this.idCardNo = value;
    }

    /**
     * Gets the value of the taxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXNo() {
        return taxNo;
    }

    /**
     * Sets the value of the taxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXNo(String value) {
        this.taxNo = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the religionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReligionID() {
        return religionID;
    }

    /**
     * Sets the value of the religionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReligionID(Integer value) {
        this.religionID = value;
    }

    /**
     * Gets the value of the martialStatusID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMartialStatusID() {
        return martialStatusID;
    }

    /**
     * Sets the value of the martialStatusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMartialStatusID(Integer value) {
        this.martialStatusID = value;
    }

    /**
     * Gets the value of the martialRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMartialRemark() {
        return martialRemark;
    }

    /**
     * Sets the value of the martialRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMartialRemark(String value) {
        this.martialRemark = value;
    }

    /**
     * Gets the value of the martialStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMartialStatusName() {
        return martialStatusName;
    }

    /**
     * Sets the value of the martialStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMartialStatusName(String value) {
        this.martialStatusName = value;
    }

    /**
     * Gets the value of the religionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionName() {
        return religionName;
    }

    /**
     * Sets the value of the religionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionName(String value) {
        this.religionName = value;
    }

    /**
     * Gets the value of the nationalityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityName() {
        return nationalityName;
    }

    /**
     * Sets the value of the nationalityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityName(String value) {
        this.nationalityName = value;
    }

    /**
     * Gets the value of the nationalityID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNationalityID() {
        return nationalityID;
    }

    /**
     * Sets the value of the nationalityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNationalityID(Integer value) {
        this.nationalityID = value;
    }

    /**
     * Gets the value of the raceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRaceID() {
        return raceID;
    }

    /**
     * Sets the value of the raceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRaceID(Integer value) {
        this.raceID = value;
    }

    /**
     * Gets the value of the raceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceName() {
        return raceName;
    }

    /**
     * Sets the value of the raceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceName(String value) {
        this.raceName = value;
    }

    /**
     * Gets the value of the salaryAccountBankID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalaryAccountBankID() {
        return salaryAccountBankID;
    }

    /**
     * Sets the value of the salaryAccountBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalaryAccountBankID(Integer value) {
        this.salaryAccountBankID = value;
    }

    /**
     * Gets the value of the salaryAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryAccountNo() {
        return salaryAccountNo;
    }

    /**
     * Sets the value of the salaryAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryAccountNo(String value) {
        this.salaryAccountNo = value;
    }

    /**
     * Gets the value of the doorAccessCardKeyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoorAccessCardKeyNo() {
        return doorAccessCardKeyNo;
    }

    /**
     * Sets the value of the doorAccessCardKeyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorAccessCardKeyNo(String value) {
        this.doorAccessCardKeyNo = value;
    }

    /**
     * Gets the value of the departmentAdmissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartmentAdmissionDate() {
        return departmentAdmissionDate;
    }

    /**
     * Sets the value of the departmentAdmissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartmentAdmissionDate(XMLGregorianCalendar value) {
        this.departmentAdmissionDate = value;
    }

    /**
     * Gets the value of the departmentCancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartmentCancellationDate() {
        return departmentCancellationDate;
    }

    /**
     * Sets the value of the departmentCancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartmentCancellationDate(XMLGregorianCalendar value) {
        this.departmentCancellationDate = value;
    }

    /**
     * Gets the value of the departmentResignationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartmentResignationDate() {
        return departmentResignationDate;
    }

    /**
     * Sets the value of the departmentResignationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartmentResignationDate(XMLGregorianCalendar value) {
        this.departmentResignationDate = value;
    }

    /**
     * Gets the value of the isIncludedInPerformanceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIncludedInPerformanceIndex() {
        return isIncludedInPerformanceIndex;
    }

    /**
     * Sets the value of the isIncludedInPerformanceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIncludedInPerformanceIndex(Boolean value) {
        this.isIncludedInPerformanceIndex = value;
    }

    /**
     * Gets the value of the reasonOfResignationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonOfResignationDetail() {
        return reasonOfResignationDetail;
    }

    /**
     * Sets the value of the reasonOfResignationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonOfResignationDetail(String value) {
        this.reasonOfResignationDetail = value;
    }

    /**
     * Gets the value of the reasonOfResignationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonOfResignationName() {
        return reasonOfResignationName;
    }

    /**
     * Sets the value of the reasonOfResignationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonOfResignationName(String value) {
        this.reasonOfResignationName = value;
    }

    /**
     * Gets the value of the reasonOfResignationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReasonOfResignationID() {
        return reasonOfResignationID;
    }

    /**
     * Sets the value of the reasonOfResignationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReasonOfResignationID(Integer value) {
        this.reasonOfResignationID = value;
    }

    /**
     * Gets the value of the idCardTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDCardTypeID() {
        return idCardTypeID;
    }

    /**
     * Sets the value of the idCardTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDCardTypeID(Integer value) {
        this.idCardTypeID = value;
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
     * Gets the value of the sourceTypeID property.
     * 
     */
    public int getSourceTypeID() {
        return sourceTypeID;
    }

    /**
     * Sets the value of the sourceTypeID property.
     * 
     */
    public void setSourceTypeID(int value) {
        this.sourceTypeID = value;
    }

    /**
     * Gets the value of the lockedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLockedDate() {
        return lockedDate;
    }

    /**
     * Sets the value of the lockedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLockedDate(XMLGregorianCalendar value) {
        this.lockedDate = value;
    }

    /**
     * Gets the value of the lockedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockedByName() {
        return lockedByName;
    }

    /**
     * Sets the value of the lockedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockedByName(String value) {
        this.lockedByName = value;
    }

    /**
     * Gets the value of the lockedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockedBy() {
        return lockedBy;
    }

    /**
     * Sets the value of the lockedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockedBy(Integer value) {
        this.lockedBy = value;
    }

}
