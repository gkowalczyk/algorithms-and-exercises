import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] array) {
        if(array.length <= 1) {
            return;
        }
        int middle = array.length / 2;
        //System.out.println(middle);
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        for(int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for(int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        merge(left);
        merge(right);
        sort(array, left, right);

    }
    private static void sort(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
   int[] arr = new int[]{1,2,6,5,4,3};
    merge(arr);
        Arrays.stream(arr).forEach(System.out::print);

    }
}

// 1,2,6
//1  2,6
//    2 6