/**
 * CustomerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.spp.soap_api;

public class CustomerServiceLocator extends org.apache.axis.client.Service implements se.spp.soap_api.CustomerService {

    public CustomerServiceLocator() {
    }


    public CustomerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerPort
    private java.lang.String CustomerPort_address = "http://spp.se/soap-api/CustomerService";

    public java.lang.String getCustomerPortAddress() {
        return CustomerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerPortWSDDServiceName = "CustomerPort";

    public java.lang.String getCustomerPortWSDDServiceName() {
        return CustomerPortWSDDServiceName;
    }

    public void setCustomerPortWSDDServiceName(java.lang.String name) {
        CustomerPortWSDDServiceName = name;
    }

    public se.spp.soap_api.CustomerPortType getCustomerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerPort(endpoint);
    }

    public se.spp.soap_api.CustomerPortType getCustomerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            se.spp.soap_api.CustomerBindingStub _stub = new se.spp.soap_api.CustomerBindingStub(portAddress, this);
            _stub.setPortName(getCustomerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerPortEndpointAddress(java.lang.String address) {
        CustomerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (se.spp.soap_api.CustomerPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                se.spp.soap_api.CustomerBindingStub _stub = new se.spp.soap_api.CustomerBindingStub(new java.net.URL(CustomerPort_address), this);
                _stub.setPortName(getCustomerPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomerPort".equals(inputPortName)) {
            return getCustomerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://spp.se/soap-api", "CustomerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://spp.se/soap-api", "CustomerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerPort".equals(portName)) {
            setCustomerPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
