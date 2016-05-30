
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehicleOwner_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleOwner_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credentialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credentialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleOwner_Type", propOrder = {
    "address",
    "credentialCode",
    "credentialNo",
    "phoneNo",
    "vehicleOwnerName"
})
public class VehicleOwnerType {

    @XmlElementRef(name = "address", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "credentialCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> credentialCode;
    @XmlElementRef(name = "credentialNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> credentialNo;
    @XmlElementRef(name = "phoneNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> phoneNo;
    @XmlElementRef(name = "vehicleOwnerName", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> vehicleOwnerName;

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * 获取credentialCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCredentialCode() {
        return credentialCode;
    }

    /**
     * 设置credentialCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCredentialCode(JAXBElement<String> value) {
        this.credentialCode = value;
    }

    /**
     * 获取credentialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCredentialNo() {
        return credentialNo;
    }

    /**
     * 设置credentialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCredentialNo(JAXBElement<String> value) {
        this.credentialNo = value;
    }

    /**
     * 获取phoneNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置phoneNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNo(JAXBElement<String> value) {
        this.phoneNo = value;
    }

    /**
     * 获取vehicleOwnerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    /**
     * 设置vehicleOwnerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleOwnerName(JAXBElement<String> value) {
        this.vehicleOwnerName = value;
    }

}
