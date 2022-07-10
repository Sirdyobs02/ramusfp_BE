package com.playground.ramusfp.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String title;
    protected String firstName;
    protected String surname;
    protected String idNumber;
    protected String cellNumber;
    protected String tellNumber;
    protected String postalAddress;
    protected String postalCode;
    protected String email;
}
