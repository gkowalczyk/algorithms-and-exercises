import java.util.LinkedList;
import java.util.List;

public class Clocks {

    private int minute;
    private int hour;

    public Clocks(int hour, int minute) {
        this.minute = minute;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }


    public void addMinute() {
        minute++;
        if(minute == 60) {
            minute = 0;
            hour++;
            if (hour == 24) {
                hour = 0;
            }
        }

    }

    public static void main(String[] args) {
        Clocks clocks = new Clocks(13, 59);
        Clocks clocks1 = new Clocks(12, 00);
        List<Clocks> clocksList = new LinkedList<>();
        clocksList.add(clocks);
        clocksList.add(clocks1);
        clocksList.forEach(Clocks::addMinute);
        clocksList.forEach(System.out::println);
    }
}
