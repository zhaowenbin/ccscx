
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AnnualTax_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡannualTaxAmount���Ե�ֵ��
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
     * ����annualTaxAmount���Ե�ֵ��
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
     * ��ȡderate���Ե�ֵ��
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
     * ����derate���Ե�ֵ��
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
     * ��ȡexceedDate���Ե�ֵ��
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
     * ����exceedDate���Ե�ֵ��
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
     * ��ȡexceedDaysCount���Ե�ֵ��
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
     * ����exceedDaysCount���Ե�ֵ��
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
     * ��ȡoverDue���Ե�ֵ��
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
     * ����overDue���Ե�ֵ��
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
     * ��ȡpaid���Ե�ֵ��
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
     * ����paid���Ե�ֵ��
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
     * ��ȡtaxDue���Ե�ֵ��
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
     * ����taxDue���Ե�ֵ��
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
     * ��ȡtaxEndDate���Ե�ֵ��
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
     * ����taxEndDate���Ե�ֵ��
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
     * ��ȡtaxLocationCode���Ե�ֵ��
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
     * ����taxLocationCode���Ե�ֵ��
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
     * ��ȡtaxStartDate���Ե�ֵ��
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
     * ����taxStartDate���Ե�ֵ��
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
     * ��ȡtaxUnitTypeCode���Ե�ֵ��
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
     * ����taxUnitTypeCode���Ե�ֵ��
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
     * ��ȡtotalAmount���Ե�ֵ��
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
     * ����totalAmount���Ե�ֵ��
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
     * ��ȡunitRate���Ե�ֵ��
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
     * ����unitRate���Ե�ֵ��
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
