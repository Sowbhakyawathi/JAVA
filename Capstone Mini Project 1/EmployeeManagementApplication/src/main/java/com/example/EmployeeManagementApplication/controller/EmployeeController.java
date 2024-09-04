package com.example.EmployeeManagementApplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.example.EmployeeManagementApplication.model.Employee;
import com.example.EmployeeManagementApplication.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController  {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
  
	@PostMapping
	public Employee creatEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.creatEmployee(employee);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeByTd(@PathVariable Long id) {
		Employee employee = employeeService.getEmployeeByID(id);
		if (employee != null) {
			return ResponseEntity.ok(employee);
		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee) {
		Employee updatedEmployee = employeeService.updateEmployee(id, employee);
		if (updatedEmployee != null) {
			return ResponseEntity.ok(updatedEmployee);
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return ResponseEntity.noContent().build();
	}

}
