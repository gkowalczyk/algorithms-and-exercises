package mod1;

public abstract interface Atm {// interface is abstract by default



    void deposit();

    void withDraw();

    default void StatusConnection() {
        System.out.println("Checking status...");
    }

    static String terminateConnectionInfo() {// static method in interface
        return "End of conn";
    }


    class AtmImpl implements Atm { //
        private static final int DEPOSIT = 0;
        @Override
        public void deposit() {
            System.out.println("Deposited into an atm...");


        }

        @Override
        public void withDraw() {
            System.out.println("Withdrawn from an atm...");
        }
    }

    public static void main(String[] args) {
        AtmImpl atmImp = new AtmImpl();
        System.out.println(atmImp.hashCode());
        atmImp.deposit();
        atmImp.withDraw();
        atmImp.StatusConnection();
        System.out.println(Atm.terminateConnectionInfo());
    }
}
// : )