package com.pharmacy.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "pharmacy")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PharmacyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pharm_id")
    private Long id;

    @Column(name = "corporate_name")
    private String corporateName;

    @Column(name = "ein_cnpj")
    private Integer ein;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "mobile")
    private Integer mobile;

    @OneToOne
    @JoinColumn(name = "addres_entity_id")
    private AddresEntity addresEntity;
}
