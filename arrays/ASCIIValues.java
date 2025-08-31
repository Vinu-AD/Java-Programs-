package arrays;

public class ASCIIValues {
    public static void main(String[] args) {
        for(int i = 0; i < 256; i++) {
            System.out.printf("%d : %c\n", i, (char)i);
        }
    }
}
