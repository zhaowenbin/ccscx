
package com.derun.webservice.client.taxmonitor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Paid_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Paid_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paid_Type", propOrder = {
    "taxDepartment",
    "taxDepartmentCode",
    "taxDocumentNumber"
})
public class PaidType {

    @XmlElementRef(name = "taxDepartment", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxDepartment;
    @XmlElementRef(name = "taxDepartmentCode", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxDepartmentCode;
    @XmlElementRef(name = "taxDocumentNumber", namespace = "http://beans.derun.com", type = JAXBElement.class)
    protected JAXBElement<String> taxDocumentNumber;

    /**
     * ��ȡtaxDepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxDepartment() {
        return taxDepartment;
    }

    /**
     * ����taxDepartment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxDepartment(JAXBElement<String> value) {
        this.taxDepartment = value;
    }

    /**
     * ��ȡtaxDepartmentCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxDepartmentCode() {
        return taxDepartmentCode;
    }

    /**
     * ����taxDepartmentCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxDepartmentCode(JAXBElement<String> value) {
        this.taxDepartmentCode = value;
    }

    /**
     * ��ȡtaxDocumentNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxDocumentNumber() {
        return taxDocumentNumber;
    }

    /**
     * ����taxDocumentNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxDocumentNumber(JAXBElement<String> value) {
        this.taxDocumentNumber = value;
    }

}
