package methods;

class SingletonDesignPattern {
/*
create only one instance for a class use SingletonDesignPattern
 */

    private static final SingletonDesignPattern eager = new SingletonDesignPattern();
    private SingletonDesignPattern() {}

    private static SingletonDesignPattern lazy = null;

    public static SingletonDesignPattern getEagerInstance() {
        return eager;
    }

    public static SingletonDesignPattern getLazyInstance() {
        if(lazy == null) {
            lazy = new SingletonDesignPattern();
            return lazy;
        }
        return lazy;
    }

}

public class SDP {
    int a;

//    SDP obj = new SDP();
    Student ob = new Student();

    SDP() {

    }
    public static void main(String[] args) {

        SDP ob = new SDP();
        System.out.println(ob.a);


        /*
        SingletonDesignPattern ob1 = SingletonDesignPattern.getEagerInstance();
        System.out.println(ob1.hashCode());
        SingletonDesignPattern ob2 = SingletonDesignPattern.getEagerInstance();
        System.out.println(ob2.hashCode());

        SingletonDesignPattern ob3 = SingletonDesignPattern.getLazyInstance();
        System.out.println(ob3.hashCode());
        SingletonDesignPattern ob4 = SingletonDesignPattern.getLazyInstance();
        System.out.println(ob4.hashCode());*/

    }
}
