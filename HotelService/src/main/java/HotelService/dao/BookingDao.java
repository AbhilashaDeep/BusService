package HotelService.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import HotelService.model.Booking;



public interface BookingDao extends MongoRepository<Booking, BigInteger> {

}
