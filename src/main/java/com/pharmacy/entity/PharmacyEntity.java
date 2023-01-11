package com.pharmacy.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.UUID;

@Entity
@Table(name = "pharmacy")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PharmacyEntity implements Serializable {

    private static final long serialVersionUUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pharm_id")
    private UUID id;

    @Column(name = "corporate_name")
    private String corporateName;

    @Column(name = "ein_cnpj")
    private String ein; //Employer Identification Number

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mobile")
    private String mobile;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addres_entity_id")
    private AddresEntity addresEntity;
}
