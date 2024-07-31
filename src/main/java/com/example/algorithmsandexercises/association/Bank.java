package com.example.algorithmsandexercises.association;

import InterfaceAndAbstractClass.Employee;

import java.util.HashSet;
import java.util.Set;
//Obiekty istnieje niezależnie od siebie,  konstruktorze jest tylko String name
public class Bank {

    private String name;
    private Set<Employee1> employees;

    public Bank(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee1> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee1> employees) {
        this.employees = employees;
    }
}


class Employee1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee1(String name) {
        this.name = name;
    }
}

class AssociationExample {
    public static void main(String[] args) {
//W powyższym przykładzie dwie oddzielne klasy Bank i Pracownik są powiązane poprzez swoje Obiekty. Bank może mieć wielu pracowników, jest to więc relacja jeden do wielu.

        Employee1 employee = new Employee1("John");
        Employee1 employee1 = new Employee1("David");
        Set<Employee1> employees = new HashSet<>();
        employees.add(employee);
        employees.add(employee1);
        Bank bank = new Bank("XYZ");
        bank.setEmployees(employees);
        bank.getEmployees().forEach(e -> System.out.println(e.getName()));
    }
    //
}