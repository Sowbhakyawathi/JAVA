package com.example.BusBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BusBooking.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
