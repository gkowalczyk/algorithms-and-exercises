package com.example.algorithmsandexercises.structuralPattern;

//Fasada - pozwala na uproszczenie interfejsu dla klienta
class Facade {

    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
    }

    public void operation() {
        subsystemA.operationA();
        subsystemB.operationB();
    }

    public class SubsystemA {
        public void operationA() {
            System.out.println("SubsystemA operation");
        }
    }

    public class SubsystemB {
        public void operationB() {
            System.out.println("SubsystemB operation");
        }
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
        }
