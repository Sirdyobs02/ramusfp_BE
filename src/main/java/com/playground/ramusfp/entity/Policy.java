package com.playground.ramusfp.entity;

import com.playground.ramusfp.model.*;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Policy {

    @Id
    private String policyNumber;

    @OneToOne
    @JoinColumn(name = "policy_payer_id")
    private PolicyPayer policyPayer;
    @OneToOne
    @JoinColumn(name = "policy_holder_id")
    private PolicyHolder policyHolderDetails;

    @OneToOne
    @JoinColumn(name = "spouse_details_id")
    private SpouseDetails spouseDetails;
    @OneToMany
    @JoinColumn(name = "children_details_id")
    private List<ChildrenDetails> childrenDetails;

    @OneToMany
    @JoinColumn(name = "extend_family_id")
    private List<ExtendedFamilyDetails> extendedFamilyDetails;
    @OneToOne
    @JoinColumn(name = "beneficiary_details_id")
    private BeneficiaryDetails beneficiaryDetails;
    @OneToOne
    @JoinColumn(name = "payment_details_id")
    private PaymentDetails paymentDetails;

    @OneToOne
    @JoinColumn(name = "bank_details_id")
    private BankDetails bankDetails;







}
