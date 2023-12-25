## Overview
The Doctor-Patient Management System API is to manage patient and doctor records efficiently. This documentation provides details on project structure, resources, tools used, dependencies, and instructions for testing the RESTful APIs.

## Resources
1. Doctor
The Doctor resource represents healthcare professionals within the system. Each doctor has a unique identifier (id) and includes details such as name, email, gender etc.

1. Patient
The Patient resource represents individual patients in the system. Each patient has a unique identifier (id) and includes essential information such as name, email, gender, etc.

## Resource
- Doctor
- Patient

## Tools 
- Eclipse
- Spring Boot
- Postman
- H2 Console

## Dependencies
- Spring Web
- H2 Database
- Spring Data JPA

## File Structure
- com.ms.dpms
- com.ms.dpms.controllers
  - DoctorController.java
  - PatientController.java
- com.ms.dpms.services
  - DoctorServices.java
  - PatientServices.java
- com.ms.dpms.models
  - DoctorEntity.java
  - PatientEntity.java
- com.ms.dpms.repositories
- com.ms.dpms.error
