package com.example.algorithmsandexercises;

public class ThisReference {

    String name;
    int age;

    public ThisReference(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ThisReference() { // uzyte do wywołania konstruktora
        this("name", 14);
        System.out.println("Inside  default constructor \n");
    }

    ThisReference getThisReference() { // zwrócenie bieżącej instancji klasy
        return this;
    }

    void display() {// zwrócenie bieżącej instancji klasy
        System.out.println("name display=" + name);
    }

    void display1(ThisReference obj) {// użycie this jako parmetru metody
        System.out.println("parametr metody =" + name);
    }

    void get() {// użycie this jako parmetru metody
        display1(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ThisReference{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printDetails() {
        System.out.println("name:" + this.name);
        System.out.println("name:" + name);
    }

    public static void main(String[] args) {
        ThisReference thisReference = new ThisReference("Ola", 20);
        thisReference.printDetails();
        thisReference.setName("Ania");
        thisReference.printDetails();

        ThisReference thisReference1 = new ThisReference();
        System.out.println(thisReference1);

        thisReference.getThisReference().display();

        thisReference.get();
    }
}