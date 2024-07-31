package com.example.algorithmsandexercises;

import InterfaceAndAbstractClass.Student;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysInJava {
    public static void main(String[] args) {

        class Student {
            int id;
            int age;
            double grade;


            public Student(int id, int age, double grade) {
                this.id = id;
                this.age = age;
                this.grade = grade;
            }

            public Student(double grade) {
                this.grade = grade;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + id + '\'' +
                        ", age=" + age +
                        ", grade=" + grade +
                        '}';
            }
        }

        Student[] students = new Student[3]; //1 sposób
        Student[] students1 = new Student[]{new Student(123, 18, 4.5)};//2 sposób

        students[0] = new Student(123, 20, 4.5);
        students[1] = new Student(123, 21, 3.5);
        students[2] = new Student(123, 22, 4.0);


        Arrays.stream(students)
                .forEach(student -> System.out.println(student.id + " " + student.age + " " + student.grade));
        //Złożoność czasowa O(n)

        //Tablica jako lista:

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.asList(numbers));



        //Tablice 2D
        int rows= 4;
        int value = 0 ;
        int columns = 4;
        int[][]arrays = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arrays[i][j] = value;
                value++;
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }



        //Tablica postrzępiona
        System.out.println("Jagged Array");
        System.out.print("\n");
        int [][] arrayJagged = new int[2][];
        arrayJagged[0] = new int[3]; //liczba kolumn
        arrayJagged[1] = new int[2];
        int counter = 0;

        for(int i = 0; i < arrayJagged.length; i++) {
            for (int j = 0; j < arrayJagged[i].length; j++) {
                arrayJagged[i][j] = counter++;

            }
        }
            for(int i = 0; i < arrayJagged.length; i++){ //
                for(int j = 0; j < arrayJagged[i].length; j++){
                    System.out.print(arrayJagged[i][j] + " ");

                }
                System.out.println();
        }


        //Tablica postrzępiona z rosnąymi wartościami

        System.out.println("Jagged Array with increasing values");
            int height = 5;
            int[][] arrayJagged1 = new int[height][];// liczba wierszy
            int counter1 = 0;

            for(int i  = 0; i < arrayJagged1.length; i++) {
                arrayJagged1[i] = new int[i + 1]; // liczba kolumn
                for(int j = 0; j <= i; j++) {
                   arrayJagged1[i][j] = counter1++;
                }
                          }

        for(int i  = 0; i < arrayJagged1.length; i++) {
            for(int j = 0; j < arrayJagged1[i].length; j++) {
                System.out.print(arrayJagged1[i][j] + " ");
            }
            System.out.println();
        }

         //tablice finalne

        final int[] arr = { 1, 2, 3, 4, 5 };

        arr[4] = 1;//można zmienić wartość bo `arr` jest finalne, ale nie jest to zmienna finalna
       // arr = new int[]{1, 2, 3, 4, 5};//nie można przypisać nowej tablicy do `arr` bo jest finalne
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //




        //Wyszukiwanie binarne

        int key = 4;
        System.out.println(key + " " + "was found at index:" + Arrays.binarySearch(numbers, key));


        ////Wyszukiwanie binarne z zakresem

        int key1 = 4;
        System.out.println(key + " " + "was found at index:" + Arrays.binarySearch(numbers, 1, 3, key1));


        //Metoda leksykograficzna do porównywania tablic
        //Zwraca 0, jeśli obie tablice są równe (mają te same elementy w tej samej kolejności).
        //Zwraca wartość ujemną, jeśli pierwsza tablica jest leksykograficznie mniejsza od drugiej.
        //Zwraca wartość dodatnią, jeśli pierwsza tablica jest leksykograficznie większa od drugiej.

        int[] numbers1 = new int[]{1, 2, 10, 4, 5, 6};

        System.out.println("Integer Arrays on comparison: "
                + Arrays.compare(numbers, numbers1));// zwróci 3 bo ma 3 inne elementy


        //Metoda do porównania CompareUnsigned jako liczby bez znaku

        //Metoda Arrays.compareUnsigned porównuje elementy bez uwzględniania znaku.
        // W przypadku liczb całkowitych oznacza to, że liczby ujemne są
        // traktowane jako duże dodatnie liczby. W języku Java, liczba -1
        // traktowana jest jako 4294967295 dla 32-bitowego int, a -2 jako 4294967294.
        //
        //Przykład dla liczby -1 w 32-bitowej reprezentacji:
        //
        //Najpierw zapisujemy wartość dodatnią 1 w postaci binarnej: 00000000 00000000 00000000 00000001.
        //Inwertujemy wszystkie bity: 11111111 11111111 11111111 11111110.
        //Dodajemy 1 do wyniku: 11111111 11111111 11111111 11111111.
        //W rezultacie -1 w systemie uzupełnienia do dwóch to: 11111111 11111111 11111111 11111111
        // w binarnej reprezentacji.
        //Porównanie pierwszych elementów: -1 (traktowane jako 4294967295) i 1
        //4294967295 jest większe od 1, więc wynik porównania będzie dodatni.
        int[] numbers2 = new int[]{-1, -2, 3};
        int[] numbers3 = new int[]{1, 2, 3};
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compareUnsigned(numbers2, numbers3));// zwróci 1 bo

        // Metodda Arrays.copy

        System.out.println(Arrays.toString(numbers));
        System.out.println("\nNew Arrays by copyOf:\n");
        System.out.println(Arrays.toString(Arrays.copyOf(numbers, 5)));


        //Metoda Arrays.copyOfRange

        System.out.println("Integer Array: "
                + Arrays.toString(numbers));

        System.out.println("\nNew Arrays by copyOfRange:\n");

        // To copy the array into an array of new length
        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOfRange(numbers, 1, 3)));


        //Metoda deepEquals

        int intArr[][] = {{10, 20, 15, 22, 35}};

        // Get the second Arrays
        int intArr1[][] = {{10, 15, 22}};

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.deepEquals(intArr, intArr1));// porównuje tablice wielowymiarowe,  umożliwia porównywanie takich struktur na wszystkich poziomach zagnieżdżenia, zapewniając dokładność porównania ich rzeczywistej zawartości.

        // Metoda deppHascode
        System.out.println("Integer Array: "
                + Arrays.deepHashCode(intArr));// zwraca hashcode tablicy wielowymiarowej


        //Metoda deepToString
        // To get the deep String of the arrays
        System.out.println("Integer Array: "
                + Arrays.deepToString(intArr));


        //Metoda equals
//Metoda Arrays.equals porównuje dwie tablice, sprawdzając, czy są one identyczne pod względem referencji (adresów w pamięci) oraz struktury na
// pierwszym poziomie (czyli porównuje referencje do tablic jednowymiarowych wewnątrz dwuwymiarowej tablicy).
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.equals(intArr, intArr1));


        //Metoda fill

        int key2 = 4;
        Arrays.fill(numbers, key2);
        System.out.println("Integer Array: "
                + Arrays.toString(numbers));


        //Metoda mismatch
//do porównania dwóch tablic i znalezienia pierwszego indeksu, pod którym ich elementy różnią się
        // Get the Arrays
        int intArr3[] = {10, 20, 15, 22, 35};

        // Get the second Arrays
        int intArr4[] = {10, 15, 22};

        // To compare both arrays
        System.out.println("The element mismatched at index: "
                + Arrays.mismatch(intArr3, intArr4));


        // Metoda parallelSort
        //Metoda Arrays.parallelSort sortuje tablicę w sposób równoległy. Wykorzystuje ona wielowątkowość do
        // przyspieszenia procesu sortowania, dzieląc tablicę na mniejsze części, sortując je równolegle i scalając wyniki.
        // Get the Array
        int intArr5[] = {10, 20, 15, 22, 35};

        // To sort the array using parallelSort
        Arrays.parallelSort(intArr5);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr5));


        //Metoda sort
        // Get the Array
        int intArr6[] = {10, 20, 15, 22, 35};

        // To sort the array using normal sort-
        Arrays.sort(intArr6);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr6));


        //Metoda sort  z przedziałem

        int intArr7[] = {10, 20, 15, 22, 35};

        // To sort the array using normal sort-
        Arrays.sort(intArr7, 1, 4);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr7));



        // metoda splititerator
      //Używamy metody Spliterators.spliterator do utworzenia Spliterator dla tablicy int.
        //Spliterator jest mechanizmem do iteracji elementów, który wspiera równoległe przetwarzanie danych.
        int intArr8[] = {10, 20, 15, 22, 35};

        // To sort the array using normal sort-
        Arrays.sort(intArr8, 1, 4);

        System.out.println("Integer Array: "
                + Arrays.spliterator(intArr8));




    }

    static class Student1 {
        int rollno;
        String name, address;

        // Constructor
        public Student1(int rollno, String name,
                        String address) {
            this.rollno = rollno;
            this.name = name;
            this.address = address;
        }

        // Used to print student details in main()
        public String toString() {
            return this.rollno + " "
                    + this.name + " "
                    + this.address;
        }
    }

     static class SortByRoll implements Comparator<Student1> {
        public int compare (Student1 a, Student1 b) {// konieczka klasa implementująca Comparator
            return a.rollno - b.rollno;

        }

         public static void main(String[] args) {


             Student1[] arr = {new Student1(111, "bbbb", "london"),
                     new Student1(131, "aaaa", "nyc"),
                     new Student1(121, "cccc", "jaipur")};

             System.out.println("Unsorted");
             for (int i = 0; i < arr.length; i++)
                 System.out.println(arr[i]);

             Arrays.sort(arr, 1, 3, new SortByRoll()); // konieczka klasa implementująca Comparator
             // public static <T> void sort(T[] a, int fromIndex, int toIndex,
             //                                Comparator<? super T> c)

             System.out.println("\nSorted by rollno");
             for (int i = 0; i < arr.length  ; i++)
                 System.out.println(arr[i]);
         }
            }





        }











