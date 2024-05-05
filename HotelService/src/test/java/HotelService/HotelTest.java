package HotelService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import HotelService.model.Hotel;

public class HotelTest {

    private Hotel hotel;

    @Before
    public void setUp() {
        // Initialize a Hotel object before each test method
        BigInteger hotelId = new BigInteger("1234567890");
        String hotelName = "Test Hotel";
        String location = "Test Location";
        int availableRooms = 100;
        hotel = new Hotel(hotelId, hotelName, location, availableRooms);
    }

    @Test
    public void testGetHotelId() {
        assertEquals(new BigInteger("1234567890"), hotel.getHotelId());
    }

    @Test
    public void testGetHotelName() {
        assertEquals("Test Hotel", hotel.getHotelName());
    }

    @Test
    public void testGetLocation() {
        assertEquals("Test Location", hotel.getLocation());
    }

    @Test
    public void testGetAvailableRooms() {
        assertEquals(100, hotel.getAvailableRooms());
    }

    @Test
    public void testEquals() {
        Hotel sameHotel = new Hotel(new BigInteger("1234567890"), "Test Hotel", "Test Location", 100);
        assertTrue(hotel.equals(sameHotel));
    }
}