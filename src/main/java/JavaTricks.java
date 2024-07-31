import java.math.BigInteger;

public class JavaTricks {

    public static void main(String[] args) {

        //sprawdzenie czy liczba jest parzysta czy nie
        int a = 5; //101
        int b = 4; //100
        System.out.println((a & 1) == 0 ? "parzysta" : "nieparzysta");// sprawdzenie poprzez porównanie czy
        //

        //mnożenie i dzielenie
        int n = 1;
        n = n << 1; //mnożenie przez 2
        n = n >> 1; //dzielenie przez 2
        System.out.println(n);

        //zamiana 2 liczb z wykorzystaniem XOR dla które tabela prawdy =
        //0101
        //0011
        //
        int x = 5;
        int y = 3;
        x ^= y;
        y ^= x;
        System.out.println(x); //6 bo  binarnie 0101^0011 = 0110
        System.out.println(y);//5

        // metoda GCD - największy wspólny dzielnik
        class GCD {
            public static int gcd(int a, int b) {
                BigInteger b1 = BigInteger.valueOf(a);
                BigInteger b2 = BigInteger.valueOf(b);
                BigInteger gcd = b1.gcd(b2);
                return gcd.intValue();
            }
        }
        System.out.println(GCD.gcd(10, 15));


        //Sprawdzanie liczby pierwszej
        System.out.println(BigInteger.valueOf(5).isProbablePrime(1) ? "pierwsza" : "złożona");


}

}


