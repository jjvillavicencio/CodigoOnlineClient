
package wdslClient;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CompilarPython", targetNamespace = "http://WebService/", wsdlLocation = "http://localhost:8080/CodigoOnlineWS-1.0-SNAPSHOT/CompilarPython?wsdl")
public class CompilarPython_Service
    extends Service
{

    private final static URL COMPILARPYTHON_WSDL_LOCATION;
    private final static WebServiceException COMPILARPYTHON_EXCEPTION;
    private final static QName COMPILARPYTHON_QNAME = new QName("http://WebService/", "CompilarPython");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CodigoOnlineWS-1.0-SNAPSHOT/CompilarPython?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPILARPYTHON_WSDL_LOCATION = url;
        COMPILARPYTHON_EXCEPTION = e;
    }

    public CompilarPython_Service() {
        super(__getWsdlLocation(), COMPILARPYTHON_QNAME);
    }

    public CompilarPython_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPILARPYTHON_QNAME, features);
    }

    public CompilarPython_Service(URL wsdlLocation) {
        super(wsdlLocation, COMPILARPYTHON_QNAME);
    }

    public CompilarPython_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPILARPYTHON_QNAME, features);
    }

    public CompilarPython_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompilarPython_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CompilarPython
     */
    @WebEndpoint(name = "CompilarPythonPort")
    public CompilarPython getCompilarPythonPort() {
        return super.getPort(new QName("http://WebService/", "CompilarPythonPort"), CompilarPython.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompilarPython
     */
    @WebEndpoint(name = "CompilarPythonPort")
    public CompilarPython getCompilarPythonPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebService/", "CompilarPythonPort"), CompilarPython.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPILARPYTHON_EXCEPTION!= null) {
            throw COMPILARPYTHON_EXCEPTION;
        }
        return COMPILARPYTHON_WSDL_LOCATION;
    }

}
