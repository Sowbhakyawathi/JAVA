package com.example.PatientMedandApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.PatientMedandApp.model.Appointment;

@Repository
public interface AppointmentRepository extends MongoRepository <Appointment, String>{

}
