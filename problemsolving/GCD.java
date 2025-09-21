package problemsolving;

import java.util.Scanner;

public class GCD {

    public static void main(String[] ignoredArgs) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }

    public static int gcd(int a, int b) {
        // by Euclidean algorithm
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
