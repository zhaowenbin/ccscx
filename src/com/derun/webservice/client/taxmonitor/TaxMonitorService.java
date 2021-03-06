package com.derun.webservice.client.taxmonitor;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2015-08-13T19:03:05.992+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "TaxMonitorService", 
                  wsdlLocation = "http://localhost:7002/taxcarship/services/TaxMonitorService?wsdl",
                  targetNamespace = "http://service.taxmonitor.derun.com") 
public class TaxMonitorService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.taxmonitor.derun.com", "TaxMonitorService");
    public final static QName TaxMonitorServiceHttpPort = new QName("http://service.taxmonitor.derun.com", "TaxMonitorServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:7002/taxcarship/services/TaxMonitorService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TaxMonitorService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:7002/taxcarship/services/TaxMonitorService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TaxMonitorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TaxMonitorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaxMonitorService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns TaxMonitorServicePortType
     */
    @WebEndpoint(name = "TaxMonitorServiceHttpPort")
    public TaxMonitorServicePortType getTaxMonitorServiceHttpPort() {
        return super.getPort(TaxMonitorServiceHttpPort, TaxMonitorServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TaxMonitorServicePortType
     */
    @WebEndpoint(name = "TaxMonitorServiceHttpPort")
    public TaxMonitorServicePortType getTaxMonitorServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(TaxMonitorServiceHttpPort, TaxMonitorServicePortType.class, features);
    }

}
