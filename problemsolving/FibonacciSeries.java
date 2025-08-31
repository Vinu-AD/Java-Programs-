package problemsolving;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int curr = 1;
        int prev = 0;
        Scanner sc = new Scanner(System.in);
        int sum;
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.exit(0);
        } else if (n == 1) {
            System.err.println("0");
        } else if (n == 2) {
            System.err.println("0 1");
        } else {
            System.err.print("0 ");
            while (n-- > 1) {
                sum = curr + prev;
                System.out.print(sum + " ");
                prev = curr;
                curr = sum;
            }
        }
    }

}
