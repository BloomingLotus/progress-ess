//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.27 at 12:50:31 PM ICT 
//


package progress.hrinfo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnObjectKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnObjectKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}ReturnMessage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnObjectKey", propOrder = {
    "keyID"
})
public class ReturnObjectKey
    extends ReturnMessage
{

    @XmlElement(name = "KeyID")
    protected int keyID;

    /**
     * Gets the value of the keyID property.
     * 
     */
    public int getKeyID() {
        return keyID;
    }

    /**
     * Sets the value of the keyID property.
     * 
     */
    public void setKeyID(int value) {
        this.keyID = value;
    }

}
