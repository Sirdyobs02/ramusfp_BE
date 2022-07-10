package com.playground.ramusfp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class PolicyPayer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String surname;
    private String idNumber;
    private String cellNumber;
    private String telephone;
    private String postalAddress;
    private String postalCode;
    private String email;
    private String relationshipToMember;
}
