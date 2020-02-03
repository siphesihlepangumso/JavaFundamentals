package com.ilabquality;

import java.util.Scanner;

public class CostOfCopies {

    public static void main(String[] a) {

        //Declare variables
        int requestedCopies = 0;
        float cost = 0;

        //input from user
        System.out.print("How many copies do you want?: ");
        requestedCopies = new Scanner(System.in).nextInt();

        //Program logic
        if (requestedCopies >= 1 && requestedCopies < 101) {
            cost = requestedCopies * 0.05f;
        } else if (requestedCopies > 100) {
            cost = (float) (0.03 * (requestedCopies - 100)) + 5;
        }

        //Display output
        if (requestedCopies <= 0)
            System.out.println("Invalid Entry!");
        else
            System.out.printf("Total cost is R%.2f", cost);
    }
}
