package BusServiceManag.BusService.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import BusServiceManag.BusService.model.Bus;

public interface BusService {
	public ResponseEntity<?> addBus(Bus bus);

	public Iterable<Bus> viewAllBus();

	public Bus viewBus(BigInteger busNumber);

	public Bus modifyBus(Bus bus);

	public String removeBus(BigInteger busNumber);

}

