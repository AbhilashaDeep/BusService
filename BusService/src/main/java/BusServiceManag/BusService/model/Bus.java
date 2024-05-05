package BusServiceManag.BusService.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;

@Document(collection = "busdb")
@Builder
public class Bus {

	@Id
	private BigInteger busNo;
	private String origin;
	private String destination;
	private int seatCapacity;

	/*
	  @OneToOne(mappedBy = "flightObj", cascade = CascadeType.ALL) private
	  ScheduledFlight sfObj;
	 */

	public Bus() {
	}

	/*
	  @param busNo
	  @param origin
	  @param destination
	  @param seatCapacity
	 */
	
	public BigInteger getBusNo() {
		return busNo;
	}

	public void setBusNo(BigInteger busNo) {
		this.busNo = busNo;
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

	public Bus(BigInteger busNo, String origin, String destination, int seatCapacity) {
		super();
		this.busNo = busNo;
		this.origin = origin;
		this.destination = destination;
		this.seatCapacity = seatCapacity;
	}

	

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((busNo == null) ? 0 : busNo.hashCode());
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
		Bus other = (Bus) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (busNo == null) {
			if (other.busNo != null)
				return false;
		} else if (!busNo.equals(other.busNo))
			return false;
		if (seatCapacity != other.seatCapacity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", origin=" + origin + ", destination=" + destination + ", seatCapacity="
				+ seatCapacity + "]";
	}

	

}