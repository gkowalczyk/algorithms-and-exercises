package com.example.algorithmsandexercises.casting;

public class CastingExample {


    public static void main(String[] args) {
        //implicit casting
        //rzutowanie niejawne
        int intValue = 10;
        double doubleValue = intValue;

        //explicit casting
        //rzutowanie jawne
        double d = 10.5;
        int i = (int) d;


        class Animal {

            void makeSound() {
                System.out.println("Animal is making a sound");
            }
        }
            class Dog extends Animal {
                void makeSound() {
                    System.out.println("Dog is barking");
                }

                public static void main(String[] args) {
                    Animal a = new Dog(); //rzutowanie niejawne
                    a.makeSound();
                    Dog d = (Dog) a; //rzutowanie jawne
                    d.makeSound();
                }
            }
        }

    }
