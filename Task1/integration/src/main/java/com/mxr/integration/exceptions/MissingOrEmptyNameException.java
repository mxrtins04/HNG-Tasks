package com.mxr.integration.exceptions;

public class MissingOrEmptyNameException extends RuntimeException {
    public MissingOrEmptyNameException(String message) {
        super(message);
    }
    
}
