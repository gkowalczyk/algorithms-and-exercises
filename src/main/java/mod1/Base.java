package mod1;
//Podobnie jak C++, klasa abstrakcyjna może zawierać konstruktory w
// Javie. Konstruktor klasy abstrakcyjnej jest wywoływany, gdy tworzona jest instancja klasy dziedziczonej.
// Wygląda to tak jak na poniższym programie:
public abstract class Base {

    public Base() {
        System.out.println("Base constructor");
    }

    abstract void fun();
}

class Derived extends Base {

    public Derived() {
        System.out.println("Derived constructor");
    }

    @Override
    void fun() {
        System.out.println("Derived `fun()` method");
    }

}
 class AppRun {
     public static void main(String[] args) {
         Derived derived = new Derived();
         derived.fun();
     }
 }