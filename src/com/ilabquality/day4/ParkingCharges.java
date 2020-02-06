package com.ilabquality.day4;

import java.util.Scanner;

public class ParkingCharges {

	public static void main(String[] args) {

		//variable declaration
		int customers, hours;
		double total = 0.0;
		Scanner input = new Scanner(System.in);
		Calculations calc = new Calculations();

		//user input
		System.out.print("How many customers parked yesterday?: ");
		customers = input.nextInt();

		//customer input validation
		while (customers > 20 || customers < 1) {
			System.out.println("customers cannot exceed 20 or be less than 1. Try again...");
			System.out.print("How many customers parked yesterday?: ");
			customers = input.nextInt();
		}
		
		//Loop through customers
		for (int i = 1; i <= customers; i++) {

			System.out.print("Enter parking hours for customer " + i + ": ");
			hours = input.nextInt();
			
			if (hours <= 0 || hours > 24) {
				System.out.println("Invalid Entry, try again...");
				--i;
			} else {
				System.out.printf("Customer " + i + " parked for " + hours + " hour(s), parking fee = $%.2f", calc.charges(hours)).println();
				total = total + calc.charges(hours);
			}
		}
		System.out.printf("The total is $%.2f", total);

		input.close();
	}
}

//class with calculation method
class Calculations {

	public double charges(int hours) {

		double fees = 0.0;

		if (hours > 0 && hours < 4) {
			fees = 2.0;
		} else if(hours > 3 && hours < 24) {
			fees = 2 + (hours - 3) * 0.5;
		} else if (hours == 24) {
			fees = 10.00;
		}

		return fees;
	}

}