
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in0" type="{http://beans.derun.com}BaseMonitorReqInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "in0"
})
@XmlRootElement(name = "taxMon", namespace = "http://service.taxmonitor.derun.com")
public class TaxMon {

    @XmlElement(namespace = "http://service.taxmonitor.derun.com", required = true, nillable = true)
    protected BaseMonitorReqInfo in0;

    /**
     * 获取in0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseMonitorReqInfo }
     *     
     */
    public BaseMonitorReqInfo getIn0() {
        return in0;
    }

    /**
     * 设置in0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseMonitorReqInfo }
     *     
     */
    public void setIn0(BaseMonitorReqInfo value) {
        this.in0 = value;
    }

}
