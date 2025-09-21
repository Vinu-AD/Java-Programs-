package advancedjava.datetimeapi.task;

import java.time.LocalTime;
import java.util.Scanner;

public class Alarm {
    public static void main(String[] ignoredArgs) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the time(hh): ");
        int hour = scan.nextInt();
        System.out.print("Enter the time(mm): ");
        int minute = scan.nextInt();

        LocalTime time = LocalTime.of(hour, minute);
        while(true) {
            LocalTime currentTime = LocalTime.now();
            System.out.println(currentTime);
            if(time.getHour() == currentTime.getHour() &&
                time.getMinute() == currentTime.getMinute()) {
                System.out.println("Alarm ON");
                break;
            }
            Thread.sleep(1000);
        }

    }
}
