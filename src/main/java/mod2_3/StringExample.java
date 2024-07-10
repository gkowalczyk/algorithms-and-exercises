package mod2_3;

public class StringExample {
    public static void main(String[] args) {
        String pablo = "pablo";
       // Przy użyciu operator new – w końcu String jest obiektem i ma konstruktor:
      String drugiPablo = new String("pablo");
      //  No i jeszcze jakiegoś jednego:

        String trzeciPablo = "pablo";
      //  No i może jeszcze takiego:

        String czwartyPablo = new String("pablo");

        if (pablo == trzeciPablo) { //Pablo równa się trzeciPablo bo oba są w String Pool i mają tą samą referencję, String z "" są w String Pool czyli w pamięci zaalokowanej przez JVM
            System.out.println("Pablo równa się trzeciPablo");
        } else {
            System.out.println("Pablo nie równa się trzeciPablo");
        }
        final boolean b = pablo.hashCode() == trzeciPablo.hashCode();
        System.out.println(b);



        if (pablo == drugiPablo) { // nie równa się bo drugiPablo jest tworzony przez new i nie jest w String Pool
            System.out.println("Pablo równa sie drugipablo(1)");
        } else {
            System.out.println("Pablo nie równa się drugiPablo(1)");
        }




        if (pablo.equals(drugiPablo)) {
            System.out.println("Pablo równa sie drugipablo(2)");
        } else {
            System.out.println("Pablo nie równa sie drugipablo(2)");
        }


        if (drugiPablo == czwartyPablo) {// brak równości bo oba są tworzone przez new i nie są w String Pool
            System.out.println("drugiPablo równa sie czwartyPablo");
        } else {
            System.out.println("drugiPablo nie równa się czwartyPablo");
        }
    }


}
