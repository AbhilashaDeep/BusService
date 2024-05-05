package BusServiceManag.BusService.controller;

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

import BusServiceManag.BusService.exceptions.RecordAlreadyPresentException;
import BusServiceManag.BusService.exceptions.RecordNotFoundException;
import BusServiceManag.BusService.model.Bus;
import BusServiceManag.BusService.service.BusService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired(required = true)
	BusService busService;

	@PostMapping("/addBus")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addBus(@RequestBody Bus bus) {
		busService.addBus(bus);
	}

	@GetMapping("/allBus")
	public Iterable<Bus> viewAllBus() {
		return busService.viewAllBus();
	}

	@GetMapping("/viewbus/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public Bus viewBus(@PathVariable("id") BigInteger busNo) {
		return busService.viewBus(busNo);
	}

	@PutMapping("/updateBus")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyBus(@RequestBody Bus bus) {
		busService.modifyBus(bus);
	}

	@DeleteMapping("/deleteBus/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void removeBus(@PathVariable("id") BigInteger BusNo) {
		busService.removeBus(BusNo);
	}
}