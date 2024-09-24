package multiThread;

public class MultithreadingDemo extends Thread {

    //Uruchomienie wątku poprzez dziedziczenie klasy Thread lub implementację interfejsu Runnable

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }


    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
                    }

    }
}
