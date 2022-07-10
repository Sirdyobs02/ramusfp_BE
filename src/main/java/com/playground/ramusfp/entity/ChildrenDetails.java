package com.playground.ramusfp.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ChildrenDetails extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "children_details_policy_number")
    private Policy policyNumber;
}
