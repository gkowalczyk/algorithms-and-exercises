package multiThread;

public class PriorityThread extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        System.out.println("t1 thread priority : " + t1.getPriority()); // Default 5
        System.out.println("t2 thread priority : " + t2.getPriority()); // Default 5
        System.out.println("t3 thread priority : " + t3.getPriority()); // Default 5

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 thread priority : " + t1.getPriority()); // 2
        System.out.println("t2 thread priority : " + t2.getPriority()); // 5
        System.out.println("t3 thread priority : " + t3.getPriority()); // 8

        t1.start();
        t2.start();
        t3.start();
    }

}
