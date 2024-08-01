package com.example.algorithmsandexercises.concurencyExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample implements Runnable {

    private final int taskId;

    public ExecutorServiceExample(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task ID : " + this.taskId + " performed by " + Thread.currentThread().getName());
    }
        public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5); // nowa instancja klasy ExecutorService z 5 wątkami
        for(int i = 0; i < 10; i++) {
            executorService.submit(new ExecutorServiceExample(i));//zleca wykonanie zadania
        }
          executorService.shutdown();//zamyka ExecutorService
    }
}
