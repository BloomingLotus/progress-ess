//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 01:54:43 PM ICT 
//


package progrss.hrcertificate.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MT_CertFocusArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MT_CertFocusArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FocusAreaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FocusAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FocusAreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FocusAreaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UpdatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CreatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MT_CertFocusArea", propOrder = {
    "focusAreaID",
    "focusAreaCode",
    "focusAreaName",
    "focusAreaDesc",
    "isActive",
    "updatedDate",
    "updatedByName",
    "updatedBy",
    "createdDate",
    "createdByName",
    "createdBy"
})
public class MTCertFocusArea {

    @XmlElement(name = "FocusAreaID")
    protected int focusAreaID;
    @XmlElement(name = "FocusAreaCode")
    protected String focusAreaCode;
    @XmlElement(name = "FocusAreaName")
    protected String focusAreaName;
    @XmlElement(name = "FocusAreaDesc")
    protected String focusAreaDesc;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "UpdatedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    @XmlElement(name = "UpdatedByName")
    protected String updatedByName;
    @XmlElement(name = "UpdatedBy", required = true, type = Integer.class, nillable = true)
    protected Integer updatedBy;
    @XmlElement(name = "CreatedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreatedByName")
    protected String createdByName;
    @XmlElement(name = "CreatedBy")
    protected int createdBy;

    /**
     * Gets the value of the focusAreaID property.
     * 
     */
    public int getFocusAreaID() {
        return focusAreaID;
    }

    /**
     * Sets the value of the focusAreaID property.
     * 
     */
    public void setFocusAreaID(int value) {
        this.focusAreaID = value;
    }

    /**
     * Gets the value of the focusAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocusAreaCode() {
        return focusAreaCode;
    }

    /**
     * Sets the value of the focusAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocusAreaCode(String value) {
        this.focusAreaCode = value;
    }

    /**
     * Gets the value of the focusAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocusAreaName() {
        return focusAreaName;
    }

    /**
     * Sets the value of the focusAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocusAreaName(String value) {
        this.focusAreaName = value;
    }

    /**
     * Gets the value of the focusAreaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocusAreaDesc() {
        return focusAreaDesc;
    }

    /**
     * Sets the value of the focusAreaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocusAreaDesc(String value) {
        this.focusAreaDesc = value;
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
     */
    public int getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     */
    public void setCreatedBy(int value) {
        this.createdBy = value;
    }

}