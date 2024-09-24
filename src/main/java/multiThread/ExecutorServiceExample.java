package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Zamiast zarządzać wątkami bezpośrednio, można skorzystać z ExecutorService, który upraszcza zarządzanie pulami wątków.
public class ExecutorServiceExample {
    public static void main(String[] args) {
        //Tworzenie puli wątków
        //Zgłaszamy dwa zadania do wykonania za pomocą metody submit().
        // Ponieważ mamy dwa wątki w puli,
        // każde zadanie zostanie wykonane przez jeden z dostępnych wątków.
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable runnable = () -> {
            System.out.println("Processing task in first thread:" + Thread.currentThread().getName());
        };

        Runnable runnable1 = () -> {
            System.out.println("Processing task in second thread:" + Thread.currentThread().getName());
        };

        Runnable runnable2 = () -> {
            System.out.println("Processing task in third thread:" + Thread.currentThread().getName());
        };
        Runnable runnable3 = () -> {
            System.out.println("Processing task in fourth thread:" + Thread.currentThread().getName());
        };
        executor.submit(runnable);
        executor.submit(runnable1);
        executor.submit(runnable2);
        executor.submit(runnable3);
        executor.shutdown();
    }
}
