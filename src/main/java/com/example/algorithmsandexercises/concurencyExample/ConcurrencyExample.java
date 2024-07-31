package com.example.algorithmsandexercises.concurencyExample;

public class ConcurrencyExample {

    public static void main(String[] args) {
        Thread thread= new Thread(() -> {
            System.out.println("Hello from thread:" + Thread.currentThread().getName());

        });
thread.start();



        Thread thread1= new Thread(() -> {
            System.out.println("Hello from thread:" + Thread.currentThread().getName());

        });
        thread1.start();
    }

    class Counter {
        private int count = 0;
        private volatile boolean running  = true; //volatile - zapewnia, że zmienna jest zawsze aktualna i może być używana przez wiele wątków

        public synchronized void increment() { //synchronized - blokuje dostęp do metody dla innych wątków
            count++;
    }
        public int getCount() {
            return count;
        }

        public boolean isRunning() {
            return running;
        }


    }
}
