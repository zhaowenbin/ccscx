
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Derate_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdeduction���Ե�ֵ��
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
     * ����deduction���Ե�ֵ��
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
     * ��ȡdeductionDocumentNumber���Ե�ֵ��
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
     * ����deductionDocumentNumber���Ե�ֵ��
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
     * ��ȡdeductionDueCode���Ե�ֵ��
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
     * ����deductionDueCode���Ե�ֵ��
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
     * ��ȡdeductionDueProportion���Ե�ֵ��
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
     * ����deductionDueProportion���Ե�ֵ��
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
     * ��ȡdeductionDueType���Ե�ֵ��
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
     * ����deductionDueType���Ե�ֵ��
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
     * ��ȡtaxDepartment���Ե�ֵ��
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
     * ����taxDepartment���Ե�ֵ��
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
     * ��ȡtaxDepartmentCode���Ե�ֵ��
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
     * ����taxDepartmentCode���Ե�ֵ��
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
