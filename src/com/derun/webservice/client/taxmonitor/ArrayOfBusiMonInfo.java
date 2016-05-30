
package com.derun.webservice.client.taxmonitor;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfBusiMonInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBusiMonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusiMonInfo" type="{http://vo.taxmonitor.derun.com}BusiMonInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBusiMonInfo", namespace = "http://vo.taxmonitor.derun.com", propOrder = {
    "busiMonInfo"
})
public class ArrayOfBusiMonInfo {

    @XmlElement(name = "BusiMonInfo", nillable = true)
    protected List<BusiMonInfo> busiMonInfo;

    /**
     * Gets the value of the busiMonInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the busiMonInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusiMonInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusiMonInfo }
     * 
     * 
     */
    public List<BusiMonInfo> getBusiMonInfo() {
        if (busiMonInfo == null) {
            busiMonInfo = new ArrayList<BusiMonInfo>();
        }
        return this.busiMonInfo;
    }

}
