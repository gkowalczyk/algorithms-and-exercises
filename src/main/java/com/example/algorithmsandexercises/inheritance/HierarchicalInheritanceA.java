package com.example.algorithmsandexercises.inheritance;


    class HierarchicalInheritanceA {
        public void print_A() {
            System.out.println("Class A");
        }
    }

    class HierarchicalInheritanceB extends HierarchicalInheritanceA {
        public void print_B() {
            System.out.println("Class B");
        }
    }

    class HierarchicalInheritanceC extends HierarchicalInheritanceA {
        public void print_C() {
            System.out.println("Class C");
        }
    }

    class HierarchicalInheritanceD extends HierarchicalInheritanceA {
        public void print_D() {
            System.out.println("Class D");
        }
    }

    class Main2 {
        public static void main(String[] args) {
           HierarchicalInheritanceB b = new HierarchicalInheritanceB();
                HierarchicalInheritanceC c = new HierarchicalInheritanceC();
                HierarchicalInheritanceD d = new HierarchicalInheritanceD();
                b.print_A();
                b.print_B();
                c.print_A();
                c.print_C();
                d.print_A();
                d.print_D();
        }
    }

