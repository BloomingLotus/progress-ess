//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.20 at 03:44:46 PM ICT 
//


package progress.hrStaffAddress.form.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MT_Amphur complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MT_Amphur"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmphurID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="THAmphurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENAmphurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "MT_Amphur", propOrder = {
    "amphurID",
    "thAmphurName",
    "enAmphurName",
    "provinceID",
    "isActive",
    "updatedDate",
    "updatedByName",
    "updatedBy",
    "createdDate",
    "createdByName",
    "createdBy"
})
public class MTAmphur {

    @XmlElement(name = "AmphurID")
    protected int amphurID;
    @XmlElement(name = "THAmphurName")
    protected String thAmphurName;
    @XmlElement(name = "ENAmphurName")
    protected String enAmphurName;
    @XmlElement(name = "ProvinceID")
    protected int provinceID;
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
     * Gets the value of the amphurID property.
     * 
     */
    public int getAmphurID() {
        return amphurID;
    }

    /**
     * Sets the value of the amphurID property.
     * 
     */
    public void setAmphurID(int value) {
        this.amphurID = value;
    }

    /**
     * Gets the value of the thAmphurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHAmphurName() {
        return thAmphurName;
    }

    /**
     * Sets the value of the thAmphurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHAmphurName(String value) {
        this.thAmphurName = value;
    }

    /**
     * Gets the value of the enAmphurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENAmphurName() {
        return enAmphurName;
    }

    /**
     * Sets the value of the enAmphurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENAmphurName(String value) {
        this.enAmphurName = value;
    }

    /**
     * Gets the value of the provinceID property.
     * 
     */
    public int getProvinceID() {
        return provinceID;
    }

    /**
     * Sets the value of the provinceID property.
     * 
     */
    public void setProvinceID(int value) {
        this.provinceID = value;
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
