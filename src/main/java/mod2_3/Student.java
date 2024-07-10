package mod2_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Student {
    private String name;
    private String surname;
    private String pesel;


    public Student(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public boolean equals(Object o) {
        Student e = (Student) o;
        return (this.name == e.name) && (this.surname == e.surname) && (this.pesel == e.pesel);
    }

    public int hashCode() {
        return Integer.parseInt(pesel.substring(0, 5));
    }

    public String toString() {
        return name + " " + surname + " (" + pesel + ")";
    }
}

class AppRun {

    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", "88991112345");
        Student student1 = new Student("Tomek", "Kowalski", "88991002345");
        Map<Student, List<Integer>> grades = new HashMap<>();
        grades.put(student, List.of(5, 5, 5, 5, 5));
        grades.put(student1, List.of(3, 3, 3, 3, 3));


        grades.forEach((user, gradeList) -> {
            double avg = gradeList.stream()
                    .mapToDouble(Double::valueOf)
                    .average()
                    .orElse(0.0);
            System.out.println(user + "średnia ocen :" + avg);
        });
    }
}

