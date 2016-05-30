
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DiskInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DiskInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="devName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="free" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskInfo", namespace = "http://vo.taxmonitor.derun.com", propOrder = {
    "devName",
    "free",
    "totalC",
    "userPercent",
    "y"
})
public class DiskInfo {

    @XmlElementRef(name = "devName", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> devName;
    @XmlElementRef(name = "free", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> free;
    @XmlElementRef(name = "totalC", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> totalC;
    @XmlElementRef(name = "userPercent", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> userPercent;
    protected Float y;

    /**
     * ��ȡdevName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDevName() {
        return devName;
    }

    /**
     * ����devName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDevName(JAXBElement<String> value) {
        this.devName = value;
    }

    /**
     * ��ȡfree���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFree() {
        return free;
    }

    /**
     * ����free���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFree(JAXBElement<String> value) {
        this.free = value;
    }

    /**
     * ��ȡtotalC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalC() {
        return totalC;
    }

    /**
     * ����totalC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalC(JAXBElement<String> value) {
        this.totalC = value;
    }

    /**
     * ��ȡuserPercent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserPercent() {
        return userPercent;
    }

    /**
     * ����userPercent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserPercent(JAXBElement<String> value) {
        this.userPercent = value;
    }

    /**
     * ��ȡy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getY() {
        return y;
    }

    /**
     * ����y���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setY(Float value) {
        this.y = value;
    }

}
