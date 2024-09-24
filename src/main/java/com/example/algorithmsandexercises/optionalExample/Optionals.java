package com.example.algorithmsandexercises.optionalExample;

import java.util.Optional;
import static java.util.Optional.ofNullable;

public class Optionals {

public static Optional<String> findUserNameById(int id) {
    if(id == 1) {
        return Optional.of("John");
    } else {
        return Optional.empty();
    }

}



    public static void main(String[] args) {

        Optional<String> emptyOptionals = Optional.empty(); // tworzy pusty obiekt
        System.out.println(emptyOptionals.isEmpty()); // pusty obiekt
        System.out.println(emptyOptionals.isPresent()); // pusty obiekt


        Optional<String> nonEmptyOptionals = Optional.of("Hello"); // tworzy niepusty obiekt
        System.out.println(nonEmptyOptionals.isEmpty()); // niepusty obiekt
        System.out.println(nonEmptyOptionals.isPresent()); // niepusty obiekt

        String name = "John";
        String name1 = "Gregory";
        Optional<String> nameOptional = Optional.of(name);
        Optional<String> nameOptional2 = Optional.ofNullable(name);// zwroci pusty obiekt, jeśli wartość jest nullem


        System.out.println(nameOptional.get());
        System.out.println(nameOptional2.isPresent());
        ofNullable(name1).ifPresent(System.out::println);


        Optional<String> userName = findUserNameById(1);
        Optional<String> userName2 = findUserNameById(2);
        if (userName.isPresent() && userName2.isPresent()) {
            System.out.println(userName.get());
        } else {
            System.out.println("User not found");
        }


        userName.ifPresent(System.out::println);
        userName2.ifPresent(System.out::println);


        String defaultName = userName.orElse("Default name");
        String defaultName1 = userName2.orElse("Default name");
        System.out.println("Default name:" + defaultName);
        System.out.println("Default name:" + defaultName1);


        String defaultName2 = userName.orElseGet(() -> "Default name");// orElseGet() - zwraca wartość domyślną, jeśli nie ma wartości w obiekcie Optional
        String defaultName3 = userName2.orElseGet(() -> "Default name");// orElseGet() - zwraca wartość domyślną, jeśli nie ma wartości w obiekcie Optional
        System.out.println("Default name:" + defaultName2);
        System.out.println("Default name:" + defaultName3);


        String defaultName4 = userName.orElseThrow(() -> new IllegalArgumentException("User not found"));
        System.out.println("Default name:" + defaultName4);

        // String defaultName5 = userName2.orElseThrow(() -> new IllegalArgumentException("User not found"));
        //System.out.println("Default name:" + defaultName5);

// inne metody
        //metoda map służy do przekształcania wartości w obiekcie Optional
        userName.map(String::length).ifPresent(lenght -> System.out.println("Name lenght:" + lenght));


        //metoda flatMap służy do przekształcania wartości w obiekcie Optional, ale zwraca obiekt Optional
        userName.flatMap(n -> Optional.of(n.toUpperCase())).ifPresent(nameUpperCase -> System.out.println("Name upper case:" + nameUpperCase));

        //metoda filter służy do sprawdzania warunków na wartości w obiekcie Optional

        userName.filter(n -> n.startsWith("J")).ifPresent(nameStartsWithJ -> System.out.println("Name starts with J:" + nameStartsWithJ));



    }

    }
