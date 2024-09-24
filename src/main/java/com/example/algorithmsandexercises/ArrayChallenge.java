package com.example.algorithmsandexercises;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayChallenge {

    // For example: if arr is [44, 30, 24, 32, 35, 30, 40, 38, 15] then your program should return 16
    // because at index 2 stock was worth $24 and at index 6 the stock
    // was then worth $40, so if you bought the stock at 24 and sold it at
    // 40, you would have made profit of $16, which is the maximum profit
    // that could have been made with this list of stock prices. If there
    // is not profit that could have been made with the stock prices, then
    // your program should return -1. For example: arr is [10, 9, 8, 2]
    // then your program should return -1.
    // Example: Input: new int[] {10,12,4,5,9} Output: 5
    // Input: new int[] {14,20,4,12,5,11} Output: 8 Input: new int[] {44,30,24,32,35,30,40,38,15} Output: 16
// 1  2  3  4
    // 4  5  6 2 1
    public static int maxProfit(int[] arr) {
        int minProfit = arr[0];
        int maxProfit = -1;
        int potentialProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            potentialProfit = arr[i] - minProfit;
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
            if (arr[i] < minProfit) {
                minProfit = arr[i];
            }
        }
        return maxProfit > 0 ? maxProfit : -1;
    }

    public static int maxProfit1(int[] arr) {
        final int[] minProfit = {arr[0]};
        final int[] maxProfit = {0};

        IntStream.range(0, arr.length)
                .forEach(i -> {
                    minProfit[0] = Math.min(minProfit[0], arr[i]);
                    int potentialProfit = arr[i] - minProfit[0];
                    maxProfit[0] = Math.max(maxProfit[0], potentialProfit);
                });
        return maxProfit[0] > 0 ? maxProfit[0] : -1;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{10, 9, 8, 2}));
        System.out.println(maxProfit1(new int[]{44,30,24,32,35,30,40,38,1}));
    }
}

