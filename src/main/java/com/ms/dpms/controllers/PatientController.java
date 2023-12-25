package com.ms.dpms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.dpms.models.PatientEntity;
import com.ms.dpms.services.PatientService;

@RestController
public class PatientController 
{
	@Autowired
	private PatientService patientService;
	
	/*get all patients record */
	@GetMapping("/patients")
    public ResponseEntity<List<PatientEntity>> getPatients() 
	{
        List<PatientEntity> patients = this.patientService.getPatients();

        if (patients.isEmpty()) 
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }
	
	//get one patient record
	@GetMapping("/patients/{patientId}")
    public ResponseEntity<PatientEntity> getPatient(@PathVariable String patientId) 
	{
        try 
        {
            Long id = Long.parseLong(patientId);
            PatientEntity patient = this.patientService.getPatient(id);

            if (patient != null) 
            {
                return new ResponseEntity<>(patient, HttpStatus.OK);
            } 
            else 
            {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } 
        catch (NumberFormatException e) 
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
	
	// add patient
	@PostMapping("/patients")
    public ResponseEntity<Object> addPatient(@RequestBody PatientEntity patient) 
	{
        try 
        {
            PatientEntity addedPatient = this.patientService.addPatient(patient);
            return new ResponseEntity<>(addedPatient, HttpStatus.CREATED);
        } 
        catch (Exception e) 
        {
            String errorMessage = "Failed to add patient. Please check your input.";
            return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
        }
    }
	
	// update patient
	@PutMapping("/patients")
	public ResponseEntity<Object> patientPatient(@RequestBody PatientEntity patient) 
	{
	    try 
	    {
	        PatientEntity updatedPatient = this.patientService.updatePatient(patient);
	        
	        if (updatedPatient != null) 
	        {
	            return new ResponseEntity<>(updatedPatient, HttpStatus.OK);
	        } 
	        else 
	        {
	            String errorMessage = "Patient not found with the given ID.";
	            return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	        }
	    } 
	    catch (Exception e) 
	    {
	        String errorMessage = "Failed to update patient. Please check your input.";
	        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	    }
	}
	
	
	// delete patient
	@DeleteMapping("/patients/{patientId}")
	public ResponseEntity<HttpStatus> deletePatient(@PathVariable String patientId)
	{
		try 
		{
			this.patientService.deletePatient(Long.parseLong(patientId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}

}

