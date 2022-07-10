package com.playground.ramusfp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PolicyHolderModel extends PersonModel {
    private String policyNumber;
}
