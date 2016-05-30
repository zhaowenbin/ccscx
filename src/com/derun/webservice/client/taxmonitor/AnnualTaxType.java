
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AnnualTax_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AnnualTax_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annualTaxAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="derate" type="{http://beans.derun.com}Derate_Type" minOccurs="0"/>
 *         &lt;element name="exceedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceedDaysCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="overDue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paid" type="{http://beans.derun.com}Paid_Type" minOccurs="0"/>
 *         &lt;element name="taxDue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxUnitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unitRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnualTax_Type", propOrder = {
    "annualTaxAmount",
    "derate",
    "exceedDate",
    "exceedDaysCount",
    "overDue",
    "paid",
    "taxDue",
    "taxEndDate",
    "taxLocationCode",
    "taxStartDate",
    "taxUnitTypeCode",
    "totalAmount",
    "unitRate"
})
public class AnnualTaxType {

    protected Double annualTaxAmount;
    @XmlElementRef(name = "derate", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<DerateType> derate;
    @XmlElementRef(name = "exceedDate", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> exceedDate;
    protected Integer exceedDaysCount;
    protected Double overDue;
    @XmlElementRef(name = "paid", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<PaidType> paid;
    protected Double taxDue;
    @XmlElementRef(name = "taxEndDate", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxEndDate;
    @XmlElementRef(name = "taxLocationCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxLocationCode;
    @XmlElementRef(name = "taxStartDate", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxStartDate;
    @XmlElementRef(name = "taxUnitTypeCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxUnitTypeCode;
    protected Double totalAmount;
    protected Double unitRate;

    /**
     * 获取annualTaxAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnualTaxAmount() {
        return annualTaxAmount;
    }

    /**
     * 设置annualTaxAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnualTaxAmount(Double value) {
        this.annualTaxAmount = value;
    }

    /**
     * 获取derate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DerateType }{@code >}
     *     
     */
    public JAXBElement<DerateType> getDerate() {
        return derate;
    }

    /**
     * 设置derate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DerateType }{@code >}
     *     
     */
    public void setDerate(JAXBElement<DerateType> value) {
        this.derate = value;
    }

    /**
     * 获取exceedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExceedDate() {
        return exceedDate;
    }

    /**
     * 设置exceedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExceedDate(JAXBElement<String> value) {
        this.exceedDate = value;
    }

    /**
     * 获取exceedDaysCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExceedDaysCount() {
        return exceedDaysCount;
    }

    /**
     * 设置exceedDaysCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExceedDaysCount(Integer value) {
        this.exceedDaysCount = value;
    }

    /**
     * 获取overDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverDue() {
        return overDue;
    }

    /**
     * 设置overDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverDue(Double value) {
        this.overDue = value;
    }

    /**
     * 获取paid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaidType }{@code >}
     *     
     */
    public JAXBElement<PaidType> getPaid() {
        return paid;
    }

    /**
     * 设置paid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaidType }{@code >}
     *     
     */
    public void setPaid(JAXBElement<PaidType> value) {
        this.paid = value;
    }

    /**
     * 获取taxDue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxDue() {
        return taxDue;
    }

    /**
     * 设置taxDue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxDue(Double value) {
        this.taxDue = value;
    }

    /**
     * 获取taxEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxEndDate() {
        return taxEndDate;
    }

    /**
     * 设置taxEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxEndDate(JAXBElement<String> value) {
        this.taxEndDate = value;
    }

    /**
     * 获取taxLocationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxLocationCode() {
        return taxLocationCode;
    }

    /**
     * 设置taxLocationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxLocationCode(JAXBElement<String> value) {
        this.taxLocationCode = value;
    }

    /**
     * 获取taxStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxStartDate() {
        return taxStartDate;
    }

    /**
     * 设置taxStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxStartDate(JAXBElement<String> value) {
        this.taxStartDate = value;
    }

    /**
     * 获取taxUnitTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxUnitTypeCode() {
        return taxUnitTypeCode;
    }

    /**
     * 设置taxUnitTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxUnitTypeCode(JAXBElement<String> value) {
        this.taxUnitTypeCode = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    /**
     * 获取unitRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitRate() {
        return unitRate;
    }

    /**
     * 设置unitRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitRate(Double value) {
        this.unitRate = value;
    }

}
