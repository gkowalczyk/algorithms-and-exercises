package com.example.algorithmsandexercises.taskProcessorExample;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        TaskProcessor processor = new TaskProcessor();
        processor.addTask(new Task(5));
        Thread.sleep(2000); // Symulacja opóźnienia
        processor.addTask(new Task(3));
        Thread.sleep(6000); // Symulacja opóźnienia
        processor.addTask(new Task(1));
        processor.addTask(new Task(10));

        processor.processAllTasks();
    }
}
