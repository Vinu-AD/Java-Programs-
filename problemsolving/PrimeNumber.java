package problemsolving;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] ignoredArgs) {
        System.out.print("Enter a number: ");
        long num = new Scanner(System.in).nextLong();
        if (isPrime(num))
            System.out.println("The given number " + num + " is a Prime Number");
        else
            System.out.println("The given number " + num + " is not a Prime Number");
    }

    public static boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;

        for(long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i+2) == 0) return false;
        }
        return true;
    }
}
