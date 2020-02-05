package com.ilabquality.day2;

import java.util.Scanner;

/**
 *
 * @author <Siphesihle Pangumso>
 */
public class GasMileage {

    public static void main(String[] a) {

        //variable declaration
        int gallons, miles;
        float totalMiles = 0;
        char trip = 'Y';

        //Logic
        do {

            //user input - gallons
            System.out.print("How many gallons did you use?: ");
            gallons = new Scanner(System.in).nextInt();

            if (gallons > 0) {

                System.out.print("How many miles did you travel?: ");
                miles = new Scanner(System.in).nextInt();

                if (miles > 0) {

                } else {
                    System.out.println("Invalid entry for miles. Try again...");
                }

                totalMiles = totalMiles + (miles / gallons);

            } else {
                System.out.println("Invalid entry for gallons. Try again...");
                continue;
            }

            System.out.print("Do you want to add another trip? 'Y' = YES and 'N' = No: ");
            trip = new Scanner(System.in).nextLine().charAt(0);

        } while (trip == 'Y' || trip == 'y');

        //Display output
        System.out.println("Total miles per gallon are " + totalMiles + " mp/g");
    }
}
