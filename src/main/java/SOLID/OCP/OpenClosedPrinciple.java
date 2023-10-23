package SOLID.OCP;

public class OpenClosedPrinciple {
//Zasada otwarte-zamknięte (Open-Closed Principle, OCP) jest jedną z zasad SOLID, która promuje tworzenie oprogramowania, które jest otwarte na rozszerzenia, ale zamknięte dla modyfikacji. Innymi słowy, gdy dodawane są nowe funkcje lub zachowania, nie powinno być konieczne modyfikowanie istniejącego kodu.
//
//Teoria OCP:
//
//Zasada ta mówi, że istniejący kod powinien być stabilny i nie zmieniać się, kiedy dodajemy nowe funkcje. Nowe funkcje powinny być wprowadzane poprzez rozszerzenie istniejących klas i dodawanie nowych klas, a nie poprzez zmiany istniejącego kodu. Dzięki temu zminimalizowana zostaje szansa wprowadzenia błędów do już działającego kodu, a także zwiększa się elastyczność systemu, umożliwiając dodawanie nowych funkcji bez ryzyka psucia istniejącej funkcjonalności.

    interface paymentMethod {
        void processPayment(double amount);
    }



    class CreditCardMethod implements paymentMethod {

        @Override
        public void processPayment(double amount) {

        }
    }

    //gdy chcemy rozszerzyć klasę dodajemy ..............implementację nowej klasy

    class DigitalPaymentMethod implements paymentMethod {

        @Override
        public void processPayment(double amount) {

        }
    }
}
