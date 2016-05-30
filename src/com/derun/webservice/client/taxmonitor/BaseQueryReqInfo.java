
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BaseQueryReqInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BaseQueryReqInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carMatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insureEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="insureStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="querySequencetTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxInfo" type="{http://beans.derun.com}Tax_Type" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleInfo" type="{http://beans.derun.com}Vehicle_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseQueryReqInfo", propOrder = {
    "areaCode",
    "carMatchId",
    "companyCode",
    "insureEndDate",
    "insureStartDate",
    "password",
    "querySequencetTime",
    "taxInfo",
    "userName",
    "vehicleInfo"
})
public class BaseQueryReqInfo {

    @XmlElementRef(name = "areaCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> areaCode;
    @XmlElementRef(name = "carMatchId", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> carMatchId;
    @XmlElementRef(name = "companyCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> companyCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insureEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insureStartDate;
    @XmlElementRef(name = "password", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "querySequencetTime", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> querySequencetTime;
    @XmlElementRef(name = "taxInfo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<TaxType> taxInfo;
    @XmlElementRef(name = "userName", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "vehicleInfo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<VehicleType> vehicleInfo;

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
     * ��ȡcarMatchId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarMatchId() {
        return carMatchId;
    }

    /**
     * ����carMatchId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarMatchId(JAXBElement<String> value) {
        this.carMatchId = value;
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
     * ��ȡinsureEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsureEndDate() {
        return insureEndDate;
    }

    /**
     * ����insureEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsureEndDate(XMLGregorianCalendar value) {
        this.insureEndDate = value;
    }

    /**
     * ��ȡinsureStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsureStartDate() {
        return insureStartDate;
    }

    /**
     * ����insureStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsureStartDate(XMLGregorianCalendar value) {
        this.insureStartDate = value;
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
     * ��ȡquerySequencetTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuerySequencetTime() {
        return querySequencetTime;
    }

    /**
     * ����querySequencetTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuerySequencetTime(JAXBElement<String> value) {
        this.querySequencetTime = value;
    }

    /**
     * ��ȡtaxInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxType }{@code >}
     *     
     */
    public JAXBElement<TaxType> getTaxInfo() {
        return taxInfo;
    }

    /**
     * ����taxInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxType }{@code >}
     *     
     */
    public void setTaxInfo(JAXBElement<TaxType> value) {
        this.taxInfo = value;
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

    /**
     * ��ȡvehicleInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleType }{@code >}
     *     
     */
    public JAXBElement<VehicleType> getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * ����vehicleInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleType }{@code >}
     *     
     */
    public void setVehicleInfo(JAXBElement<VehicleType> value) {
        this.vehicleInfo = value;
    }

}
