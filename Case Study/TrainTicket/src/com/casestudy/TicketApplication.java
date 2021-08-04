package com.casestudy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.*;

public class TicketApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		
		
		Scanner sc = new Scanner(System.in);
		TrainDAO trainDAO = new TrainDAO();
		while(true) {
			System.out.println("Menu:\n1) Book the ticket:\n2) Enquiry:\n3) No. of tickets booked on a day\n4) Print all the tickets:\n5) Exit");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				System.out.println("Enter the train number:");
				int trainNo = Integer.parseInt(sc.nextLine());
				Train train = trainDAO.findTrain(trainNo);
				if(train == null) {
					return;
				}
				
				System.out.println("Enter travel date:");
				String[] arr = sc.nextLine().split("/");
				LocalDate travelDate = LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
				System.out.println("Enter Number of Passengers:");
				Ticket ticket = new Ticket(travelDate,train);
				int n = Integer.parseInt(sc.nextLine());
				
				
				while(n-- > 0) {
					System.out.println("Enter Passenger Name:");
					String name = sc.nextLine();
					System.out.println("Enter Age:");
					int age = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Gender(M/F):");
					char gender = sc.nextLine().charAt(0);
					ticket.addPassenger(name,age,gender);
				}
				ticket.writeTicket();
				System.out.println("Ticket booked with PNR: " + ticket.getPnr());
				break;
			case 2:
				System.out.println("Enter the train number:");
				trainNo = Integer.parseInt(sc.nextLine());
				train = trainDAO.findTrain(trainNo);
				if(train != null) {
					System.out.println("This train is available");
				}
				break;
			case 3:
				System.out.println("Enter travel date:");
				arr = sc.nextLine().split("/");
				travelDate = LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
				int count = Ticket.countTickets(travelDate);
				System.out.println(count);
				break;
			case 4:
				System.out.println("Enter travel date:");
				arr = sc.nextLine().split("/");
				travelDate = LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
				Ticket.printTickets(travelDate);
				break;
			case 5:
				System.exit(0);
			}
			
		}
		
		
		

	}

}
