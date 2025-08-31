package mathclass;

public class CustomMethods {
    //sqrt, cbrt, abs, pow, ur own
    //wrapper class method - 5

    private static void squareRoot(int n) { // 4
        boolean sqroot = false;
        for(int i = 1; i * i <= n; i++) { // 4 <= 4
            if(i * i == n) {
                sqroot = true;
//                break;
            }
        }
        if(sqroot) System.out.println("Square root");
        else System.out.println("Not a Square root");
    }

    private static void cubeRoot(int n) {
        boolean cbroot = false;
        for(int i = 1; i * i * i <= n; i++) {
            if(i * i * i == n) {
                cbroot = true;
                break;
            }
        }
        if(cbroot) System.out.println("Cube root");
        else System.out.println("Not a Cube root");
    }

    private static void absolute(int n) {
        System.out.println("abs : " + ((n < 0) ? -n : n));
    }

    private static void power(int b, int p) {
        int pow = 1;
        while(p != 0) {
            pow *= b;
            p--;
        }
        System.out.println(pow);
    }

    private static void minMax(int a, int b) {
        if(a > b) {
            System.out.println(a + " is maximum");
            System.out.println(b + " is minimum");
        }
        else {
            System.out.println(a + " is minimum");
            System.out.println(b + " is maximum");
        }
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int compare(int a, int b) {
        return a == b ? 0 : a > b ? 1 : -1;
    }

    private static String toString(int n) {
        return n + "";
    }

    private static int parseInt(String s) { // "1234"
        int res = 0; // 123
        if(s.charAt(0) == '-') {
            for(int i = 1; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    res = (res * 10) + s.charAt(i) - '0';
                    // res = (123 *   10)  +     52       -  48 ;
                else
                    throw new NumberFormatException();
            }
        return -res;
        }
        else {
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    res = (res * 10) + s.charAt(i) - '0';
                    // res = (123 *   10)  +     52       -  48 ;
                else
                    throw new NumberFormatException();
            }
        return res;
        }
    }

    private static String toBinaryString(int n) { // 1/2 = 0
        System.out.println(Integer.toHexString(n));
        String s = ""; // 1010
        while(n != 0) {
            s = (n % 16) + s;
            n /= 16;
        }
        return s;
    }

    public static void main(String[] args) {
//        squareRoot(336);
//        cubeRoot(27);
//        absolute(-10);
//        power(4, 2);
//        minMax(30, 20);

//        System.out.println(sum(30, 20));
//        System.out.println(compare(30, 30));

//        System.out.println(toString(10));
//        System.out.println(toString(10).getClass().getSimpleName());

//        System.out.println(parseInt("-12"));
//        System.out.println(toBinaryString(140));

//        System.out.println(Math.ceil(10.1));

//        int n = 100;
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(Integer.bitCount(n));

        System.out.println(Double.isFinite(10.0/2));
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.SIZE);
        System.out.println(Integer.numberOfTrailingZeros(10));
        System.out.println(Integer.numberOfLeadingZeros(10));
    }
}
