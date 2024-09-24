package com.example.algorithmsandexercises.creationalPatterns;

public class SingletonExample {

    private static SingletonExample instance; //metoda statyczna, która zwraca instancję klasy SingletonExample
    public String s = "";

    private SingletonExample() { // konstruktor musi być prywatny bo nie można tworzyć instancji klasy SingletonExample
        s = "Hello I am a string part of Singleton class";
    }

    public static synchronized SingletonExample getInstance() {//tylko jeden wątek może tworzy instancję
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("EagerSingleton: Witaj w Singletonie!");
    }


    public static void main(String[] args) {
        SingletonExample singletonExample0 = new SingletonExample();// w ten sposób nie można utworzyć obiektu klasy SingletonExample bo konstruktor jest prywatny
        singletonExample0.showMessage();
        //  singletonExample0.getInstance().showMessage();

        SingletonExample x = SingletonExample.getInstance();
        SingletonExample y = SingletonExample.getInstance(); // ten sam hascode bo to ta sama instancja która jest utworzona za pierwszym razem w metodzie getInstance() x i y to referencje do tej samej instancji
        SingletonExample z = SingletonExample.getInstance();
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}