
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Paid_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Paid_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paid_Type", propOrder = {
    "taxDepartment",
    "taxDepartmentCode",
    "taxDocumentNumber"
})
public class PaidType {

    @XmlElementRef(name = "taxDepartment", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxDepartment;
    @XmlElementRef(name = "taxDepartmentCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxDepartmentCode;
    @XmlElementRef(name = "taxDocumentNumber", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxDocumentNumber;

    /**
     * 获取taxDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxDepartment() {
        return taxDepartment;
    }

    /**
     * 设置taxDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxDepartment(JAXBElement<String> value) {
        this.taxDepartment = value;
    }

    /**
     * 获取taxDepartmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxDepartmentCode() {
        return taxDepartmentCode;
    }

    /**
     * 设置taxDepartmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxDepartmentCode(JAXBElement<String> value) {
        this.taxDepartmentCode = value;
    }

    /**
     * 获取taxDocumentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxDocumentNumber() {
        return taxDocumentNumber;
    }

    /**
     * 设置taxDocumentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxDocumentNumber(JAXBElement<String> value) {
        this.taxDocumentNumber = value;
    }

}
