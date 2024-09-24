package multiThread;

import lombok.SneakyThrows;

public class ThreadClassExample implements Runnable  {

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("thread2 going to sleep for 5000");
        Thread.sleep(5000);
    }
}

class Test implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        System.out.println("thread1 in test class");

    }

    public static void main(String[] args) {
        ThreadClassExample threadClassExample = new ThreadClassExample();
        Test test = new Test();
        Thread thread1 = new Thread(threadClassExample);
        Thread thread2 = new Thread(test);
        thread1.start();
        thread2.start();

        ClassLoader classLoader = thread1.getContextClassLoader();
        System.out.println(classLoader);

        Thread thread3 = new Thread(new ThreadClassExample());
        thread3.start();

        System.out.println("Active threads: " + Thread.activeCount());




    }
}

