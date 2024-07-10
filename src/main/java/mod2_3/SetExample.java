package mod2_3;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union of the two Set");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);// usuwa z intersection elementy, które nie są w b
        System.out.println("Intersection of the two Set");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b); // usuwa z difference elementy, które są w b
        System.out.println("Difference of the two Set");
        System.out.println(difference);

        System.out.println("contains 4 in a: " + a.contains(4));

        a.remove(4);

        System.out.println("contains 4 in a: " + a.contains(4));

        for(Integer i : a) {
            System.out.println(i);
        }

        System.out.println("Iterator");

        Iterator<Integer> iterator = a.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> ts = new TreeSet<String>();

        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");







    }
}
