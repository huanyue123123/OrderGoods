
package com.example.eurekafeign.webClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DemoService", targetNamespace = "http://interfaces.eurekafeign.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DemoService {


    /**
     * 
     * @param userId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    @RequestWrapper(localName = "getUserName", targetNamespace = "http://interfaces.eurekafeign.example.com/", className = "com.example.eurekafeign.webClient.GetUserName")
    @ResponseWrapper(localName = "getUserNameResponse", targetNamespace = "http://interfaces.eurekafeign.example.com/", className = "com.example.eurekafeign.webClient.GetUserNameResponse")
    public String getUserName(
        @WebParam(name = "userId", targetNamespace = "")
        String userId);

    /**
     * 
     * @param userId
     * @return
     *     returns com.example.eurekafeign.webClient.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://interfaces.eurekafeign.example.com/", className = "com.example.eurekafeign.webClient.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://interfaces.eurekafeign.example.com/", className = "com.example.eurekafeign.webClient.GetUserResponse")
    public User getUser(
        @WebParam(name = "userId", targetNamespace = "")
        String userId);

}
