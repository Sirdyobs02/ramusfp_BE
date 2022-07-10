package com.playground.ramusfp.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class PolicyHolder{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String firstname;
    private String surname;
    private String idNumber;
    private String maritalStatus;
    private String cellNumber;
    private String telephone;

}
