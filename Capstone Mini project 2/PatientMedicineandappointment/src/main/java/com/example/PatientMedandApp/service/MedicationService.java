package com.example.PatientMedandApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PatientMedandApp.exception.ResourceNotFoundException;
import com.example.PatientMedandApp.model.Medication;
import com.example.PatientMedandApp.repository.MedicationRepository;

@Service
public class MedicationService {
	@Autowired
	private MedicationRepository medicationRepository;
	
	public Medication saveMedication(Medication medication) {
        return medicationRepository.save(medication);
    }
	public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }
	public Medication getMedicationById(String id) {
        return medicationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Medication not found"));
    }
	public Medication updateMedication(String id, Medication medication) {
        if (!medicationRepository.existsById(id)) {
            throw new ResourceNotFoundException("Medication not found");
        }
        medication.setId(id);
        return medicationRepository.save(medication);
    }
	public void deleteMedication(String id) {
        medicationRepository.deleteById(id);
    }


}
