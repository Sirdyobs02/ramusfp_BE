package com.playground.ramusfp.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class PolicyHolder extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "policy_holder_policy_number")
    private Policy policyNumber;

    private String marital_Status;
    public PolicyHolder(Person person){
        this.title = person.getTitle();
        this.firstName = person.getFirstName();
    }
}
