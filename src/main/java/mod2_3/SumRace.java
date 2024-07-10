package mod2_3;

import java.util.Random;

public class SumRace {
    public static void main(String[] args) {
        Random random = new Random();
        int sumaA = 1000;
        int sumaB = 0;
        int counter = 0 ;

        while(sumaA > sumaB) {
            sumaA += random.nextInt(9);
            sumaB += random.nextInt(49);
            counter++;

        }
        System.out.println("sumaA=" + sumaA);
        System.out.println("sumaB=" + sumaB);
        System.out.println("counter=" + counter);
    }
}
