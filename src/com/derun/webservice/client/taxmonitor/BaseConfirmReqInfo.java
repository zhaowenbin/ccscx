
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BaseConfirmReqInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取insureconformflag属性的值。
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
     * 设置insureconformflag属性的值。
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
     * 获取areaCode属性的值。
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
     * 设置areaCode属性的值。
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
     * 获取calcTaxFlag属性的值。
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
     * 设置calcTaxFlag属性的值。
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
     * 获取carMatchId属性的值。
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
     * 设置carMatchId属性的值。
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
     * 获取carSerialNo属性的值。
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
     * 设置carSerialNo属性的值。
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
     * 获取cityCode属性的值。
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
     * 设置cityCode属性的值。
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
     * 获取companyCode属性的值。
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
     * 设置companyCode属性的值。
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
     * 获取countryCode属性的值。
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
     * 设置countryCode属性的值。
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
     * 获取insureEndDate属性的值。
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
     * 设置insureEndDate属性的值。
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
     * 获取insureStartDate属性的值。
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
     * 设置insureStartDate属性的值。
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
     * 获取password属性的值。
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
     * 设置password属性的值。
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
     * 获取taxConfirmNo属性的值。
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
     * 设置taxConfirmNo属性的值。
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
     * 获取taxInfo属性的值。
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
     * 设置taxInfo属性的值。
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
     * 获取taxPrintNo属性的值。
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
     * 设置taxPrintNo属性的值。
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
     * 获取taxQueryNo属性的值。
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
     * 设置taxQueryNo属性的值。
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
     * 获取userName属性的值。
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
     * 设置userName属性的值。
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
     * 获取vehicleInfo属性的值。
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
     * 设置vehicleInfo属性的值。
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
     * 获取vehicleOwnerInfo属性的值。
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
     * 设置vehicleOwnerInfo属性的值。
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
