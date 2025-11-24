package org.bancoma;

import java.io.*;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
       /* Stream di Byte */ /*
        int data;
        System.out.println("Inserisci un carattere: ");
        data = System.in.read();
        System.out.println("Hai inserito il carattere: " + (char)data);
        System.out.println("Il codice ASCII è: " + data);


        FileInputStream sourceImg = null;
        FileOutputStream destImg = null;

        try
        {
            sourceImg = new FileInputStream("logo.png");
            destImg = new FileOutputStream("new_logo.png");

            int read;
            while ((read = sourceImg.read()) != -1)
            {
                destImg.write(read);
            }
        }
        finally
        {
            if(sourceImg != null)
                sourceImg.close();
            if(destImg != null)
                destImg.close();
        }
      */  /* Stream di caratteri */ /*
        FileReader sourceStream = null;

        try
        {
            sourceStream = new FileReader("input.txt");


            int temp;

            while (( temp = sourceStream.read())!= -1 )
                System.out.println((char)temp);
        }
        finally
        {
            if (sourceStream != null)
                sourceStream.close();
        }
        */
        try
        {
            File myNewFile = new File("new_file.txt");
            myNewFile.createNewFile();

            FileWriter myWriter = new FileWriter(myNewFile);
            myWriter.write("Hello World\nCome va?\nCiao Andrea come va la vita a Milano?\nVideoprova HTC 10");
            myWriter.close();

            Scanner Reader = new Scanner(myNewFile);
            while(Reader.hasNextLine())
            {
                System.out.println(Reader.nextLine());
            }
        }
        catch (IOException e)
        {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}