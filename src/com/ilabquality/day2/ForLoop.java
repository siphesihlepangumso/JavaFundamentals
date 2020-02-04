package com.ilabquality.day2;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 4; i++) {
            sum += i;
            System.out.println("Loop: " + i + "\t, Sum: " + sum);
        }
    }//end main method
}//end class
