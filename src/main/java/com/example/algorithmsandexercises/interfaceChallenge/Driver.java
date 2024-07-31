package com.example.algorithmsandexercises.interfaceChallenge;

public class Driver implements intA, intB {
    public void method1() {
        intA.super.method1(); //oznacza to że chcemy wywołać metodę domyślną z interfejsu intA, musimy ją nadpisać bo jest konflikt
        intB.super.method1(); //oznacza to że chcemy wywołać metodę domyślną z interfejsu intB, musimy ją nadpisać bo jest konflikt
    }

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.method1();
    }

}
