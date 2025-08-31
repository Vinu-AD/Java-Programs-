package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {

    private static void mobileNumberValidate() {
        String mob = "9500882368";
        String reg = "^(\\+91|91)?[6-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(mob);
        System.out.println(mob.matches(reg));
        while(m.find())
            System.out.println(m.group() + " : " + m.start() + " - " + m.end());
    }

    private static void emailValidate() {
        String email = "vinu.123@gmail.com";
        String reg = "^(?![.])(?!.*\\.\\.)(?!.*[.]@)(?!.*\\.$)[a-zA-Z_][\\w.]*@[a-zA-Z0-9]+\\.[a-z]{2,}$";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(email);
        System.out.println(email.matches(reg));
        while(m.find())
            System.out.println(m.group() + " : " + m.start() + " - " + m.end());
    }

    public static void main(String[] args) {

//        String s = "Go1 Green before6 Green goes";
//        Pattern ptr = Pattern.compile("."); // all the characters
//        Pattern ptr = Pattern.compile("o"); // return matches
//        Pattern ptr = Pattern.compile("[abc]"); // contains a or b or c
//        Pattern ptr = Pattern.compile("[^abc]"); // except a or b or c
//        Pattern ptr = Pattern.compile("[a-z]"); // all lowercases
//        Pattern ptr = Pattern.compile("[A-Z]"); // all uppercases
//        Pattern ptr = Pattern.compile("[0-9]"); // all digits
//        Pattern ptr = Pattern.compile("^[G]"); // letter starts with G
//        Pattern ptr = Pattern.compile("^Go"); // starts with Go
//        Pattern ptr = Pattern.compile("goes$"); // ends with goes
//        Pattern ptr = Pattern.compile("\\bGreen\\b"); // contains 'Green' word
//        Pattern ptr = Pattern.compile("\\Bree\\B"); // contains 'ree' sequence exactly in between a word
//        Pattern ptr = Pattern.compile("ee|oe"); // contains 'ee' or 'oe'

//                  01234567890123456789012345678901234567890
//        String s = "Go1 Green before6 Ngreengreengreen goes";
//        Pattern ptr = Pattern.compile("(green){2}"); // contains 'green' two times
//        Pattern ptr = Pattern.compile("(?:green){2}"); // contains 'green' two times
//        Pattern ptr = Pattern.compile("N(?=green).*"); // checks 'green' presence after 'N'
//        Pattern ptr = Pattern.compile("N(?!green).*"); // checks 'green' is not presence after 'N'

//        String s = "Go1 Green before6 Ngreengreengreen goes";
//        Pattern ptr = Pattern.compile("(?<=ree)n"); // match 'n' only comes after 'ree'
//        Pattern ptr = Pattern.compile("(?<!es)n"); // not matches 'n' before 'es'

        String s = "Go1! Green% before96 Ngreengreengreen goes*   ";

//        Pattern ptr = Pattern.compile("\\d+"); // only digit with consecutive digits also
//        Pattern ptr = Pattern.compile("\\D+"); // except digits words
//        Pattern ptr = Pattern.compile("\\w+"); // all words
//        Pattern ptr = Pattern.compile("\\W+"); // except all words nothing but space and special characters
//        Pattern ptr = Pattern.compile("\\s"); // return all spaces
//        Pattern ptr = Pattern.compile("\\S"); // except all spaces

//        Matcher m = ptr.matcher(s);
//        while(m.find()) {
//            System.out.println(m.group() + " - starts at " + m.start());
//        }

        // do task with string regex
//        mobileNumberValidate();
        emailValidate();
    }
}
