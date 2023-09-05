package com.example.Api.service;

import org.springframework.stereotype.Service;

import com.example.api.generated.CustomerPortType;
import com.example.api.generated.GetCustomer;
import com.example.api.generated.GetCustomerResponse;
import com.example.Api.entity.Person;

@Service
public class PersonService {

    private final CustomerPortType customerPort;

    public PersonService(CustomerPortType customerPort) {
        this.customerPort = customerPort;
    }

    public Person getPersonById(String id) {
        GetCustomer request = new GetCustomer();
        request.setPersonOfficialId(id);

        GetCustomerResponse response = customerPort.getCustomer(request);
        if (response != null && response.getResult() != null) {
            Person person = response.getResult();
            return person;
        } else {
            return null;
        }
    }
}
