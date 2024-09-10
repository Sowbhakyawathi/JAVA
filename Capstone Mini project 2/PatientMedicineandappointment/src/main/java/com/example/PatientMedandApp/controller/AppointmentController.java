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

import com.example.PatientMedandApp.model.Appointment;
import com.example.PatientMedandApp.service.AppointmentService;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
	 @Autowired
	    private AppointmentService appointmentService;

	    @PostMapping
	    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
	        Appointment savedAppointment = appointmentService.saveAppointment(appointment);
	        return new ResponseEntity<>(savedAppointment, HttpStatus.CREATED);
	    }
	    @GetMapping
	    public List<Appointment> getAllAppointments() {
	        return appointmentService.getAllAppointments();
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Appointment> getAppointmentById(@PathVariable String id) {
	        Appointment appointment = appointmentService.getAppointmentById(id);
	        return new ResponseEntity<>(appointment, HttpStatus.OK);
	    }
	    @PutMapping("/{id}")
	    public ResponseEntity<Appointment> updateAppointment(@PathVariable String id, @RequestBody Appointment appointment) {
	        Appointment updatedAppointment = appointmentService.updateAppointment(id, appointment);
	        return new ResponseEntity<>(updatedAppointment, HttpStatus.OK);
	    }
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteAppointment(@PathVariable String id) {
	        appointmentService.deleteAppointment(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
