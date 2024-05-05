package HotelService.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import HotelService.model.Hotel;



public interface HotelService {
	public ResponseEntity<?> addHotel(Hotel hotel);

	public Iterable<Hotel> viewAllHotel();

	public Hotel viewHotel(BigInteger hotelId);

	public Hotel modifyHotel(Hotel hotel);

	public String removeHotel(BigInteger hotelId);

}