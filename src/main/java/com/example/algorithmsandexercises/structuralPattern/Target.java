package com.example.algorithmsandexercises.structuralPattern;

// Wzorzez adapter pozwala na współpracę dwóch klas o niekompatybilnych interfejsach. Adapter działa jako pośrednik, który tłumaczy zapytania z jednego interfejsu na drugi.
public interface Target {
    void request();
}

class Adaptee {
    public void specificRequest() {
        System.out.println("Adaptee: specificRequest");
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}


