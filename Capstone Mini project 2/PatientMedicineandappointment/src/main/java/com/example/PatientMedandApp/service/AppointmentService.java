package com.example.PatientMedandApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PatientMedandApp.exception.ResourceNotFoundException;
import com.example.PatientMedandApp.model.Appointment;
import com.example.PatientMedandApp.repository.AppointmentRepository;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public Appointment saveAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	
	 public List<Appointment> getAllAppointments() {
	        return appointmentRepository.findAll();
	    }

	    public Appointment getAppointmentById(String id) {
	        return appointmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));
	    }
	    public Appointment updateAppointment(String id, Appointment appointment) {
	        if (!appointmentRepository.existsById(id)) {
	            throw new ResourceNotFoundException("Appointment not found");
	        }
	        appointment.setId(id);
	        return appointmentRepository.save(appointment);
	    }

	    public void deleteAppointment(String id) {
	        Appointment appointment = getAppointmentById(id);
	        appointmentRepository.delete(appointment);
	    }
	

}
