package com.example.algorithmsandexercises.concurencyExample;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();//tworzy executro z pojedycznnym wątkiem co oznacza że wszystkie zadania będą wykonywane w kolejności jedno po drugim


        Future<Integer> future = executorService.submit(new Callable<Integer>() {// umożliwia zwrócenie wyniku z wątku dla operacji asynchronicznych
            @Override // metoda call() z interfesju Callable zwraca wynik z wątku
            public Integer call() throws Exception {
                Thread.sleep(1000);
                return 42;
            }
        });

        System.out.println("czekamy na wynik");
        int result = future.get();// blokuje zadanie dopóki nie otrzyma wyniku
        System.out.println(result);
        executorService.shutdown();
    }
}

//Programowanie asynchroniczne w Javie polega na wykonywaniu zadań w tle, bez blokowania głównego wątku. W Javie mamy kilka sposobów na tworzenie zadań asynchronicznych, ale jednym z najbardziej popularnych jest użycie interfejsu Future i ExecutorService.
//Operacje mogą być wykonane niezależnie, a wyniki sa wyświetlane gdy zadania zostaną wykonane.

//Wątek główny - >>>>>>>>>>>>>>>>
//Tworzymy ExecutorService z pojedynczym wątkiem, co oznacza, że wszystkie zadania będą wykonywane w kolejności jedno po drugim.


//Wątek pracowniczy - >>>>>>>>>>>>>>
//Wykonuje nowy wątek poprzez wywołanie interejsu Callable, który zwraca wynik z wątku.

//Future.get() przestaje blokować i zwraca wynik do wątku głównego

