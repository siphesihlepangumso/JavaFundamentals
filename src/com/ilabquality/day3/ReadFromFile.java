package com.ilabquality.day3;

import java.io.*;

public class ReadFromFile {

    public static void main(String[] args) {

        //file to read from
        String fileName = "C:\\Users\\siphe\\Desktop\\file.txt";
        //line iteration
        String line = null;

        try {

            //FileReader to read text in the default encoding
            FileReader fileReader =  new FileReader(fileName);
            //Wrap file reader in buffered reader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            //close files
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
