
package com.example.eurekafeign.weather;

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
@WebServiceClient(name = "WeatherWebService", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "file:/D:/ideaWorkSpace/demo/eureka-feign/src/main/resources/WeatherWebService.wsdl")
public class WeatherWebService
    extends Service
{

    private final static URL WEATHERWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEATHERWEBSERVICE_EXCEPTION;
    private final static QName WEATHERWEBSERVICE_QNAME = new QName("http://WebXml.com.cn/", "WeatherWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/ideaWorkSpace/demo/eureka-feign/src/main/resources/WeatherWebService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERWEBSERVICE_WSDL_LOCATION = url;
        WEATHERWEBSERVICE_EXCEPTION = e;
    }

    public WeatherWebService() {
        super(__getWsdlLocation(), WEATHERWEBSERVICE_QNAME);
    }

    public WeatherWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERWEBSERVICE_QNAME, features);
    }

    public WeatherWebService(URL wsdlLocation) {
        super(wsdlLocation, WEATHERWEBSERVICE_QNAME);
    }

    public WeatherWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERWEBSERVICE_QNAME, features);
    }

    public WeatherWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap")
    public WeatherWebServiceSoap getWeatherWebServiceSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceSoap"), WeatherWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap")
    public WeatherWebServiceSoap getWeatherWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceSoap"), WeatherWebServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap12")
    public WeatherWebServiceSoap getWeatherWebServiceSoap12() {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceSoap12"), WeatherWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap12")
    public WeatherWebServiceSoap getWeatherWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceSoap12"), WeatherWebServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WeatherWebServiceHttpGet
     */
    @WebEndpoint(name = "WeatherWebServiceHttpGet")
    public WeatherWebServiceHttpGet getWeatherWebServiceHttpGet() {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceHttpGet"), WeatherWebServiceHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceHttpGet
     */
    @WebEndpoint(name = "WeatherWebServiceHttpGet")
    public WeatherWebServiceHttpGet getWeatherWebServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceHttpGet"), WeatherWebServiceHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns WeatherWebServiceHttpPost
     */
    @WebEndpoint(name = "WeatherWebServiceHttpPost")
    public WeatherWebServiceHttpPost getWeatherWebServiceHttpPost() {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceHttpPost"), WeatherWebServiceHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceHttpPost
     */
    @WebEndpoint(name = "WeatherWebServiceHttpPost")
    public WeatherWebServiceHttpPost getWeatherWebServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceHttpPost"), WeatherWebServiceHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERWEBSERVICE_EXCEPTION!= null) {
            throw WEATHERWEBSERVICE_EXCEPTION;
        }
        return WEATHERWEBSERVICE_WSDL_LOCATION;
    }

}
