package com.example.algorithmsandexercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayReflect {

    public static void main(String[] args) {
// pozwala na dynamiczne tworzenie tablicy w czasie działania programu.
// Refleksja jest mechanizmem, który umożliwia programowi badanie lub
// modyfikowanie swojej struktury oraz zachowania w trakcie działania. W kontekście tworzenia tablicy oznacza to, że możemy dynamicznie określić typ i rozmiar tablicy w czasie wykonywania, co może być przydatne w sytuacjach, gdy typ lub rozmiar tablicy nie jest znany podczas kompilacji.

        int size = 5;
        int[] intArray = (int[]) Array.newInstance(int.class, size);
        Array.setInt(intArray, 0, 10);
        Array.setInt(intArray, 1, 20);
        Array.setInt(intArray, 2, 30);
        System.out.println(Array.get(intArray, 3));
        System.out.println(Arrays.toString(intArray));
    }
}
