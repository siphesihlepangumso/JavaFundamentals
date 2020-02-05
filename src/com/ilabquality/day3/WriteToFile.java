package com.ilabquality.day3;

import java.io.PrintWriter;

public class WriteToFile {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\siphe\\Desktop\\file.txt";

        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println("Text written by a java program");
            writer.println("______________________________");
            System.out.println("text created");
            writer.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
