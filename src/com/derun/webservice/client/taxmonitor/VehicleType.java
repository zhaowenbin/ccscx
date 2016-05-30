
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Vehicle_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Vehicle_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displacement" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="engineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstRegisterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licensePlateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licensePlateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="madeFactory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motorTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motorUsageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noLicenseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ratedPassengerCapacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="specialCarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tonnage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wholeWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle_Type", propOrder = {
    "vin",
    "displacement",
    "engineNo",
    "firstRegisterDate",
    "fuelType",
    "licensePlateNo",
    "licensePlateType",
    "madeFactory",
    "model",
    "motorTypeCode",
    "motorUsageTypeCode",
    "noLicenseFlag",
    "power",
    "ratedPassengerCapacity",
    "specialCarType",
    "tonnage",
    "vehicleType",
    "wholeWeight"
})
public class VehicleType {

    @XmlElementRef(name = "VIN", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> vin;
    protected Double displacement;
    @XmlElementRef(name = "engineNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> engineNo;
    @XmlElementRef(name = "firstRegisterDate", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> firstRegisterDate;
    @XmlElementRef(name = "fuelType", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> fuelType;
    @XmlElementRef(name = "licensePlateNo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> licensePlateNo;
    @XmlElementRef(name = "licensePlateType", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> licensePlateType;
    @XmlElementRef(name = "madeFactory", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> madeFactory;
    @XmlElementRef(name = "model", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "motorTypeCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> motorTypeCode;
    @XmlElementRef(name = "motorUsageTypeCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> motorUsageTypeCode;
    @XmlElementRef(name = "noLicenseFlag", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> noLicenseFlag;
    protected Double power;
    protected Integer ratedPassengerCapacity;
    @XmlElementRef(name = "specialCarType", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> specialCarType;
    protected Double tonnage;
    @XmlElementRef(name = "vehicleType", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> vehicleType;
    protected Double wholeWeight;

    /**
     * 获取vin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVIN() {
        return vin;
    }

    /**
     * 设置vin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVIN(JAXBElement<String> value) {
        this.vin = value;
    }

    /**
     * 获取displacement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDisplacement() {
        return displacement;
    }

    /**
     * 设置displacement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDisplacement(Double value) {
        this.displacement = value;
    }

    /**
     * 获取engineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEngineNo() {
        return engineNo;
    }

    /**
     * 设置engineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEngineNo(JAXBElement<String> value) {
        this.engineNo = value;
    }

    /**
     * 获取firstRegisterDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstRegisterDate() {
        return firstRegisterDate;
    }

    /**
     * 设置firstRegisterDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstRegisterDate(JAXBElement<String> value) {
        this.firstRegisterDate = value;
    }

    /**
     * 获取fuelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuelType() {
        return fuelType;
    }

    /**
     * 设置fuelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuelType(JAXBElement<String> value) {
        this.fuelType = value;
    }

    /**
     * 获取licensePlateNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicensePlateNo() {
        return licensePlateNo;
    }

    /**
     * 设置licensePlateNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicensePlateNo(JAXBElement<String> value) {
        this.licensePlateNo = value;
    }

    /**
     * 获取licensePlateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicensePlateType() {
        return licensePlateType;
    }

    /**
     * 设置licensePlateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicensePlateType(JAXBElement<String> value) {
        this.licensePlateType = value;
    }

    /**
     * 获取madeFactory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMadeFactory() {
        return madeFactory;
    }

    /**
     * 设置madeFactory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMadeFactory(JAXBElement<String> value) {
        this.madeFactory = value;
    }

    /**
     * 获取model属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * 设置model属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * 获取motorTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotorTypeCode() {
        return motorTypeCode;
    }

    /**
     * 设置motorTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotorTypeCode(JAXBElement<String> value) {
        this.motorTypeCode = value;
    }

    /**
     * 获取motorUsageTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotorUsageTypeCode() {
        return motorUsageTypeCode;
    }

    /**
     * 设置motorUsageTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotorUsageTypeCode(JAXBElement<String> value) {
        this.motorUsageTypeCode = value;
    }

    /**
     * 获取noLicenseFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoLicenseFlag() {
        return noLicenseFlag;
    }

    /**
     * 设置noLicenseFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoLicenseFlag(JAXBElement<String> value) {
        this.noLicenseFlag = value;
    }

    /**
     * 获取power属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPower() {
        return power;
    }

    /**
     * 设置power属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPower(Double value) {
        this.power = value;
    }

    /**
     * 获取ratedPassengerCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatedPassengerCapacity() {
        return ratedPassengerCapacity;
    }

    /**
     * 设置ratedPassengerCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatedPassengerCapacity(Integer value) {
        this.ratedPassengerCapacity = value;
    }

    /**
     * 获取specialCarType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialCarType() {
        return specialCarType;
    }

    /**
     * 设置specialCarType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialCarType(JAXBElement<String> value) {
        this.specialCarType = value;
    }

    /**
     * 获取tonnage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTonnage() {
        return tonnage;
    }

    /**
     * 设置tonnage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTonnage(Double value) {
        this.tonnage = value;
    }

    /**
     * 获取vehicleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置vehicleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleType(JAXBElement<String> value) {
        this.vehicleType = value;
    }

    /**
     * 获取wholeWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWholeWeight() {
        return wholeWeight;
    }

    /**
     * 设置wholeWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWholeWeight(Double value) {
        this.wholeWeight = value;
    }

}
