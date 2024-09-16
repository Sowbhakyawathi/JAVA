package com.example.BusBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BusBooking.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

}
