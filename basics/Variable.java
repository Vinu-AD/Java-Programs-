package basics;

class A {
    int a = 10;
    int b = 20;

    void method() {
        System.out.println("New method");
    }
}

class B {
    static int a = 60;
    static int b = 50;
}

public class Variable {
    public static void main(String[] args) {
        A obj = new A();
        obj.method();
        System.out.println(obj.a + obj.b);
        System.out.println(B.a - B.b);
    }
}