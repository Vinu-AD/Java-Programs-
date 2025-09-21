package advancedjava.datetimeapi;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] ignoredArgs) {

//        staticMethods();
        instanceMethods();

    }

    private static void staticMethods() {

        LocalDate date1 = LocalDate.now();
//        LocalDate date2 = LocalDate.of(2024, 10, 25);
//        LocalDate date2 = LocalDate.of(2024, Month.OCTOBER, 25);
        LocalDate date2 = LocalDate.of(2024, Month.of(10), 25);
        LocalDate date3 = LocalDate.parse("2000-05-20");

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

    }

    private static void instanceMethods() {
        LocalDate date = LocalDate.now();

//        getMethods(date);
//        withMethods(date);e
        commonMethods(date);
    }
    private static void getMethods(LocalDate date) {

        System.out.println(date);
        System.out.println(date.getYear());

        System.out.println(date.getMonth()); // sep
        System.out.println(date.getMonthValue()); // 9

        System.out.println(date.getDayOfYear()); // nth day of the year
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());

        System.out.println(date.getChronology()); // ISO
        System.out.println(date.getEra()); // CE -> Common Era

    }

    private static void withMethods(LocalDate date) {
        System.out.println(date);

        System.out.println(date.withYear(2000));
        System.out.println(date.withMonth(10));
        System.out.println(date.withDayOfMonth(12));
        System.out.println(date.withDayOfYear(289));

    }

    private static void commonMethods(LocalDate date) {
        System.out.println(date.isLeapYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());

        date = date.withDayOfMonth(30);
        System.out.println(date);
        System.out.println(date.plusDays(20));
        System.out.println(date.plusWeeks(2)); // add 14 days
        System.out.println(date.plusMonths(4)); // it just adds months date becomes same
        System.out.println(date.plusYears(5));

        System.out.println("----");
        System.out.println(date);
        System.out.println(date.minusDays(10));
        System.out.println(date.minusWeeks(2));
        System.out.println(date.minusMonths(2));
        System.out.println(date.minusYears(5));
    }
}
