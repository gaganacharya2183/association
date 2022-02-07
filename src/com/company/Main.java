package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        try {
            AirPlane plane = new AirPlane();
            System.out.println("Please enter flight Name");
            plane.setPlaneName(scanner.next());
            System.out.println("Please enter flight company");
            plane.setFlightCompany(scanner.next());
            System.out.println("Please enter flight number");
            plane.setFlightNumber(scanner.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Error Occurred \n Input mis-match");
        }
    }
}
