package com.mxr.integration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mxr.integration.exceptions.MissingOrEmptyNameException;
import com.mxr.integration.service.IntegrationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class classifyController {
    private final IntegrationService integrationService;
    
    public classifyController(IntegrationService integrationService) {
        this.integrationService = integrationService;
    }
    
    @GetMapping("/api/classify")
    public ProceesedResponse getMethodName(@RequestParam String name) {
        
        
    }
    
    
}
