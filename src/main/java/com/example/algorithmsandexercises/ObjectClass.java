package com.example.algorithmsandexercises;

import java.util.Objects;

//toString() method
//hashCode() method
//equals(Object obj) method
//finalize() method
//getClass() method
//clone() method
//wait(), notify() notifyAll() methods
public class ObjectClass {

    int idNumber;

    @Override
    public String toString() {// konwertuje obiekt na String czyli ciąg znaków
        return "ObjectClass{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectClass that = (ObjectClass) o;
        return idNumber == that.idNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber);
    }

    public static void main(String[] args) {
        ObjectClass objectClass = new ObjectClass();
        System.out.println(objectClass.toString());

        System.out.println(objectClass.hashCode());// zwraca unikalny identyfikator obiektu, ale nie jest to adres obiektu w pamięci
        System.out.println(objectClass.equals(new ObjectClass()));// porównuje dwa obiekty i zwraca true jeśli są takie same
        System.out.println(objectClass.getClass().getName());// zwraca klasę obiektu



        //Działanie metody finalize() wywoływane jest przez Garbage Collectora w momencie, gdy obiekt nie jest już używany i jest gotowy do usunięcia z pamięci.
        objectClass = null;
        System.gc();// wywołuje Garbage Collectora
        System.out.println("end of main() method");
    }
        @Override
        protected void finalize() {
            System.out.println("finalize() method");
        }

    }

