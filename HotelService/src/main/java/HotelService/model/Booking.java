package HotelService.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Builder;

@Document(collection = "bookingdb")
@Builder
public class Booking {
	@Id
	private BigInteger bookingId;
	private String bookingDate;
	private int noOfRooms;

	public BigInteger getBookingId() {
		return bookingId;
	}

	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNoOfPassengers() {
		return noOfRooms;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfRooms = noOfPassengers;
	}


}
