package string;

public class StringCompressionII {

    public String sort(StringBuilder s) {
        int len = s.length();
        for(int i = 0; i < len; i++) {
            boolean swapped = false;
            for(int j = 0; j < len - 1; j++) {
                if(s.charAt(j) > s.charAt(j+1)) {
                    // swap
                    char temp = s.charAt(j);
                    s.setCharAt(j, s.charAt(j+1));
                    s.setCharAt(j+1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
            len--;
        }
        return new String(s);
    }

    public int getLengthOfOptimalCompression(String s, int k) {

        s = sort(new StringBuilder(s));
        System.out.println(s);
        String result = "";
        int count = 1;
        int i;
        for( i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                count++;
            }
            else {
                if(count > 1)
                result = result + s.charAt(i-1) + count;
                else
                    result = result + s.charAt(i-1);
                count = 1;
            }
        }
        if(count > 1)
            result = result + s.charAt(i-1) + count;
        else
            result = result + s.charAt(i-1);

        System.out.println(result);
        return result.length() - k;
    }
    public static void main(String[] args) {
        StringCompressionII ob = new StringCompressionII();
//        String s = "aaabcccd"; // 6 - 2 = 4
//        String s = "aabbaa"; // 4 - 2 = 2
        String s = "aabaabbcbbbaccc"; // 6 - 2 = 4
        int k = 6;
//        System.out.println(ob.getLengthOfOptimalCompression(s, k));  // it's not working properly
    }
}
