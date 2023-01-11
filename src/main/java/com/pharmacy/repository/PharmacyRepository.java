package com.pharmacy.repository;

import com.pharmacy.entity.PharmacyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PharmacyRepository extends JpaRepository<PharmacyEntity, UUID> {
}
