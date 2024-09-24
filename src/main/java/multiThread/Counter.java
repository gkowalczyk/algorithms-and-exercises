package multiThread;
//W środowisku wielowątkowym wiele wątków może próbować uzyskać dostęp
// do tych samych zasobów, co może prowadzić do problemów. W tym celu Java oferuje mechanizmy synchronizacji.
public class Counter {

    private int count = 0;

    public synchronized void increment() {//synchronized blokuje dostęp do metody dla innych wątków, dopóki nie zostanie zwolniony
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }
}
