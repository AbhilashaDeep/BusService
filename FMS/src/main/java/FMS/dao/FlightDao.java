package FMS.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;


import FMS.model.Flight;


public interface FlightDao extends MongoRepository<Flight,BigInteger>{

}