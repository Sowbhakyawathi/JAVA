package com.example.BusBooking.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.BusBooking.model.Passenger;
import com.example.BusBooking.repository.PassengerRepository;

@Service
public class PassengerService {
	@Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Passenger registerUser(Passenger passenger) {
        passenger.setPassword(bCryptPasswordEncoder.encode(passenger.getPassword()));
        return passengerRepository.save(passenger);
    }

    public String loginUser(Passenger passenger) {
        Passenger existingPassenger = passengerRepository.findByEmail(passenger.getEmail());
        if (existingPassenger != null && bCryptPasswordEncoder.matches(passenger.getPassword(), existingPassenger.getPassword())) {
            return "Login successful";
        }
        return "Invalid credentials";
    }

	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
