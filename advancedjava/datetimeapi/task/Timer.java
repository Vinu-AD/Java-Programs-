package advancedjava.datetimeapi.task;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        int time = 5;
        for (int i = 0; i < 3; i++) {

            LocalTime end = LocalTime.now().plusSeconds(time);
            int timeLeft = time;
            while (LocalTime.now().isBefore(end)) {
                if(ifPresent()) {
                    s.append(scan.nextLine());
                    break;
                }
                System.out.print("\rTime left: " + timeLeft-- + "s  "); // \r overwrites same line
                Thread.sleep(1000);
            }
            System.out.println();
        }
        System.out.println(s);
    }
    private static boolean ifPresent() {
        try {
            return System.in.available() > 1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
