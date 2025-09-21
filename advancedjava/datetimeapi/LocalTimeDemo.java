package advancedjava.datetimeapi;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
//        staticMethods();
        instanceMethods();
    }

    private static void staticMethods() {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time2 = LocalTime.of(5,30);
        System.out.println(time2);
        LocalTime time3 = LocalTime.of(12,30,20);
        System.out.println(time3);
        LocalTime time4 = LocalTime.of(10, 20, 30, 1000);
        System.out.println(time4);

        LocalTime time5 = LocalTime.parse("18:20:50"); // hh-mm-ss
        System.out.println(time5);

    }

    private static void instanceMethods() {
        LocalTime time = LocalTime.now();

        getMethods(time);
//        withMethods(time);
//        plusMethods(time);
//        minusMethods(time);
    }

    private static void getMethods(LocalTime time) {
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
    }

    private static void withMethods(LocalTime time) {
        System.out.println(time);
        System.out.println(time.withHour(20));
        System.out.println(time.withMinute(59));
        System.out.println(time.withSecond(35));
        System.out.println(time.withNano(999999999)); // 9 digit
    }

    private static void plusMethods(LocalTime time) {
        System.out.println(time);
        System.out.println(time.plusHours(2)); // 23 + 2 = 1
        System.out.println(time.plusMinutes(35));
        System.out.println(time.plusSeconds(30));
        System.out.println(time.plusNanos(500000000));
    }

    private static void minusMethods(LocalTime time) {
        System.out.println(time);
        System.out.println(time.minusHours(2)); // 23 + 2 = 1
        System.out.println(time.minusMinutes(35));
        System.out.println(time.minusSeconds(30));
        System.out.println(time.minusNanos(500000000));
    }
}
