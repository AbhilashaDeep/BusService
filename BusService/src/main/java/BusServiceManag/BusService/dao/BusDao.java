package BusServiceManag.BusService.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import BusServiceManag.BusService.model.Bus;

public interface BusDao extends MongoRepository<Bus,BigInteger>{

}