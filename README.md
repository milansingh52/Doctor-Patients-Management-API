## Overview
The Doctor-Patient Management System API is to manage patient and doctor records efficiently. This documentation provides details on project structure, resources, tools used, dependencies, and instructions for testing the RESTful APIs.

## Resources
1. Doctor: 
The Doctor resource represents healthcare professionals within the system. Each doctor has a unique identifier (id) and includes details such as name, email, gender etc.

1. Patient: 
The Patient resource represents individual patients in the system. Each patient has a unique identifier (id) and includes essential information such as name, email, gender, etc.

## Tools
1. Eclipse: Integrated Development Environment (IDE) for Java development.
2. Spring Boot: Framework for building Java-based enterprise applications.
3. Postman: API development and testing tool.
4. H2 Console: Database management tool for H2 Database.

## Dependencies
1. Spring Web: Provides HTTP request handling.
2. H2 Database: In-memory database for development and testing.
3. Spring Data JPA: Simplifies the data access layer.

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

## RESTful APIs
### Doctor Endpoints
GET /doctors: Retrieve a list of all doctors.
GET /doctors/{id}: Retrieve details of a specific doctor.
POST /doctors: Add a new doctor to the system.
PUT /doctors/{id}: Update details of a specific doctor.
DELETE /doctors/{id}: Delete a specific doctor.

### Patient Endpoints
GET /patients: Retrieve a list of all patients.
GET /patients/{id}: Retrieve details of a specific patient.
POST /patients: Add a new patient to the system.
PUT /patients/{id}: Update details of a specific patient.
DELETE /patients/{id}: Delete a specific patient.

## Testing the APIs
Open the project in Eclipse.
Run the application (Application.java).
Use Postman to test the listed APIs with the provided endpoints.
