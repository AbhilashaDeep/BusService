package HotelService.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HotelService.exceptions.RecordAlreadyPresentException;
import HotelService.exceptions.RecordNotFoundException;
import HotelService.model.Hotel;
import HotelService.service.HotelService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/hotel")
public class HotelController {
	
		@Autowired(required = true)
		HotelService hotelService;

		@PostMapping("/addHotel")
		@ExceptionHandler(RecordAlreadyPresentException.class)
		public void addHotel(@RequestBody Hotel hotel) {
			hotelService.addHotel(hotel);
		}

		@GetMapping("/allHotel")
		public Iterable<Hotel> viewAllHotel() {
			return hotelService.viewAllHotel();
		}

		@GetMapping("/viewHotel/{id}")
		@ExceptionHandler(RecordNotFoundException.class)
		public Hotel viewHotel(@PathVariable("id") BigInteger hotelId) {
			return hotelService.viewHotel(hotelId);
		}

		@PutMapping("/updateHotel")
		@ExceptionHandler(RecordNotFoundException.class)
		public void modifyHotel(@RequestBody Hotel hotel) {
			hotelService.modifyHotel(hotel);
		}

		@DeleteMapping("/delete/{id}")
		@ExceptionHandler(RecordNotFoundException.class)
		public void removeHotel(@PathVariable("id") BigInteger hotelId) {
			hotelService.removeHotel(hotelId);
		}
	}

