
package com.derun.webservice.client.taxmonitor;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAnnualTax_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAnnualTax_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnualTax_Type" type="{http://beans.derun.com}AnnualTax_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnnualTax_Type", propOrder = {
    "annualTaxType"
})
public class ArrayOfAnnualTaxType {

    @XmlElement(name = "AnnualTax_Type", nillable = true)
    protected List<AnnualTaxType> annualTaxType;

    /**
     * Gets the value of the annualTaxType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annualTaxType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnualTaxType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnualTaxType }
     * 
     * 
     */
    public List<AnnualTaxType> getAnnualTaxType() {
        if (annualTaxType == null) {
            annualTaxType = new ArrayList<AnnualTaxType>();
        }
        return this.annualTaxType;
    }

}
