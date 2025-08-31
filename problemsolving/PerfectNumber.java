// Program to check whether the given number is a PerfectNumber of not

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.print("Enter a nubmer:");
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
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

}
