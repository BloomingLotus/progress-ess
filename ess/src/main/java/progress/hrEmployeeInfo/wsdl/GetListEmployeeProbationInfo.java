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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employeeID",
    "pageSize",
    "pageIndex",
    "searchCriteria",
    "sortExpression"
})
@XmlRootElement(name = "getListEmployeeProbationInfo")
public class GetListEmployeeProbationInfo {

    @XmlElement(name = "EmployeeID")
    protected int employeeID;
    @XmlElement(name = "PageSize")
    protected int pageSize;
    @XmlElement(name = "PageIndex")
    protected int pageIndex;
    @XmlElement(name = "SearchCriteria")
    protected String searchCriteria;
    @XmlElement(name = "SortExpression")
    protected String sortExpression;

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
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCriteria(String value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the sortExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortExpression() {
        return sortExpression;
    }

    /**
     * Sets the value of the sortExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortExpression(String value) {
        this.sortExpression = value;
    }

}
