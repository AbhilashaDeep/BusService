package BusServiceManag.BusService.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import BusServiceManag.BusService.model.Booking;

public interface BookingDao extends MongoRepository<Booking, BigInteger> {

}
