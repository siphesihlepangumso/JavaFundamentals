package com.ilabquality.day2;

import java.util.Scanner;

public class SalesCalculation {

    public static void main(String[] a) {

        //Declare variables
        int productID, quantity;
        double price = 0, totalPrice = 0;

        //input from user
        System.out.print("Whats the product number of the item you want? (HINT: Type '-999' to exit): ");
        productID = new Scanner(System.in).nextInt();

        while (productID != -999) {

            if (productID > 0 && productID < 6) {
                //input from user
                System.out.print("How many items of product " + productID + " would you like?: ");
                quantity = new Scanner(System.in).nextInt();

                if (quantity > 0) {
                    switch (productID) {
                        case 1:
                            price = 2.98 * quantity;
                            break;
                        case 2:
                            price = 4.50 * quantity;
                            break;
                        case 3:
                            price = 9.98 * quantity;
                            break;
                        case 4:
                            price = 4.49 * quantity;
                            break;
                        case 5:
                            price = 6.87 * quantity;
                            break;
                    }

                    //sum up if product ID is known
                    totalPrice = totalPrice + price;

                } else {
                    System.out.println("Please enter a valid number of items for product " + productID);
                    continue;
                }

                //Display output
                System.out.printf("Total retail price is R%.2f", totalPrice).println();

            } else {
                System.out.println("PRODUCT NUMBER UNKNOWN!");
            }

            System.out.print("Whats the product number of the item you want? (HINT: Type '-999' to exit): ");
            productID = new Scanner(System.in).nextInt();
        }
        System.out.println("PROGRAM EXITING...");
    }
}
