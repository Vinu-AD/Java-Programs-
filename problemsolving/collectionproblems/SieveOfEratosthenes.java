package problemsolving.collectionproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfEratosthenes {
    public static int[] sieve(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(isPrime(i))
                list.add(i);
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
    private static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i*i <= n; i+=6)
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(49)));
    }
}
