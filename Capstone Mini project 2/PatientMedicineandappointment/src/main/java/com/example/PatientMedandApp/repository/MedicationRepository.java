package com.example.PatientMedandApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.PatientMedandApp.model.Medication;

@Repository
public interface MedicationRepository extends MongoRepository<Medication, String> {

}
