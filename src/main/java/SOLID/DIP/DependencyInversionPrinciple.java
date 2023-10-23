
package SOLID.DIP;


public class DependencyInversionPrinciple {

    //Moduły wysokiego poziomu nie powinny zależeć od modułów niskiego poziomu. Oba powinny zależeć od abstrakcji.
    // Abstrakcje nie powinny zależeć od szczegółów. Szczegóły powinny zależeć od abstrakcji. Zasada odwrócenia
    // zależności określa, że powinniśmy oddzielać moduły wysokiego poziomu od modułów niskiego poziomu, wprowadzając
    // warstwę abstrakcji między klasami wysokiego poziomu a klasami warstwy niższej. W klasyczny sposób, gdy moduł oprogramowania
    // (klasa, komponent) potrzebuje jakiegoś innego modułu, inicjuje się i zawiera bezpośrednie odniesienie do niego. Spowoduje
    // to ścisłe połączenie tych dwóch elementów. Stosując odwrócenie zależności poprzez warstwę abstrakcji, moduły mogą być łatwo zamieniane na inne.
    //
    //Jest to w mojej opinii najważniejsza zasada, dotycząca nie tyle projektu systemu co jego architektury.



public class Worker {
    public void work() {

    }
}

    public class Manager {
        Worker worker;

        public void setWorker(Worker worker) {
            this.worker = worker;
        }
        public void manage() {
            worker.work();
    }
//Widać, że obiekt Manager jest bezpośrednio zależny od obiektu Worker, co powoduje, że te dwa elementy są ze sobą trwale powiązane i zmiana Worker na alternatywny nie może zostać wykonana bez modyfikacji klasy Manager.
    }


    public interface IWorker {
        public void work();
    }


    public class GoodWorker implements IWorker {

        @Override
        public void work() {

        }

        public class Manager {
            IWorker iWorker;

            public void setiWorker(IWorker iWorker) {
                this.iWorker = iWorker;
            }

            public void manage() {
                iWorker.work();
//                /
            }
            //Po korekcie obiekt Manager został pozbawiony sztywnej zależności do obiektu Worker, co daje nam możliwość podmiany implementacji interfejsu IWorker w czasie rzeczywistym bez modyfikowania warstwy wyższego rzędu.
            //
            //Zasada odwrócenia zależności wspiera również zasadę Open Close Principle, ponieważ wersja program
        }
    }
        public static void main(String[] args) {


        }
    }


