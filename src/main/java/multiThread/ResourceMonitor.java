package multiThread;
//Wątki demonowe to wątki, które działają w tle i nie
// blokują zakończenia programu.
// Przykładem może być wątek monitorujący zasoby.
//Praktyczne zastosowania wątków demonowych najczęściej dotyczą zadań,
// które powinny działać w tle i nie blokować zakończenia
// głównych procesów programu. Poniżej znajdziesz przykład wykorzystania
// wątku demonowego do monitorowania zasobów systemowych w aplikacji.
public class ResourceMonitor extends Thread {
    public ResourceMonitor() {
        setDaemon(true);//setDaemon(true) ustawia wątek jako demonowy
    }

    public void run() {
        while (true) {
            System.out.println("Monitoring the system resources");
            long freeMemory = Runtime.getRuntime().freeMemory();
            long totalMemory = Runtime.getRuntime().totalMemory();
            long usedMemory = totalMemory - freeMemory;
            System.out.println("Free memory: " +usedMemory);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ResourceMonitor resourceMonitor = new ResourceMonitor();
        resourceMonitor.start();

        //Symulacja pracy aplikacji
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main app is running task:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Po zakończeniu głównego wątku aplikacja się kończy, a wątek demonowy
        // ResourceMonitor zostaje automatycznie przerwany.
        System.out.println("Main app is done");
    }
}

