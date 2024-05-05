package HotelService.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import HotelService.dao.HotelDao;
import HotelService.exceptions.RecordAlreadyPresentException;
import HotelService.exceptions.RecordNotFoundException;
import HotelService.model.Hotel;


@Service
public class HotelServiceImpl implements HotelService{

 
	@Autowired
	HotelDao hotelDao;

	/*
	 * add a hotel
	 */
	@Override
	public ResponseEntity<Hotel> addHotel(Hotel hotel) {
		Optional<Hotel> findById = hotelDao.findById(hotel.getHotelId());
		try {
		if (!findById.isPresent()) {
			hotelDao.save(hotel);
			return new ResponseEntity<Hotel>(hotel,HttpStatus.OK);
		} else
			throw new RecordAlreadyPresentException("Hotel with id: " + hotel.getHotelId() + " already present");
	}
		catch(RecordAlreadyPresentException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * view all flights
	 */
	@Override
	public Iterable<Hotel> viewAllHotel() {
		return hotelDao.findAll();
	}

	/*
	 * search a flight
	 */
	@Override
	public Hotel viewHotel(BigInteger hotelId) {
		Optional<Hotel> findById = hotelDao.findById(hotelId);
		if (findById.isPresent()) {
			return findById.get();
		}
		else
			throw new RecordNotFoundException("Hotel with id: " + hotelId + " not exists");
	    }
		/*catch(RecordNotFoundException e)
		{
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}*/

	/*
	 * modify a flight
	 */
	@Override
	public Hotel modifyHotel(Hotel hotel) {
		Optional<Hotel> findById = hotelDao.findById(hotel.getHotelId());
		if (findById.isPresent()) {
			hotelDao.save(hotel);
		} else
			throw new RecordNotFoundException("Hotel with Id: " + hotel.getHotelId() + " not exists");
		return hotel;
	}

	/*
	 * remove a flight
	 */
	public String removeHotel(BigInteger hotelId) {
		Optional<Hotel> findById = hotelDao.findById(hotelId);
		if (findById.isPresent()) {
			hotelDao.deleteById(hotelId);
			return "Hotel removed!!";
		} else
			throw new RecordNotFoundException("Hotel with id: " + hotelId + " not exists");

	}

}
