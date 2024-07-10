package SnakeLetterChallenge;

import java.util.Deque;

///Część 1
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
public class App {
    public static void main(String[] args) {
        GeneratorStringApp generatorStringApp = new GeneratorStringApp();
        Deque<String> arrayDeque = generatorStringApp.generateString();
        generatorStringApp.checkerEvenOrOddLengthString(arrayDeque);
    }
}
