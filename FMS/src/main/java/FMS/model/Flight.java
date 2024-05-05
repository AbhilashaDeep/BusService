package FMS.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Builder;


@Document(collection = "flightdb")
@Builder
public class Flight {

	@Id
	private BigInteger flightNo;
	private String origin;
	private String destination;
	private int seatCapacity;

	/*
	  @OneToOne(mappedBy = "flightObj", cascade = CascadeType.ALL) private
	  ScheduledFlight sfObj;
	 */

	public Flight() {
	}

	/*
	  @param flightNo
	  @param origin
	  @param destination
	  @param seatCapacity
	 */
	public Flight(BigInteger flightNo, String origin, String destination, int seatCapacity) {
		super();
		this.flightNo = flightNo;
		this.origin = origin;
		this.destination = destination;
		this.seatCapacity = seatCapacity;
	}

	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNo == null) ? 0 : flightNo.hashCode());
		result = prime * result + seatCapacity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNo == null) {
			if (other.flightNo != null)
				return false;
		} else if (!flightNo.equals(other.flightNo))
			return false;
		if (seatCapacity != other.seatCapacity)
			return false;
		return true;
	}

	public BigInteger getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(BigInteger flightNo) {
		this.flightNo = flightNo;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", origin=" + origin + ", destination=" + destination
				+ ", seatCapacity=" + seatCapacity + "]";
	}

	

}