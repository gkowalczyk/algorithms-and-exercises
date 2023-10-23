package SOLID;

public class InterfaceSegregationPrinciple {

    //Zasada segregacji interfejsu (Interface Segregation Principle, ISP) jest jednym z pięciu zasad SOLID w programowaniu obiektowym. Zasada ta mówi, że klienty nie powinny być zmuszane do implementowania interfejsów, których nie używają. Zamiast tego, interfejsy powinny być specyficzne dla potrzeb klienta, aby uniknąć sytuacji, w których klient musi dostarczać implementacje nieużywanych metod.
    //
    //Teoria ISP:
    //
    //Zasada segregacji interfejsu podkreśla, że interfejsy powinny być małe, specyficzne i skoncentrowane na jednym zadaniu. Nie powinny wymagać od klienta implementacji metod, które nie są potrzebne. Dzięki temu klient nie jest zmuszany do dostarczania nieużywanych implementacji, co prowadzi do bardziej elastycznego i odizolowanego kodu.
    //
    //Przykład ISP:
    //
    //Załóżmy, że mamy interfejs Worker, który reprezentuje pracownika:
    //
    //java
    //Copy code
    public interface Worker {
        void work();

        void eat();

        //Następnie mamy dwie klasy implementujące ten interfejs: OfficeWorker (Pracownik biurowy) i FactoryWorker (Pracownik fabryczny):
        //
        //java
        //Copy code
        public class OfficeWorker implements Worker {
            public void work() {
                //        // Implementacja pracy biurowego
            }

            //
            public void eat() {
                //        // Implementacja jedzenia
            }

        }

        //
        public class FactoryWorker implements Worker {
            public void work() {
                //        // Implementacja pracy fabrycznego
            }

            //
            public void eat() {
                //        // Implementacja jedzenia
            }
        }
        //W tym przykładzie obie klasy implementują zarówno metodę work(), jak i eat(). Jednak w przypadku pracownika biurowego może być potrzebna tylko metoda work(), a w przypadku pracownika fabrycznego tylko eat().
        //
        //Aby zastosować zasadę segregacji interfejsu, możemy podzielić interfejs Worker na mniejsze interfejsy specyficzne dla każdego zadania:
        //
        //java
        //Copy code
        //public interface Workable {
        //    void work();ytg
        //}
        //
        //public interface Eatable {
        //    void eat();
        //}
        //Teraz klasy OfficeWorker i FactoryWorker mogą implementować tylko te interfejsy, które są odpowiednie dla ich zadań:
        //
        //java
        //Copy code
        //public class OfficeWorker implements Workable {
        //    public void work() {
        //        // Implementacja pracy biurowego
        //    }
        //}
        //
        //public class FactoryWorker implements Eatable {
        //    public void eat() {
        //        // Implementacja jedzenia
        //    }
        //}
        //Dzięki temu zastosowaniu zasady segregacji interfejsu, klasy są bardziej elastyczne i klient nie jest zmuszany do dostarczania niepotrzebnych implementacji.
    }
}