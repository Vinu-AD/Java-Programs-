package advancedjava.methodreference;

import java.util.function.*;

public class MethodReference {

    public MethodReference() {
        System.out.println("Constructor called");
    }
    public MethodReference(int m, int n) {
        System.out.println("Constructor called with " + m + " and " + n);
    }

    private int instanceMethod(int m, int n) {
        System.out.println("Instance method called with " + m + " and " + n);
        return m + n;
    }

    private static int staticMethod(int n) {
        System.out.println("Static method called with " + n);
        return n + 5;
    }

    public static void main(String[] args) {
        // static method reference
        Function<Integer, Integer> r1 = MethodReference::staticMethod;
        System.out.println("Static method returned: " + r1.apply(21));

        // instance method reference
//        MethodReference ob = new MethodReference();
//        BiFunction<Integer, Integer, Integer> r2 = ob::instanceMethod;
//        System.out.println("Instance method returned: " + r2.apply(20, 30));

        // constructor reference
//        Supplier<MethodReference> ob = MethodReference::new;
//        ob.get();
//
//        BiConsumer<Integer, Integer> bc = MethodReference::new;
//        bc.accept(20, 30);

    }

}
