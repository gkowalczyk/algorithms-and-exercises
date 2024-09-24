package com.example.algorithmsandexercises.structuralPattern;

import java.util.ArrayList;
import java.util.List;
///Composite: Komponowanie obiektów w strukturę drzewiastą,  pozwala trakatować pojedyczne obiekty i ich kompozycje w jednolity sposób
public interface Component {

    void operation();

    class Leaf implements Component {

        @Override
        public void operation() {
            System.out.println("Leaf operation");
        }
    }

    class Composite implements Component {

        List<Component> children = new ArrayList<>();

        public void add(Component component) {
            children.add(component);
        }

        public void remove(Component component) {
            children.remove(component);
        }

        @Override
        public void operation() {
            children.forEach(Component::operation);
        }
    }

    public static void main(String[] args) {
        Component leaf = new Leaf();
        Component leaf2 = new Leaf();
        Composite composite = new Composite();
        composite.add(leaf);
        composite.add(leaf2);
        composite.operation();
    }
}
