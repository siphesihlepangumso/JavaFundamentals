package com.ilabquality.day4;

import java.util.Scanner;

public class EvenVsOdd {
	
	public static void main(String[] args) {

		//variable declaration
		int number;
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Enter a natural number: ");
		number = input.nextInt();
		
		System.out.println("The entered value is " + isEven(number));
		
		input.close();
	}
	
	public static String isEven(int value) {
		return value % 2 == 0 ? "even" : "Odd";
	}
}
