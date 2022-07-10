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
    @JoinColumn(name = "policy_payer_policy_number")
    private PolicyPayer policyPayer;
    @OneToOne
    @JoinColumn(name = "policy_holder_policy_number")
    private PolicyHolder policyHolderDetails;

    @OneToOne
    @JoinColumn(name = "spouse_details_policy_number")
    private SpouseDetails spouseDetails;
    @OneToMany
    @JoinColumn(name = "children_details_policy_number")
    private List<ChildrenDetails> childrenDetails;

    @OneToMany
    @JoinColumn(name = "extend_family_policy_number")
    private List<ExtendedFamilyDetails> extendedFamilyDetails;
    @OneToOne
    @JoinColumn(name = "beneficiary_details_policy_number")
    private BeneficiaryDetails beneficiaryDetails;
    @OneToOne
    @JoinColumn(name = "payment_details_policy_number")
    private PaymentDetails paymentDetails;

    @OneToOne
    @JoinColumn(name = "bank_details_policy_number")
    private BankDetails bankDetails;







}
