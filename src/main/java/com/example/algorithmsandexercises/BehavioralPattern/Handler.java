package com.example.algorithmsandexercises.BehavioralPattern;

//Chain of Responsibility - wzorzec łańcucha odpowiedzialności, gdy chcemy przekazać żądanie
//tylko 1 obiektowi z listy obiektów
abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}

class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Handled by CA");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handled by CB");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }

    public static void main(String[] args) {
        Handler handler = new ConcreteHandler1();
        Handler handler1 = new ConcreteHandler2();
        handler.setSuccessor(handler1);

        handler.handleRequest("A");
        handler.handleRequest("B");
    }
}
