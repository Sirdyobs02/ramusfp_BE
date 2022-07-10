package com.playground.ramusfp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BeneficiaryDetails extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String relationship;

    @OneToOne
    @JoinColumn(name = "beneficiary_details_policy_number")
    private Policy policyNumber;
}
