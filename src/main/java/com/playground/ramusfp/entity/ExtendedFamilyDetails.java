package com.playground.ramusfp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ExtendedFamilyDetails extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "extend_family_policy_number")
    private Policy policyNumber;
}
