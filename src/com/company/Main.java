package com.company;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date;
        // write your code here
        try {
            Passenger passenger= new Passenger();

            System.out.println("Please enter Passenger name ");
            passenger.setPassengerName(scanner.nextLine());

//            System.out.println("Please enter flight date MM/DD/YY");
//            passenger.setFlightDate(scanner.nextLine());
            LocalDate flightDate = LocalDate.now();

            System.out.println("Please enter ticket Number");
            passenger.setTicketNumber(scanner.nextInt());

            AirPlane plane = new AirPlane();

            System.out.println("Please enter flight Name");
            plane.setPlaneName(scanner.nextLine());

            System.out.println("Please enter flight company");
            plane.setFlightCompany(scanner.nextLine());

            System.out.println("Please enter flight number");
            plane.setFlightNumber(scanner.nextInt());

            Ticket ticket = new Ticket();

            System.out.println("Please enter ticketing agent name");
            ticket.setTicketAgent(scanner.nextLine());

            System.out.println("Please enter ticket price");
            ticket.setTicketPrice(scanner.nextInt());

            Fuel fuel = new Fuel();

            System.out.println("Please enter fuel Type");
            fuel.setFuelType(scanner.nextLine());

            System.out.println("Please enter the rate of fuel per gallon");
            fuel.setFuelPrice(scanner.nextFloat());

            System.out.println("Please enter the volume of fuel filled on the airplane");
            fuel.setFuelVolume(scanner.nextFloat());


            System.out.println("Passenger "+passenger.getPassengerName()+
                    " is travelling on the date " + flightDate
            +" with ticket number of "+ passenger.getTicketNumber()
            +" on the flight named "+plane.getPlaneName()
            + " of the company "+plane.getFlightCompany()
            +"."
            +" He got is ticket for $" + ticket.getTicketPrice()
            + " from "+ ticket.getTicketAgent()
            +".");
            System.out.println("The flight got fuel of volume "+fuel.getFuelVolume()
                    +" gallon"
                    + " at rate of $"+fuel.getFuelPrice()
            +".");





        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Error Occurred \n Input mis-match");
        }
    }
}
