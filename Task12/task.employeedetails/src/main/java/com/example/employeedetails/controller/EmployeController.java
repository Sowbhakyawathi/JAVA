package com.example.employeedetails.controller;

 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.employeedetails.dto.Employe;
import com.example.employeedetails.service.EmployeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeController {

    @Autowired
    private EmployeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employe> addEmployee(@RequestBody Employe employee) {
        Employe savedEmployee = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(savedEmployee);
    }

    @GetMapping("/displayAll")
    public ResponseEntity<List<Employe>> displayAllEmployees() {
        List<Employe> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/display/{employeeId}")
    public ResponseEntity<Employe> displayEmployeeById(@PathVariable String employeeId) {
        Employe employee = employeeService.getEmployeeById(employeeId);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}