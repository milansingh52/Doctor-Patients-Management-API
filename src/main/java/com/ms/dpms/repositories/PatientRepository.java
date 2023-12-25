package com.ms.dpms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.dpms.models.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Long>{

}
