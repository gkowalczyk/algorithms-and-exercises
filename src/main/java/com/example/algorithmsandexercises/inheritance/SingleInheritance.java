package com.example.algorithmsandexercises.inheritance;

public class SingleInheritance {

    public void print_geek() {
        System.out.println("Geeks");
    }
}
class SingleInheritance2 extends SingleInheritance {
    public void print_for() {
        System.out.println("for");
    }
}

class Main {
    public static void main(String[] args) {
        SingleInheritance2 geek = new SingleInheritance2();
        geek.print_geek();
        geek.print_for();
        geek.print_geek();
    }
}
