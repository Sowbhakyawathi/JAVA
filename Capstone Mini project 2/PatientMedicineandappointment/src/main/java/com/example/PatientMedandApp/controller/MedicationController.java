package com.example.PatientMedandApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PatientMedandApp.model.Medication;
import com.example.PatientMedandApp.service.MedicationService;

@RestController
@RequestMapping("/medications")
public class MedicationController {
	@Autowired
	private MedicationService medicationService;

	@PostMapping
	public ResponseEntity<Medication> createMedication(@RequestBody Medication medication) {
		Medication savedMedication = medicationService.saveMedication(medication);
		return new ResponseEntity<>(savedMedication, HttpStatus.CREATED);
	}

	@GetMapping
	public List<Medication> getAllMedications() {
		return medicationService.getAllMedications();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Medication> getMedicationById(@PathVariable String id) {
		Medication medication = medicationService.getMedicationById(id);
		return new ResponseEntity<>(medication, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Medication> updateMedication(@PathVariable String id, @RequestBody Medication medication) {
		Medication updatedMedication = medicationService.updateMedication(id, medication);
		return new ResponseEntity<>(updatedMedication, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMedication(@PathVariable String id) {
		medicationService.deleteMedication(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
