package com.example.PatientMedandApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.PatientMedandApp.model.Patient;

@Repository
public interface PatientRepository extends MongoRepository <Patient, String> {

}
