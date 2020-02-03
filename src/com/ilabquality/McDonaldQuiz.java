package com.ilabquality;

import java.util.Scanner;

public class McDonaldQuiz {

    public static void main(String[] a) {

        //Declare variables
        String answer;

        //input from user
        System.out.print("Who was the first Ronald McDonald?: ");
        answer = new Scanner(System.in).nextLine();

        //Program logic
        if (answer.equalsIgnoreCase("Willard Scott")) {
            System.out.println("Correct");
        } else {
            System.out.println("Nice try");
        }
    }
}
