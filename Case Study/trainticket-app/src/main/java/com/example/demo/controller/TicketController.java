package com.example.demo.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;
import com.example.demo.repository.TrainRepository;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	TrainRepository trainRepository;
	
	@PostMapping("/book")
	public void bookTicket(@RequestParam int trainNo, @RequestParam String str, @RequestBody List<Passenger> passengers) throws IOException {
		
		Optional<Train> train = trainRepository.findById(trainNo);
		if(enquiry(trainNo) == "Train is available") {
			String[] arr = str.split("/");
			LocalDate travelDate = LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
			Ticket ticket = new Ticket(travelDate,train.get());
			for(Passenger passenger : passengers) {
				ticket.addPassenger(passenger.getName(),passenger.getAge(),passenger.getGender());
			}
			ticket.writeTicket();
			System.out.println("Ticket booked with PNR: " + ticket.getPnr());
		}
		
		
	}
	
	@RequestMapping("/enquiry")
	public String enquiry(@RequestParam int trainNo) {
		Optional<Train> train = trainRepository.findById(trainNo);
		try {
			if(train.isPresent() == false) {
				throw new NoSuchTrainException();
			}
		}catch(NoSuchTrainException e) {
			return(e.getMessage());
		}
		return "Train is available";
		
	}
	
	@RequestMapping("/numberoftickets")
	public int numberOfTickets(@RequestParam String str) {
		String[] arr = str.split("/");
		LocalDate travelDate = LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
		int count = Ticket.countTickets(travelDate);
		return count;
	}
		
	
	@RequestMapping("/print")
	public String printTickets(@RequestParam String str) throws IOException {
		String[] arr = str.split("/");
		LocalDate travelDate = LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
		return Ticket.printTickets(travelDate);
	}
	
	
	
	
	
}
