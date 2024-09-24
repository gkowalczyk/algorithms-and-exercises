package multiThread;

//Deadlock to sytuacja w której dwa lub więcej wątków są zablokowane w oczekiwaniu na siebie nawzajem, aby zwolnić zasoby, które mają i potrzebują.
//Jednym ze sposobów na uniknięcie deadlocka jest przestrzeganie spójnego porządku blokowania zasobów. Na przykład, jeśli oba wątki zawsze próbują
// zablokować zasoby w tej samej kolejności (np. najpierw lock1, potem lock2), wtedy deadlock nie wystąpi.
public class DeadLockExample {

    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread thread1 = new Thread(() -> { //blokada lock 1 i próba uzyskania lock 2
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");

                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                System.out.println("Status wątku 1: " + Thread.currentThread().getState());
                synchronized (lock2) {

                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }

        });

        Thread thread2 = new Thread(() -> { // blokada lock 2 i próba uzyskania lock 1
            synchronized (lock2) {

                System.out.println("Thread 1: Holding lock 1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                System.out.println("Status wątku 2: " + Thread.currentThread().getState());
                synchronized (lock1) {
                    System.out.println("Status wątku 2: " + Thread.currentThread().getState());
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
            System.out.println("Status wątku 2: " + Thread.currentThread().getState());
        });

        thread1.start();

        thread2.start();

    }
}
