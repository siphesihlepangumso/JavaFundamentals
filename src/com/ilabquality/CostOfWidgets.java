package com.ilabquality;

import java.util.Scanner;

public class CostOfWidgets {

    public static void main(String[] a) {

        //Declare variables
        int orderedWidgets = 0;
        float cost = 0;

        //input from user
        System.out.print("How many widgets do you want?: ");
        orderedWidgets = new Scanner(System.in).nextInt();

        //Program logic
        if (orderedWidgets >= 1 && orderedWidgets < 100) {
            cost = orderedWidgets * 0.25f;
        } else if (orderedWidgets >= 100) {
            cost = orderedWidgets * 0.2f;
        }

        //Display output
        if (orderedWidgets <= 0)
            System.out.println("Invalid Entry!");
        else
            System.out.printf("Total cost is R%.2f", cost);
    }
}
