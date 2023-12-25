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

import com.ms.dpms.models.DoctorEntity;
import com.ms.dpms.services.DoctorService;

@RestController
public class DoctorController 
{
	@Autowired
	private DoctorService doctorService;
	
	/*get all doctors record */
	@GetMapping("/doctors")
    public ResponseEntity<List<DoctorEntity>> getDoctors() 
	{
        List<DoctorEntity> doctors = this.doctorService.getDoctors();

        if (doctors.isEmpty()) 
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }
	
	//get one doctor record
	@GetMapping("/doctors/{doctorId}")
    public ResponseEntity<DoctorEntity> getDoctor(@PathVariable String doctorId) 
	{
        try 
        {
            Long id = Long.parseLong(doctorId);
            DoctorEntity doctor = this.doctorService.getDoctor(id);

            if (doctor != null) 
            {
                return new ResponseEntity<>(doctor, HttpStatus.OK);
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
	
	// add doctor details
	@PostMapping("/doctors")
    public ResponseEntity<Object> addDoctor(@RequestBody DoctorEntity doctor) 
	{
        try 
        {
            DoctorEntity addedDoctor = this.doctorService.addDoctor(doctor);
            return new ResponseEntity<>(addedDoctor, HttpStatus.CREATED);
        } 
        catch (Exception e) 
        {
            String errorMessage = "Failed to add doctor. Please check your input.";
            return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
        }
    }
	
	// update doctor details
	@PutMapping("/doctors")
	public ResponseEntity<Object> updateDoctor(@RequestBody DoctorEntity doctor) 
	{
	    try 
	    {
	        DoctorEntity updatedDoctor = this.doctorService.updateDoctor(doctor);
	        
	        if (updatedDoctor != null) 
	        {
	            return new ResponseEntity<>(updatedDoctor, HttpStatus.OK);
	        } 
	        else 
	        {
	            String errorMessage = "Doctor not found with the given ID.";
	            return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	        }
	    } 
	    catch (Exception e) 
	    {
	        String errorMessage = "Failed to update doctor. Please check your input.";
	        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	    }
	}
	
	// delete doctor
	@DeleteMapping("/doctors/{doctorId}")
	public ResponseEntity<HttpStatus> deleteDoctor(@PathVariable String doctorId)
	{
		try 
		{
			this.doctorService.deleteDoctor(Long.parseLong(doctorId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}

}
