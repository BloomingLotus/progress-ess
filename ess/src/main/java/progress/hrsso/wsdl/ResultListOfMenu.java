//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 12:41:20 PM ICT 
//


package progress.hrsso.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultListOfMenu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultListOfMenu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectList" type="{http://tempuri.org/}ArrayOfMenu" minOccurs="0"/&gt;
 *         &lt;element name="TotalRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultListOfMenu", propOrder = {
    "objectList",
    "totalRows"
})
public class ResultListOfMenu
    extends Result
{

    @XmlElement(name = "ObjectList")
    protected ArrayOfMenu objectList;
    @XmlElement(name = "TotalRows")
    protected int totalRows;

    /**
     * Gets the value of the objectList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMenu }
     *     
     */
    public ArrayOfMenu getObjectList() {
        return objectList;
    }

    /**
     * Sets the value of the objectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMenu }
     *     
     */
    public void setObjectList(ArrayOfMenu value) {
        this.objectList = value;
    }

    /**
     * Gets the value of the totalRows property.
     * 
     */
    public int getTotalRows() {
        return totalRows;
    }

    /**
     * Sets the value of the totalRows property.
     * 
     */
    public void setTotalRows(int value) {
        this.totalRows = value;
    }

}