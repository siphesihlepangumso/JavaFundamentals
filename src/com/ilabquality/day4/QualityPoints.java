package com.ilabquality.day4;

import java.util.Scanner;

public class QualityPoints {
	
	public static void main(String[] args) {

		//variable declaration
		int number;
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Enter your average: ");
		number = input.nextInt();
		
		System.out.println("You have " + qualityPoints(number) + " points.");
		
		input.close();
	}
	
	public static int qualityPoints(int average) {
	
		if (average >= 90 && average <= 100) {
			return 4;
		} else if (average >= 80 && average <= 89) {
			return 3;
		} else if (average >= 70 && average <= 79) {
			return 2;
		} else if (average >= 60 && average <= 69) {
			return 1;
		} else {
			return 0;
		}
		
	}
}
