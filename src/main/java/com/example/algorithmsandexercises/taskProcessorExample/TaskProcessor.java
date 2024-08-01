package com.example.algorithmsandexercises.taskProcessorExample;


import java.util.PriorityQueue;

class TaskProcessor {

    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();

    public void addTask(Task task) {
        taskQueue.add(task);
    }

    public void processAllTasks() {
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing task: " + task);
        }
    }
}
