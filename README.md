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

Doctor-Patient-Management-System-API
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controllers
│   │   │   │   ├── DoctorController.java
│   │   │   │   ├── PatientController.java
│   │   │   ├── models
│   │   │   │   ├── Doctor.java
│   │   │   │   ├── Patient.java
│   │   │   ├── repositories
│   │   │   │   ├── DoctorRepository.java
│   │   │   │   ├── PatientRepository.java
│   │   │   ├── services
│   │   │   │   ├── DoctorService.java
│   │   │   │   ├── PatientService.java
│   │   │   └── Application.java
│   │   ├── resources
│   │   │   ├── application.properties
│   └── test
│       └── java
│           └── ... (test classes)
└── target
    └── ... (compiled classes and JAR files)


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
