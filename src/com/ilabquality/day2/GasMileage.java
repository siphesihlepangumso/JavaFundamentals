package com.ilabquality.day2;

import java.util.Scanner;

/**
 *
 * @author <Siphesihle Pangumso>
 */
public class GasMileage {

    public static void main(String[] a) {

        //variable declaration
        int gallons = 0, miles = 0;
        float totalMGs = 0, MG = 0;
        char trip = 'Y';

        //Logic
        do {

            //user input - gallons
            if (gallons <= 0 ) {
                System.out.print("How many gallons did you use?: ");
                gallons = new Scanner(System.in).nextInt();
            }

            if (gallons > 0) {

                System.out.print("How many miles did you travel?: ");
                miles = new Scanner(System.in).nextInt();

                if (miles > 0) {
                    MG = miles/gallons;
                    totalMGs = totalMGs + MG;
                } else {
                    System.out.println("Invalid entry for miles. Try again...");
                    continue;
                }

                //Display output
                System.out.println("current miles per gallon: " + MG);

            } else {
                System.out.println("Invalid entry for gallons. Try again...");
                continue;
            }

            System.out.print("Do you want to add another trip? 'Y' = YES and 'any character' = No: ");
            trip = new Scanner(System.in).nextLine().charAt(0);

        } while (trip == 'Y' || trip == 'y');

        //Display output
        System.out.println("Total miles per gallon: " + totalMGs);
    }
}
