package string;

public class StringBasicTask {
    public static void reverse() {
        String str = "Java Programming";
        StringBuilder res = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--)
            res.append(str.charAt(i));
        str = res.toString();
        System.out.println(str);
    }
    public static void palindrome() {
//        String str = "racecar";
        String str = "Programming";
        int start = 0;
        int end = str.length() - 1;
        boolean palindrome = true;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                palindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(palindrome) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    public static void vowelCount() {
        String str = "Programming";
        int len = 0;
        int vowel = 0;
        for(char c : str.toCharArray())
            if("aeiouAEIOU".contains(c+"")) {
                System.out.print(c+" ");
                vowel++;
            }
        System.out.println("\nVowel Count: " + vowel);
    }
    public static void wordCount() {
        String str = "   Java is a   programming language   ";
        str = str.replaceAll("\\s+", " ").strip();
        String[] arr = str.split(" ");
        for (String s : arr)
            System.out.println(s);
        System.out.println("Word Count: " + arr.length);
        System.out.println("------------------------------------------");

        int len = str.length();
        int count = 0;
        int start = 0;
        int end = 0;
        while (start < len && end < len) {
            while(end < len && str.charAt(end) != ' ') {
                end++;
            }
            count++;
            System.out.println(str.substring(start, end));
            start = end + 1;
            end = start;
        }
        System.out.println("Word Count: " + count);
    }
    public static void caseCount() {
        String str = "ABcd$$123@gmail.com";
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int splChar = 0;
        for(char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z') lower++;
            else if(c >= 'A' && c <= 'Z') upper++;
            else if(c >= '0' && c <= '9') digit++;
            else if((c>=32&&c<=48)||(c>=58&&c<=64)||(c>=91&&c<=96)||(c>=123&&c<=126)) splChar++;
        }
        System.out.println("Lower Case count: " + lower);
        System.out.println("Upper Case count: " + upper);
        System.out.println("Digits count: " + digit);
        System.out.println("Special Character count: " + splChar);
    }
    public static void oddEvenWords() {
        String str = "Java is a high level programming language";
        String[] arr = str.strip().replaceAll("\\s+", " ").split(" ");
        System.out.print("Odd length words: ");
        for(String s : arr)
            if(s.length() % 2 == 1)
                System.out.print(s + ", ");
        System.out.print("\nEven length words: ");
        for(String s : arr)
            if(s.length() % 2 == 0)
                System.out.print(s + ", ");
    }
    public static void containsChar() {
        String str = "Java is a Programming language";
        char target = 'P';
        System.out.println(str.contains(target+""));

        int len = str.length();
        for(int i = 0; i < len; i++) {
            if(str.charAt(i) == target) {
                System.out.println("Given char is present");
                return;
            }
        }
        System.out.println("Given char is not present");
    }
    public static void containsString() {
        String str = "Java is a Programming language";
        String target = "Program";
        System.out.println(str.contains(target));

        int check = str.indexOf(target);
        if(check != -1)
            System.out.println("Given String is present");
        else
            System.out.println("Given String is not present");
    }
    public static void toUpperCase() {
        String s = "Java Programming";
        int len = s.length();
        String res = "";
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ch -= 32;
                res += ch+"";
            }
            else
                res += ch+"";
        }
        System.out.println(res);
    }
    public static void toLowerCase() {
        String s = "Java Programming";
        int len = s.length();
        String res = "";
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                ch += 32;
                res += ch+"";
            }
            else
                res += ch+"";
        }
        System.out.println(res);
    }
    public static void toggleCase() {
        String s = "Java Programming";
        int len = s.length();
        String res = "";
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                ch += 32;
                res += ch+"";
            }
            else if(ch >= 'a' && ch <= 'z') {
                ch -= 32;
                res += ch+"";
            }
            else
                res += ch+"";
        }
        System.out.println(res);
    }
    public static void firstRepeatChar() {
        String str = "Java is a Programming language";
        int len = str.length();
        for(int i = 0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    System.out.println("First repeating character is '" + str.charAt(i) + "' at index " + i);
                    return;
                }
            }
        }
        System.out.println("No duplicates found");
    }
    public static void firstNonRepeatChar() {
        String str = "Java is a Programming language";
        int len = str.length();
        for(int i = 0; i < len; i++) {
            boolean unique = true;
            for(int j = 0; j < len; j++) {
                if (i == j) continue;
                if(str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if(unique) {
                System.out.println("First non repeating character is '" + str.charAt(i) + "' at index " + i);
                return;
            }
        }
        System.out.println("No unique character found");
    }
    public static void longestWord() {
        String str = "   Java is a   programming language   ";
        str = str.replaceAll("\\s+", " ").strip();
        String[] arr = str.split(" ");
        String longest = "";
        for (String s : arr) {
            if(s.length() > longest.length())
                longest = s;
        }
        System.out.println("Longest Word is: " + longest);
        System.out.println("-------------------------------");

        str = "String is an Interesting topic in Java";
        int len = str.length();
        int start = 0;
        int end = 0;
        String longer = "";
        while (start < len && end < len) {
            while(end < len && str.charAt(end) != ' ') {
                end++;
            }
            String s = str.substring(start, end);
            if(s.length() > longer.length())
                longer = s;
            start = end + 1;
            end = start;
        }
        System.out.println("Longest Word is: " + longer);
    }
    public static void main(String[] args) {

//        reverse();            // 1
//        palindrome();         // 2
//        vowelCount();         // 3
//        wordCount();          // 4
//        caseCount();          // 5
//        oddEvenWords();       // 6 & 7
//        containsChar();       // 8
//        containsString();     // 9
//        toUpperCase();        // 10
//        toLowerCase();        // 11
//        toggleCase();         // 12
//        firstRepeatChar();    // 13
        firstNonRepeatChar(); // 14
//        longestWord();        // 15

/*
String Basic Task

1.reverse a string
2.check if a string is palindrome
3.count vowels in a string
4.count words in a string
5.count the upper and lower case character count in the given string.
6.print odd length words
7.print even length words
8.check the given char is present or not in string
9.check the given String is present or not in string
10.convert the given String into uppercase?
11.convert the given String into lowercase
12.convert the given String upper to lower and lower to upper?
13.find the first-repeating character?
14.find the first non-repeating character?
15.find the longest word in the given string?
*/
    }
}
