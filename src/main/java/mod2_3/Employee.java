package mod2_3;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String firstName;
    private String lastName;
    private String peselId;


    public Employee(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;

    }

    @Override
    public boolean equals(Object o) {
       Employee e = (Employee) o;
        return this.firstName.equals(e.firstName) &&
                this.lastName.equals(e.lastName) &&
                this.peselId.equals(e.peselId);

    }

    @Override
    public int hashCode() {
        return Integer.parseInt(peselId.substring(0, 5));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
class SalaryParameters {

    Double baseSalary;
    Double regulatedBonus;
    Double chefBonus;
    Double functionAddSalary;

    public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Double getRegulatedBonus() {
        return regulatedBonus;
    }

    public Double getChefBonus() {
        return chefBonus;
    }

    public Double getFunctionAddSalary() {
        return functionAddSalary;
    }

    @Override
    public String toString() {
        return "SalaryParameters{" +
                "baseSalary=" + baseSalary +
                ", regulatedBonus=" + regulatedBonus +
                ", chefBonus=" + chefBonus +
                ", functionAddSalary=" + functionAddSalary +
                '}';
    }
}

class EqualityTest {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Zachary", "Taylor", "12345678901");
        Employee worker2 = new Employee("Elizabeth", "Kowalski", "10987654321");
        System.out.println("worker1 == worker2: " + (worker1 == worker2));

        Employee worker3 = new Employee("Monica", "mith", "99999888887");
        Employee worker4 = new Employee("Monica", "Smith", "99999888887");
        System.out.println("worker3 == worker4: " + (worker3 == worker4));

        System.out.println(worker3.equals(worker4));// sprawdzenie metody equals


        SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
        SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
        SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);

        Map<Employee, SalaryParameters> map = new HashMap<>();
        map.put(worker1, params1);
        map.put(worker2, params2);
        map.put(worker3, params3);

        System.out.println("Salary employee 1=" + map.get(worker1));

        for(Map.Entry<Employee, SalaryParameters> entry: map.entrySet()) {
            if (entry.getValue().getBaseSalary() >= 5000) {
                System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
            }
        }




    }
}