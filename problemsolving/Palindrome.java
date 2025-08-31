package problemsolving;
/// Program to check whether the given number is palindrome or not

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entere a number: ");
        int num = sc.nextInt();
        int sum = num;
        int res = 0;
        while (num > 0) {
            res = (res * 10) + (num % 10);
            num = num / 10;
        }
        System.out.println("The given number is:    " + res);
        System.out.println("The reversed number is: " + res);

        if (res == sum) {
            System.out.println("The given number is Palindrome");
        } else {
            System.out.println("The given number is Not Palindrome");
        }
    }

}
