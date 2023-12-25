package com.ms.dpms.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PatientEntity 
{
	@Id
	private long id;
	private String name;
	private String email;
	private String gender;
	
	public PatientEntity() {}
	
	public PatientEntity(long id, String name, String email, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}
