import java.util.Arrays;

public class QuickSortingExampleAlgorithm1 {

    public int partition(int arr[], int low, int high) { // x,y...z < pivot < a,b...c

        int pivot = arr[high];
        int medium = low -1;
        for(int i = low; i < high; i++) {
            if(arr[i] <= pivot) {
                medium++;
                int temp = arr[medium];
                arr[medium] = arr[i];
                arr[i] = temp;
            }
        }
         int temp = arr[medium + 1];
        arr[medium +1] = arr[high];
        arr[high] = temp;

        return medium + 1;
    }

    public void sort(int arr[], int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot -1 );
            sort(arr, pivot + 1,  high);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, -7, -6, -11};
        int n = arr.length;
        QuickSortingExampleAlgorithm1 ob = new QuickSortingExampleAlgorithm1();
        ob.sort(arr, 0, n - 1);
        System.out.println();
        printArray(arr);
       // Arrays.sort(arr);
    }
}
