
package cc2018.eurocupservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tGameLevelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGameLevelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dFirstGame" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="iFirstGameID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dLastGame" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="iLastGameID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGameLevelInfo", propOrder = {
    "iLevel",
    "dFirstGame",
    "iFirstGameID",
    "dLastGame",
    "iLastGameID"
})
public class TGameLevelInfo {

    protected int iLevel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dFirstGame;
    protected int iFirstGameID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dLastGame;
    protected int iLastGameID;

    /**
     * Gets the value of the iLevel property.
     * 
     */
    public int getILevel() {
        return iLevel;
    }

    /**
     * Sets the value of the iLevel property.
     * 
     */
    public void setILevel(int value) {
        this.iLevel = value;
    }

    /**
     * Gets the value of the dFirstGame property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDFirstGame() {
        return dFirstGame;
    }

    /**
     * Sets the value of the dFirstGame property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDFirstGame(XMLGregorianCalendar value) {
        this.dFirstGame = value;
    }

    /**
     * Gets the value of the iFirstGameID property.
     * 
     */
    public int getIFirstGameID() {
        return iFirstGameID;
    }

    /**
     * Sets the value of the iFirstGameID property.
     * 
     */
    public void setIFirstGameID(int value) {
        this.iFirstGameID = value;
    }

    /**
     * Gets the value of the dLastGame property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDLastGame() {
        return dLastGame;
    }

    /**
     * Sets the value of the dLastGame property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDLastGame(XMLGregorianCalendar value) {
        this.dLastGame = value;
    }

    /**
     * Gets the value of the iLastGameID property.
     * 
     */
    public int getILastGameID() {
        return iLastGameID;
    }

    /**
     * Sets the value of the iLastGameID property.
     * 
     */
    public void setILastGameID(int value) {
        this.iLastGameID = value;
    }

}
