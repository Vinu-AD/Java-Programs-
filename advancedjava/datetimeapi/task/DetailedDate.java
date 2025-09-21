package advancedjava.datetimeapi.task;

import java.time.LocalDate;
import java.util.Scanner;

public class DetailedDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        System.out.print("Enter the month: ");
        int month = scan.nextInt();

        LocalDate monthOfDate = LocalDate.of(year, month, 1);
        int len = monthOfDate.lengthOfMonth();

        for(int day = 1; day <= len; day++) {
            LocalDate date = LocalDate.of(year, month, day);
            System.out.print(date.getDayOfWeek() + ", " + day + ", ");
            System.out.print(date.getMonth() + ", " + date.getYear() + "\n");
        }
    }
}
