
package com.derun.webservice.client.taxmonitor;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2015-08-13T19:03:05.933+08:00
 * Generated source version: 2.6.0
 * 
 */
public final class TaxMonitorServicePortType_TaxMonitorServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.taxmonitor.derun.com", "TaxMonitorService");

    private TaxMonitorServicePortType_TaxMonitorServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TaxMonitorService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TaxMonitorService ss = new TaxMonitorService(wsdlURL, SERVICE_NAME);
        TaxMonitorServicePortType port = ss.getTaxMonitorServiceHttpPort();  
        
        {
        System.out.println("Invoking taxMon...");
        com.derun.webservice.client.taxmonitor.BaseMonitorReqInfo _taxMon_in0 = null;
        com.derun.webservice.client.taxmonitor.BaseMonitorResInfo _taxMon__return = port.taxMon(_taxMon_in0);
        System.out.println("taxMon.result=" + _taxMon__return);


        }

        System.exit(0);
    }

}
