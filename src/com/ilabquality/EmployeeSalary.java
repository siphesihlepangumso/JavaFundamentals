package com.ilabquality;

import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {

        //variable declaration
        Scanner input = new Scanner(System.in);
        double hours = 0, payRate = 0, salary = 0;

        //user input
        System.out.print("Entered worked hours: ");
        hours = input.nextDouble();
        System.out.print("Entered rate of pay: ");
        payRate = input.nextDouble();

        //salary calculation
        salary = hours * payRate;

        System.out.printf("The employee's salary is R%.2f", salary);

    }
}
