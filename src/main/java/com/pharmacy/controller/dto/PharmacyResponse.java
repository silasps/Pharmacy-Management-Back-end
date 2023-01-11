package com.pharmacy.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PharmacyResponse {

    @NotNull
    private String corporateName;
    @NotNull
    private String ein; //Employer Identification Number (14 digits)
    @NotNull
    private String businessName;
    @NotNull
    private String email;
    private String phone;
    @NotNull
    private String mobile;

}
