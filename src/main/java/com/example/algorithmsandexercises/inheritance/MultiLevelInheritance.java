package com.example.algorithmsandexercises.inheritance;

public class MultiLevelInheritance {

    public void print_geek() {
        System.out.println("Geeks");
    }
}

class MultiLevelInheritance2 extends MultiLevelInheritance {
    public void print_for() {
        System.out.println("for");
    }
}

class MultiLevelInheritance3 extends MultiLevelInheritance2 {
    public void print_last() {
        System.out.println("geeks");

    }
}
        class Main1 {
            public static void main(String[] args) {
                MultiLevelInheritance3 geek = new MultiLevelInheritance3();
                geek.print_geek();
                geek.print_for();
                geek.print_last();
            }
        }

