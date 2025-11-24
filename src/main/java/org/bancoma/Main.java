package org.bancoma;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        /* Stream di Byte */
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
        /* Stream di caratteri */
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
    }
}