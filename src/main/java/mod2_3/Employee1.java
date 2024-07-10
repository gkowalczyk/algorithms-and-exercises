package mod2_3;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Employee1 {

    String firstName;
    String lastName;
    LocalDate birthDate;

    public Employee1(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int hashCode() {
        return birthDate.getYear() * 100 + birthDate.getDayOfYear();
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public boolean equals(Object o) {
        Employee1 e = (Employee1) o;
        return (birthDate.getYear() == e.getBirthDate().getYear()
                && birthDate.getDayOfYear() == e.getBirthDate().getDayOfMonth()
                && birthDate.getDayOfYear() == e.getBirthDate().getDayOfYear()
                && firstName.equals(e.getFirstName()));
    }

    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("name", "lastname", 1980, 05, 23);
        System.out.println(employee1.hashCode());

        Set<Employee1> workersSet = new HashSet<>();
        workersSet.add(new Employee1("name", "lastname", 1980, 05, 23));
        System.out.println(workersSet.contains(employee1));

        for (Employee1 employee : workersSet) {
            if (employee.getBirthDate().getYear() > 1980) {
                System.out.println(employee);
            }
        }
        workersSet.forEach(System.out::println);

        Iterator<Employee1> iterator = workersSet.iterator();
        while(iterator.hasNext()) {
            Employee1 temp = iterator.next();
            System.out.println(temp);
        }
    }
}
