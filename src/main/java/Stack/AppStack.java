package Stack;

public class AppStack {

    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        System.out.println("-       stos - driver klasy            -");
        System.out.println("----------------------------------------\n");

        ArrayStack<Integer> stackInt = new ArrayStack<Integer>(10);
        LinkedStack<Integer> stackListInt = new LinkedStack<Integer>();

        System.out.println("Czy stos pusty?: " + stackInt.isEmpty());
        System.out.println("Ile elementow?: " + stackInt.size());

        System.out.println("----------------------------------------");
        System.out.println("-           Dodawanie do stosu         -");
        System.out.println("----------------------------------------\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("----------------------------------------\n");
            System.out.println("Dodawanie elementu: " + i);
            stackInt.push(i);
            stackListInt.push(i);
            System.out.println("-tablica----------------------------------");
            System.out.println("Czy stos pusty?: " + stackInt.isEmpty());
            System.out.println("Ilosc elemntow: " + stackInt.size());
            System.out.println("Gora: " + stackInt.top());
            System.out.println("----------------------------------------\n");
            System.out.println("Czy stos pusty?: " + stackListInt.isEmpty());
            System.out.println("Ilosc elemntow: " + stackListInt.size());
            System.out.println("Gora: " + stackListInt.top());
            System.out.println("----------------------------------------\n");

        }

        System.out.println("----------------------------------------");
        System.out.println("-      Usuwanie ze stosu na tablicy   -");
        System.out.println("----------------------------------------\n");

        for (int i = stackInt.size(); i > 0; i--) {
            System.out.println("----------------------------------------\n");
            System.out.println("usuwanie elementu: " + stackInt.pop());
            System.out.println("Czy stos pusty?: " + stackInt.isEmpty());
            System.out.println("Ilosc elemntow: " + stackInt.size());
            System.out.println("Gora: " + stackInt.top());
            System.out.println("----------------------------------------\n");
        }
        System.out.println("Czy stos na tablicy pusty?: " + stackInt.isEmpty());

        while (!stackListInt.isEmpty()) {
            System.out.println("----------------------------------------\n");
            System.out.println("usuwanie elementu: " + stackListInt.pop());
            System.out.println("Czy stos pusty?: " + stackListInt.isEmpty());
            System.out.println("Ilosc elemntow: " + stackListInt.size());
            System.out.println("Gora: " + stackListInt.top());
            System.out.println("----------------------------------------\n");
        }
        System.out.println("Czy stos na liscie pusty?: " + stackListInt.isEmpty());
    }
            }
