public class BubbleSort {


//6.4 Sortowanie bąbelkowe
/*Korzystając z danego poprzednio programu tworzącego losową tablicę typu double,
napisz program sortowanie bąbelkowego. Algorytm polega na porównywaniu dwóch
kolejnych elementów i zamianie ich kolejności, jeżeli zaburza ona porządek, w jakim
się sortuje tablicę. Sortowanie kończy się, gdy podczas kolejnego przejścia nie
dokonano żadnej zmiany.
Niech n-elementowa tablica a zawiera liczby int które należy posortować powiedzmy
rosnąco. Sortowanie bąbelkowe polega na zastosowaniu następującego algorytmu:
Krok 1
Zacznij od indeksu i=0 i porównaj a[0] i a[1]. Gdy a[0] > a[1] zamień je miejscami.
Teraz porównaj a[1] z a[2], gdy a[1] > a[2] zamień je miejscami. Powtarzaj ten proces
aż do końca tablicy. W wyniku tego postępowania największy element znajdzie się
na końcu tablicy. Postępowanie to nazywa się przebiegiem, przetwarzamy elementy
[0,n-1].
Krok 2
Powtarzamy powyższe postępowanie ale przetwarzamy elementy [0,n-2] gdyż w
pozycji n-1 jest największy element. Po zakończeniu tego kroku dwa ostatnie
elementy a[n-2] i a[n-1] są na właściwych pozycjach.*/


    public static void main(String[] args) {


        int SIZE = 5;
        int array[] = {6,5,1,-9,44};
        returnSumOfArray(array, SIZE);

    }
    static void returnSumOfArray(int numbers[], int size) {
        int temp;

        for (int j = 0; j < size -1 ; j++) {

            for (int i = 0; i < size - j -1 ; i++) {
                if( numbers[i] > numbers[ i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }









}
