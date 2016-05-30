
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DBInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DBInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RAC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="banner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentConnVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lockedSql" type="{http://service.taxmonitor.derun.com}ArrayOfArrayOfString" minOccurs="0"/>
 *         &lt;element name="maxConnVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="runningSql" type="{http://service.taxmonitor.derun.com}ArrayOfArrayOfString" minOccurs="0"/>
 *         &lt;element name="tsInfo" type="{http://service.taxmonitor.derun.com}ArrayOfArrayOfString" minOccurs="0"/>
 *         &lt;element name="userConn" type="{http://service.taxmonitor.derun.com}ArrayOfArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBInfo", namespace = "http://vo.taxmonitor.derun.com", propOrder = {
    "rac",
    "banner",
    "currentConnVal",
    "lockedSql",
    "maxConnVal",
    "runningSql",
    "tsInfo",
    "userConn"
})
public class DBInfo {

    @XmlElement(name = "RAC")
    protected Boolean rac;
    @XmlElementRef(name = "banner", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> banner;
    protected Integer currentConnVal;
    @XmlElementRef(name = "lockedSql", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfArrayOfString> lockedSql;
    protected Integer maxConnVal;
    @XmlElementRef(name = "runningSql", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfArrayOfString> runningSql;
    @XmlElementRef(name = "tsInfo", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfArrayOfString> tsInfo;
    @XmlElementRef(name = "userConn", namespace = "http://vo.taxmonitor.derun.com", type = JAXBElement.class)
    protected JAXBElement<ArrayOfArrayOfString> userConn;

    /**
     * 获取rac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRAC() {
        return rac;
    }

    /**
     * 设置rac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRAC(Boolean value) {
        this.rac = value;
    }

    /**
     * 获取banner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBanner() {
        return banner;
    }

    /**
     * 设置banner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBanner(JAXBElement<String> value) {
        this.banner = value;
    }

    /**
     * 获取currentConnVal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentConnVal() {
        return currentConnVal;
    }

    /**
     * 设置currentConnVal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentConnVal(Integer value) {
        this.currentConnVal = value;
    }

    /**
     * 获取lockedSql属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArrayOfString> getLockedSql() {
        return lockedSql;
    }

    /**
     * 设置lockedSql属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public void setLockedSql(JAXBElement<ArrayOfArrayOfString> value) {
        this.lockedSql = value;
    }

    /**
     * 获取maxConnVal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxConnVal() {
        return maxConnVal;
    }

    /**
     * 设置maxConnVal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxConnVal(Integer value) {
        this.maxConnVal = value;
    }

    /**
     * 获取runningSql属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArrayOfString> getRunningSql() {
        return runningSql;
    }

    /**
     * 设置runningSql属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public void setRunningSql(JAXBElement<ArrayOfArrayOfString> value) {
        this.runningSql = value;
    }

    /**
     * 获取tsInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArrayOfString> getTsInfo() {
        return tsInfo;
    }

    /**
     * 设置tsInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public void setTsInfo(JAXBElement<ArrayOfArrayOfString> value) {
        this.tsInfo = value;
    }

    /**
     * 获取userConn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArrayOfString> getUserConn() {
        return userConn;
    }

    /**
     * 设置userConn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArrayOfString }{@code >}
     *     
     */
    public void setUserConn(JAXBElement<ArrayOfArrayOfString> value) {
        this.userConn = value;
    }

}
