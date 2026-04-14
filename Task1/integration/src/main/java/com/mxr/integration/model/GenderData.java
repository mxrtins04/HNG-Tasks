package com.mxr.integration.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;

@Data
@Builder
public class GenderData {
    public String name;
    public String gender;
    public double probability;

    @JsonProperty("sample_size")
    public int sampleSize;
    public boolean isConfident;
    public Instant processedAt;
}
