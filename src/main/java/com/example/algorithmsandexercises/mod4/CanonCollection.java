package com.example.algorithmsandexercises.mod4;

import java.util.LinkedList;
import java.util.List;

//Czas na powtórkę z tworzenia klasy. Zadanie będzie lekko abstrakcyjne, żeby ciekawiej się je rozwiązywało. ;)
//
//Część 1
//Napisz klasę Cannon (z ang. armata) z publicznym polem loaded (z ang. załadowana) typu boolean oraz metodą fire() (z ang. wystrzel), która sprawdza przed wystrzeleniem, czy kula znajduje się w armacie.
//
//Jeśli armata nie jest załadowana, zostanie wyświetlona informacja (System.out.println) o braku kuli w armacie, a następnie kula zostanie załadowana do tej armaty.
//
//Część 2
//W metodzie main klasy Program utwórz kolekcję typu LinkedList do przechowywania armat.
//
//Dodaj kilka obiektów klasy Cannon do kolekcji, a następnie – używając pętli for – załaduj wszystkie armaty.
public class CanonCollection {

    private boolean isLoaded;

    public CanonCollection(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public void fire() {
        if (isLoaded) {
            System.out.println("Fire!!!!!");

        } else {
            System.out.println("Loading......");
            isLoaded = true;
            fire();
        }
    }

    public static void main(String[] args) {
        CanonCollection canon1 = new CanonCollection(true);
        CanonCollection canon2 = new CanonCollection(true);
        CanonCollection canon3 = new CanonCollection(false);

        List<CanonCollection> canonCollectionList = new LinkedList<>();
        canonCollectionList.add(canon1);
        canonCollectionList.add(canon2);
        canonCollectionList.add(canon3);
        canonCollectionList.forEach((n) -> {
            n.fire();
        });
    }
}
