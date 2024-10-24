package com.tripillar.filehandling.text;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {


        try (FileReader fileReader = new FileReader("output.txt")) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Reading from file: ");
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
