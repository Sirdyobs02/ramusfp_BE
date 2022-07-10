package com.playground.ramusfp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BeneficiaryDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String surname;
    private String idNumber;
    private String relationship;

}
