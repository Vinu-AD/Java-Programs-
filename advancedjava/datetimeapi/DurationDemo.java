package advancedjava.datetimeapi;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        // supporting class of the LocalTime class - Duration

        LocalTime time1 = LocalTime.parse("12:15:10.123456789");
        LocalTime time2 = LocalTime.of(20, 45, 30, 223456789);

        Duration du1 = Duration.between(time1, time2);
        Duration dura = Duration.ofDays(20);
        System.out.println(du1);
        System.out.println(dura);

        System.out.println(du1.getUnits());
        System.out.println(du1.getSeconds());
        System.out.println(du1.getNano());
        System.out.println();

        Duration du2 = Duration.ofDays(1); // new object is creating (by of())
        System.out.println(du2);
        System.out.println(du2.getSeconds());

        Duration du3 = Duration.ofHours(36);
        System.out.println("du3: "+du3.getSeconds());

        Duration du4 = Duration.ofDays(du3.toDays());
        System.out.println(du4.getSeconds());
    }
}
