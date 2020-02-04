package com.ilabquality.day2;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] a) {

        //Declare variables
        int gallons, miles;
        float totalMiles = 0;
        char trip;

        //Logic
        do {
            //user input
            System.out.print("How many gallons did you use?: ");
            gallons = new Scanner(System.in).nextInt();
            System.out.print("How many miles did you travel?: ");
            miles = new Scanner(System.in).nextInt();

            if (gallons > 0 && miles > 0) {
                totalMiles = (float) totalMiles + (miles / gallons);
            } else {
                System.out.println("Invalid Entry");
            }

            System.out.print("Do you want to add another trip? 'Y' = YES and 'N' = No: ");
            trip = new Scanner(System.in).nextLine().charAt(0);

        } while (trip == 'Y' || trip == 'y');

        //Display output
        System.out.println("Total miles per gallon are " + totalMiles + " mp/g");
    }
}
