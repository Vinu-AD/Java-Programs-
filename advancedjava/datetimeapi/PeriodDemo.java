package advancedjava.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        // supporting class of the LocalDate class - Period

        LocalDate date1 = LocalDate.parse("2003-10-16");
        LocalDate date2 = LocalDate.now();

        Period period = Period.between(date1, date2);
        Period periodOf = Period.of(2025,12,21);
        System.out.println(period);
        System.out.println(periodOf);
        System.out.println(period.toTotalMonths());

        System.out.println(period.getYears()); // 25 - 24 = 1
        System.out.println(period.getMonths()); // 12 - 10 = 2
        System.out.println(period.getDays());   // 12 - 12 = 0
        System.out.println(period.getUnits());
        System.out.println();

        Period p1 = period.plusDays(35); // 2 + 35 = 37
        System.out.println(p1.getDays());

        Period p2 = period.minusMonths(10); // 0 - 10 = -8
        System.out.println(p2.getMonths());

        System.out.println();

        Period p3 = period.negated();
        System.out.println(p3);
        System.out.println();

        Period p4 = period.normalized();
        System.out.println(p4.getYears());
        System.out.println(p4.getMonths());
        System.out.println(p4.getDays());

    }
}
