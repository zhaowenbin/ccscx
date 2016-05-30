
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BaseMonitorResInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BaseMonitorResInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busiMonInfo" type="{http://vo.taxmonitor.derun.com}ArrayOfBusiMonInfo" minOccurs="0"/>
 *         &lt;element name="sysMonInfo" type="{http://vo.taxmonitor.derun.com}SysMonInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMonitorResInfo", propOrder = {
    "busiMonInfo",
    "sysMonInfo"
})
public class BaseMonitorResInfo {

    @XmlElementRef(name = "busiMonInfo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBusiMonInfo> busiMonInfo;
    @XmlElementRef(name = "sysMonInfo", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<SysMonInfo> sysMonInfo;

    /**
     * ��ȡbusiMonInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBusiMonInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBusiMonInfo> getBusiMonInfo() {
        return busiMonInfo;
    }

    /**
     * ����busiMonInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBusiMonInfo }{@code >}
     *     
     */
    public void setBusiMonInfo(JAXBElement<ArrayOfBusiMonInfo> value) {
        this.busiMonInfo = value;
    }

    /**
     * ��ȡsysMonInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SysMonInfo }{@code >}
     *     
     */
    public JAXBElement<SysMonInfo> getSysMonInfo() {
        return sysMonInfo;
    }

    /**
     * ����sysMonInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SysMonInfo }{@code >}
     *     
     */
    public void setSysMonInfo(JAXBElement<SysMonInfo> value) {
        this.sysMonInfo = value;
    }

}
