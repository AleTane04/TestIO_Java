package org.bancoma;

import java.io.*;

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


        /* ByteStream */

        FileInputStream myInputFile = null;
        FileOutputStream myOutputFile = null;
        try
        {
            myInputFile = new FileInputStream("input.txt");
            myOutputFile = new FileOutputStream("output.txt");

            int temp;
            while((temp = myInputFile.read()) != -1)
            {
                myOutputFile.write(temp);
            }

        }
            finally
        {
            if(myInputFile != null)
                myInputFile.close();
            if(myOutputFile != null)
                myOutputFile.close();
        }

    }
}