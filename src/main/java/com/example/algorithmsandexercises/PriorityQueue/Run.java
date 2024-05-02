package com.example.algorithmsandexercises.PriorityQueue;

import java.util.*;
import java.util.stream.IntStream;

public class Run {

    public static void sortowanie_Kopcowanie(int max) {

        HeapPQ<Integer, String> PQ = new HeapPQ<>();
        Random random = new Random();
        int[] data = new int[max];


        //  System.out.println("Step 1 :");
        IntStream.range(0, max)
                .forEach(n -> {
                    int val = random.nextInt(9);
                    data[n] = val;
                    PQ.insert(val, "String" + val);
                    //     System.out.println(PQ);
                });

        //  System.out.println("Step 2 :");
        Arrays.stream(data).forEach(n -> {
            n = PQ.removeMin().getKey();
            //  System.out.println(PQ);
        });
    }

    public static void sortowanie_wstawianie(int max) {
        Random random = new Random();
        int[] data = new int[max];

        SortedPQ<Integer, String> PQ = new SortedPQ<>();
        //  System.out.println("Step 1 :");
        IntStream.range(0, max)
                .forEach(n -> {
                    int val = random.nextInt(9);
                    data[n] = val;
                    PQ.insert(val, "String" + val);
                    //    System.out.println(PQ);
                });

        //  System.out.println("Step 2 :");
        Arrays.stream(data).forEach(n -> {
            n = PQ.removeMin().getKey();
            //    System.out.println(PQ);
        });
    }

    public static void sortowanie_wybieranie(int max) {
        Random random = new Random();
        int[] data = new int[max];

        UnsortedPQ<Integer, String> PQ = new UnsortedPQ<>();
        // System.out.println("Step 1 :");
        IntStream.range(0, max)
                .forEach(n -> {
                    int val = random.nextInt(9);
                    data[n] = val;
                    PQ.insert(val, "String" + val);
                    //     System.out.println(PQ);
                });

        //  System.out.println("Step 2 :");
        Arrays.stream(data).forEach(n -> {
            n = PQ.removeMin().getKey();
            //    System.out.println(PQ);
        });
    }

    public static void main(String[] args) {



       System.out.println("Sortowanie przez wstawianie PQ \n");
        List<Integer> sortedPQList = List.of(100, 500, 10000, 50000, 100000, 500000, 1000000);
        sortedPQList.forEach(n -> {

            long start = System.currentTimeMillis();
            sortowanie_wstawianie(n);
            long finish = System.currentTimeMillis();
            System.out.print("czas sortowania przez wstawianie" + n + "elementów wyniósł " + (finish - start) + " ms.\n");
        });


        System.out.println("Sortowanie przez wybieranie PQ \n");
        List<Integer> unSortedPQList = List.of(100, 500, 10000, 50000, 100000, 500000, 1000000);
        unSortedPQList.forEach(n -> {

            long start = System.currentTimeMillis();
            sortowanie_wybieranie(n);
            long finish = System.currentTimeMillis();
            System.out.print("czas sortowania przez wybieranie" + n + "elementów wyniósł " + (finish - start) + " ms.\n");
        });


        System.out.println("Sortowanie przez kopiec PQ \n");
        List<Integer> list = List.of(100, 500, 10000, 50000, 100000, 500000, 1000000);
        list.forEach(n -> {

            long start = System.currentTimeMillis();
            sortowanie_Kopcowanie(n);
            long finish = System.currentTimeMillis();
            System.out.print("czas sortowania przez kopiec" + n + "elementów wyniósł " + (finish - start) + " ms.\n");
        });
    }
}
