//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 01:55:55 PM ICT 
//


package progrss.hrpersonal.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMT_ReasonOfResignation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMT_ReasonOfResignation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MT_ReasonOfResignation" type="{http://tempuri.org/}MT_ReasonOfResignation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMT_ReasonOfResignation", propOrder = {
    "mtReasonOfResignation"
})
public class ArrayOfMTReasonOfResignation {

    @XmlElement(name = "MT_ReasonOfResignation", nillable = true)
    protected List<MTReasonOfResignation> mtReasonOfResignation;

    /**
     * Gets the value of the mtReasonOfResignation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtReasonOfResignation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMTReasonOfResignation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MTReasonOfResignation }
     * 
     * 
     */
    public List<MTReasonOfResignation> getMTReasonOfResignation() {
        if (mtReasonOfResignation == null) {
            mtReasonOfResignation = new ArrayList<MTReasonOfResignation>();
        }
        return this.mtReasonOfResignation;
    }

}
