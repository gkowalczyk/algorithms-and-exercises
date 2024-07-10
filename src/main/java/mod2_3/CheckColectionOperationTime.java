package mod2_3;

import java.util.*;
import java.util.stream.IntStream;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

//Zadanie: pomiar szybkości LinkedList oraz HashMap
//Zadanie składa się z dwóch części. Jedna dotyczy LinkedList, a druga HashMap.
// Oba programy napisz w wewnętrznym edytorze Kodilla i zapisz je jako jeden projekt.
//
//Część 1
//
//Stwórz klasę reprezentującą książkę o nazwie Book.
// Klasa powinna mieć dwa pola: author oraz title. Pamiętaj o implementacji metod hashCode() oraz equals(Object o).
// Będziemy jej używali jako obiektów kolekcji LinkedList w tej części zadania oraz jako obiektów kolekcji HashMap w drugiej części zadania.
//
//Stwórz program, który zmierzy czas operacji wyszukiwania i usunięcia obiektu na
// początku (z użyciem metody remove(Object o)), wyszukiwania i usunięcia obiektu na końcu
// (z użyciem metody remove(Object o)), wstawiania na początku oraz wstawiania na końcu listy LinkedList liczącej kilkaset tysięcy obiektów.
//
//Część 2
//
//Stwórz program, który zmierzy czas operacji wyszukiwania po kluczu, a także czas dodawania i
// usuwania obiektu z mapy HashMap liczącej kilkaset tysięcy obiektów. Postaraj się, aby kluczem w mapie nie była wartość liczbowa.
public class CheckColectionOperationTime {


    public static void main(String[] args) throws InterruptedException {
        List<Book> bookLinkedList = new LinkedList<>();
        List<Book> bookArrayList = new ArrayList<>();

        IntStream.range(0, 300000)
                .forEach(i -> {
                    bookLinkedList.add(new Book("Author" + i, "Title" + i, i));
                    bookArrayList.add(new Book("Author" + i, "Title" + i, i));
                });

        //Porównując Arraylist oraz LinkedList operacja usuwania na końcu jest szybsza dla ArrayList, a na początku dla LinkedList bo nie trzeba przesuwać elementów

        long time1 = System.nanoTime();
        bookLinkedList.remove(0);
        long time2 = System.nanoTime();
        System.out.println("LinkedList remove first element: " + (time2 - time1) + "ns");

        long time3 = System.nanoTime();
        bookLinkedList.remove(bookLinkedList.size() -1 );
        long time4 = System.nanoTime();
        System.out.println("LinkedList remove last element: " + (time4 - time3) + "ns");

        long time5 = System.nanoTime();
        bookArrayList.remove(0);
        long time6 = System.nanoTime();
        System.out.println("ArrayList remove first element: " + (time6 - time5) + "ns");

        long time7 = System.nanoTime();
       bookArrayList.remove(bookArrayList.size() -1 );
        long time8 = System.nanoTime();
        System.out.println("ArrayList remove last element: " + (time8 - time7) + "ns");


        //Porównując Arraylist oraz LinkedList operacja dodawania na końcu jest szybsza dla ArrayList, a na początku dla LinkedList bo nie trzeba przesuwać elementów
        long time9 = System.nanoTime();
        bookLinkedList.add(new Book("last book", "last author", 300001));
        long time10 = System.nanoTime();
        System.out.println("LinkedList add last element: " + (time10 - time9) + "ns");

        long time11 = System.nanoTime();
        bookLinkedList.add(0, new Book("last book", "last author", 0));
        long time12 = System.nanoTime();
        System.out.println("LinkedList add first element: " + (time12 - time11) + "ns");

        long time13 = System.nanoTime();
        bookArrayList.add(0, new Book("last book", "last author", 0));
        long time14= System.nanoTime();
        System.out.println("ArrayList add first element: " + (time14 - time13) + "ns");

        long time15= System.nanoTime();
        bookArrayList.add(new Book("last book", "last author", 300001));
        long time16= System.nanoTime();
        System.out.println("ArrayList add last element: " + (time16 - time15) + "ns");

 // w przypadku mapy pobieranie elementu jest wolniesze niż usuwanie i wstawianie obiektu
        Map<Book, String> maps = new HashMap<>(); // klucz to nazwa magazynu np A, B, C, wartość to obiekt Book
        IntStream.range(0, 3)
                .forEach((n) -> {
                   //maps.put(new Book("Author" + n, "Title" + n, n),  "Description" + n);
                });
      //  maps.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

        long time17 = System.nanoTime();
       maps.get(0);
        long time18 = System.nanoTime();
        System.out.println("Map get first element: " + (time18 - time17) + "ns");

        long time19 = System.nanoTime();
       maps.remove(0);
        long time20= System.nanoTime();
        System.out.println("map remove element: " + (time20 - time19) + "ns");

        long time21= System.nanoTime();
        maps.put(new Book("Author" , "Title", 2000),  "Description" );
        long time22= System.nanoTime();
        System.out.println("map put ` element: " + (time22 - time21) + "ns");

        long time23 = System.nanoTime();
        maps.get(maps.size() -1);
        long time24 = System.nanoTime();
        System.out.println("Map get last element: " + (time24 - time23) + "ns");

        maps.put(new Book("Author" , "Title", 2000),  "Description" );// jeśli klucz jest taki sam to wartość zostanie nadpisana, ważna jest implementacja metody hashcode i equals
        maps.put(new Book("Author1" , "Title", 2000),  "Description" );

        maps.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));






    }
}


