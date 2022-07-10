package com.playground.ramusfp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PolicyPayerModel extends PersonModel{
    private String policyNumber;
}
