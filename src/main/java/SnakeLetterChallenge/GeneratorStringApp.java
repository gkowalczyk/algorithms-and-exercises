package SnakeLetterChallenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Część 1
//
//Napisz program, który w kolejce ArrayDeque umieści 50 obiektów
// przechowujących napisy (ciągi znaków), składające się z litery 'a'
// powtórzonej losową ilość razy (zakres powtórzeń: 1-50).
//Wypełnienie obiektu powtórzeniami litery 'a' zrealizuj przy pomocy pętli for.
//Część 2
//
//Program z części pierwszej rozbuduj w taki sposób, że przekażesz
// utworzoną kolejkę do metody Twojej klasy, która dokona rozdzielenia
// obiektów z kolejki na dwie kolekcje ArrayList.
//Jedna z nich będzie przechowywała obiekty o parzystej liczbie znaków
// 'a', a druga o nieparzystej.
public class GeneratorStringApp {

    public final Deque<String> generateString() {

        String a = "a";
        ArrayDeque<String> arrayDeque = IntStream.range(0, 50)
                .mapToObj(i -> a.repeat(new Random().nextInt(50)))
                .collect(Collectors.toCollection(ArrayDeque::new));


        // System.out.println(stringDeque);
        return arrayDeque;
    }

    public void checkerEvenOrOddLengthString(Deque<String> stringDeque) {
        List<String> evenString = new ArrayList<>();
        List<String> oddList = new ArrayList<>();

        while (stringDeque.size() > 0) {
            String temporary = stringDeque.poll();
            if (temporary.length() % 2 == 0) {
                evenString.add(temporary);
            }
            oddList.add(temporary);
        }
        System.out.println(evenString);
        System.out.println(oddList);
    }
}
