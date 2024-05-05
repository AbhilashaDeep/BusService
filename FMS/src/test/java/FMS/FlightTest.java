package FMS;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import FMS.model.Flight;

public class FlightTest {

    private Flight flight;

    @Before
    public void setUp() {
        // Initialize a Flight object before each test method
        BigInteger flightNo = new BigInteger("1234567890");
        String origin = "Origin";
        String destination = "Destination";
        int seatCapacity = 200;
        flight = new Flight(flightNo, origin, destination, seatCapacity);
    }

    @Test
    public void testGetFlightNo() {
        assertEquals(new BigInteger("1234567890"), flight.getFlightNo());
    }

    @Test
    public void testGetOrigin() {
        assertEquals("Origin", flight.getOrigin());
    }

    @Test
    public void testGetDestination() {
        assertEquals("Destination", flight.getDestination());
    }

    @Test
    public void testGetSeatCapacity() {
        assertEquals(200, flight.getSeatCapacity());
    }

    @Test
    public void testEquals() {
        Flight sameFlight = new Flight(new BigInteger("1234567890"), "Origin", "Destination", 200);
        assertTrue(flight.equals(sameFlight));
    }
}