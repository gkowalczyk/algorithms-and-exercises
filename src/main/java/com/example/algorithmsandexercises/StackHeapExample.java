package com.example.algorithmsandexercises;

public class StackHeapExample {

    static class Dog {
        String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Burek");//obiekt dog jest przechowywany na stercie, ale
        // referencja dog jest przechowywana na stosie
        int result = add(2, 3);//nowa ramka stosu który przechowuje zmienne lokalne
        // a i b oraz wynik
    }
}
//+--------------------+
//|        Stos         |
//| (Stack Memory)      |
//+--------------------+
//| int result = 30     | <-- `main` method's stack frame
//| Dog dog             |
//+--------------------+
//| int sum = 30        | <-- `add` method's stack frame
//| int a = 10          |
//| int b = 20          |
//+--------------------+
//
//+--------------------+
//|        Sterta       |
//| (Heap Memory)       |
//+--------------------+
//| Dog Object          | <-- Contains name, breed, age
//| name = "Buddy"      |
//| breed = "Golden Retriever" |
//| age = 3             |
//+--------------------+