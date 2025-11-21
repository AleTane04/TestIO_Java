package org.bancoma;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a character:");

        // Reads a single byte from System.in
        int data = System.in.read();
        int available = System.in.available();

        // Print the character and its ASCII value
        System.out.println("You entered: " + (char) data);
        System.out.println("ASCII Value: " + data);
        System.out.println("Number of bytes that can be read without blocking: " + available);
    }
}