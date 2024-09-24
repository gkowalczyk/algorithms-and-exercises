package com.example.algorithmsandexercises.creationalPatterns;

abstract public class FactoryMethodProduct {

    abstract void use();
}


class ConcreteProductA extends FactoryMethodProduct {

    @Override
    void use() {
        System.out.println("ConcreteProductA");
    }
}


class ConcreteProductB extends FactoryMethodProduct {

    @Override
    void use() {
        System.out.println("ConcreteProductB");
    }
}

abstract class Creator {
    public abstract FactoryMethodProduct factoryMethodProduct();

    public void someOperation() {
        FactoryMethodProduct factoryMethodProduct = factoryMethodProduct();
        factoryMethodProduct.use();
    }


    static class RunCreatorA extends Creator {

        @Override
        public FactoryMethodProduct factoryMethodProduct() {
            return new ConcreteProductA();
        }
    }

    class RunCreatorB extends Creator {

        @Override
        public FactoryMethodProduct factoryMethodProduct() {
            return new ConcreteProductB();
        }
    }



    public static void main(String[] args) {
       Creator creator = new RunCreatorA();
            creator.someOperation();
    }
}
