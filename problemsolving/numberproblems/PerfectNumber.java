package problemsolving.numberproblems;

// Program to check whether the given number is a Perfect number of not

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        boolean b = isPerfect(n);
        if (b) {
            System.out.println("The given number " + n + " is a Perfect Number"); 
        }else {
            System.out.println("The given number " + n + " is Not a Perfect Number");
        }

    }

    public static boolean isPerfect(int n) {
        int sum = 1;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) sum += i + n / i;
                else sum += i;
            }
        }
        return sum == n;
    }

    /*public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }*/

}
