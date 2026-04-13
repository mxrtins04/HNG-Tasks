package com.mxr.integration.model;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class data {
    public String name;
    public String gender;
    public double probability;
    public int sampleSize;
    public boolean isConfident;
    @CreationTimeStamp
    public String processedAt;
}
