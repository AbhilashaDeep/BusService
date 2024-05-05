package BusServiceManag.BusService.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import BusServiceManag.BusService.model.Booking;

public interface BookingService {

	public ResponseEntity<?> createBooking(Booking newBooking);

	public Booking updateBooking(Booking newBooking);

	public String deleteBooking(BigInteger bookingId);

	public Iterable<Booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(BigInteger bookingId);
}