
package com.viettel.pnms.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceCoDien", targetNamespace = "http://webservices.pnms.viettel.com/", wsdlLocation = "http://10.60.7.239:8031/BIKTService/ServiceCoDien?wsdl")
public class ServiceCoDien_Service
    extends Service
{

    private final static URL SERVICECODIEN_WSDL_LOCATION;
    private final static WebServiceException SERVICECODIEN_EXCEPTION;
    private final static QName SERVICECODIEN_QNAME = new QName("http://webservices.pnms.viettel.com/", "ServiceCoDien");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.60.7.239:8031/BIKTService/ServiceCoDien?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICECODIEN_WSDL_LOCATION = url;
        SERVICECODIEN_EXCEPTION = e;
    }

    public ServiceCoDien_Service() {
        super(__getWsdlLocation(), SERVICECODIEN_QNAME);
    }

    public ServiceCoDien_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICECODIEN_QNAME, features);
    }

    public ServiceCoDien_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICECODIEN_QNAME);
    }

    public ServiceCoDien_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICECODIEN_QNAME, features);
    }

    public ServiceCoDien_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceCoDien_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceCoDien
     */
    @WebEndpoint(name = "ServiceCoDienPort")
    public ServiceCoDien getServiceCoDienPort() {
        return super.getPort(new QName("http://webservices.pnms.viettel.com/", "ServiceCoDienPort"), ServiceCoDien.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceCoDien
     */
    @WebEndpoint(name = "ServiceCoDienPort")
    public ServiceCoDien getServiceCoDienPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.pnms.viettel.com/", "ServiceCoDienPort"), ServiceCoDien.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICECODIEN_EXCEPTION!= null) {
            throw SERVICECODIEN_EXCEPTION;
        }
        return SERVICECODIEN_WSDL_LOCATION;
    }

}
