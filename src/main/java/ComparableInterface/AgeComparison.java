package ComparableInterface;

import java.util.Comparator;

public class AgeComparison implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int ageComparison = Integer.compare(p2.age(), p1.age());
        if (ageComparison != 0) {
            return ageComparison;
        }
        return p1.name().compareTo(p2.name());
    }

}
