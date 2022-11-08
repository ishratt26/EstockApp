package com.estock.stockMarket.exceptions;


public class CompanyNotFoundException extends RuntimeException {

    public CompanyNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
