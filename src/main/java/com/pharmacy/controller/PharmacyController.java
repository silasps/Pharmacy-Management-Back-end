package com.pharmacy.controller;

import com.pharmacy.controller.dto.PharmacyResponse;
import com.pharmacy.entity.PharmacyEntity;
import com.pharmacy.repository.PharmacyRepository;
import com.pharmacy.service.PharmacyService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {

    final PharmacyService pharmacyService;
    private final PharmacyRepository pharmacyRepository;

    public PharmacyController(PharmacyService pharmacyService,
                              PharmacyRepository pharmacyRepository){
        this.pharmacyService = pharmacyService;
        this.pharmacyRepository = pharmacyRepository;
    }

    @PostMapping
    public ResponseEntity<Object> savePharmacy(@RequestBody @Valid PharmacyResponse pharmacyResponse){
        PharmacyEntity pharmacyEntity = new PharmacyEntity();
        BeanUtils.copyProperties(pharmacyResponse, pharmacyEntity); //convert Dto into entity
        return ResponseEntity.status(HttpStatus.CREATED).body(pharmacyService.save(pharmacyEntity));
    }

}
