package com.lux.med.exceptions;

public class CompanyNotFoundException extends RuntimeException {

    public CompanyNotFoundException(Long id) {
        super("Company not found: id " + id);
    }
}
