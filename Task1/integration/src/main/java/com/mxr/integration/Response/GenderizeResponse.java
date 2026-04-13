package com.mxr.integration.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class GenderizeResponse {
    public int count;
    public String name;
    public String gender;
    public double probability;
}
