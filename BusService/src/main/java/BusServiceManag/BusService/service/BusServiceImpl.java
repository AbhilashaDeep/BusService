package BusServiceManag.BusService.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import BusServiceManag.BusService.dao.BusDao;
import BusServiceManag.BusService.exceptions.RecordAlreadyPresentException;
import BusServiceManag.BusService.exceptions.RecordNotFoundException;
import BusServiceManag.BusService.model.Bus;

@Service
public class BusServiceImpl implements BusService {
	@Autowired
	BusDao busDao;

	/*
	 * add a bus
	 */
	@Override
	public ResponseEntity<Bus> addBus(Bus bus) {
		Optional<Bus> findById = busDao.findById(bus.getBusNo());
		try {
		if (!findById.isPresent()) {
			busDao.save(bus);
			return new ResponseEntity<Bus>(bus,HttpStatus.OK);
		} else
			throw new RecordAlreadyPresentException("Bus with number: " + bus.getBusNo() + " already present");
	}
		catch(RecordAlreadyPresentException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * view all buses
	 */
	@Override
	public Iterable<Bus> viewAllBus() {
		return busDao.findAll();
	}

	/*
	 * search a bus
	 */
	@Override
	public Bus viewBus(BigInteger busNumber) {
		Optional<Bus> findById = busDao.findById(busNumber);
		if (findById.isPresent()) {
			return findById.get();
		}
		else
			throw new RecordNotFoundException("Bus with number: " + busNumber + " not exists");
	    }
		/*catch(RecordNotFoundException e)
		{
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}*/

	/*
	 * modify a bus
	 */
	@Override
	public Bus modifyBus(Bus bus) {
		Optional<Bus> findById = busDao.findById(bus.getBusNo());
		if (findById.isPresent()) {
			busDao.save(bus);
		} else
			throw new RecordNotFoundException("Bus with number: " + bus.getBusNo() + " not exists");
		return bus;
	}

	/*
	 * remove a bus
	 */
	public String removeBus(BigInteger busNumber) {
		Optional<Bus> findById = busDao.findById(busNumber);
		if (findById.isPresent()) {
			busDao.deleteById(busNumber);
			return "Bus removed!!";
		} else
			throw new RecordNotFoundException("Bus with number: " + busNumber + " not exists");

	}
}