
package bg.government.regixclient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RegiXEntryPoint", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://172.23.105.77/RegiX/RegiXEntryPoint.svc?singleWsdl")
public class RegiXEntryPoint
    extends Service
{

    private final static URL REGIXENTRYPOINT_WSDL_LOCATION;
    private final static RuntimeException REGIXENTRYPOINT_EXCEPTION;
    private final static QName REGIXENTRYPOINT_QNAME = new QName("http://tempuri.org/", "RegiXEntryPoint");

    static {
        URL url = null;
        RuntimeException e = null;
        try {
            url = RegiXEntryPoint.class.getResource("/RegiXEntryPoint.wsdl");
        } catch (Exception ex) {
            e = new WebServiceException(ex);
        }
        if (url == null) {
            e = new IllegalStateException("Cannot locate regix WSDL");
        }
        REGIXENTRYPOINT_WSDL_LOCATION = url;
        REGIXENTRYPOINT_EXCEPTION = e;
    }

    public RegiXEntryPoint() {
        super(__getWsdlLocation(), REGIXENTRYPOINT_QNAME);
    }

    public RegiXEntryPoint(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGIXENTRYPOINT_QNAME, features);
    }

    public RegiXEntryPoint(URL wsdlLocation) {
        super(wsdlLocation, REGIXENTRYPOINT_QNAME);
    }

    public RegiXEntryPoint(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGIXENTRYPOINT_QNAME, features);
    }

    public RegiXEntryPoint(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegiXEntryPoint(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IRegiXEntryPoint
     */
    @WebEndpoint(name = "WSHttpBinding_IRegiXEntryPoint")
    public IRegiXEntryPoint getWSHttpBindingIRegiXEntryPoint() {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_IRegiXEntryPoint"), IRegiXEntryPoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IRegiXEntryPoint
     */
    @WebEndpoint(name = "WSHttpBinding_IRegiXEntryPoint")
    public IRegiXEntryPoint getWSHttpBindingIRegiXEntryPoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_IRegiXEntryPoint"), IRegiXEntryPoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGIXENTRYPOINT_EXCEPTION!= null) {
            throw REGIXENTRYPOINT_EXCEPTION;
        }
        return REGIXENTRYPOINT_WSDL_LOCATION;
    }

}
