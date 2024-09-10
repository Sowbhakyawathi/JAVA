package com.example.PatientMedandApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.PatientMedandApp.model.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository <Doctor, String>{

}
