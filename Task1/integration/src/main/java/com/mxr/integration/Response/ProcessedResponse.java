package com.mxr.integration.Response;

import com.mxr.integration.model.GenderData;

import lombok.Builder;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
@Builder
@JsonPropertyOrder({"status", "data"})
public class ProcessedResponse {
    public String status;
    public GenderData data;
}
