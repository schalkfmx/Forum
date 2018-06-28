
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkDetails", propOrder = {
    "uName",
    "pWord"
})
public class CheckDetails {

    protected String uName;
    protected String pWord;

    /**
     * Gets the value of the uName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUName() {
        return uName;
    }

    /**
     * Sets the value of the uName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUName(String value) {
        this.uName = value;
    }

    /**
     * Gets the value of the pWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWord() {
        return pWord;
    }

    /**
     * Sets the value of the pWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWord(String value) {
        this.pWord = value;
    }

}
