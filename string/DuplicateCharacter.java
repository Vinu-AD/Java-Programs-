package string;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String s = "maaza";
        int len = s.length();
        int[] f = new int[128];
        for(int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(f[ch] != 0) {
                System.out.print(ch + " ");
                f[ch] = 0;
            }
        }
    }
}
