package mod1;
//Abstrakcja w Javie to proces, w którym pokazujemy użytkownikowi jedynie istotne szczegóły/funkcje. Nieistotne szczegóły implementacji nie są wyświetlane użytkownikowi.

public abstract class ATMApp {
    private void requestCard() {
        System.out.println("Wsadź kartę");
    }

    private void requestPIN() {
        System.out.println("Podaj PIN");
    }

    private void requestAmount() {
        System.out.println("Podaj kwotę");
    }

    abstract void receiveRequest();
    abstract void checkAccountBalance();
    abstract void confirmWithdrawal();


    private void dispenseCash() {
        System.out.println("Wypłacono gotówkę");
    }

    private void thanksCustomer() {
        System.out.println("Dziękujemy za skorzystanie z naszych usług");
    }

    public void execute() {
        requestCard();
        requestPIN();
        requestAmount();
        receiveRequest();
        checkAccountBalance();
        confirmWithdrawal();
        dispenseCash();
        thanksCustomer();
    }
}
class AtmAppRunner extends ATMApp {

    @Override
    void receiveRequest() {
        System.out.println("Otrzymano żądanie");
    }
    @Override
    void checkAccountBalance() {
        System.out.println("Sprawdzanie stanu konta");
    }
    @Override
    void confirmWithdrawal() {
        System.out.println("Potwierdzenie wypłaty");
    }
}

class RunnerClass {
    public static void main(String[] args) {
        AtmAppRunner atmApp = new AtmAppRunner();
        atmApp.execute();

        ATMApp atmApp1 = new AtmAppRunner();
        atmApp1.execute();

        ATMApp atmApp2 = new ATMApp() { // nie można utworzyć obiektu klasy abstrakcyjnej
            @Override
            void receiveRequest() {

            }

            @Override
            void checkAccountBalance() {

            }

            @Override
            void confirmWithdrawal() {

            }
        };
        atmApp2.execute();
    }
}
