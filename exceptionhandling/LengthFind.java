package exceptionhandling;

public class LengthFind {
    public static void findStringLength() {
        String str = "Java Programming";
        int count = 0;
        for(char c : str.toCharArray()) {
            count++;
        }
        System.out.println("String Length: " + count);

        int len = 0;
        try {
            while(true) {
                str.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("str.lenght() : " + len);
        }
    }
    public static void findArrayLength() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for(int i : arr)
            count++;
        System.out.println("Array Length: " + count);

        int length = -1;
        try {
            while(true) {
                int t = arr[++length];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arr.length is: " + length);
        }
    }

    public static void main(String[] args) {
        findStringLength();
        findArrayLength();

    }
}
