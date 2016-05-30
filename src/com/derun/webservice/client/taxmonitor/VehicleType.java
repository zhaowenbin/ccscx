
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Vehicle_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡvin���Ե�ֵ��
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
     * ����vin���Ե�ֵ��
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
     * ��ȡdisplacement���Ե�ֵ��
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
     * ����displacement���Ե�ֵ��
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
     * ��ȡengineNo���Ե�ֵ��
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
     * ����engineNo���Ե�ֵ��
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
     * ��ȡfirstRegisterDate���Ե�ֵ��
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
     * ����firstRegisterDate���Ե�ֵ��
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
     * ��ȡfuelType���Ե�ֵ��
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
     * ����fuelType���Ե�ֵ��
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
     * ��ȡlicensePlateNo���Ե�ֵ��
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
     * ����licensePlateNo���Ե�ֵ��
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
     * ��ȡlicensePlateType���Ե�ֵ��
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
     * ����licensePlateType���Ե�ֵ��
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
     * ��ȡmadeFactory���Ե�ֵ��
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
     * ����madeFactory���Ե�ֵ��
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
     * ��ȡmodel���Ե�ֵ��
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
     * ����model���Ե�ֵ��
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
     * ��ȡmotorTypeCode���Ե�ֵ��
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
     * ����motorTypeCode���Ե�ֵ��
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
     * ��ȡmotorUsageTypeCode���Ե�ֵ��
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
     * ����motorUsageTypeCode���Ե�ֵ��
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
     * ��ȡnoLicenseFlag���Ե�ֵ��
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
     * ����noLicenseFlag���Ե�ֵ��
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
     * ��ȡpower���Ե�ֵ��
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
     * ����power���Ե�ֵ��
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
     * ��ȡratedPassengerCapacity���Ե�ֵ��
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
     * ����ratedPassengerCapacity���Ե�ֵ��
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
     * ��ȡspecialCarType���Ե�ֵ��
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
     * ����specialCarType���Ե�ֵ��
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
     * ��ȡtonnage���Ե�ֵ��
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
     * ����tonnage���Ե�ֵ��
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
     * ��ȡvehicleType���Ե�ֵ��
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
     * ����vehicleType���Ե�ֵ��
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
     * ��ȡwholeWeight���Ե�ֵ��
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
     * ����wholeWeight���Ե�ֵ��
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
