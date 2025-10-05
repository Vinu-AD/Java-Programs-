package advancedjava.datetimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
//        To standardize units of time in Java and make it easy to calculate differences
//        or manipulate dates/times in those units.

//        use ChronoUnit when I want precise differences or to manipulate dates/times in specific units.

        LocalDate lt1 = LocalDate.of(2003, Month.OCTOBER, 16);
        LocalDate lt2 = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(lt1, lt2));
        System.out.println(ChronoUnit.MONTHS.between(lt1, lt2));
        System.out.println(ChronoUnit.DAYS.between(lt1, lt2));

        LocalDate today = LocalDate.now().plus(23, ChronoUnit.DAYS);
        LocalDate today2 = LocalDate.now().plusDays(23);
        System.out.println(today);
        System.out.println(today2);

        LocalDate day1 = LocalDate.now().minus(23, ChronoUnit.DAYS);
        LocalDate day2 = LocalDate.now().minusMonths(12);
        System.out.println(day1);
        System.out.println(day2);

        Duration yearDuration = ChronoUnit.YEARS.getDuration();
        System.out.println(yearDuration);
        Duration monthDuration = ChronoUnit.MONTHS.getDuration();
        System.out.println(monthDuration);

    }
}
