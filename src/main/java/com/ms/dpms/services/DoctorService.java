package com.ms.dpms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ms.dpms.models.DoctorEntity;
import com.ms.dpms.repositories.DoctorRepository;

@Service
public class DoctorService 
{	
	@Autowired
	private DoctorRepository doctorRepository;
	
	// for all doctor
	public List<DoctorEntity> getDoctors()
	{
		return doctorRepository.findAll();
	}
	
	//for one doctor
	public DoctorEntity getDoctor(long doctorId)
	{
		return doctorRepository.getById(doctorId);
	}
	
	//for add doctor
	public DoctorEntity addDoctor(DoctorEntity doctor)
	{
		doctorRepository.save(doctor);
		return doctor;
	}
	
	
	//for update doctor
	public DoctorEntity updateDoctor(DoctorEntity doctor) {
		doctorRepository.save(doctor);
		return doctor;
	}
	
	// for delete doctor
	public void deleteDoctor(long doctorId)
	{
		DoctorEntity doct1 = doctorRepository.getOne(doctorId);
		doctorRepository.delete(doct1);
	}
}
