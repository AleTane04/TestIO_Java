package org.bancoma;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int data;
        System.out.println("Inserisci un carattere: ");
        data = System.in.read();
        System.out.println("Hai inserito il carattere: " + (char)data);
        System.out.println("Il codice ASCII è: " + data);
    }
}