package multiThread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

//Zamiast zarządzać wątkami bezpośrednio, można skorzystać z ExecutorService, który upraszcza zarządzanie pulami wątków.
//w tym przykładzie pokazano jak używać puli wątków do przetwarzania wielu zadań równolegle.
//zadania od 1-3 są przetwarzane równolegle, a zadanie 4 i 5 jest przetwarzane po zakończeniu zadania 3.
public class ThreadPoolExample implements Runnable {

    private String name;

    public ThreadPoolExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            IntStream.range(0, 6).forEach(i -> {
                if (i == 0) {
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for task name - " + name + " = " + simpleDateFormat.format(date));
                } else {
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - " + name + " = " + simpleDateFormat.format(date));
                }

            });
            System.out.println(name + " is done");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}

    class Runner {
        private static final int MAX_THREADS = 3;

        public static void main(String[] args) {

            ExecutorService pool = Executors.newFixedThreadPool(MAX_THREADS);
            pool.execute(new ThreadPoolExample("task 1"));
            pool.execute(new ThreadPoolExample("task 2"));
            pool.execute(new ThreadPoolExample("task 3"));
            pool.execute(new ThreadPoolExample("task 4"));
            pool.execute(new ThreadPoolExample("task 5"));

            pool.shutdown();
        }
    }
