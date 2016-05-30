
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Derate_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Derate_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deduction" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deductionDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductionDueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductionDueProportion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deductionDueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Derate_Type", propOrder = {
    "deduction",
    "deductionDocumentNumber",
    "deductionDueCode",
    "deductionDueProportion",
    "deductionDueType",
    "taxDepartment",
    "taxDepartmentCode"
})
public class DerateType {

    protected Double deduction;
    @XmlElementRef(name = "deductionDocumentNumber", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> deductionDocumentNumber;
    @XmlElementRef(name = "deductionDueCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> deductionDueCode;
    protected Double deductionDueProportion;
    @XmlElementRef(name = "deductionDueType", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> deductionDueType;
    @XmlElementRef(name = "taxDepartment", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxDepartment;
    @XmlElementRef(name = "taxDepartmentCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxDepartmentCode;

    /**
     * 获取deduction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeduction() {
        return deduction;
    }

    /**
     * 设置deduction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeduction(Double value) {
        this.deduction = value;
    }

    /**
     * 获取deductionDocumentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeductionDocumentNumber() {
        return deductionDocumentNumber;
    }

    /**
     * 设置deductionDocumentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeductionDocumentNumber(JAXBElement<String> value) {
        this.deductionDocumentNumber = value;
    }

    /**
     * 获取deductionDueCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeductionDueCode() {
        return deductionDueCode;
    }

    /**
     * 设置deductionDueCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeductionDueCode(JAXBElement<String> value) {
        this.deductionDueCode = value;
    }

    /**
     * 获取deductionDueProportion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeductionDueProportion() {
        return deductionDueProportion;
    }

    /**
     * 设置deductionDueProportion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeductionDueProportion(Double value) {
        this.deductionDueProportion = value;
    }

    /**
     * 获取deductionDueType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeductionDueType() {
        return deductionDueType;
    }

    /**
     * 设置deductionDueType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeductionDueType(JAXBElement<String> value) {
        this.deductionDueType = value;
    }

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

}
