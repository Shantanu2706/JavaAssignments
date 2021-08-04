package com.example.demo.model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class Ticket {
	private int counter;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	private TreeMap<Passenger,Integer> passengers = new TreeMap<>();
	
	public Ticket(LocalDate travelDate, Train train) {
		if(travelDate.isBefore(LocalDate.now())) {
			System.out.println("Travel Date is before current date");
			return;
		}
		this.travelDate = travelDate;
		this.train = train;
	}
	
	public String generatePNR() throws IOException {
		StringBuilder sb = new StringBuilder("");
		File file = new File("counter.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int data = 0;
		while((data = bis.read()) != -1) {
			sb.append((char)data);
		}
		bis.close();
		counter = Integer.parseInt(sb.toString());
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formatDateTime = this.travelDate.format(format1);
		this.pnr = String.valueOf(this.getTrain().getSource().charAt(0)) + String.valueOf(this.getTrain().getDestination().charAt(0)) + "_" + formatDateTime + "_" + counter;
		counter++;
		String str = String.valueOf(counter);
		String fileName = "counter.txt";
		FileOutputStream fos = new FileOutputStream(fileName);
		PrintWriter pr = new PrintWriter(fos);
		pr.write(str);
		pr.close();
		return this.pnr;
	}
	
	public double calcPassengerFare(Passenger passenger) {
		double fare = this.getTrain().getTicketPrice();
		if(passenger.getAge() <= 12) {
			fare = fare/2;
		}else if(passenger.getAge() >= 60) {
			fare = (fare*3)/5;
		}else {
			if(passenger.getGender() == 'F') {
				fare = (fare*3)/4;
			}
		}
		return fare;
	}
	
	public void addPassenger(String name, int age, char gender) {
		Passenger passenger = new Passenger(name, age, gender);
		double fare = calcPassengerFare(passenger);
		this.passengers.put(passenger, (int)fare);
		
	}
	
	public double calculateTotalTicketPrice() {
		double total = 0;
		for(Passenger passenger : this.passengers.keySet()) {
			total += this.passengers.get(passenger);
		}
		return total;
	}
	
	public StringBuilder generateTicket() throws IOException {
		StringBuilder sb = new StringBuilder("");
		int L = 15;
		sb.append(String.format("%" + (-L) +"s","PNR") + ": " + this.generatePNR() + "\n");
		sb.append(String.format("%" + (-L) +"s","Train No") + ": " + this.train.getTrainNo() + "\n");
		sb.append(String.format("%" + (-L) +"s","Train Name") + ": " + this.train.getTrainName() + "\n");
		sb.append(String.format("%" + (-L) +"s","From") + ": " + this.train.getSource() + "\n");
		sb.append(String.format("%" + (-L) +"s","To") + ": " + this.train.getDestination() + "\n");
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatDateTime = this.travelDate.format(format1);
		sb.append(String.format("%" + (-L) +"s","Travel Date") + ": " + formatDateTime + "\n\n");
		DecimalFormat df = new DecimalFormat("0,000.00");
		sb.append("Passengers" + "\n");
		L = 20;
		sb.append(String.format("%" + (-L) +"s","Name") + String.format("%" + (-L) +"s","Age") + String.format("%" + (-L) +"s","Gender") + String.format("%" + (-L) +"s","Fare") + "\n");
		for(Passenger passenger : this.passengers.keySet()) {
			sb.append(String.format("%" + (-L) +"s",passenger.getName()) + String.format("%" + (-L) +"s",passenger.getAge()) + String.format("%" + (-L) +"s",passenger.getGender()) + String.format("%s", df.format(this.passengers.get(passenger)) + "\n"));
		}
		df = new DecimalFormat("00,000.00");
		sb.append("Total Price: " + df.format(this.calculateTotalTicketPrice())); 
		return sb;
	}
	
	public void writeTicket() throws IOException {
		String str = this.generateTicket().toString();
		String fileName = this.pnr + ".txt";
		FileOutputStream fos = new FileOutputStream(fileName);
		PrintWriter pr = new PrintWriter(fos);
		pr.write(str);
		pr.close();
	}
	
	public static int countTickets(LocalDate date) {
		int count = 0;
		File folder = new File("D:\\BJ_SpringSpace\\trainticket-app");
		File[] folderList = folder.listFiles();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formatDateTime = date.format(format1);
		String str = ".*" + formatDateTime + ".*";
		Pattern fileName = Pattern.compile(str);	
		for(int i=0 ; i<folderList.length ; i++) {
			if(folderList[i].isFile()) {
				if(fileName.matcher(folderList[i].getName()).matches()) {
					count++;
				}
				
			}
		}
		return count;
	}
	
	public static String printTickets(LocalDate date) throws IOException {
		File folder = new File("D:\\BJ_SpringSpace\\trainticket-app");
		File[] folderList = folder.listFiles();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formatDateTime = date.format(format1);
		String str = ".*" + formatDateTime + ".*";
		Pattern fileName = Pattern.compile(str);	
		StringBuilder sb = new StringBuilder("");
		for(int i=0 ; i<folderList.length ; i++) {
			if(folderList[i].isFile()) {
				if(fileName.matcher(folderList[i].getName()).matches()) {
					FileInputStream fis = new FileInputStream(folderList[i]);
					BufferedInputStream bis = new BufferedInputStream(fis);
					int data = 0;
					while((data = bis.read()) != -1) {
						sb.append((char)data);
					}
					bis.close();
					sb.append("\n---------------------------------\n\n");
				}
				
			}
			
		}
		return sb.toString();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TreeMap<Passenger, Integer> getPassengers() {
		return passengers;
	}

	public void setPassengers(TreeMap<Passenger, Integer> passengers) {
		this.passengers = passengers;
	}


}
