package com.example.algorithmsandexercises.structuralPattern;
//Wzorzez Bridge - gdy chcemy zmieniać abstrakcję od jej
// implementacji niezależnie od siebie
public interface Implementor {
    void operationImpl();
}

class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB operation");
    }
}

class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA operation");
    }
}

abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}

class RedefinedAbstraction extends Abstraction {

    public RedefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.operationImpl();
    }

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RedefinedAbstraction(implementor);
        abstraction.operation();
    }
}

