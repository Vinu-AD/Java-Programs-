package string;

public class StringProblems {

    public static void anagram() {
        String s1 = "racecars";
        String s2 = "carrace";
        int[] freq = new int[256];
        boolean isAnagram = true;

        if(s1.length() != s2.length()) {
            System.out.println("The given Strings are not anagram");
            return;
        }

        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for(int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram)
            System.out.println("The given Strings are anagram");
        else
            System.out.println("The given Strings are not anagram");
    }

    public static void pangram() {
        String s = "The quick brown fox jumps over the lazy dog";
//        String s = "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();

        boolean isPangram = true;
        for(char i = 'a'; i <= 'z'; i++) {
            if(!s.contains(i+"")) {
                isPangram = false;
                break;
            }
        }
        if (isPangram)
            System.out.println("The given String is Pangram");
        else
            System.out.println("The given String is not Pangram");
    }

    public static void substring() {
        String s = "Java Programming";
        String t = "Program";
        if(t.isEmpty() || s.isEmpty()) {
            System.err.println("Not a string");
            return;
        }
        if(t.length() > s.length()) {
            System.out.println("Not a substring");
            return;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        boolean found = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(0)) {
                if(s.length() - i < t.length()) break; // for largest substring
                found = true;
                for(int j = 0; j < t.length() && i+j < s.length(); j++) {
                    if(t.charAt(j) != s.charAt(i+j)) {
                        found = false;
                        break;
                    }
                }
            }
            if(found) break;
        }
        if(found)
            System.out.println("Substring");
        else
            System.out.println("Not a substring");
    }

    public static void compareTo() {
        String s1 = "java";
        String s2 = "Java";
        int len1 = s1.length();
        int len2 = s2.length();
        int min = len1 < len2 ? len1 : len2;

        int res = 0;
        for(int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                res = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }
        if(res == 0) {
            res = len1 - len2;
        }
        System.out.println("Mine: " + res);
        System.out.println("In-built: " + s1.compareTo(s2)); // pre-defined method
    }

    public static void wordReverse() {
                                          // 012345678901234567890123
        StringBuilder s = new StringBuilder("Java Program");
        int len = s.length();
        int start = 0;
        int end;
        while(start < len) {
            while(start < len && s.charAt(start) == ' ')
                start++;
            System.out.print(start + " ");
            if(start >= len) break;

            end = start;
            while(end < len && s.charAt(end) != ' ')
                end++;
            System.out.println(end);

            reverse(s, start, end - 1);

            start = end;
        }

        System.out.println("Result: [" + s +"]");
    }

    public static void sentenceReverse() {
                                          // 0123456789012345678901234567890
        StringBuilder s = new StringBuilder("Java Program by James Gosling");
        int len = s.length();
        int start = 0;
        int end;
        while(start < len) {
            while(start < len && s.charAt(start) == ' ')
                start++;
            if(start >= len) break;

            end = start;
            while(end < len && s.charAt(end) != ' ')
                end++;

            reverse(s, start, end - 1);

            start = end;
        }

        reverse(s, 0, len -1);
        System.out.println("Result: [" + s +"]");
    }
    private static void reverse(StringBuilder s, int start, int end) {
        while(start < end) {
            char c = s.charAt(start);
            s.setCharAt(start, s.charAt(end));
            s.setCharAt(end, c);
            start++;
            end--;
        }
    }

    public static void sort() {
        StringBuilder s = new StringBuilder("FullStack");
        int len = s.length();
        for(int i = 0; i < len - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < len - 1; j++) {
                if(s.charAt(j) > s.charAt(j+1)) {
                    char temp = s.charAt(j);
                    s.setCharAt(j, s.charAt(j+1));
                    s.setCharAt(j+1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
            len--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        anagram(); // task 1
//        pangram(); // task 2
//        substring(); // task 3
//        compareTo(); // task 4
//        wordReverse();  // task 5
//        sentenceReverse(); // task 6
//        sort();  // task 7
    }

}
