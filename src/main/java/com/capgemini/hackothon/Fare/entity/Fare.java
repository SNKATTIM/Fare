package com.capgemini.hackothon.Fare.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fare {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long Id;
    private long flightNumber;
    private String origin;
    private String Destination;
    private String seatClass;
    private long flightFare; 
    private String flightDate;
    
    
	public Fare() {
		super();
	}


	public Fare(long flightId, long flightNumber, String origin, String destination, String seatClass, long flightFare,
			String flightDate) {
		super();
		this.Id = flightId;
		this.flightNumber = flightNumber;
		this.origin = origin;
		Destination = destination;
		this.seatClass = seatClass;
		this.flightFare = flightFare;
		this.flightDate = flightDate;
	}


	public long getFlightId() {
		return Id;
	}


	public void setFlightId(long flightId) {
		this.Id = flightId;
	}


	public long getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}


	public String getSeatClass() {
		return seatClass;
	}


	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}


	public long getFlightFare() {
		return flightFare;
	}


	public void setFlightFare(long flightFare) {
		this.flightFare = flightFare;
	}


	public String getFlightDate() {
		return flightDate;
	}


	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}


	@Override
	public String toString() {
		return "Fare [flightId=" + Id + ", flightNumber=" + flightNumber + ", origin=" + origin + ", Destination="
				+ Destination + ", seatClass=" + seatClass + ", flightFare=" + flightFare + ", flightDate=" + flightDate
				+ "]";
	}
	
	
	
    
    
	
	
}
