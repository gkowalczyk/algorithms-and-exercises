package multiThread;

import lombok.SneakyThrows;

public class StateOfThread extends Thread{
    //NEW - wątek został utworzony, ale nie został jeszcze uruchomiony
    //RUNNABLE - wątek jest uruchomiony i jest gotowy do pracy
    //BLOCKED - wątek jest zablokowany i oczekuje na dostęp do zasobów
    //WAITING - wątek jest zatrzymany i oczekuje na inne wątki
    //TIMED_WAITING - wątek jest zatrzymany z ograniczonym czasem oczekiwania
    //TERMINATED - wątek zakończył swoje działanie


    public void run() {
        try {
            //3 . Stan po uruchomieniu wątku
        System.out.println("2.Thread is running - Runnable:" + Thread.currentThread().getState());
        Thread.sleep(2000); // Symulacja opóźnienia - status TIMED_WAITING
            System.out.println("5. End of thread - Terminated:" + Thread.currentThread().getState());

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }

    public static void main(String[] args) throws InterruptedException {
        StateOfThread object = new StateOfThread();
        //1 . Stan po stworzeniu obiektu
        System.out.println("1.Thread is created - New:" + object.getState());
        //2. Uruchomienie wątku
        object.start(); // status RUNNABLE

        //4. Stan RUNNABLE
        Thread.sleep(500);
        System.out.println("3.Thread is waiting -Time_Waiting:" + object.getState());

        Thread.sleep(1000);
        //5. Zamknięcie wątku, czekamy aż wątek w bloku run się zakończy, dopiero wtedy zwróci TERMINATED
        object.join();
        System.out.println("4.Thread is terminated - Terminated:" + object.getState());




    }
}
