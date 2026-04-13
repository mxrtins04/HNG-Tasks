package com.mxr.integration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mxr.integration.exceptions.MissingOrEmptyNameException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class classifyController {
    @GetMapping("/api/classify")
    public String getMethodName(@RequestParam String name) {
        try{
            return "I'm gonna get a job within the next 2 months and i'll be earning over 600,000 naira";}
            catch(NullPointerException)
        }
        if (name == null)
            throw new MissingOrEmptyNameException(Message)
        if
        
    }
    
    
}
