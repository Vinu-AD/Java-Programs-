package string;
/*
length(), charAt(), equals(), contains(), concat(), compareTo(), compareToIgnoreCase()
indexOf(), lastIndexOf(), isEmpty(), isBlank(), startsWith(), endsWith()
trim(), strip() stripLeading(), stripTrailing(), toLowerCase(), toUpperCase()
repeat(), intern(), indent()
replace(), replaceFirst, substring(), split(), toCharArray()

important :
length(), charAt(), equals(), contains(), concat(), compareTo(), indexOf()
substring(), split(), isEmpty()
 */

public class StringDemo {

    public static void method1() {
        String s = new String("Hello World");
        System.out.println(s);
        System.out.println(s.charAt(6));
        System.out.println(s.indexOf('o'));
        System.out.println(s.lastIndexOf('o'));
        System.out.println(s.indexOf('l', 2));
        System.out.println(s.lastIndexOf('l', 2));
        System.out.println(s.indexOf('W', 5, 11));
        System.out.println("Length: " + s.length());
        System.out.println(s.contains("lo W"));
        System.out.println(s.repeat(4));
    }

    public static void method2() {
        String s1 = "vinu V";
        String s2 = "Vinu";
        String s3 = " ";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.endsWith("V"));
        System.out.println(s2.startsWith("V"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
    }

    public static void method3() {

        String str = "VINU V";
        str.compareTo("");
        StringBuilder s = new StringBuilder(str);
        s.compareTo(s);
        System.out.println(s);
        StringBuilder s1 = new StringBuilder("ab"); // a = 97, b = 98
        StringBuilder s2 = new StringBuilder("ad"); // d = 100

        System.out.println(s1.compareTo(s2));

    }

    public static void method4() {
        String str = new String("Vijay is a Java is FSD at uniq");
        String[] arr = str.split(" ");
        for (String s : arr)
            System.out.println(s);
    }

    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        method4();
    }
}
