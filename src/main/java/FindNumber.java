//Znalezienie dwóch dodatnich liczb całkowitych (A i B),
// których suma daje określoną liczbę N, a żadna
// z tych liczb nie może mieć zera w zapisie dziesiętnym.

public class FindNumber {
    public static void main(String[] args) {
        int N = 10;
        findNumbers(N);
    }

    static void findNumbers(int N) {
        for (int a = 1; a < N; a++) {
            int b = N - a;
            if (!String.valueOf(a).contains("0") || !String.valueOf(a).contains("0")) {
                System.out.println("a=" + a + "b=" + b);
                return;
            }
        }
        System.out.println("not found");
    }
}
