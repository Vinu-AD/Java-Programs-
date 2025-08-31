package oops.inheritance;

public class Temp {
    static int a = 0;
    Temp t;
    {
        a = a + 1;
        if(a != 5)
            t = new Temp();
        System.out.println(a + " " + t);
    }

    public static void main(String[] args) {
        Temp o = new Temp();
        System.out.println(o.t);
    }
}
