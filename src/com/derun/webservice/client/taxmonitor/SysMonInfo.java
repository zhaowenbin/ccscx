
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SysMonInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcpuInfo���Ե�ֵ��
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
     * ����cpuInfo���Ե�ֵ��
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
     * ��ȡdbInfo���Ե�ֵ��
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
     * ����dbInfo���Ե�ֵ��
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
     * ��ȡdiskInfo���Ե�ֵ��
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
     * ����diskInfo���Ե�ֵ��
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
     * ��ȡmemInfo���Ե�ֵ��
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
     * ����memInfo���Ե�ֵ��
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
     * ��ȡnetInfo���Ե�ֵ��
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
     * ����netInfo���Ե�ֵ��
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
     * ��ȡprocessInfo���Ե�ֵ��
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
     * ����processInfo���Ե�ֵ��
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
