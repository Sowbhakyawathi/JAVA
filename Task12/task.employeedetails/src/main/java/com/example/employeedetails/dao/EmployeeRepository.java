package com.example.employeedetails.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employeedetails.dto.Employe;

@Repository
public interface EmployeeRepository extends  MongoRepository<Employe, String> {
	Employe findByEmployeeId(String employeeId);
}
