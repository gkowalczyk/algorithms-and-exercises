package com.example.algorithmsandexercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaExpression {
    public static void main(String[] args) {

        //Java z interfejsem funkcyjnym

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable");
            }
        };
        runnable.run();


        Runnable thisSameWithLambda = () -> System.out.println("Hello from lambda");
        thisSameWithLambda.run();

        //Java z interfejsem funkcyjnym standardowym

        //Przyjmuje jeden argument i zwraca wartość
        Predicate<Integer> isEven = (number) -> number % 2 == 0;// zwraca true jeśli liczba jest parzysta
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));
        System.out.println(isEven.or((number) -> number % 3 == 0).test(6));


        //Przyjmuje jeden argument i nie zwraca wartości
        Consumer<Integer> printNumber = (number) -> System.out.println(number);
        printNumber.accept(5);


        //Przyjmuje jeden argument T i zwraca wartość R
        Function<Integer, String> intToString = (number) -> "Liczba: " + number;
        System.out.println(intToString.apply(5));


        //Supplier reprezentuje dostawcę wyniku i nie przyjmuje żadnych argumentów
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());


        //Lambdy w API strumieniowym Java
        List<String> names = Arrays.asList("Anna", "Bob", "Catherine", "David", "Emily");
      List<String> filteredNamesList = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(filteredNamesList);

     //Metody statyczne w interfejsach funkcyjnych

        //1. Wyrażenie lambda  z użyciem metody statycznej
        Consumer<String> print = (s) -> System.out.println(s);
        print.accept("Hello");

        Consumer<String> print2 = System.out::println;
        print2.accept("Hello");



        //2. Wyrażenie lambda z użyciem metody instancyjnej

        String text = "Hello";
        Supplier<String> supplier = () -> text.toUpperCase();
        System.out.println(supplier.get());
        Supplier<String> supplier1 =  text::toUpperCase;
        System.out.println(supplier1.get());

        //3, Referencje do metod instancyjnych na rzecz obiektu konkretnej klasy
        List<String> names1  = Arrays.asList("Anna", "Bob", "Catherine", "David", "Emily");
        names1.forEach(System.out::println);
        names1.forEach(name -> System.out.println(name));


        //4. Referencje do konstruktora
        Supplier<String> supplier2 = String::new;
        System.out.println(supplier2.get());

   }
}
