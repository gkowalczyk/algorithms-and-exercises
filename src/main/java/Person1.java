import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class Person1 {

    private String name;
    private Integer age;
    private boolean isMale;


    public Map<String, Integer> getAdultMales(List<Person1> people) {
        return people.stream()
                .filter(person -> person.isMale)
                .filter(person -> person.age >= 18)
                .collect(Collectors.toMap(Person1::getName, Person1::getAge));

    }
}