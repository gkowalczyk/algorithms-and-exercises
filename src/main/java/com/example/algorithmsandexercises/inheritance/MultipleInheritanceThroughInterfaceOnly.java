package com.example.algorithmsandexercises.inheritance;

//w Java nie ma wielodziedziczenia klas, ale można dziedziczyć wiele interfejsów
interface MultipleInheritanceThroughInterfaceOnly {
    void print_geek();

    interface MultipleInheritanceThroughInterfaceOnly2 {
        void print_for();
    }

    interface MultipleInheritanceThroughInterfaceOnly3 extends
            MultipleInheritanceThroughInterfaceOnly, MultipleInheritanceThroughInterfaceOnly2 {
        void print_last();
    }


    class Child implements MultipleInheritanceThroughInterfaceOnly3 {

        @Override
        public void print_geek() {

        }

        @Override
        public void print_for() {

        }

        @Override
        public void print_last() {

        }

        public static void main(String[] args) {
            Child geek = new Child();
            geek.print_geek();
            geek.print_for();
            geek.print_last();
        }
    }
}
