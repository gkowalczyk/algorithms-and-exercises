import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {


    public static void main(String a[]) throws Exception {
        String strn;
        int flag = 0;
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        strn = br.readLine();
        System.out.println("Result string is:");
        //write your logic here

        StringBuilder strn1 = new StringBuilder(strn.replaceAll("[^a-zA-Z]", "").toLowerCase());
        StringBuilder stringBuilderReverse = new StringBuilder(strn.replaceAll("[^a-zA-Z]", "").toLowerCase()).reverse();

        if (strn1.toString().equals(stringBuilderReverse.toString())) {
            flag = 1;
        } else {
            flag = 0;
        }

        //end
        if (flag == 1)
            System.out.print("palindrome");
        else
            System.out.print("not a palindrome2");

    }
}
