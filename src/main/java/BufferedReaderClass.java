import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {

        //Metody użycia w pętli klasy BufferedReader która jest wydajniejsza niż Scanner
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[5];
        String[] strArr = bufferedReader.readLine().split(" ");
        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(Arrays.toString(arr));


        //Powyższy przykłąd mozną rozwiązac jeszzcze bardziej wydajnie za pomocą strumieni

        int[] arr1 = Stream.of(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.toString(arr1));

        //lub

        List<Integer> arrayList = Stream.of(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()// przechodzenie na typ obiektowy
                        .collect(Collectors.toList());
        System.out.println(arrayList);



        //Do zgłaszania błedów
        System.err.print("Error"); // zgłaszanie błędu


        //Różńice między System.out.println() a System.out.print()

        System.out.print("GfG! ");
        System.out.print("GfG! ");
        System.out.print("GfG! ");

        System.out.println();
        System.out.println();
        System.out.println("Using println()");

        // using println()
        // all are printed in the
        // different line
        System.out.println("GfG! ");
        System.out.println("GfG! ");
        System.out.println("GfG! ");




        //Porównanie i opis System.out.println() oraz System.out.print()
        System.out.println();
        //System - klasa finalna zdefiniowana w java.lang package.
        //out - instancja klasy PrintStream która jest polem statycznym klasy System
        //println() - metoda klasy PrintStream która jest używana do wyświetlania wartości na konsoli z nową linią

        System.in.read(); // odczyt bajtu z konsoli

        //odczyt poprzez DataInputStream który rózni sięod BufferedReader tym, że nie jest synchronizowany oraz nie jest wątko bezpieczny
        DataInputStream reader = new DataInputStream(System.in);
        System.out.println("Enter your int: ");
        int inputInt = Integer.parseInt(reader.readLine());
        System.out.println("Enter aa String");
        String inputString = reader.readLine();
        System.out.println("You entered integer: " + inputInt);
        System.out.println("You entered string: " + inputString);


//InputStreamReader  - konwersja strumienia bajtów na strumień znaków
//DataInputStream - odczyt danych z wejścia ,
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));// odpowiada za wczytywanie danych z klawiatury
        String str = bfn.readLine();// wywołanie metody readLine() powoduje oczekiwanie na wprowadzenie danych z klawiatury

        int integer = Integer.parseInt(bfn.readLine());

        System.out.println(str);
        System.out.println(integer);

        //lub opcjonalnie, lepiej

        BufferedReader bfn1 = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try {
            System.out.println("Enter name:");
            name = bfn1.readLine();
            System.out.println("Name =" + name);
        } catch (Exception exception) {

        }

        // możemy też używać klasy Scanner

        Scanner scn = new Scanner(System.in);
        String str1 = scn.next(); // zwraca pojedyncze słowo
        System.out.println("Entered String = " + str1);

        String str2 = scn.nextLine(); // zwraca następną linijkę
        System.out.println("Entered String = " + str2);

        // input is an Integer
        // read by nextInt() function
        int x = scn.nextInt();

        // print integer
        System.out.println("Entered Integer : " + x);

        // input is a floatingValue
        // read by nextFloat() function
        float f = scn.nextFloat();

        // print floating value
        System.out.println("Entered FloatValue : " + f);


        // Przykład zsumowania liczb całkowitych wprowadzonych przez użytkownika
        System.out.println("Wprowadź liczby całkowite do zsumowania (wprowadź nie-liczbę, aby zakończyć):");
        int sum = 0, count = 0;
        while (scn.hasNextInt()) { // użycie skanera w pętli
            int num = scn.nextInt();
            sum += num;

        }
        System.out.println("Wynik =" + sum);
        scn.close();

        //Różnice pomiędzy BufferedReader a Scanner

        Scanner scn2 = new Scanner(System.in);
        System.out.println("Enter an integer & a String");

        int a = scn2.nextInt();
        String b = scn2.nextLine();
        // int c = scn2.nextInt();// to nie zadziała bo

        System.out.printf("You have entered:- " + a + " "
                + "and name as " + b); // widać że scanner automatycznie przechodzi do nowej linii i odczytuje jako String oraz Int w jednym
        //  System.out.println(c); // to nie będzie działać bo scanner nie odczyta inta ze wz`

        System.out.println("\n");

        BufferedReader bfn2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer");
        int a1 = Integer.parseInt(bfn2.readLine());
        System.out.println("Enter an string");
        String b1 = bfn2.readLine();
        System.out.printf("You have entered:- " + a1
                + " and name as " + b1);


        //Inna opcja to użycie Console Class

        //  String name = System.console().readLine();
        //  System.out.println("Name = " + name);


        // Inna oopcja to użycie args w main z linii poleceń poprzez wpisanie w terminalu np. java BufferedReaderClass arg1 arg2 arg3


        if (args.length > 0) {
            System.out.println(
                    "The command line arguments are:");

            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        } else
            System.out.println("No command line " + "arguments found)");
    }
}