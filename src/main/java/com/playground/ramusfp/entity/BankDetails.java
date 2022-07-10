package com.playground.ramusfp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BankDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "bank_details_policy_number")
    private Policy policyNumber;
    private String bankName;
    private String bankCode;
    private String branch;
    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private String debitOrderDay;

}
