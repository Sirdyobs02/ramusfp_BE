package com.playground.ramusfp.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class PaymentDetails  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modeOfPayment;
    private String frequency;
    private Date policyStartDate;

}
