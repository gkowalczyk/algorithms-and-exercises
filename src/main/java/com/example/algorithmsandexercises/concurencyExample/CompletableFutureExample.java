package com.example.algorithmsandexercises.concurencyExample;

import org.springframework.core.task.SimpleAsyncTaskExecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

       // SimpleAsyncTaskExecutor

        CompletableFuture<String> completableFuture = fetchDataFromServer();
        System.out.println("Pobieranie danych z serwera");//dalsza praca na wątku głównym

        completableFuture.thenAccept(data -> {// // Rejestracja callbacku do przetwarzania danych po zakończeniu pobierania
            System.out.println("Otrzymane dane: " + data);
        });
        // Kontynuowanie pracy w głównym wątku
        System.out.println("Zakończono pracę w głównym wątku.");

    }


    public static CompletableFuture<String> fetchDataFromServer() {

        return CompletableFuture.supplyAsync(() -> {
            //symulacja operacji
            try {
                Thread.sleep(10000);
            } catch(InterruptedException e) {
                e.getMessage();
            }
            return "Dane z serwera";
        });
    }
}