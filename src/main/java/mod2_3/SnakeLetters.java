package mod2_3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Część 1
//
//Napisz program, który w kolejce ArrayDeque umieści 50 obiektów przechowujących napisy (ciągi znaków), składające się z litery 'a' powtórzonej losową ilość razy (zakres powtórzeń: 1-50).
//Wypełnienie obiektu powtórzeniami litery 'a' zrealizuj przy pomocy pętli for.
//Część 2
//
//Program z części pierwszej rozbuduj w taki sposób, że przekażesz utworzoną kolejkę do metody Twojej klasy, która dokona rozdzielenia obiektów z kolejki na dwie kolekcje ArrayList.
//Jedna z nich będzie przechowywała obiekty o parzystej liczbie znaków 'a', a druga o nieparzystej.
//Rozwiązane zadanie wyślij do Mentora.
public class SnakeLetters {

    public static ArrayDeque<String> splitArrayDeque() {
        Random random = new Random();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 50; i++) {
            int randomInt = random.nextInt(50);
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < randomInt; j++) {
                stringBuilder.append("a"); // append dodaje do końca
            }

            arrayDeque.add(stringBuilder.toString());

        }
        return arrayDeque;
    }

    public static void separateOddOrEven(ArrayDeque<String> arrayDeque) {
        List<String> oddList = new ArrayList<>();//parzyste
        List<String> evenList = new ArrayList<>();//nieparzyste
        for (String s : arrayDeque) {
            if (s.length() % 2 == 0) {
                oddList.add(s);
            } else {
                evenList.add(s);
            }
        }
        System.out.println("Even list: " + evenList);
        System.out.println("Odd list: " + oddList);
    }

    public static void main(String[] args) {//
        separateOddOrEven(splitArrayDeque());

    }
}
