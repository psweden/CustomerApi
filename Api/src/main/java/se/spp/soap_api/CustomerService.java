/**
 * CustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.spp.soap_api;

public interface CustomerService extends javax.xml.rpc.Service {
    public java.lang.String getCustomerPortAddress();

    public se.spp.soap_api.CustomerPortType getCustomerPort() throws javax.xml.rpc.ServiceException;

    public se.spp.soap_api.CustomerPortType getCustomerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
