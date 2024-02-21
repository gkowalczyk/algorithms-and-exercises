public class CounterLetter {

    //1) algorytm na stringu tzn na wejściu jest np: wwwegwwh a na wyjściu ma być 3w1e1g2w1h
    public static void main(String[] args) {

        StringChallenge("wwwegwwh");
    }

    public static void StringChallenge(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int n = 0; n < str.length(); n++) {
            int counter = 1;

            while (n < str.length() - 1 && (str.charAt(n) == str.charAt(n + 1))) {
                n++;
                counter++;
            }
            stringBuilder.append(counter).append(str.charAt(n));
        }
        System.out.println(stringBuilder);
    }
}