package HotelService.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import HotelService.model.Hotel;



public interface HotelDao extends MongoRepository<Hotel,BigInteger>{

}


