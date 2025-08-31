package string;

import java.util.Arrays;

public class ValidAnagramString {

    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < s.length(); i++) {
            if(freq[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
//        String s = "car";
//        String t = "rat";
        ValidAnagramString ob = new ValidAnagramString();
        System.out.println(ob.isAnagram(s, t));
    }
}
