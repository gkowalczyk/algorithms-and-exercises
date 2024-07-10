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
// new int[]{1,5,1,1})
    //b1: 3   b2: 0   b3: 0   b4: 1

    public static int[] sort(int[] tab) {  // [ 3   0    0  0  1 ]
        int[] getMaxMin = getMinMax(tab);
        int min = getMaxMin[0];
        int max = getMaxMin[1];
     int[] buckets = new int[max - min + 1];
        for(int i = 0; i < tab.length; i++) {
         buckets[tab[i] - min]++;
        }
        int i = 0;
        int j =0;  //index of array bucket

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
