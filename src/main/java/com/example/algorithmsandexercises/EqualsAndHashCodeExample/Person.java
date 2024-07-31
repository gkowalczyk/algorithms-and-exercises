package com.example.algorithmsandexercises.EqualsAndHashCodeExample;


import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age; // 31 bo to liczba pierwsza i daje dobre wyniki oraz poprawia  wydajność ze względu na przesunięcie bitowe

        return result;
    }


    public static void main(String[] args) {

        String str0 = "Ola";
        String str1 = "Ola"; // przechowywane w String Pool, referencja do obiektu co zaoszczędza pamięć
        String str2 = new String("Ola");// przechowywane na stercie, nowy obiekt
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode() == str2.hashCode());
        System.out.println(str0 == str1);
        System.out.println(str1 == str2); //false bo to są dwa różne obiekty

        Person person1 = new Person("Ola", 20);
        Person person2 = new Person("Ola", 20);
        Person person3 = new Person("Ola", 30);
        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(set.size()); // bez metody equals i hashCode w klasie Person, wynik to 3, z metodami wynik to 2

//true
//true
//true
//false
//2
    }
}
