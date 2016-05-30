
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaxAmount_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡannualTaxDue���Ե�ֵ��
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
     * ����annualTaxDue���Ե�ֵ��
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
     * ��ȡsumOverdue���Ե�ֵ��
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
     * ����sumOverdue���Ե�ֵ��
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
     * ��ȡsumTax���Ե�ֵ��
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
     * ����sumTax���Ե�ֵ��
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
     * ��ȡsumTaxDefault���Ե�ֵ��
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
     * ����sumTaxDefault���Ե�ֵ��
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
     * ��ȡtaxAmountFlag���Ե�ֵ��
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
     * ����taxAmountFlag���Ե�ֵ��
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
     * ��ȡtaxDealCode���Ե�ֵ��
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
     * ����taxDealCode���Ե�ֵ��
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
