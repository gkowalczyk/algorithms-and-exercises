package com.example.algorithmsandexercises.innerClass;

public class Outer {

    //w metodode wystepują klasy lokalne
    void OuterMethod() {
        System.out.println("Inside OuterMethod");


        class Inner { //klasa wewnątrz metody
            void InnerMethod() {
                System.out.println("Inside InnerMethod");
            }
        }
        Inner inner = new Inner();
        inner.InnerMethod();
    }
}

class GFG {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.OuterMethod();
    }
}
