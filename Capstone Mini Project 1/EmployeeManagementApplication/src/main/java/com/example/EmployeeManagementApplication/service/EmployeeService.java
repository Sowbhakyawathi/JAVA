package com.example.EmployeeManagementApplication.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagementApplication.model.Employee;
import com.example.EmployeeManagementApplication.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	public Employee getEmployeeByID(Long id) {
		Optional<Employee> employeeOptional = employeeRepository.findById(id);
	    return employeeOptional.orElseThrow(() -> new EntityNotFoundException("Employee not found with id " + id));
	}
	public Employee creatEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	public Employee updateEmployee(Long id, Employee employee) {
		employee.setId(id);
		return employeeRepository.save(employee);
	}
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
    
}
