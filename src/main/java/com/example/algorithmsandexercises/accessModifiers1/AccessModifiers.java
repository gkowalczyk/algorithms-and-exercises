package com.example.algorithmsandexercises.accessModifiers1;

public class AccessModifiers {

    //default -  dostępność tylko w obrębie pakietu
    //private - dostępność tylko w obrębie klasy
    //protected  dostępność w tej samej klasie, pakiecie, w innym pakiecie dostęp poprzez dziedziczenie z klasy rodzica
    //public - bez ograniczeń

      //final , default, synchroized, abstract, native, stricfp, transient, volatile


    void defaultMethod() {
        System.out.println("Default method");
    }// metoda defaultowa z dostępem tylko w obrębie pakietu

    private final void display() {
        System.out.println("private");
    }

    protected void displayProtected() {
        System.out.println("protected");
    }




    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.defaultMethod();// dostępnie tylko w klasie
        accessModifiers.displayProtected();
    }
}


class AccessModifiers1 {
    public static void main(String[] args) {

        AccessModifiers accessModifiers = new AccessModifiers();
        //accessModifiers.display();// brak dostępu do metody prrivate z innego pakietu
        accessModifiers.displayProtected();//
    }
}