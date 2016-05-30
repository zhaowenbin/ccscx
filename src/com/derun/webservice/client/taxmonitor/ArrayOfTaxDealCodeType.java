
package com.derun.webservice.client.taxmonitor;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfTaxDealCode_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTaxDealCode_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxDealCode_Type" type="{http://beans.derun.com}TaxDealCode_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaxDealCode_Type", propOrder = {
    "taxDealCodeType"
})
public class ArrayOfTaxDealCodeType {

    @XmlElement(name = "TaxDealCode_Type", nillable = true)
    protected List<TaxDealCodeType> taxDealCodeType;

    /**
     * Gets the value of the taxDealCodeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDealCodeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDealCodeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDealCodeType }
     * 
     * 
     */
    public List<TaxDealCodeType> getTaxDealCodeType() {
        if (taxDealCodeType == null) {
            taxDealCodeType = new ArrayList<TaxDealCodeType>();
        }
        return this.taxDealCodeType;
    }

}
