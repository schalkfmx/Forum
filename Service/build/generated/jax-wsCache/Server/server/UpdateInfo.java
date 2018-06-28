
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateInfo", propOrder = {
    "uName",
    "pWord",
    "email",
    "securityA",
    "gender"
})
public class UpdateInfo {

    protected String uName;
    protected String pWord;
    protected String email;
    protected String securityA;
    protected String gender;

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

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the securityA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityA() {
        return securityA;
    }

    /**
     * Sets the value of the securityA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityA(String value) {
        this.securityA = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

}
