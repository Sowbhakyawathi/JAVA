package com.example.PatientMedandApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PatientMedandApp.exception.ResourceNotFoundException;
import com.example.PatientMedandApp.model.Patient;
import com.example.PatientMedandApp.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientById(String id) {
        return patientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
    }
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    public void deletePatient(String id) {
        Patient patient = getPatientById(id);
        patientRepository.delete(patient);
    }
    public Patient updatePatient(String id, Patient updatedPatient) {
        Patient existingPatient = getPatientById(id);
        existingPatient.setName(updatedPatient.getName());
        existingPatient.setContactDetails(updatedPatient.getContactDetails());
        existingPatient.setMedicalHistory(updatedPatient.getMedicalHistory());
        return patientRepository.save(existingPatient);
    }

}
