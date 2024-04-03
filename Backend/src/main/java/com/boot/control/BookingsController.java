package com.boot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.BookingsRepository;
import com.boot.entity.Bookings;

@RestController
@CrossOrigin("http://localhost:4200")
public class BookingsController {
	
	@Autowired
	BookingsRepository bookingsRepo;
	
	//Add Booking
	@PostMapping("/addbooking")
	public void addBooking(@RequestBody Bookings booking) {
		bookingsRepo.save(booking);
	}
	
	//GetDetails
	@GetMapping("/getBookingbyId/{bookingId}")
	public Bookings getBookingbybookingId(@PathVariable int bookingId) {
		return bookingsRepo.getReferenceById(bookingId);
	}
	
	@GetMapping("/getBookingbyuserId/{userId}")
	public List<Bookings> getBookingbyuserId(@PathVariable int userId) {
		return bookingsRepo.getBookingsbyUserId(userId);
	}
	
	@GetMapping("/getBookingbyBusId/{busId}")
	public List<Bookings> getBookingsbyBusId(@PathVariable int busId){
		return bookingsRepo.getBookingsbyBusId(busId);
	}
	
	//Update bookings
	
	
	//Delete Booking
	@DeleteMapping("deletebookingbyID/{bookingId}")
	public void deleteBooking(@PathVariable int bookingId) {
		bookingsRepo.deleteById(bookingId);
	}
	
}
