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
 * <p>Java class for ResultObjectOfInt32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultObjectOfInt32"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Object" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObjectOfInt32", propOrder = {
    "object"
})
public class ResultObjectOfInt32
    extends Result
{

    @XmlElement(name = "Object")
    protected int object;

    /**
     * Gets the value of the object property.
     * 
     */
    public int getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     */
    public void setObject(int value) {
        this.object = value;
    }

}
