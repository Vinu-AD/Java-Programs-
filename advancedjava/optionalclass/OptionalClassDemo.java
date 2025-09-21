package advancedjava.optionalclass;

import javax.swing.text.html.Option;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClassDemo {
    public static void main(String[] args) {
//        staticMethods();
//        instanceMethods();
        otherInstanceMethods();
    }

    private static void staticMethods() {
//        Optional<String> obj = Optional.empty();
//        System.out.println(obj); // Optional.empty

//        System.out.println(obj.get()); // NSEE

//        Optional<String> obj = Optional.of(null); NPE
        Optional<String> obj = Optional.of("str");
        System.out.println(obj.get());

//        Optional<Integer> i = Optional.of(0);
        Optional<String> s = Optional.ofNullable(null);
//        Optional<String> s = Optional.ofNullable("Str");
        System.out.println(s);
//        System.out.println(s.get()); // NSE
        s = Optional.of("New Str");
        System.out.println(s);

    }

    private static void instanceMethods() {
        Optional<String> obj = Optional.ofNullable(null);
        Optional<String> str = Optional.ofNullable("Default");
//        String s = obj.get();
//        String s = obj.orElse("Ant");

//        String s = obj.orElseGet(str::get);

//        String s = obj.orElseThrow(()->new RuntimeException("No data"));
//        String s = obj.orElseThrow();

        boolean f = str.isPresent(); // if null -> false else true
//        boolean f = str.isEmpty(); // if null -> true else false
        System.out.println(f);

        obj.ifPresent(System.out::println);

        // methods
//        get()
//        orElse()
//        orElseGet()
//        orElseThrow()

//        isPresent()
//        isEmpty()

//        ifPresent()
    }

    private static void otherInstanceMethods() {

        // filter()
        // ========
        Optional<String> obj = Optional.ofNullable("Java Programming");
        Optional<String> f1 = obj.filter(x -> x.length() >= 5);
        Optional<String> f2 = f1.filter(x -> x.startsWith("J"));
        Optional<String> f3 = f2.filter(x -> x.endsWith("ing"));
        Optional<String> f4 = f3.filter(x -> x.contains("Program"));

//        f4.ifPresent((x) -> System.out.println(x));

        Predicate<String> p1 = x -> x.length() >= 5;
        Predicate<String> p2 = x -> x.startsWith("J");
        Predicate<String> p3 = x -> x.endsWith("ing");
        Predicate<String> p4 = x -> x.endsWith("ing");
        Optional<String> p5 = obj.filter(p1.and(p2).and(p3));

//        p5.ifPresent((x) -> System.out.println(x));

        Optional<String> res = obj.filter(x -> x.length() >= 5 && x.startsWith("J") && x.endsWith("ing") && x.contains("Program"));
        res.ifPresent(System.out::println);


//        Map()
//        =====
        Optional<String> res2 = obj.map(String::toUpperCase);
        res2.ifPresent(System.out::println);

//        stream()
//        ========
        obj.stream().forEach(System.out::println);

    }
}
