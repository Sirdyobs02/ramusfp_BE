package com.playground.ramusfp.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PersonModel {

    private String title;
    private String firstName;
    private String surname;
    private String idNumber;
    private String cellNumber;
    private String tellNumber;
    private String postalAddress;
    private String postalCode;
    private String email;
}
