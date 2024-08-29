package com.example.employeedetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeedetails.dao.EmployeeRepository;
import com.example.employeedetails.dto.Employe;

@Service
public class EmployeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employe saveEmployee(Employe employe) {
        return employeeRepository.save(employe);
    }

    public List<Employe> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employe getEmployeeById(String employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

}
