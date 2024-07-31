package com.example.algorithmsandexercises.accessModifiers2;

import com.example.algorithmsandexercises.accessModifiers1.AccessModifiers;

public class AccessModifiers2 extends AccessModifiers {

    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
       // accessModifiers.defaultMethod();//nie działa bo jest metoda defaultowa z
        //dostępem tylko w obebie pakietu

        AccessModifiers2 accessModifiers2 = new AccessModifiers2();
        accessModifiers2.displayProtected();// można uzyskać dostęp do protected poprzez dziedziczenie


    }
}
