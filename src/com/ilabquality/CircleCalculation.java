package com.ilabquality;

import java.util.Scanner;

public class CircleCalculation {

    public static void main(String[] a){

        //variable declaration
        Scanner input = new Scanner(System.in);
        int radius = 0;
        float circumference = 0, area = 0, diameter = 0;
        final float pi = (float) 3.14159;

        //user input
        System.out.print("Enter radius of the circle: ");
        radius = input.nextInt();

        //calculations
        area = pi * (radius^2);
        circumference = 2 * pi * radius;
        diameter = 2 * radius;

        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
        System.out.println("The diameter of the circle is " + diameter);
    }
}
