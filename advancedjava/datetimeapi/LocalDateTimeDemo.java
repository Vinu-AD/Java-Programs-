package advancedjava.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatterBuilder;

public class LocalDateTimeDemo {
    public static void main(String[] ignoredArgs) {
//        staticMethods();
        instanceMethods();
    }

    private static void staticMethods() {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dt1 = LocalDateTime.of(date,time);
        System.out.println(dt1);

        LocalDateTime dt2 = LocalDateTime.of(2025,10,16,18,30);
        System.out.println(dt2);

        LocalDateTime dt3 = LocalDateTime.of(2025, 10, 16, 18, 30,20);
        System.out.println(dt3);

        LocalDateTime dt4 = LocalDateTime.of(2025, 10, 16, 18, 30,20, 489494427);
        System.out.println(dt4);

        LocalDateTime dt5 = LocalDateTime.parse("2025-09-20T00:16:30.498423843");
        System.out.println(dt5);

        LocalDateTime min = LocalDateTime.MIN;
        System.out.println(min);

        LocalDateTime max = LocalDateTime.MAX;
        System.out.println(max);
    }

    private static void instanceMethods() {
        LocalDateTime dateTime = LocalDateTime.now();

//        getMethods(dateTime);
//        withMethods(dateTime);
//        plusMethods(dateTime);
//        minusMethods(dateTime);
    }

    private static void getMethods(LocalDateTime dt) {
        System.out.println(dt);
        System.out.println();

        System.out.println(dt.getYear());
        System.out.println(dt.getMonth());
        System.out.println(dt.getMonthValue());
        System.out.println(dt.getDayOfMonth());

        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
        System.out.println(dt.getNano());

        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getDayOfYear());
    }

    private static void withMethods(LocalDateTime dt) {
        System.out.println(dt);
        System.out.println();

        System.out.println(dt.withYear(2000));
        System.out.println(dt.withMonth(10));
        System.out.println(dt.withDayOfMonth(3));
        System.out.println(dt.withDayOfYear(105));
        System.out.println();

        System.out.println(dt.withHour(8));
        System.out.println(dt.withMinute(15));
        System.out.println(dt.withSecond(45));
        System.out.println(dt.withNano(439284949));

    }

    private static void plusMethods(LocalDateTime dt) {
        System.out.println(dt);
        System.out.println();

        System.out.println(dt.plusYears(200));
        System.out.println(dt.plusMonths(10));
        System.out.println(dt.plusDays(90));
        System.out.println();

        System.out.println(dt.plusHours(24));
        System.out.println(dt.plusMinutes(15));
        System.out.println(dt.plusSeconds(45));
        System.out.println(dt.plusNanos(100000000));
    }

    private static void minusMethods(LocalDateTime dt) {
        System.out.println(dt);
        System.out.println();

        System.out.println(dt.minusYears(200));
        System.out.println(dt.minusMonths(24));
        System.out.println(dt.minusDays(60));
        System.out.println();

        System.out.println(dt.minusHours(10));
        System.out.println(dt.minusMinutes(5));
        System.out.println(dt.minusSeconds(2));
        System.out.println(dt.minusNanos(100000000));
    }
}
