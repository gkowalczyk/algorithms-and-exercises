package com.example.algorithmsandexercises;

public class BucketSort {

    public static void printArray(int[] tab) {
        System.out.println();
        for(int i = 0; i < tab.length; i++)
        {
            System.out.print(tab[i] + " | ");
        }
        System.out.println();
    }
    public static int[] getMinMax(int[] arr) {
    int min = arr[0];
    int max = arr[0];

    for(int i = 0; i < arr.length; i++) {
    if(arr[i] > min) {
        max = arr[i];
    } else {
        min = arr[i];
    }
    }
      return new int[]{min, max};
    }
// 1  2  3 5 5 2 2 1
    //b1: 2   b2: 3   b3: 1   b4: 0 b5 : 2

    public static int[] sort(int[] tab) {
        int[] buckets;
        int[]minMaX = getMinMax(tab);
        int min = minMaX[0];
        int max = minMaX[1];

        buckets = new int[max - min + 1];
        for(int i = 0; i < tab.length; i++) {
            buckets[tab[i] - min]++;
        }
        int j = 0;
        int i = 0;

        while(i < tab.length) {
            if(buckets[j] != 0) {
                tab[i] = min + j;
                i++;
                buckets[j]--;
            } else {
                j++;
            }
        }
        return tab;
    }

    public static void main(String[] args) {
       printArray(sort(new int[]{1,5,1,1}));

    }
}
