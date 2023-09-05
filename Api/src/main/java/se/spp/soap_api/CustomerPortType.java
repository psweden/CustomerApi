/**
 * CustomerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.spp.soap_api;

public interface CustomerPortType extends java.rmi.Remote {
    public java.lang.String createCustomer(se.spp.model.Customer customer) throws java.rmi.RemoteException;
    public se.spp.model.Customer getCustomer(java.lang.String personOfficialId) throws java.rmi.RemoteException;
}
