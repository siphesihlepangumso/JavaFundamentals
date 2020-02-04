package com.ilabquality.day2;

public class WhileLoop {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i < 4) {
            sum += i;
            System.out.println("Loop: " + i + "\t, Sum: " + sum);
            i++;
        }
    }//end main method
}//end class
