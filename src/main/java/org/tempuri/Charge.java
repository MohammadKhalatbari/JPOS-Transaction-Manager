
package org.tempuri;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Charge", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://192.168.43.165:8090/Charge?wsdl")
public class Charge
    extends Service
{

    private final static URL CHARGE_WSDL_LOCATION;
    private final static WebServiceException CHARGE_EXCEPTION;
    private final static QName CHARGE_QNAME = new QName("http://tempuri.org/", "Charge");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.43.165:8090/Charge?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHARGE_WSDL_LOCATION = url;
        CHARGE_EXCEPTION = e;
    }

    public Charge() {
        super(__getWsdlLocation(), CHARGE_QNAME);
    }

    public Charge(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHARGE_QNAME, features);
    }

    public Charge(URL wsdlLocation) {
        super(wsdlLocation, CHARGE_QNAME);
    }

    public Charge(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHARGE_QNAME, features);
    }

    public Charge(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Charge(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICharge
     */
    @WebEndpoint(name = "BasicHttpBinding_ICharge")
    public ICharge getBasicHttpBindingICharge() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ICharge"), ICharge.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICharge
     */
    @WebEndpoint(name = "BasicHttpBinding_ICharge")
    public ICharge getBasicHttpBindingICharge(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ICharge"), ICharge.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHARGE_EXCEPTION!= null) {
            throw CHARGE_EXCEPTION;
        }
        return CHARGE_WSDL_LOCATION;
    }

}