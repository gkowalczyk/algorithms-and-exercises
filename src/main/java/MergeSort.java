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
      int i = 0; int j = 0; int k = 0;
//      [2, 6]
      // [2]  [6]
    while (i < left.length && j < right.length) {
        if(left[i] < right[j]) {
            array[k] = left[i];
            i++; //inkrementacja i bo lewa wartość już najmniejsza, wtedy i < left.lenght= false
        } else {
            array[k] = right[j];
            j++;
        }
        k++;// k służy do inkrementacji tablicy array
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

//cofamy się  w rekurencji do :
//  1,2,6
//1    [2,6]


//5   [4,3]
//   4     3
// cofamy się w rekurencji
//   5,4,3
//     5       3,4


