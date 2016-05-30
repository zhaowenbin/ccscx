
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MemInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeMem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jvmFreeMem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jvmMaxMem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jvmTotalMem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemInfo", namespace = "http://vo.taxmonitor.derun.com", propOrder = {
    "freeMem",
    "jvmFreeMem",
    "jvmMaxMem",
    "jvmTotalMem",
    "totalMem"
})
public class MemInfo {

    @XmlElementRef(name = "freeMem", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> freeMem;
    @XmlElementRef(name = "jvmFreeMem", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> jvmFreeMem;
    @XmlElementRef(name = "jvmMaxMem", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> jvmMaxMem;
    @XmlElementRef(name = "jvmTotalMem", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> jvmTotalMem;
    @XmlElementRef(name = "totalMem", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> totalMem;

    /**
     * 获取freeMem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeMem() {
        return freeMem;
    }

    /**
     * 设置freeMem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeMem(JAXBElement<String> value) {
        this.freeMem = value;
    }

    /**
     * 获取jvmFreeMem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJvmFreeMem() {
        return jvmFreeMem;
    }

    /**
     * 设置jvmFreeMem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJvmFreeMem(JAXBElement<String> value) {
        this.jvmFreeMem = value;
    }

    /**
     * 获取jvmMaxMem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJvmMaxMem() {
        return jvmMaxMem;
    }

    /**
     * 设置jvmMaxMem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJvmMaxMem(JAXBElement<String> value) {
        this.jvmMaxMem = value;
    }

    /**
     * 获取jvmTotalMem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJvmTotalMem() {
        return jvmTotalMem;
    }

    /**
     * 设置jvmTotalMem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJvmTotalMem(JAXBElement<String> value) {
        this.jvmTotalMem = value;
    }

    /**
     * 获取totalMem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalMem() {
        return totalMem;
    }

    /**
     * 设置totalMem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalMem(JAXBElement<String> value) {
        this.totalMem = value;
    }

}
