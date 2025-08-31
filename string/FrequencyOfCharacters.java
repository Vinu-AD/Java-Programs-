package string;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s = "&The $Quick ^ Bro%wn Fox * J^umps(Over)Th!e @Lazy# $ Dog";
        s = s.toLowerCase();
        int len = s.length();
        int[] f = new int[128];
        for (int i = 0; i < len; i++) {
            f[s.charAt(i)]++;
        }

        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(f[c] != 0) {
                System.out.println(c + " : " + f[c]);
                f[c] = 0;
            }
        }
    }
}
