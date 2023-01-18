package com.capgemini.hackothon.Fare.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.hackothon.Fare.Service.FareServiceImpl;
import com.capgemini.hackothon.Fare.entity.Fare;

@RestController
@RequestMapping("/api/fare")
public class FareController {
	
	@Autowired
	public FareServiceImpl fareImpl;
	
	@PostMapping("/addfare")
    public Fare addFare(@RequestBody Fare fare){
    	return fareImpl.saveFare(fare);
    }
	@GetMapping("/getall")
	public List<Fare> findAllfares(){
		return fareImpl.getFares();
	}
	
	@GetMapping("/getfare/{flightNumber}/{flightDate}")
	public ResponseEntity<?> findByflightNumberAndflightDate(@PathVariable long flightNumber,@PathVariable String flightDate)
	{
		return new ResponseEntity<>(fareImpl.findByFlightNumberAndflightDate(flightNumber, flightDate),HttpStatus.OK);
	}
	

	
}
