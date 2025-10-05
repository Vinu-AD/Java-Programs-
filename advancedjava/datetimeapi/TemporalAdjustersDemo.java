package advancedjava.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());

        LocalDate day1 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate day2 = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(day1);
        System.out.println(day2);

        LocalDate day3 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()); // X - last day
        System.out.println(day3);

        LocalDate day4 = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        System.out.println(day4);
        LocalDate day5 = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(day5);

        LocalDate day6 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(day6);

        LocalDate day7 = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(day7);
        LocalDate day8 = LocalDate.now().with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));
        System.out.println(day8);

        LocalDate day9 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(day9);
        LocalDate day10 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println(day10);

        LocalDate day11 = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(day11);
        LocalDate day12 = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY));
        System.out.println(day12);

    }
}
