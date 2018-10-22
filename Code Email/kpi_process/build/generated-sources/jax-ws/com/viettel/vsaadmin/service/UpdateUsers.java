
package com.viettel.vsaadmin.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actor" type="{http://service.vsaadmin.viettel.com/}actor" minOccurs="0"/>
 *         &lt;element name="users" type="{http://service.vsaadmin.viettel.com/}user" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isCheckOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUsers", propOrder = {
    "actor",
    "users",
    "isCheckOnly"
})
public class UpdateUsers {

    protected Actor actor;
    @XmlElement(nillable = true)
    protected List<User> users;
    protected boolean isCheckOnly;

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link Actor }
     *     
     */
    public Actor getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actor }
     *     
     */
    public void setActor(Actor value) {
        this.actor = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the users property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * 
     * 
     */
    public List<User> getUsers() {
        if (users == null) {
            users = new ArrayList<User>();
        }
        return this.users;
    }

    /**
     * Gets the value of the isCheckOnly property.
     * 
     */
    public boolean isIsCheckOnly() {
        return isCheckOnly;
    }

    /**
     * Sets the value of the isCheckOnly property.
     * 
     */
    public void setIsCheckOnly(boolean value) {
        this.isCheckOnly = value;
    }

}
