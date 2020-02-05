package com.ilabquality.day2;

import java.util.Scanner;

/**
 *
 * @author <Siphesihle Pangumso>
 */
public class SalesCalculation {

    public static void main(String[] a) {

        //variable declaration
        int productID, quantity;
        double price = 0, totalPrice = 0;

        //user input - product number
        System.out.print("Whats the product number of the item you want? (HINT: Type '-999' to exit): ");
        productID = new Scanner(System.in).nextInt();

        //Program logic
        while (productID != -999) {

            //correct product number validation
            if (productID > 0 && productID < 6) {

                //user input - number of products
                System.out.print("How many items of product " + productID + " would you like?: ");
                quantity = new Scanner(System.in).nextInt();

                //validate quantity of items
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

                    //Calculate total price
                    totalPrice = totalPrice + price;

                } else {
                    System.out.println("Invalid number of items for product " + productID + ". Try again...");
                    continue;
                }

                //Display price of current item(s)
                System.out.printf("Price of product " + productID + " is R%.2f", price).println();

            } else {
                System.out.println("PRODUCT NUMBER UNKNOWN!");
            }

            //user input - product number (within loop)
            System.out.print("Whats the product number of the item you want? (HINT: Type '-999' to exit): ");
            productID = new Scanner(System.in).nextInt();
        }

        if (totalPrice != 0) {
            System.out.printf("Total retail price is R%.2f", totalPrice).println();
        }

        System.out.println("PROGRAM EXITING...");
    }
}
