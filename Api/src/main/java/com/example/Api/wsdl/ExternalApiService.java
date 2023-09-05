package com.example.Api.wsdl;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import com.example.Api.entity.Customer;
import com.example.Api.generated.CustomerPortType;

import org.springframework.stereotype.Service;

@Service
public class ExternalApiService {

    public Customer getCustomerByOfficialId(String officialId) {
        // Skapa en JaxWsProxyFactoryBean för att skapa en klient för WSDL-tjänsten
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(CustomerPortType.class); // Använd din genererade PortType-klass
        factory.setAddress("http://spp.se/soap-api/CustomerService"); // Ange adressen till WSDL-tjänsten

        CustomerPortType customerPort = (CustomerPortType) factory.create();

        // Anropa GetCustomer-operationen på WSDL-tjänsten med det givna officialId
        GetCustomer request = new GetCustomer();
        request.setPersonOfficialId(officialId);
        GetCustomerResponse response = customerPort.getCustomer(request);

        // Hämta kunddata från responsen och mappa det till en Customer-objekt
        Customer customer = new Customer();
        customer.setPersonOfficialId(response.getResult().getPersonOfficialId());
        customer.setLastUpdated(response.getResult().getLastUpdated());
        customer.setFirstName(response.getResult().getFirstName());
        customer.setLastName(response.getResult().getLastName());
        customer.setAddress(response.getResult().getAddress());
        customer.setPersonType(response.getResult().getPersonType());

        return customer;
    }
}
