package com.capgemini.hackothon.Fare.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.hackothon.Fare.entity.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare,Long> {

	Fare findByFlightNumberAndFlightDateAndSeatClass(long flightNumber, String flightDate, String seatclass);
	Fare findByFlightNumberAndFlightDate(long flightNumber, String flightDate);
	
	

	

}
