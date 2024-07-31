package mod1;

public interface A {
    void method1();
    void method2();
}

interface B extends A { // przykład na rozszerzanie interfejsów
    void method3();
}

class gfg implements B {
    public void method1() {
        System.out.println("Method 1");
    }
    public void method2() {
        System.out.println("Method 2");
    }
    public void method3() {
        System.out.println("Method 3");
    }
}

class Main1 {
    public static void main(String[] args) {
        gfg obj = new gfg();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}