package com.ilabquality.day4;

import java.util.Scanner;

public class CircleArea {
	
	private static final double pi = 3.14159;

	public static void main(String[] args) {

		//variable declaration
		double radius = 0;
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextDouble();
		
		System.out.println("The area of the circle is  " + circleArea(radius));
		
		
		input.close();
	}
	
	public static double circleArea(double radius) {
		return pi * radius * radius;
	}
}
