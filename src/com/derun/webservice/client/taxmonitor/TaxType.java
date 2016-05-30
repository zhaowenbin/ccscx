
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Tax_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Tax_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentTaxDue" type="{http://beans.derun.com}AnnualTax_Type" minOccurs="0"/>
 *         &lt;element name="delinquentTaxDue" type="{http://beans.derun.com}ArrayOfAnnualTax_Type" minOccurs="0"/>
 *         &lt;element name="payCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAmount" type="{http://beans.derun.com}TaxAmount_Type" minOccurs="0"/>
 *         &lt;element name="taxConditionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxPayerIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxPayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxRegistryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxTermTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax_Type", propOrder = {
    "currentTaxDue",
    "delinquentTaxDue",
    "payCompanyCode",
    "payDate",
    "taxAmount",
    "taxConditionCode",
    "taxPayerIdentificationCode",
    "taxPayerName",
    "taxRegistryNumber",
    "taxTermTypeCode"
})
public class TaxType {

    @XmlElementRef(name = "currentTaxDue", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<AnnualTaxType> currentTaxDue;
    @XmlElementRef(name = "delinquentTaxDue", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAnnualTaxType> delinquentTaxDue;
    @XmlElementRef(name = "payCompanyCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> payCompanyCode;
    @XmlElementRef(name = "payDate", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> payDate;
    @XmlElementRef(name = "taxAmount", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<TaxAmountType> taxAmount;
    @XmlElementRef(name = "taxConditionCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxConditionCode;
    @XmlElementRef(name = "taxPayerIdentificationCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxPayerIdentificationCode;
    @XmlElementRef(name = "taxPayerName", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxPayerName;
    @XmlElementRef(name = "taxRegistryNumber", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxRegistryNumber;
    @XmlElementRef(name = "taxTermTypeCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxTermTypeCode;

    /**
     * 获取currentTaxDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnnualTaxType }{@code >}
     *     
     */
    public JAXBElement<AnnualTaxType> getCurrentTaxDue() {
        return currentTaxDue;
    }

    /**
     * 设置currentTaxDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnnualTaxType }{@code >}
     *     
     */
    public void setCurrentTaxDue(JAXBElement<AnnualTaxType> value) {
        this.currentTaxDue = value;
    }

    /**
     * 获取delinquentTaxDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnnualTaxType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAnnualTaxType> getDelinquentTaxDue() {
        return delinquentTaxDue;
    }

    /**
     * 设置delinquentTaxDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnnualTaxType }{@code >}
     *     
     */
    public void setDelinquentTaxDue(JAXBElement<ArrayOfAnnualTaxType> value) {
        this.delinquentTaxDue = value;
    }

    /**
     * 获取payCompanyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayCompanyCode() {
        return payCompanyCode;
    }

    /**
     * 设置payCompanyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayCompanyCode(JAXBElement<String> value) {
        this.payCompanyCode = value;
    }

    /**
     * 获取payDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayDate() {
        return payDate;
    }

    /**
     * 设置payDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayDate(JAXBElement<String> value) {
        this.payDate = value;
    }

    /**
     * 获取taxAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxAmountType }{@code >}
     *     
     */
    public JAXBElement<TaxAmountType> getTaxAmount() {
        return taxAmount;
    }

    /**
     * 设置taxAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxAmountType }{@code >}
     *     
     */
    public void setTaxAmount(JAXBElement<TaxAmountType> value) {
        this.taxAmount = value;
    }

    /**
     * 获取taxConditionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxConditionCode() {
        return taxConditionCode;
    }

    /**
     * 设置taxConditionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxConditionCode(JAXBElement<String> value) {
        this.taxConditionCode = value;
    }

    /**
     * 获取taxPayerIdentificationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxPayerIdentificationCode() {
        return taxPayerIdentificationCode;
    }

    /**
     * 设置taxPayerIdentificationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxPayerIdentificationCode(JAXBElement<String> value) {
        this.taxPayerIdentificationCode = value;
    }

    /**
     * 获取taxPayerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxPayerName() {
        return taxPayerName;
    }

    /**
     * 设置taxPayerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxPayerName(JAXBElement<String> value) {
        this.taxPayerName = value;
    }

    /**
     * 获取taxRegistryNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxRegistryNumber() {
        return taxRegistryNumber;
    }

    /**
     * 设置taxRegistryNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxRegistryNumber(JAXBElement<String> value) {
        this.taxRegistryNumber = value;
    }

    /**
     * 获取taxTermTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxTermTypeCode() {
        return taxTermTypeCode;
    }

    /**
     * 设置taxTermTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxTermTypeCode(JAXBElement<String> value) {
        this.taxTermTypeCode = value;
    }

}
