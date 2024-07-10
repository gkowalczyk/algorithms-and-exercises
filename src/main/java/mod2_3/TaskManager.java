package mod2_3;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public record TaskManager() {

   static List<String> executeTask = new ArrayList<>();


    public void executeTask(Deque<String> theQueue) {
        while (theQueue.size() > 0) {
            String task = theQueue.poll();
            System.out.println("Zadanie " + task + " wykonane");
            executeTask.add(task);
        }
        System.out.println((executeTask.size() > 1 ? executeTask.size() +   " zadań wykonanych /" + executeTask.size()  : "zadanie wykonane"));
    }
}

    class TaskManagerTest {
        public static void main(String[] args) {
            Deque<String> taskQueue = new LinkedList<>();
            taskQueue.offer("Zadanie 1");
            taskQueue.offer("Zadanie 2");
            taskQueue.offer("Zadanie 3");
            taskQueue.offer("Zadanie 4");


            TaskManager taskManager = new TaskManager();
            taskManager.executeTask(taskQueue);
        }
    }
