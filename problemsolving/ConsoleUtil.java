package commontask;

public class ConsoleUtil {

    public static void clear() {
        try {
            // Works if ANSI escape codes are supported
//            System.out.print("\033[H\033[2J");
//            System.out.flush();
            for (int i = 0; i < 10; i++) {
                System.out.printf("\b");
            }
        } catch (Exception e) {
            // Fallback: just print new lines
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print("hello world " + j + k);
                }
                System.out.println();
            }
            System.out.println("Enter key");
            new java.util.Scanner(System.in).nextLine();
            clear();
        }

    }
}
