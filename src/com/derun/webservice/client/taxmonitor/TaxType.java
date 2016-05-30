
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Tax_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcurrentTaxDue���Ե�ֵ��
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
     * ����currentTaxDue���Ե�ֵ��
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
     * ��ȡdelinquentTaxDue���Ե�ֵ��
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
     * ����delinquentTaxDue���Ե�ֵ��
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
     * ��ȡpayCompanyCode���Ե�ֵ��
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
     * ����payCompanyCode���Ե�ֵ��
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
     * ��ȡpayDate���Ե�ֵ��
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
     * ����payDate���Ե�ֵ��
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
     * ��ȡtaxAmount���Ե�ֵ��
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
     * ����taxAmount���Ե�ֵ��
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
     * ��ȡtaxConditionCode���Ե�ֵ��
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
     * ����taxConditionCode���Ե�ֵ��
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
     * ��ȡtaxPayerIdentificationCode���Ե�ֵ��
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
     * ����taxPayerIdentificationCode���Ե�ֵ��
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
     * ��ȡtaxPayerName���Ե�ֵ��
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
     * ����taxPayerName���Ե�ֵ��
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
     * ��ȡtaxRegistryNumber���Ե�ֵ��
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
     * ����taxRegistryNumber���Ե�ֵ��
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
     * ��ȡtaxTermTypeCode���Ե�ֵ��
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
     * ����taxTermTypeCode���Ե�ֵ��
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
