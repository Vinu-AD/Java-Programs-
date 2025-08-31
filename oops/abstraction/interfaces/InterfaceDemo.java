package oops.abstraction.interfaces;

interface Interface {
    final int a = 10;
    int b = 10;
    private void m1(){}
    public static void m2(){}
    void m3();

    default void m4(){}
}

public class InterfaceDemo {
    public static void main(String[] args) {
//        Interface.b = 20;
        System.out.println(Interface.b);
    }
}
