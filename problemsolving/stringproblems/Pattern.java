package problemsolving.stringproblems;
import java.util.Scanner;

public class Pattern {

    static void pattern1(int n) {
        System.out.println("Pattern 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        /*

*
* *
* * *
* * * *
* * * * *              */
    }

    static void pattern2(int n) {
        System.out.println("Pattern 2: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *       */
    }

    static void pattern3(int n) {
        System.out.println("Pattern 3: ");
        for (int i = n; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1               */
    }

    static void pattern4(int n) {
        System.out.println("Pattern 4: ");
        for (int i = n; i >= 0; i--) {
            for (int j = n; j > n - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5                       */
    }

    static void pattern5(int n) {
        System.out.println("Pattern 5: ");
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1                      */
    }

    static void pattern6(int n) {
        System.out.println("Pattern 6: ");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            int j = 1;
            for (; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (j -= 2; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1          */
    }

    static void pattern7(int n) {
        System.out.println("Pattern 7: ");
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        /*
        5
      5 4
    5 4 3
  5 4 3 2
5 4 3 2 1                  */
    }

    static void pattern8(int n) {
        System.out.println("Pattern 8: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
        /*
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1       */
    }

    static void pattern9(int n) {
        System.out.println("Pattern 9: ");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i * 2 - 2; j++) {
                System.out.print(i + " ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i * 2 - 2; j++) {
                System.out.print(i + " ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /*
4 4 4 4 4 4 4
4 3 3 3 3 3 4 
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4      
         */
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = scan.nextInt();

        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);

    }
}
