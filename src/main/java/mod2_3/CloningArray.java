package mod2_3;

import java.util.Arrays;

public class CloningArray {

    public static void main(String[] args) {

        int arr[] = {33, 3, 4, 5};
        int clone[] = arr.clone();
        System.out.println(arr == clone);// fałsz ponieważ to są dwa różne obiekty
        System.out.println(arr[0] == clone[0]);
        Arrays.stream(clone).forEach(System.out::println);
    }
}
