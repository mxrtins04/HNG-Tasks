package com.mxr.integration.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ErrorResponse> handleMissingServletRequestParameterException(MissingServletRequestParameterException ex){
        ErrorResponse response = new ErrorResponse(
            "BAD_REQUEST",
            "Required request parameter is missing"
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        
    }
}
