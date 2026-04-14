package com.mxr.integration.Response;

import com.mxr.integration.model.GenderData;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProcessedResponse {
    public String status;
    public GenderData data;
}
