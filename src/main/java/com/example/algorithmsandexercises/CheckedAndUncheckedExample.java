package com.example.algorithmsandexercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedAndUncheckedExample {
    public static void main(String[] args) {
        //checked

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("fleName.txt"))) {
            String line;
            while (( line = bufferedReader.readLine()) != null) {// w pętli odczytujemy linie z pliku aż do kiedy nie będzie null czyli do końca pliku
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("Błąd odczytu pliku:" + e.getMessage());

        }
        // unchecked

        String string = null;

       try {
           System.out.println(string.length());

       } catch (NullPointerException e) {
           System.out.println("Błąd:" + e.getMessage());
        }
    }
}
