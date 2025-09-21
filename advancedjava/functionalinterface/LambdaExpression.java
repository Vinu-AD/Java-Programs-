package advancedjava.functionalinterface;

@FunctionalInterface
interface Bank {
    String getName();
}

@FunctionalInterface
interface Account extends Bank {
//    void newMethod(); // we cannot create more than one abstract
    String getName();
    default void name() {
        System.out.println("SBI");
    }
}

public class LambdaExpression {

    public static void main(String[] args) {
        Account b = () -> "UserName";
        System.out.println(b.getName());
        b.name();
    }
}
