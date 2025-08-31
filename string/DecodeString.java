package string;

public class DecodeString {
    public static void main(String[] args) {
        String s = "a3b3c4d";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length() - 1; i+=2) {
            char c = s.charAt(i);
            int count = s.charAt(i + 1) - '0';
            for(int j = 0; j < count; j++) {
                sb.append(c);
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
