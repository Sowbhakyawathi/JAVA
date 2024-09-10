package com.example.PatientMedandApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PatientMedandApp.exception.ResourceNotFoundException;
import com.example.PatientMedandApp.model.Patient;
import com.example.PatientMedandApp.service.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
	
	 @Autowired
	    private PatientService patientService;

	    @PostMapping
	    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
	        Patient savedPatient = patientService.savePatient(patient);
	        return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);
	    }
	    @GetMapping
	    public List<Patient> getAllPatients() {
	        return patientService.getAllPatients();
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Patient> getPatientById(@PathVariable String id) {
	        Patient patient = patientService.getPatientById(id);
	        return new ResponseEntity<>(patient, HttpStatus.OK);
	    }

	    @ExceptionHandler(ResourceNotFoundException.class)
	    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	    }
	    @PutMapping("/{id}")
	    public ResponseEntity<Patient> updatePatient(@PathVariable String id, @RequestBody Patient patient) {
	        Patient updatedPatient = patientService.updatePatient(id, patient);
	        return new ResponseEntity<>(updatedPatient, HttpStatus.OK);
	    }
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletePatient(@PathVariable String id) {
	        patientService.deletePatient(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
