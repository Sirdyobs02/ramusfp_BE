package com.playground.ramusfp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SpouseDetails extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "spouse_details_policy_number")
    private Policy policyNumber;

}
