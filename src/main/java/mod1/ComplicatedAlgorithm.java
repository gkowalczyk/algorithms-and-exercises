package mod1;

abstract class ComplicatedAlgorithm {



    abstract protected void firstMethodToImplement();//W naszym przykładzie klasa abstrakcyjna mówi klasie, która po niej dziedziczy, że metody oznaczone jako protected będą dostępne w jej obrębie i we wszystkich klasach, które po niej dziedziczą.

    abstract protected void secondMethodToImplement();


    private void thirdMethodToImplement() {
        System.out.println("Third method to implement");
    }

    private void fourthMethodToImplement() {
        System.out.println("Fourth method to implement");
    }

    public void run() {
        firstMethodToImplement(); // metoda abstrakcyjna musi być zaimplementowana w klasie dziedziczącej
        secondMethodToImplement();// metoda abstrakcyjna musi być zaimplementowana w klasie dziedziczącej
        thirdMethodToImplement();
        fourthMethodToImplement();
    }
}
    class ComplicatedAlgorithmImpl extends ComplicatedAlgorithm {

        @Override
        protected void firstMethodToImplement() {
            System.out.println("First method to implement");
        }

        @Override
        protected void secondMethodToImplement() {
            System.out.println("Second method to implement");
        }
        @Override
        public void run() { // metoda run() jest zaimplementowana w klasie dziedziczącej, tutaj nadpisujemy metodę run() z klasy abstrakcyjnej
            firstMethodToImplement();
            secondMethodToImplement();
        }
    }

    class Runner {
        public static void main(String[] args) {
            ComplicatedAlgorithmImpl complicatedAlgorithm = new ComplicatedAlgorithmImpl();
            complicatedAlgorithm.run();

        }
    }

