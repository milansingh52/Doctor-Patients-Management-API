package com.ms.dpms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.dpms.models.DoctorEntity;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long>{

}
