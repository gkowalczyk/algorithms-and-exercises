import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//podać liczbę minut dla stringa podanego następująco 11:00am-8:00pm.
//wynik: 540 minut
public class CounterTime_v1 {
    public static void main(String[] args) throws ParseException {
        String timeRange = "11:00am-08:00pm";
        CalculateTime(timeRange);
    }

    public static void CalculateTime(String string) throws ParseException {

        String[] time = string.split("-");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mma");
        Date date1 = simpleDateFormat.parse(time[0]);
        Date date2 = simpleDateFormat.parse(time[1]);

        if(date2.before(date1)) {
            date2 = new Date(date2.getTime() + TimeUnit.DAYS.toMillis(1));
        }
        System.out.println((date2.getTime() - date1.getTime()) / 60000);
    }
}

