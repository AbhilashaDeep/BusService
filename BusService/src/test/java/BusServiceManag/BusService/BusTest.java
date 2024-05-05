package BusServiceManag.BusService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import BusServiceManag.BusService.model.Bus;

public class BusTest {

    private Bus bus;

    @Before
    public void setUp() {
        // Initialize a Bus object before each test method
        BigInteger busNo = new BigInteger("9876543210");
        String origin = "Origin";
        String destination = "Destination";
        int seatCapacity = 50;
        bus = new Bus(busNo, origin, destination, seatCapacity);
    }

    @Test
    public void testGetBusNo() {
        assertEquals(new BigInteger("9876543210"), bus.getBusNo());
    }

    @Test
    public void testGetOrigin() {
        assertEquals("Origin", bus.getOrigin());
    }

    @Test
    public void testGetDestination() {
        assertEquals("Destination", bus.getDestination());
    }

    @Test
    public void testGetSeatCapacity() {
        assertEquals(50, bus.getSeatCapacity());
    }

    @Test
    public void testEquals() {
        Bus sameBus = new Bus(new BigInteger("9876543210"), "Origin", "Destination", 50);
        assertTrue(bus.equals(sameBus));
    }
}
