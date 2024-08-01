package com.example.algorithmsandexercises.taskProcessorExample;

//
//A process executes tasks from a queue. Each task has given
// priority and the same duration. The process always
// runs task with the highest priority. Constantly
// some new tasks with random priorities are added to
// the queue.  How can you modify this method of
// executing a collection of tasks so that priorities
// are still taken into account  but there's no danger
// that some task will wait forever due to high traffic
// of incoming tasks? Answer in polish."

public class Task implements Comparable<Task> {

    private final int priority;
    private final long creationTime;
    private final static int MAX_TIME_WAITING = 5000;

    public Task(int priority) {
        this.priority = priority;
        this.creationTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", creationTime=" + creationTime +
                '}';
    }

    public int getPriority() {
        long timeWaiting = System.currentTimeMillis() - creationTime;
        if(timeWaiting > MAX_TIME_WAITING) {
            return Integer.MAX_VALUE;
        }
        return priority;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(o.getPriority(), this.getPriority());
    }
}
