package innerclasses;

public class LocalInnerClass {
    public static void main(String[] args) {

        calculate(5, 4);
    }

    private static void calculate(int a, int b) {
        int cal = a + b;

        class Print { // inner class
            int a = 10;
            static int b = 20;
            void print() {
                System.out.println(cal);
            }
        }
//        cal += 1;
        new Print().print();
        System.out.println(Print.b);
    }
}
