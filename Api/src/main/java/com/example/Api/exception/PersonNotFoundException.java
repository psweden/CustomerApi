package com.example.Api.exception;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(String officialId) {
        super("No person found with official ID: " + officialId);
    }
}

