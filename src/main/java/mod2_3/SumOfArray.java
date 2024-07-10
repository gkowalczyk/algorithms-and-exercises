package mod2_3;

public class SumOfArray {

    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 3, 6, 1, 7, 4, 2};
        sum(arr);

    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("Array element values [" + i + "] = " + arr[i]);
        }
        System.out.println(sum);
    }
}
