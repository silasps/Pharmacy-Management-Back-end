package com.pharmacy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "medicine")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String medicineName;

    @Column(name = "lab_name")
    private String labName;

    @Column(name = "dose")
    private String medicineDose;

    @Column(name = "description")
    private String medicineDescription;

    @Column(name = "unit_price")
    private String medicineUnitPrice;

    @Column(name = "type")
    private String type;

}
