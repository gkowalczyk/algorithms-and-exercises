package com.example.algorithmsandexercises.Queue;

public class App {

    public static void main(String[] args) {


        QueueArray<Integer> stackInt = new QueueArray<>();
     //   QueueList<Integer> stackListInt = new QueueList<>();

        System.out.println("Czy kolejka jest pusta?: " + stackInt.isEmpty());
        System.out.println("Ile elementow?: " + stackInt.size());

        System.out.println("----------------------------------------");
        System.out.println("-           Dodawanie do kolejki         -");
        System.out.println("----------------------------------------\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("----------------------------------------\n");
            System.out.println("Dodawanie elementu: " + i);
            stackInt.enqueue(i);
            //stackListInt.enqueue(i);
            System.out.println("-kolejka----------------------------------");
            System.out.println("Czy kolejka pusta?: " + stackInt.isEmpty());
            System.out.println("Ilosc elemntow: " + stackInt.size());
            System.out.println("Gora: " + stackInt.front());
            System.out.println("----------------------------------------\n");
         //   System.out.println("Czy kolejka pusta?: " + stackListInt.isEmpty());
         //   System.out.println("Ilosc elemntow: " + stackListInt.size());
          //  System.out.println("Gora: " + stackListInt.front());
            System.out.println("----------------------------------------\n");

        }

        System.out.println("----------------------------------------");
        System.out.println("-      Usuwanie z kolejki   -");
        System.out.println("----------------------------------------\n");

        for (int i = stackInt.size(); i > 0; i--) {
            System.out.println("----------------------------------------\n");
            System.out.println("usuwanie elementu: " + stackInt.dequeue());
            System.out.println("Czy kolejka pusta?: " + stackInt.isEmpty());
            System.out.println("Ilosc elemntow: " + stackInt.size());
            System.out.println("Gora: " + stackInt.front());
            System.out.println("----------------------------------------\n");
        }
        System.out.println("Czy pusta kolejka?: " + stackInt.isEmpty());

       // while (!stackListInt.isEmpty()) {
            System.out.println("----------------------------------------\n");
           // System.out.println("usuwanie elementu: " + stackListInt.dequeue());
           // System.out.println("Czy kolejka pusty?: " + stackListInt.isEmpty());
          //  System.out.println("Ilosc elemntow: " + stackListInt.size());
          //  System.out.println("Gora: " + stackListInt.front());
            System.out.println("----------------------------------------\n");
        }
     //   System.out.println("Czy  pusta kolejka?: " + stackListInt.isEmpty());
    }

