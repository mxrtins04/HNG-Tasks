package com.mxr.integration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mxr.integration.Response.GenderizeResponse;
import com.mxr.integration.Response.ProcessedResponse;
import com.mxr.integration.model.GenderData;
import com.mxr.integration.service.IntegrationService;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class classifyController {
    private final IntegrationService integrationService;

    public classifyController(IntegrationService integrationService) {
        this.integrationService = integrationService;
    }

    @GetMapping("/api/classify")
    public ProcessedResponse getMethodName(@RequestParam String name) {
        GenderizeResponse response = integrationService.getResponseEntity(name);

        GenderData genderData = processGenderizeResponse(response);
       
        ProcessedResponse processedResponse = processGenderData(genderData);
        return processedResponse;

    }

    private GenderData processGenderizeResponse(GenderizeResponse response) {
        boolean isConfident = response.getProbability() >= 0.7 && response.getSampleSize() >= 100;
        return GenderData.builder()
                .name(response.getName())
                .gender(response.getGender())
                .probability(response.getProbability())
                .sampleSize(response.getSampleSize())
                .isConfident(isConfident)
                .processedAt(Instant.now())
                .build();
    }

    private ProcessedResponse processGenderData(GenderData data) {

        return ProcessedResponse.builder()
                .status("success")
                .data(data)
                .build();
    }

}
