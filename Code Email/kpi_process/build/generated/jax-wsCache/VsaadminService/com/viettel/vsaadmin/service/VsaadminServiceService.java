
package com.viettel.vsaadmin.service;

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
@WebServiceClient(name = "VsaadminServiceService", targetNamespace = "http://service.vsaadmin.viettel.com/", wsdlLocation = "http://10.58.71.48:8280/vsaadminv3/VsaadminService?wsdl")
public class VsaadminServiceService
    extends Service
{

    private final static URL VSAADMINSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException VSAADMINSERVICESERVICE_EXCEPTION;
    private final static QName VSAADMINSERVICESERVICE_QNAME = new QName("http://service.vsaadmin.viettel.com/", "VsaadminServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.58.71.48:8280/vsaadminv3/VsaadminService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VSAADMINSERVICESERVICE_WSDL_LOCATION = url;
        VSAADMINSERVICESERVICE_EXCEPTION = e;
    }

    public VsaadminServiceService() {
        super(__getWsdlLocation(), VSAADMINSERVICESERVICE_QNAME);
    }

    public VsaadminServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VSAADMINSERVICESERVICE_QNAME, features);
    }

    public VsaadminServiceService(URL wsdlLocation) {
        super(wsdlLocation, VSAADMINSERVICESERVICE_QNAME);
    }

    public VsaadminServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VSAADMINSERVICESERVICE_QNAME, features);
    }

    public VsaadminServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VsaadminServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VsaadminService
     */
    @WebEndpoint(name = "VsaadminServicePort")
    public VsaadminService getVsaadminServicePort() {
        return super.getPort(new QName("http://service.vsaadmin.viettel.com/", "VsaadminServicePort"), VsaadminService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VsaadminService
     */
    @WebEndpoint(name = "VsaadminServicePort")
    public VsaadminService getVsaadminServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.vsaadmin.viettel.com/", "VsaadminServicePort"), VsaadminService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VSAADMINSERVICESERVICE_EXCEPTION!= null) {
            throw VSAADMINSERVICESERVICE_EXCEPTION;
        }
        return VSAADMINSERVICESERVICE_WSDL_LOCATION;
    }

}
