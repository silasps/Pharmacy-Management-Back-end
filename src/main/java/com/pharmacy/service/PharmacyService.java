package com.pharmacy.service;

import com.pharmacy.entity.PharmacyEntity;
import com.pharmacy.repository.PharmacyRepository;
import org.springframework.stereotype.Service;

@Service
public class PharmacyService {

    final PharmacyRepository pharmacyRepository;

    public PharmacyService(PharmacyRepository pharmacyRepository){
        this.pharmacyRepository = pharmacyRepository;
    }

    public PharmacyEntity save(PharmacyEntity pharmacyEntity){
        return pharmacyRepository.save(pharmacyEntity);
    }


}
