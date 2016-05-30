
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusiMonInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BusiMonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseChangeConfirmReqInfo" type="{http://beans.derun.com}BaseChangeConfirmReqInfo" minOccurs="0"/>
 *         &lt;element name="baseChangeQueryReqInfo" type="{http://beans.derun.com}BaseChangeQueryReqInfo" minOccurs="0"/>
 *         &lt;element name="baseConfirmReqInfo" type="{http://beans.derun.com}BaseConfirmReqInfo" minOccurs="0"/>
 *         &lt;element name="baseQueryReqInfo" type="{http://beans.derun.com}BaseQueryReqInfo" minOccurs="0"/>
 *         &lt;element name="dealTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="declareDateUploadReqInfo" type="{http://beans.derun.com}DeclareDateUploadReqInfo" minOccurs="0"/>
 *         &lt;element name="reconciliationReqInfo" type="{http://beans.derun.com}ReconciliationReqInfo" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxPayQueryReqInfo" type="{http://beans.derun.com}TaxPayQueryReqInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusiMonInfo", namespace = "http://vo.taxmonitor.derun.com", propOrder = {
    "baseChangeConfirmReqInfo",
    "baseChangeQueryReqInfo",
    "baseConfirmReqInfo",
    "baseQueryReqInfo",
    "dealTime",
    "declareDateUploadReqInfo",
    "reconciliationReqInfo",
    "serviceType",
    "taxPayQueryReqInfo"
})
public class BusiMonInfo {

    @XmlElementRef(name = "baseChangeConfirmReqInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<BaseChangeConfirmReqInfo> baseChangeConfirmReqInfo;
    @XmlElementRef(name = "baseChangeQueryReqInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<BaseChangeQueryReqInfo> baseChangeQueryReqInfo;
    @XmlElementRef(name = "baseConfirmReqInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<BaseConfirmReqInfo> baseConfirmReqInfo;
    @XmlElementRef(name = "baseQueryReqInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<BaseQueryReqInfo> baseQueryReqInfo;
    @XmlElementRef(name = "dealTime", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> dealTime;
    @XmlElementRef(name = "declareDateUploadReqInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<DeclareDateUploadReqInfo> declareDateUploadReqInfo;
    @XmlElementRef(name = "reconciliationReqInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ReconciliationReqInfo> reconciliationReqInfo;
    @XmlElementRef(name = "serviceType", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> serviceType;
    @XmlElementRef(name = "taxPayQueryReqInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<TaxPayQueryReqInfo> taxPayQueryReqInfo;

    /**
     * ��ȡbaseChangeConfirmReqInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseChangeConfirmReqInfo }{@code >}
     *     
     */
    public JAXBElement<BaseChangeConfirmReqInfo> getBaseChangeConfirmReqInfo() {
        return baseChangeConfirmReqInfo;
    }

    /**
     * ����baseChangeConfirmReqInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseChangeConfirmReqInfo }{@code >}
     *     
     */
    public void setBaseChangeConfirmReqInfo(JAXBElement<BaseChangeConfirmReqInfo> value) {
        this.baseChangeConfirmReqInfo = value;
    }

    /**
     * ��ȡbaseChangeQueryReqInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseChangeQueryReqInfo }{@code >}
     *     
     */
    public JAXBElement<BaseChangeQueryReqInfo> getBaseChangeQueryReqInfo() {
        return baseChangeQueryReqInfo;
    }

    /**
     * ����baseChangeQueryReqInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseChangeQueryReqInfo }{@code >}
     *     
     */
    public void setBaseChangeQueryReqInfo(JAXBElement<BaseChangeQueryReqInfo> value) {
        this.baseChangeQueryReqInfo = value;
    }

    /**
     * ��ȡbaseConfirmReqInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseConfirmReqInfo }{@code >}
     *     
     */
    public JAXBElement<BaseConfirmReqInfo> getBaseConfirmReqInfo() {
        return baseConfirmReqInfo;
    }

    /**
     * ����baseConfirmReqInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseConfirmReqInfo }{@code >}
     *     
     */
    public void setBaseConfirmReqInfo(JAXBElement<BaseConfirmReqInfo> value) {
        this.baseConfirmReqInfo = value;
    }

    /**
     * ��ȡbaseQueryReqInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseQueryReqInfo }{@code >}
     *     
     */
    public JAXBElement<BaseQueryReqInfo> getBaseQueryReqInfo() {
        return baseQueryReqInfo;
    }

    /**
     * ����baseQueryReqInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseQueryReqInfo }{@code >}
     *     
     */
    public void setBaseQueryReqInfo(JAXBElement<BaseQueryReqInfo> value) {
        this.baseQueryReqInfo = value;
    }

    /**
     * ��ȡdealTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealTime() {
        return dealTime;
    }

    /**
     * ����dealTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealTime(JAXBElement<String> value) {
        this.dealTime = value;
    }

    /**
     * ��ȡdeclareDateUploadReqInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeclareDateUploadReqInfo }{@code >}
     *     
     */
    public JAXBElement<DeclareDateUploadReqInfo> getDeclareDateUploadReqInfo() {
        return declareDateUploadReqInfo;
    }

    /**
     * ����declareDateUploadReqInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeclareDateUploadReqInfo }{@code >}
     *     
     */
    public void setDeclareDateUploadReqInfo(JAXBElement<DeclareDateUploadReqInfo> value) {
        this.declareDateUploadReqInfo = value;
    }

    /**
     * ��ȡreconciliationReqInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReconciliationReqInfo }{@code >}
     *     
     */
    public JAXBElement<ReconciliationReqInfo> getReconciliationReqInfo() {
        return reconciliationReqInfo;
    }

    /**
     * ����reconciliationReqInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReconciliationReqInfo }{@code >}
     *     
     */
    public void setReconciliationReqInfo(JAXBElement<ReconciliationReqInfo> value) {
        this.reconciliationReqInfo = value;
    }

    /**
     * ��ȡserviceType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceType() {
        return serviceType;
    }

    /**
     * ����serviceType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceType(JAXBElement<String> value) {
        this.serviceType = value;
    }

    /**
     * ��ȡtaxPayQueryReqInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxPayQueryReqInfo }{@code >}
     *     
     */
    public JAXBElement<TaxPayQueryReqInfo> getTaxPayQueryReqInfo() {
        return taxPayQueryReqInfo;
    }

    /**
     * ����taxPayQueryReqInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxPayQueryReqInfo }{@code >}
     *     
     */
    public void setTaxPayQueryReqInfo(JAXBElement<TaxPayQueryReqInfo> value) {
        this.taxPayQueryReqInfo = value;
    }

}
