//podać liczbę minut dla stringa podanego następująco 11:00am-8:00pm.
//wynik: 540 minut
public class CounterTime {
    public static void main(String[] args) {
        String timeRange = "11:00am-08:00pm";
        System.out.println(CalculateTime(timeRange));
    }

    public static int CalculateTime(String string) {

        String[] time = string.split("-");
        int time1 = convertHourToMinutes(time[0]);
        int time2 = convertHourToMinutes(time[1]);
        if (time[1].contains("pm")) {
            time2 = time2 + 60 * 12;
        }
        return time2 - time1;
    }

    public static int convertHourToMinutes(String time) {
        String[] timeArr = time.split(":");
        int hours = Integer.parseInt(timeArr[0].substring(0, 2));
        int minutes = Integer.parseInt(timeArr[1].substring(0, 2));
        return hours * 60 + minutes;
    }
}

