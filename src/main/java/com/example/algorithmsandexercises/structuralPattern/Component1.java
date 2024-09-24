package com.example.algorithmsandexercises.structuralPattern;

//Decorator :
//Dodaje nowe funkcjonalności do obiektów dynamicznie bez potrzeby modyfikacji icjh klasy.
public interface Component1 {
    void operation();

}

class ConcreteComponent implements Component1 {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}

abstract class Decorator implements Component1 {
    protected Component1 component;

    public Decorator(Component1 component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component1 component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    public void addedBehavior() {
        System.out.println("ConcreteDecorator addedBehavior");
    }

    public static void main(String[] args) {
        Component1 component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
        decorator.operation();
    }
}