package problemsolving;
//Printing ASCII values with symbols (0-256)

public class AsciiValues {

    public static void main(String[] args) {
        for (int i = 0; i <= 256; i++) {
            System.out.println(i + " : " + (char) i);
        }
    }
}
