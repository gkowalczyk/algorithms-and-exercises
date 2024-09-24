package multiThread;

import java.util.stream.IntStream;

//Poniższy przykład pokazuje :

//Operacje na głównym wątku: Możliwość zmiany parametrów wątku, takich jak nazwa i priorytet.
  //      Tworzenie nowych wątków: Pokazano dwie techniki – anonimowa klasa oraz klasa dziedziczona z Thread.
  //      Priorytety wątków: Teoretyczny wpływ priorytetów na sposób przydzielania czasu CPU.
 //       Równoległość: Kod w wątkach działa równolegle, co prowadzi do asynchronicznego wykonywania działań.
public class MainThreadExample extends Thread {


    public static void main(String[] args) {
        //main thread
        Thread mainThread = Thread.currentThread();
        System.out.println("Current thread: " + mainThread.getName());
        mainThread.setName("MainThread");
        System.out.println("Main thread: " + mainThread.getName());
        System.out.println("Main thread id: " + mainThread.getId());
        System.out.println("Priority: " + mainThread.getPriority());
        mainThread.setPriority(MAX_PRIORITY);
        System.out.println("Main thread new priority: "
                + mainThread.getPriority());

        IntStream.range(1, 6).forEach(i -> {
            System.out.println("Main thread: " + i);
        });

        //Create child thread for main thread
        Thread childThread = new Thread() {


            public void run() {
                IntStream.range(1, 6).forEach(i -> {
                    System.out.println("Child thread: " + i);
                });

            }
        };
        System.out.println("Current thread from child : " + childThread.getName());
        System.out.println("Priority Child: " + childThread.getPriority());
        childThread.setPriority(MIN_PRIORITY);
        System.out.println("Child thread new priority: "
                + childThread.getPriority());
        System.out.println("Child thread id: " + childThread.getId());
        childThread.start();


        //Create child thread for main thread using new class
        ChildThread childThread2 = new ChildThread();
        childThread2.start();
    }
}

class ChildThread extends Thread {
    public void run() {

        IntStream.range(1, 6).forEach(i -> {
            System.out.println("Child thread from new class: " + i);
        });
        System.out.println("Child thread from new class thread: " + Thread.currentThread().getName());

        System.out.println("Priority Child thread from new class: " + Thread.currentThread().getPriority());
    }
}

