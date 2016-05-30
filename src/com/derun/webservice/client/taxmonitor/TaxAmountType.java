
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaxAmount_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxAmount_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annualTaxDue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sumOverdue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sumTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sumTaxDefault" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxAmount_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDealCode" type="{http://beans.derun.com}TaxDealCode_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAmount_Type", propOrder = {
    "annualTaxDue",
    "sumOverdue",
    "sumTax",
    "sumTaxDefault",
    "taxAmountFlag",
    "taxDealCode"
})
public class TaxAmountType {

    protected Double annualTaxDue;
    protected Double sumOverdue;
    protected Double sumTax;
    protected Double sumTaxDefault;
    @XmlElementRef(name = "taxAmount_Flag", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxAmountFlag;
    @XmlElementRef(name = "taxDealCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<TaxDealCodeType> taxDealCode;

    /**
     * 获取annualTaxDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnualTaxDue() {
        return annualTaxDue;
    }

    /**
     * 设置annualTaxDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnualTaxDue(Double value) {
        this.annualTaxDue = value;
    }

    /**
     * 获取sumOverdue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumOverdue() {
        return sumOverdue;
    }

    /**
     * 设置sumOverdue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumOverdue(Double value) {
        this.sumOverdue = value;
    }

    /**
     * 获取sumTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumTax() {
        return sumTax;
    }

    /**
     * 设置sumTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumTax(Double value) {
        this.sumTax = value;
    }

    /**
     * 获取sumTaxDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumTaxDefault() {
        return sumTaxDefault;
    }

    /**
     * 设置sumTaxDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumTaxDefault(Double value) {
        this.sumTaxDefault = value;
    }

    /**
     * 获取taxAmountFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxAmountFlag() {
        return taxAmountFlag;
    }

    /**
     * 设置taxAmountFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxAmountFlag(JAXBElement<String> value) {
        this.taxAmountFlag = value;
    }

    /**
     * 获取taxDealCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}
     *     
     */
    public JAXBElement<TaxDealCodeType> getTaxDealCode() {
        return taxDealCode;
    }

    /**
     * 设置taxDealCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}
     *     
     */
    public void setTaxDealCode(JAXBElement<TaxDealCodeType> value) {
        this.taxDealCode = value;
    }

}
