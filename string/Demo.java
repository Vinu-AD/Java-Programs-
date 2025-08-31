package string;

public class Demo {
    public static void main(String[] args) {
        String s = null;
        StringBuilder sb = new StringBuilder("hello");
        sb.insert(5, "hi");
        System.out.println(sb);
    }
}
