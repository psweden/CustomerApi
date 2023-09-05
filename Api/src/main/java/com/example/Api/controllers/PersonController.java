package com.example.Api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Api.entity.Person; // Använd Person istället för Customer
import com.example.Api.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    
    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable String id) {
        Person person = personService.getPersonById(id); // Använd getPersonById-metoden
        if (person != null) {
            return ResponseEntity.ok(person);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
