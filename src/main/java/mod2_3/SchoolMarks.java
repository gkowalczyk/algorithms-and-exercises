package mod2_3;

import java.util.ArrayList;
import java.util.List;

public class SchoolMarks {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(3);
        integerList.add(4);
        integerList.add(2);
        integerList.add(5);
        integerList.add(3);

        System.out.println(integerList);

        for (int i = 0; i < integerList.size() -1 ; i++) {
            for (int j = 0; j < integerList.size() - 1; j++) {
                if(integerList.get(j) > integerList.get(j+1)) {
                    int temp = integerList.get(j);
                    integerList.set(j, integerList.get(j+1));
                    integerList.set(j+1, temp);
                }
            }
        }
        System.out.println(integerList);
        integerList.remove(0);
        integerList.remove(integerList.size() - 1);
        System.out.println(integerList);

        double avg = integerList.stream()
                .mapToDouble(Double::valueOf)
                .average()
                        .getAsDouble();
               // .orElse(0.0);

        System.out.println(avg);
    }
}
