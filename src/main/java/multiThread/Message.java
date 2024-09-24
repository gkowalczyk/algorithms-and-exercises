package multiThread;

import java.util.Scanner;

//W Javie można użyć metod wait(), notify(), i notifyAll(), aby wątki mogły się nawzajem informować o swoim stanie.
public class Message {
    private String message;

    public synchronized void sendMessage(String message) {
        this.message = message;
        notify();//notify() metoda wywołana na obiekcie synchronizowanym powiadamia jeden wątek czekający na ten obiekt.
    }

    public synchronized String readMessage() throws InterruptedException {
        while (message == null) {
            wait();
        }
        return message;
    }

    public static void main(String[] args) {
        Message message = new Message();
        Scanner scanner = new Scanner(System.in);

        Thread sender = new Thread(() -> {
            try {

                Thread.sleep(1000);
                message.sendMessage(scanner.nextLine());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
               // scanner.close();
            }
        });

        Thread reader = new Thread(() -> {
            try {
                String msg = message.readMessage();
                System.out.println("Message read: " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        reader.start();
        sender.start();
    }
}