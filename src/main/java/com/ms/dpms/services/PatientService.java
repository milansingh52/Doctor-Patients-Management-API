package com.ms.dpms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ms.dpms.models.PatientEntity;
import com.ms.dpms.repositories.PatientRepository;

@Service
public class PatientService 
{	
	@Autowired
	private PatientRepository patientRepository;
	
	// for all patient
	public List<PatientEntity> getPatients()
	{
		return patientRepository.findAll();
	}
	
	//for one patient
	public PatientEntity getPatient(long patientId)
	{
		return patientRepository.getById(patientId);
	}
	
	//for add patient
	public PatientEntity addPatient(PatientEntity patient)
	{
		patientRepository.save(patient);
		return patient;
	}	
	
	//for update patient
	public PatientEntity updatePatient(PatientEntity patient) 
	{
		patientRepository.save(patient);
		return patient;
	}
	
	// for delete patient
	public void deletePatient(long patientId)
	{
		PatientEntity doct1 = patientRepository.getOne(patientId);
		patientRepository.delete(doct1);
	}
}