package advancedjava.datetimeapi.task;

import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] ignoredArgs) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
//        System.out.print("Enter the month: ");
//        int month = scan.nextInt();

        for(int month = 1; month <= 12; month++) {

            LocalDate date = LocalDate.of(year, month, 1);
            int days = date.lengthOfMonth();
            System.out.println("Month: " + date.getMonth());

            int first = date.getDayOfWeek().getValue() % 7;
            System.out.println("Day of Week of Date 1: " + date.getDayOfWeek() + "\n");
            int day = 1;

//            System.err.print("Sun ");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 1; i <= first; i++) System.out.print("    ");
            for (int i = 0; i < 7 - first; i++) System.out.printf("%3d ", day++);
            System.out.println();

            while (day <= days) {
                for (int j = 0; j < 7; j++) {
                    if (day > days) break;
//                    if(day % 7 == 7-first+1)
//                        System.err.printf("%3d ", day++);
//                    else
//                        System.out.printf("%3d ", day++);
                    System.out.printf("%3d ", day++);
                }
                System.out.println();
            }
            System.out.println("--------------------------------------");
        }
    }
}
