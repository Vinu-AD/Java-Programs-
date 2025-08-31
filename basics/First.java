package basics;

public class First {

    byte b = 10 + 5;
    short s = 100 - 25;
    int i = 1000 + s;
    float f = 10.5f + 1000.50f;
    double d = 1000.30 + 2000.70;
    char c = 'v';
    boolean bool = true;

    public static void main(String[] args) {
        First v = new First();
        System.out.println(v.b);
        System.out.println(v.s);
        System.out.println(v.i);
        System.out.println(v.f);
        System.out.println(v.d);
        System.out.println(v.c);
        System.out.println(v.bool);
    }
}
