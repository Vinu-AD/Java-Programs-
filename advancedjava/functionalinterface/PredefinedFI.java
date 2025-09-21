package advancedjava.functionalinterface;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredefinedFI {

    private static void mukeshClass() {
        Predicate<Integer> p = age -> age >= 18;
        System.out.println(p.test(18));

        BiPredicate<Integer, Integer> bp = (a, b) -> a == b;
        bp.test(10, 10);

        Consumer<String> c = name -> System.out.println(name);
        c.accept("Vinu");

        BiConsumer<String, String> bc = (name, name2) -> name.concat(name2);
        bc.accept("Hello", "World");

        Supplier<String> s = () -> "Hello World";
        System.out.println(s.get());

        Function<String, Integer> f = string -> string.length();
        System.out.println(f.apply("Hello World!"));

        BiFunction<String, String, Integer> bf = (str1, str2) -> str1.concat(str2).length();
        System.out.println(bf.apply("Hello World!", "Java"));

        UnaryOperator<String> uo = a -> "Hello, ".concat(a);
        System.out.println(uo.apply("Vinu"));

        BinaryOperator<String> bo = (a, b) -> "Hello, ".concat(a).concat(b);
        System.out.println(bo.apply("Mr. ", "Vinu"));

        Comparable<String> co = ob -> ob.length();
        Comparator<String> com = (ob1, ob2) -> ob1.compareTo(ob2);
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Bob", "Cerina", "Adam"));
        Collections.sort(list, com);
        System.out.println(list);

        Runnable run1 = () -> System.out.println("Runnable run() method called");
        Thread th = new Thread(run1);
        th.start();
    }

    private static void practice() {
        Predicate<Integer> p1 = age -> age >= 21;
        Predicate<String> p2 = marital -> marital.equalsIgnoreCase("married");
        boolean age = p1.test(22);
        boolean status = p2.test("married");
        boolean crime = age && status;
        System.out.println(!crime ? "Case" : "No case");
    }

    private static void andMethod() {
        Predicate<Integer> p1 = age -> age >= 21;
        Predicate<Integer> p2 = age -> age >= 21;
        Predicate<Integer> isOld = p1.and(p2);

        System.out.println(isOld.test(30) ? "Old" : "Young");
    }

    private static void orMethod() {
        Predicate<Integer> sub1 = mark -> mark >= 35;
        Predicate<Integer> sub2 = mark -> mark >= 45;
        Predicate<Integer> isPass = sub1.or(sub2);

        System.out.println(isPass.test(40) ? "Pass" : "Fail");
    }

    private static void negateMethod() {
        Predicate<Integer> sub1 = mark -> mark >= 35;
        Predicate<Integer> sub2 = mark -> mark >= 45;
        Predicate<Integer> isFail = sub1.or(sub2).negate();

        System.out.println(isFail.test(40) ? "Pass" : "Fail");
    }

    private static void andThenMethod() {
        Function<Integer, Integer> sub1 = mark -> 10 + mark;
        Function<Integer, Integer> sub2 = mark -> mark + 10;
        Function<Integer, Integer> percent = sub1.andThen(sub2);

        System.out.println(percent.apply(30));
    }

    private static void composeMethod() {
        Function<String, String> sub1 = name -> "The " + name;
        Function<String, String> sub2 = name -> name + " Program";

        Function<String, String> percent = sub1.compose(sub2);

        System.out.println(percent.apply("Java"));
    }

    private static void identityMethod() {
        Function<String, String> get = Function.identity();
        System.out.println(get.apply("Programming Language"));

        Stream.of("Java", "Spring", "MySql")
                .map(get)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
//        mukeshClass();

        // Mani kumar - default and static methods in FI

        // Predicate FI
//        practice();
//        andMethod();
//        orMethod();
//        negateMethod();

        // Function FI
//        andThenMethod();
//        composeMethod();
//        identityMethod();

        // Consumer


    }
}
