import java.util.*;

class Time {
    int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getgiay() {
        return this.hour * 3600 + this.minute * 60 + this.second;
    }

    @Override
    public String toString() {
        return this.hour + " " + this.minute + " " + this.second;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Time> times = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();
            int second = scanner.nextInt();
            times.add(new Time(hour, minute, second));
        }
        Collections.sort(times, new Comparator<Time>()
        {
            @Override
            public int compare(Time o1 , Time o2)
            {
                return o1.getgiay()-o2.getgiay();
            }
        });
        for(Time time:times){
            System.out.println(time);
    }
}
}