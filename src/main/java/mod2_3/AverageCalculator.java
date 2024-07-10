package mod2_3;

import java.util.ArrayList;
import java.util.Collections;

public class AverageCalculator {

    public static void main(String[] args) {
        double[] numbers = new double[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int sum = 0;
       for(int i = 0; i < numbers.length; i++) {
           sum += numbers[i];
       }
        System.out.println("Sum: " + sum);
        double average = sum / numbers.length;
        System.out.println("Average: " + average);
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.sort(arrayList);
    }
}
