
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeclareDateUploadReqInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DeclareDateUploadReqInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="declareDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxConfirmNo" type="{http://beans.derun.com}ArrayOfTaxDealCode_Type" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclareDateUploadReqInfo", propOrder = {
    "areaCode",
    "companyCode",
    "declareDate",
    "password",
    "taxConfirmNo",
    "userName"
})
public class DeclareDateUploadReqInfo {

    @XmlElementRef(name = "areaCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> areaCode;
    @XmlElementRef(name = "companyCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> companyCode;
    @XmlElementRef(name = "declareDate", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> declareDate;
    @XmlElementRef(name = "password", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "taxConfirmNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTaxDealCodeType> taxConfirmNo;
    @XmlElementRef(name = "userName", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> userName;

    /**
     * ��ȡareaCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAreaCode() {
        return areaCode;
    }

    /**
     * ����areaCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAreaCode(JAXBElement<String> value) {
        this.areaCode = value;
    }

    /**
     * ��ȡcompanyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyCode() {
        return companyCode;
    }

    /**
     * ����companyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyCode(JAXBElement<String> value) {
        this.companyCode = value;
    }

    /**
     * ��ȡdeclareDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeclareDate() {
        return declareDate;
    }

    /**
     * ����declareDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeclareDate(JAXBElement<String> value) {
        this.declareDate = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * ��ȡtaxConfirmNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaxDealCodeType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaxDealCodeType> getTaxConfirmNo() {
        return taxConfirmNo;
    }

    /**
     * ����taxConfirmNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaxDealCodeType }{@code >}
     *     
     */
    public void setTaxConfirmNo(JAXBElement<ArrayOfTaxDealCodeType> value) {
        this.taxConfirmNo = value;
    }

    /**
     * ��ȡuserName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * ����userName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

}
