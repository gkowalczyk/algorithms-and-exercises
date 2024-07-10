package SinglyLinkedList;

public class App {

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("- Lista jednokierunkowa - driver klasy -");
        System.out.println("----------------------------------------\n");

        //deklaracja listy jednokierunkowej dla danych typu int

        SinglyLinkedList<Integer> listInt = new SinglyLinkedList<Integer>();
        SinglyLinkedList<String> listString = new SinglyLinkedList<String>();

       /* System.out.println("Czy lista pusta?: " + listInt.isEmpty());
        System.out.println("Ile wezlow?: " + listInt.getSize());

        System.out.println("----------------------------------------");
        System.out.println("-      Dodawanie na początku listy     -");
        System.out.println("----------------------------------------\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Dodawanie na początku: " + i);
            listInt.addFirst(i);
            System.out.println("Czy lista pusta?: " + listInt.isEmpty());
            System.out.println("Ilosc wezłów: " + listInt.getSize());
            System.out.println("Ostatni: " + listInt.tail());
            System.out.println("Pierwszy: " + listInt.firstElement());
        }

        System.out.println("Usuwanie na początku");
        listInt.removeFirst();
        System.out.println("Ostatni: " + listInt.tail());
        System.out.println("Pierwszy: " + listInt.firstElement());

        System.out.println("----------------------------------------");
        System.out.println("-       Dodawanie na końcu listy       -");
        System.out.println("----------------------------------------\n");


       for (int i = 0; i < 3; i++) {
            System.out.println("Dodawanie na końcu: " + i);
            listInt.addLast(i);
            System.out.println("Czy lista pusta?: " + listInt.isEmpty());
            System.out.println("Ilosc wezłów: " + listInt.getSize());
            System.out.println("Ostatni: " + listInt.tail());
            System.out.println("Pierwszy: " + listInt.firstElement());

            System.out.println("----------------------------------------");
            System.out.println("-       Lista String                   -");
            System.out.println("----------------------------------------\n");*/

            listString.addFirst("1");
            listString.addFirst("2");
        listString.addFirst("5");
            listString.addLast("3");
           listString.addLast("4");
           listString.addFirst("0");

           System.out.println("Usuwanie na początku\n");
           listString.removeFirst();
            System.out.println("Ostatni: " + listString.tail());
            System.out.println("Pierwszy: " + listString.firstElement());
           System.out.println(listString.toString());
        }
    }
