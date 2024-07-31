import java.util.ArrayList;

public class LoopsInJava {
    public static void main(String[] args) {


        //instrukcja switch i break

        int n = 3;
        switch(n) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }







        //instrukcja continue


        for(int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // pominięcie liczby 5
            }
            System.out.println(i);
        }








        //dodawanie obiektu do kolekcji może w końcu powodować wyjątek braku pamięci

       /* ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            arrayList.add(i);
        }*/



        // pętla zagnieżdżona


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }




        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("\n");

        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 10);


//nieskończona pętla

// for(;;) {
//}

//lub

//while (true) {

        //      }

     /*   for (int x = 5; x != 0; x -= 2) { // `
            System.out.println(i);
        }
        int x = 5;

        // infinite loop because update statement
        // is not provided.
        while (x == 5) {
            System.out.println("In the loop");
        }*/
    }
}












