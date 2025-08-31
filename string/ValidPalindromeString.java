package string;

public class ValidPalindromeString {

    public boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if(!isAlphaNumeric(s.charAt(start))) {
                start++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(end))) {
                    end--;
                    continue;
            }
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";

        ValidPalindromeString ob = new ValidPalindromeString();
        System.out.println(ob.isPalindrome(s));
    }
}
