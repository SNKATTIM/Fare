package com.capgemini.hackothon.Fare.Service;

import java.util.List;
import java.util.Optional;

import com.capgemini.hackothon.Fare.entity.Fare;

public interface FareService {
	
	public Fare saveFare(Fare fare);
	public Fare UpdateFare(Fare fare);
	public List<Fare> getFares();
	public Optional<Fare> getFareId(long id);
	public Fare getByFlightNumberAndSeatClass(long flightNumber,String flightDate,String Seatclass);
	public String deleteById(long id);

	public Fare findByFlightNumberAndflightDate(long flightNumber, String flightDate);
	

}
