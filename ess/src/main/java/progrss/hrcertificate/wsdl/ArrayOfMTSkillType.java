//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 01:54:43 PM ICT 
//


package progrss.hrcertificate.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMT_SkillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMT_SkillType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MT_SkillType" type="{http://tempuri.org/}MT_SkillType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMT_SkillType", propOrder = {
    "mtSkillType"
})
public class ArrayOfMTSkillType {

    @XmlElement(name = "MT_SkillType", nillable = true)
    protected List<MTSkillType> mtSkillType;

    /**
     * Gets the value of the mtSkillType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtSkillType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMTSkillType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MTSkillType }
     * 
     * 
     */
    public List<MTSkillType> getMTSkillType() {
        if (mtSkillType == null) {
            mtSkillType = new ArrayList<MTSkillType>();
        }
        return this.mtSkillType;
    }

}
