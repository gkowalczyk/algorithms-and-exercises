package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 20));

        Collections.sort(people, new AgeComparison());
        people.forEach(System.out::println);
    }
}
