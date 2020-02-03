package com.ilabquality;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {

        //varaible declarations
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your test mark out of 100: ");
        int testMark = input.nextInt();

        //program logic
        if (testMark >= 50 && testMark < 101) {
            System.out.println("Pass");
        } else if (testMark <= 49 && testMark > -1) {
            System.out.println("Fail");
        } else {
            System.out.println("Fail");
        }
    }//end main method
}//end class
