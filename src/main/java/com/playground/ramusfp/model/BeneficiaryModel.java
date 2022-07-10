package com.playground.ramusfp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BeneficiaryModel extends PersonModel {
    private String policyNumber;
    private String ppRelationship;
}
