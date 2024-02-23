public class PrimeChecker {

    public static void main(String[] args) {
        System.out.println(PrimeCheck(2));
        System.out.println(PrimeCheck(3));
        System.out.println(PrimeCheck(4));
        System.out.println(PrimeCheck(5));
        System.out.println( PrimeCheck(6));
        System.out.println( PrimeCheck(7));
        System.out.println( PrimeCheck(8));

    }

    public static String PrimeCheck(int number) {
        if (number % 2 == 0 && number > 2) {
            return "false";
        }
        return "true";
    }
}
