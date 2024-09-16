package com.example.BusBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BusBooking.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
	Passenger findByEmail(String email);

}
