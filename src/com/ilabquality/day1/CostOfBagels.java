package com.ilabquality.day1;

import java.util.Scanner;

public class CostOfBagels {

    public static void main(String[] a) {

        //Declare variables
        int numberOfBagels = 0;
        float cost = 0;

        //input from user
        System.out.print("How many bagels do you want?: ");
        numberOfBagels = new Scanner(System.in).nextInt();

        //Program logic
        if (numberOfBagels >= 1 && numberOfBagels < 6) {
            cost = numberOfBagels * 0.75f;
        }

        if (numberOfBagels >= 6) {
            cost = numberOfBagels * 0.60f;
        }

        //Display output
        if (numberOfBagels <= 0)
            System.out.println("Invalid Entry!");
        else
            System.out.printf("Total cost is R%.2f", cost);
    }
}
