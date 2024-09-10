package com.example.PatientMedandApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PatientMedandApp.exception.ResourceNotFoundException;
import com.example.PatientMedandApp.model.Doctor;
import com.example.PatientMedandApp.repository.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
    public Doctor getDoctorById(String id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
    }
    public Doctor updateDoctor(String id, Doctor doctor) {
        if (!doctorRepository.existsById(id)) {
            throw new ResourceNotFoundException("Doctor not found");
        }
        doctor.setId(id);
        return doctorRepository.save(doctor);
    }
    public void deleteDoctor(String id) {
        doctorRepository.deleteById(id);
    }

}
