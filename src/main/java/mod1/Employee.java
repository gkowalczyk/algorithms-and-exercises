package mod1;

public interface Employee {

    double calculateSalary();

}

class ProductBasedEmployee implements Employee {

    private double rate;
    private int pcs;

    public ProductBasedEmployee(double rate, int pcs) {
        this.rate = rate;
        this.pcs = pcs;
    }

    @Override
    public double calculateSalary() {
        return rate * pcs;
    }
}

class SalesEmployee implements Employee {

    private double baseSalary;
    private boolean bonus;

    public SalesEmployee(double baseSalary, boolean bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return bonus ? baseSalary * 1.2 : baseSalary;
    }
}


class FixedSalaryEmployee implements Employee {

    private double salary;


    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

class HourlySalaryEmployee implements Employee {

    private double hourlySalary;
    private int hours;

    public HourlySalaryEmployee(double hourlySalary, int hours) {
        this.hourlySalary = hourlySalary;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return hourlySalary * hours;
    }
}

abstract class SalaryPayout {
    private final Employee employee;
    private int pcs;


    protected SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Processing payout");
        payout();
        System.out.println("Payment completed");
    }
}

class SalaryPayoutProcessor extends SalaryPayout {

    protected SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    @Override
    protected void payout() {

        System.out.println("Sending money to employee");
    }
}

class startApp {
    public static void main(String[] args) {

        SalaryPayoutProcessor salaryPayoutProcessor = new SalaryPayoutProcessor(new FixedSalaryEmployee(5000));
        salaryPayoutProcessor.processPayout();

        ProductBasedEmployee productBasedEmployee = new ProductBasedEmployee(5, 100);
        System.out.println(productBasedEmployee.calculateSalary());

        SalesEmployee salesEmployee = new SalesEmployee(5000, true);
        System.out.println(salesEmployee.calculateSalary());


    }
}
