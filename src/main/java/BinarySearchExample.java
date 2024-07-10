public class BinarySearchExample {

    public static int binaryResearch(int[] arr, int target) {

        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] == target) {

                return mid;
            }
            if (arr[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        int target = 8;
        System.out.println(BinarySearchExample.binaryResearch(arr, target));
    }
}
