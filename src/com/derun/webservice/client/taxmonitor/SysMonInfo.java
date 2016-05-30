
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SysMonInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SysMonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpuInfo" type="{http://vo.taxmonitor.derun.com}ArrayOfCpuInfo" minOccurs="0"/>
 *         &lt;element name="dbInfo" type="{http://vo.taxmonitor.derun.com}DBInfo" minOccurs="0"/>
 *         &lt;element name="diskInfo" type="{http://vo.taxmonitor.derun.com}ArrayOfDiskInfo" minOccurs="0"/>
 *         &lt;element name="memInfo" type="{http://vo.taxmonitor.derun.com}MemInfo" minOccurs="0"/>
 *         &lt;element name="netInfo" type="{http://vo.taxmonitor.derun.com}ArrayOfNetInfo" minOccurs="0"/>
 *         &lt;element name="processInfo" type="{http://vo.taxmonitor.derun.com}ArrayOfProcessInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysMonInfo", namespace = "http://vo.taxmonitor.derun.com", propOrder = {
    "cpuInfo",
    "dbInfo",
    "diskInfo",
    "memInfo",
    "netInfo",
    "processInfo"
})
public class SysMonInfo {

    @XmlElementRef(name = "cpuInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCpuInfo> cpuInfo;
    @XmlElementRef(name = "dbInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<DBInfo> dbInfo;
    @XmlElementRef(name = "diskInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDiskInfo> diskInfo;
    @XmlElementRef(name = "memInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<MemInfo> memInfo;
    @XmlElementRef(name = "netInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNetInfo> netInfo;
    @XmlElementRef(name = "processInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProcessInfo> processInfo;

    /**
     * 获取cpuInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCpuInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCpuInfo> getCpuInfo() {
        return cpuInfo;
    }

    /**
     * 设置cpuInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCpuInfo }{@code >}
     *     
     */
    public void setCpuInfo(JAXBElement<ArrayOfCpuInfo> value) {
        this.cpuInfo = value;
    }

    /**
     * 获取dbInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DBInfo }{@code >}
     *     
     */
    public JAXBElement<DBInfo> getDbInfo() {
        return dbInfo;
    }

    /**
     * 设置dbInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DBInfo }{@code >}
     *     
     */
    public void setDbInfo(JAXBElement<DBInfo> value) {
        this.dbInfo = value;
    }

    /**
     * 获取diskInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiskInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDiskInfo> getDiskInfo() {
        return diskInfo;
    }

    /**
     * 设置diskInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiskInfo }{@code >}
     *     
     */
    public void setDiskInfo(JAXBElement<ArrayOfDiskInfo> value) {
        this.diskInfo = value;
    }

    /**
     * 获取memInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MemInfo }{@code >}
     *     
     */
    public JAXBElement<MemInfo> getMemInfo() {
        return memInfo;
    }

    /**
     * 设置memInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MemInfo }{@code >}
     *     
     */
    public void setMemInfo(JAXBElement<MemInfo> value) {
        this.memInfo = value;
    }

    /**
     * 获取netInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetInfo> getNetInfo() {
        return netInfo;
    }

    /**
     * 设置netInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetInfo }{@code >}
     *     
     */
    public void setNetInfo(JAXBElement<ArrayOfNetInfo> value) {
        this.netInfo = value;
    }

    /**
     * 获取processInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProcessInfo> getProcessInfo() {
        return processInfo;
    }

    /**
     * 设置processInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProcessInfo }{@code >}
     *     
     */
    public void setProcessInfo(JAXBElement<ArrayOfProcessInfo> value) {
        this.processInfo = value;
    }

}
