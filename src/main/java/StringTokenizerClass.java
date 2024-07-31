import java.util.StringTokenizer;

public class StringTokenizerClass {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(
                "Hello Geeks How are you", " ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(
                "JAVA : Code : String", " :");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }


       StringTokenizer st3 = new StringTokenizer(
                "JAVA : Code : String", " :", true);

        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
    }
    }
