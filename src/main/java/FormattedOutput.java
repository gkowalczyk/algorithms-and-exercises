import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class FormattedOutput {

    public static void main(String[] args) {

        int a = 100000;
        System.out.printf("%,d%n", a); //100 000

        //do liczb zmiennoprzecinkowych
        double a1 = 3.14159265359;
        System.out.printf("%f\n", a1); //oznacza to, że liczba ma być wyświetlona jako liczba zmiennoprzecinkowa
        System.out.printf("%5.3f\n", a1);// oznacza to, że liczba ma być wyświetlona jako liczba zmiennoprzecinkowa z dokładnością do trzech miejsc po przecinku
        System.out.printf("%5.2f\n", a1);//formatowanie liczby zmiennoprzecinkowej z dokładnością do 2 miejsc po przecinku, przy czym minimalna szerokość pola wynosi 5 znaków.

        int a2 = 10;
        Boolean b = true, c = false;
        Integer d = null;

        //do typów logicznych
        System.out.printf("%b\n", a2); // true  - jeśli liczba jest różna od zera
        System.out.printf("%B\n", b);// TRUE - jeśli liczba jest różna od zera
        System.out.printf("%b\n", c);// false - jeśli liczba jest równa zero
        System.out.printf("%B\n", d);//
        System.out.printf("%b\n", d); // false - jeśli liczba jest równa zero

        //do znaków
        char c1 = 'g';
        System.out.printf("%c\n", c1);
        System.out.printf("%C\n", c1);

        //do ciągów znaków
        String str = "Hello";
        System.out.printf("%s\n", str);

        //do formatowania daty i czasu
        System.out.printf("%tD%n", System.currentTimeMillis());
        Date time = new Date();
        System.out.printf("Current Time: %tT\n", time); //Current Time: 12:00:00
        System.out.printf("Hours: %tH  Minutes: %tM Seconds: %tS\n",
                time,time, time); //Hours: 12  Minutes: 00 Seconds: 00
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n",
                time); //12:00:00 PM 000 000 000 +0000

        //Przedstawienie liczby w formie zmiennoprzecinkowej przy użyciu klasy DecimalFormat
        double num = 123.4567;

        DecimalFormat df = new DecimalFormat("###");
        System.out.println(df.format(num)); //123

        df = new DecimalFormat("###.##");
        System.out.println(df.format(num)); //123.46

        df = new DecimalFormat("00000.00");
        System.out.println("formatting Numeric part : num = "
                + df.format(num));

        double income = 2334.234;
        df = new DecimalFormat("'$'###,###.##");
        System.out.println("formatting Numeric part : income = "
                + df.format(income));


        //Klasa SimpleDateFormat

        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String date = ft.format(new Date());
        System.out.println("Current Date: " + date);

        str = "2018-12-31";
        ft = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date2 = ft.parse(str);
            System.out.println("Date: " + date2);
        } catch (Exception e) {
            System.out.println("Unparseable using " + ft);
        }





    }
}
