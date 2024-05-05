package FMS.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;


import FMS.model.Booking;


public interface BookingDao extends MongoRepository<Booking, BigInteger> {

}