package com.capgemini.hackothon.Fare.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.hackothon.Fare.Repository.FareRepository;
import com.capgemini.hackothon.Fare.entity.Fare;

@Service
public class FareServiceImpl implements FareService{

	@Autowired
	private FareRepository fareRepository;

	@Override
	public Fare saveFare(Fare fare) {
		// TODO Auto-generated method stub
		return fareRepository.save(fare);
	}

	@Override
	public Fare UpdateFare(Fare fare) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fare> getFares() {
		// TODO Auto-generated method stub
		return fareRepository.findAll();
	}

	@Override
	public Optional<Fare> getFareId(long id) {
		Optional<Fare> fare = fareRepository.findById(id);
		return fare ;
	}

	@Override
	public Fare getByFlightNumberAndSeatClass(long flightNumber,String flightDate ,String Seatclass) {
		
		return fareRepository.findByFlightNumberAndFlightDateAndSeatClass(flightNumber, flightDate, Seatclass);
	}

	@Override
	public String deleteById(long id) {
		fareRepository.deleteById(id);
		return "Deleted" ;
	}


	@Override
	public Fare findByFlightNumberAndflightDate(long flightNumber, String flightDate) {
		
		Fare fare=fareRepository.findByFlightNumberAndFlightDate(flightNumber, flightDate);
		long flightfare=fare.getFlightFare();
		return fare;
	}
	
	
}
