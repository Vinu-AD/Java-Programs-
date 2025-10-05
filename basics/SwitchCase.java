package basics;

// Program to use switch case

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        switch (a) {
            case 1 ->
                System.out.println("ONE");
            case 2 ->
                System.out.println("TWO");
            case 3 ->
                System.out.println("THREE");
            case 4 ->
                System.out.println("FOUR");
            case 5 ->
                System.out.println("FIVE");
            case 6 ->
                System.out.println("SEX");
            case 7 ->
                System.out.println("SEVEN");
            case 8 ->
                System.out.println("EIGHT");
            case 9 ->
                System.out.println("NINE");
            case 10 ->
                System.out.println("TEN");
            default ->
                System.out.println("You entered greater than 10");
        }
        if (a >= 10) {
            if (a % 2 == 0) {
                System.out.println("The given number is Even"); 
            }else {
                System.out.println("The given number is Odd");
            }
        }
    }
}
