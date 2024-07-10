package mod1;

//Klasy abstrakcyjne mogą mieć również metody końcowe (metody, których nie można zastąpić)
public abstract class Base2 {

    final void fun() {
        System.out.println("Base2 `fun()` method");
    }
    static void demoFun() {//Podobnie jak w przypadku interfejsu,
        // w klasie abstrakcyjnej możemy zdefiniować metody statyczne ,
        // które można wywoływać niezależnie, bez obiektu.
        System.out.println("Demo fun method from demoFun");
    }
}

class Derived2 extends Base2 {

}

class GFGRunner {

    public static void main(String[] args) {
        Base2 base2 = new Derived2();
        base2.fun();
        Base2.demoFun();

    }

}


