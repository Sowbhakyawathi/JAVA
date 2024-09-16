package com.example.BusBooking.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BusBooking.model.Passenger;
import com.example.BusBooking.security.JwtUtil;
import com.example.BusBooking.service.PassengerService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
    private PassengerService passengerService;
	 @Autowired
	    private JwtUtil jwtUtil;

	
	 	 
	 @PostMapping("/register")
    public Passenger registerUser1(@RequestBody Passenger passenger) {
        return passengerService.registerUser(passenger);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Passenger passenger) {
        return passengerService.loginUser(passenger);
    }
    @GetMapping("/profile")
    public ResponseEntity<User> getProfile(HttpServletRequest request) {
        String token = request.getHeader("Authorization").substring(7); // Remove "Bearer " prefix
        String email = jwtUtil.extractUsername(token);
        User user = passengerService.findByEmail(email);
        return ResponseEntity.ok(user);
    }

}
