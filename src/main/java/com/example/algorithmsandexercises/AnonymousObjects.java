package com.example.algorithmsandexercises;

//instancje klas bez przypisania ich do zmiennej
//instance of class without assigning them to a variable
public class AnonymousObjects {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous class");
            }
        };
        new Thread(runnable).start();//implementacja interfejsu Runnable w klasie anonimowej ktora zostala utworzona bez przypisania jej do zmiennej
    }
}
