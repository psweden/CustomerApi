package se.spp.soap_api;

public class CustomerPortTypeProxy implements se.spp.soap_api.CustomerPortType {
  private String _endpoint = null;
  private se.spp.soap_api.CustomerPortType customerPortType = null;
  
  public CustomerPortTypeProxy() {
    _initCustomerPortTypeProxy();
  }
  
  public CustomerPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerPortTypeProxy();
  }
  
  private void _initCustomerPortTypeProxy() {
    try {
      customerPortType = (new se.spp.soap_api.CustomerServiceLocator()).getCustomerPort();
      if (customerPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerPortType != null)
      ((javax.xml.rpc.Stub)customerPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public se.spp.soap_api.CustomerPortType getCustomerPortType() {
    if (customerPortType == null)
      _initCustomerPortTypeProxy();
    return customerPortType;
  }
  
  public java.lang.String createCustomer(se.spp.model.Customer customer) throws java.rmi.RemoteException{
    if (customerPortType == null)
      _initCustomerPortTypeProxy();
    return customerPortType.createCustomer(customer);
  }
  
  public se.spp.model.Customer getCustomer(java.lang.String personOfficialId) throws java.rmi.RemoteException{
    if (customerPortType == null)
      _initCustomerPortTypeProxy();
    return customerPortType.getCustomer(personOfficialId);
  }
  
  
}