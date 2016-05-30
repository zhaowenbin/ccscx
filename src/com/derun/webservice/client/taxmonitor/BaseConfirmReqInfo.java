
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BaseConfirmReqInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BaseConfirmReqInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INSURE_CONFORM_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calcTaxFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carMatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insureEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="insureStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxConfirmNo" type="{http://beans.derun.com}TaxDealCode_Type" minOccurs="0"/>
 *         &lt;element name="taxInfo" type="{http://beans.derun.com}Tax_Type" minOccurs="0"/>
 *         &lt;element name="taxPrintNo" type="{http://beans.derun.com}TaxDealCode_Type" minOccurs="0"/>
 *         &lt;element name="taxQueryNo" type="{http://beans.derun.com}TaxDealCode_Type" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleInfo" type="{http://beans.derun.com}Vehicle_Type" minOccurs="0"/>
 *         &lt;element name="vehicleOwnerInfo" type="{http://beans.derun.com}VehicleOwner_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfirmReqInfo", propOrder = {
    "insureconformflag",
    "areaCode",
    "calcTaxFlag",
    "carMatchId",
    "carSerialNo",
    "cityCode",
    "companyCode",
    "countryCode",
    "insureEndDate",
    "insureStartDate",
    "password",
    "taxConfirmNo",
    "taxInfo",
    "taxPrintNo",
    "taxQueryNo",
    "userName",
    "vehicleInfo",
    "vehicleOwnerInfo"
})
public class BaseConfirmReqInfo {

    @XmlElementRef(name = "INSURE_CONFORM_FLAG", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> insureconformflag;
    @XmlElementRef(name = "areaCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> areaCode;
    @XmlElementRef(name = "calcTaxFlag", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> calcTaxFlag;
    @XmlElementRef(name = "carMatchId", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> carMatchId;
    @XmlElementRef(name = "carSerialNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> carSerialNo;
    @XmlElementRef(name = "cityCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> cityCode;
    @XmlElementRef(name = "companyCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> companyCode;
    @XmlElementRef(name = "countryCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> countryCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insureEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insureStartDate;
    @XmlElementRef(name = "password", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "taxConfirmNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<TaxDealCodeType> taxConfirmNo;
    @XmlElementRef(name = "taxInfo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<TaxType> taxInfo;
    @XmlElementRef(name = "taxPrintNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<TaxDealCodeType> taxPrintNo;
    @XmlElementRef(name = "taxQueryNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<TaxDealCodeType> taxQueryNo;
    @XmlElementRef(name = "userName", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "vehicleInfo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<VehicleType> vehicleInfo;
    @XmlElementRef(name = "vehicleOwnerInfo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<VehicleOwnerType> vehicleOwnerInfo;

    /**
     * ��ȡinsureconformflag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINSURECONFORMFLAG() {
        return insureconformflag;
    }

    /**
     * ����insureconformflag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINSURECONFORMFLAG(JAXBElement<String> value) {
        this.insureconformflag = value;
    }

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
     * ��ȡcalcTaxFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalcTaxFlag() {
        return calcTaxFlag;
    }

    /**
     * ����calcTaxFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalcTaxFlag(JAXBElement<String> value) {
        this.calcTaxFlag = value;
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
     * ��ȡcarSerialNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarSerialNo() {
        return carSerialNo;
    }

    /**
     * ����carSerialNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarSerialNo(JAXBElement<String> value) {
        this.carSerialNo = value;
    }

    /**
     * ��ȡcityCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityCode() {
        return cityCode;
    }

    /**
     * ����cityCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityCode(JAXBElement<String> value) {
        this.cityCode = value;
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
     * ��ȡcountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * ����countryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
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
     * ��ȡtaxConfirmNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}
     *     
     */
    public JAXBElement<TaxDealCodeType> getTaxConfirmNo() {
        return taxConfirmNo;
    }

    /**
     * ����taxConfirmNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}
     *     
     */
    public void setTaxConfirmNo(JAXBElement<TaxDealCodeType> value) {
        this.taxConfirmNo = value;
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
     * ��ȡtaxPrintNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}
     *     
     */
    public JAXBElement<TaxDealCodeType> getTaxPrintNo() {
        return taxPrintNo;
    }

    /**
     * ����taxPrintNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}
     *     
     */
    public void setTaxPrintNo(JAXBElement<TaxDealCodeType> value) {
        this.taxPrintNo = value;
    }

    /**
     * ��ȡtaxQueryNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}
     *     
     */
    public JAXBElement<TaxDealCodeType> getTaxQueryNo() {
        return taxQueryNo;
    }

    /**
     * ����taxQueryNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxDealCodeType }{@code >}
     *     
     */
    public void setTaxQueryNo(JAXBElement<TaxDealCodeType> value) {
        this.taxQueryNo = value;
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

    /**
     * ��ȡvehicleOwnerInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleOwnerType }{@code >}
     *     
     */
    public JAXBElement<VehicleOwnerType> getVehicleOwnerInfo() {
        return vehicleOwnerInfo;
    }

    /**
     * ����vehicleOwnerInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleOwnerType }{@code >}
     *     
     */
    public void setVehicleOwnerInfo(JAXBElement<VehicleOwnerType> value) {
        this.vehicleOwnerInfo = value;
    }

}
