package multiThread;

public class MultithreadingDemoWithRunnable implements Runnable{




    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
        System.out.println("Thread " + Thread.currentThread().getName() );

    }

    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Thread object = new Thread(new MultithreadingDemoWithRunnable());
          //Różnice:
            //run() nie tworzy nowego wątku — metoda jest wykonywana w bieżącym wątku.
            //start() tworzy nowy wątek i uruchamia metodę run() w tym nowym wątku
            object.start();
            object.run();
        }
    }
}
