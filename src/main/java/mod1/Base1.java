package mod1;

//W Javie możemy mieć klasę abstrakcyjną bez żadnej metody
// abstrakcyjnej . Dzięki temu możemy tworzyć klasy, których
// instancji nie można utworzyć, a które można jedynie dziedziczyć .
// Jest to pokazane poniżej w
// następujący sposób przy pomocy czystego programu Java.
public abstract class Base1 {

    void fun() {
        System.out.println("Base1 `fun()` method");
    }
}

class Derived1 extends Base1 {
}

class Main {
    public static void main(String[] args) {
        Derived1 derived1 = new Derived1();
        derived1.fun();
        Base1 base1 = new Base1() { // nie można utworzyć instancj klasy
            @Override
            void fun() {
                super.fun();
            }
        };
    }
}
