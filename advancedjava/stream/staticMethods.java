package advancedjava.stream;

import java.util.stream.Stream;

public class staticMethods {
    public static void main(String[] args) {
//        method1();
        method2();
    }
    private static void method2() {
        String s = "Hello World";
        String str = s.chars()
                .distinct()
                .mapToObj(x->String.valueOf((char)x))
                .reduce("", (x,y)->x+""+y);
        System.out.println(str);
    }
    private static void method1() {

        Stream st1 = Stream.of(1, 2, 3, 4, 5, null);
//        st1.forEach(System.out::println);

        Stream st2 = Stream.of(6, 7, 8, 9, 10);
//        st2.forEach(System.out::println);

//        Stream.concat(st1, st2).forEach(System.out::println);

        Stream.ofNullable(null)
                .forEach(System.out::println);

        Stream.empty().forEach(System.out::println);
/*
        Stream.iterate(1, x -> x+1)
                .map(x -> x + " x 2 = " + x * 2)
                .limit(16)
                .forEach(System.out::println);*/
//
//        Stream.iterate(1, x -> x + 1)
//                .limit(50)
//                .filter(x -> x % 2 == 1)
//                .filter(x -> x <= 10)
//                .forEach(System.out::println);

//        Stream.of("ab", "ABC", "abcd", "ABCDE", "abcdef")
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

    }
}
