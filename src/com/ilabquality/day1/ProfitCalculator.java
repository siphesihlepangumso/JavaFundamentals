package com.ilabquality.day1;

import java.util.Scanner;

public class ProfitCalculator {

    public static void main(String[] a){
        //variable declaration
        Scanner input = new Scanner(System.in);
        double revenue = 0, cost = 0, profit = 0;

        //user input
        System.out.print("Enter revenue: ");
        revenue = input.nextDouble();
        System.out.print("Enter cost: ");
        cost = input.nextDouble();

        //profit calculation
        profit = revenue - cost;

        System.out.println("The profit is R" + profit);
    }
}