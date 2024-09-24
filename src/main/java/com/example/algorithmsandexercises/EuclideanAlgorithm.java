package com.example.algorithmsandexercises;

public class EuclideanAlgorithm {

public static int calculateNWD(int a, int b) {
    if (a != b) {
        return calculateNWD(a > b ? a - b : a, b > a ? b - a : b);
    }
    return a;
    }

    public static void main(String[] args) {
        System.out.println(calculateNWD(24, 4));
    }
}
