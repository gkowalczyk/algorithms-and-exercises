package mod1;

public abstract interface Bank {
    void deposit();
    void withdraw();
    void loan();
    void account();
}

abstract class Dev1 implements Bank {
    public void deposit() {
        System.out.println("Deposited" + 100);
    }
}
 abstract class Dev2 extends Dev1 {
     public void withdraw() {
         System.out.println("Withdrawn" + 10);
     }
 }

    class Dev3 extends Dev2 {
        public void loan() {
            System.out.println("Loan" + 1000);
        }

        @Override
        public void account() {
            System.out.println("Account" + 10000);
        }
    }
    class GFG {
        public static void main(String[] args) {
            Dev3 dev3 = new Dev3(); //
            dev3.deposit(); //
            dev3.withdraw();
            dev3.loan();
            dev3.account();
        }
    }

