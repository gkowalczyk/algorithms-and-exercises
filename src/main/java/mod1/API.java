package mod1;
//Dziedziczenie wielokrotne to koncepcja OOP, której nie
// można zaimplementować w Javie przy użyciu klas.
// Ale możemy używać wielu dziedzicień w Javie za pomocą interfejsu
public abstract interface API {//abstract interface
    default void show() {
        // Print statement
        System.out.println("Default API");
    }
}
interface Interface1 extends API {
    void display();
    }

    interface Interface2 extends API {

     final static String constant = "Interface2"; // constant variable

    void print();
    }

    class TestClass implements Interface1, Interface2 {

        public void display()
        {
            System.out.println("Display from Interface1");
        }
        // Overriding the abstract method from Interface2
        public void print()
        {
            System.out.println("Print from Interface2");
        }
        // Main driver method
        public static void main(String[] args) {
            TestClass obj = new TestClass();
            obj.display();
            obj.print();
            obj.show();

        }
    }

