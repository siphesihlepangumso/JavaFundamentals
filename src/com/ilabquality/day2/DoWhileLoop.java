package com.ilabquality.day2;

public class DoWhileLoop {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        do {
            sum += i;
            System.out.println("Loop: " + i + "\t, Sum: " + sum);
            i++;
        } while (i < 4);

    }//end main method
}//end class
