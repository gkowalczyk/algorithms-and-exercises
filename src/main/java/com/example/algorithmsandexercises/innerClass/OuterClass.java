package com.example.algorithmsandexercises.innerClass;

public class OuterClass {

    class InnerClass {
        public void display() {
            System.out.println("This is an inner class");
        }
    }
}
    class Main {

        public static void main(String[] args) {
        OuterClass.InnerClass in = new OuterClass().new InnerClass();
        in.display();
        }
    }
