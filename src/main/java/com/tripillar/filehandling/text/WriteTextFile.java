package com.tripillar.filehandling.text;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to write to: ");
        String content= scanner.nextLine();
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write(content);
            System.out.println("Writing successful");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
