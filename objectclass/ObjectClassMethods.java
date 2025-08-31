package objectclass;

import org.w3c.dom.ls.LSOutput;

public class ObjectClassMethods implements Cloneable {

    int id;
    String name;

    public ObjectClassMethods(){};

    public ObjectClassMethods(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public ObjectClassMethods(ObjectClassMethods ob) {
        this.id = ob.id;
        this.name = ob.name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
    @Override
    public boolean equals(Object ob) {
        if(ob instanceof ObjectClassMethods) {
            ObjectClassMethods obj = (ObjectClassMethods) ob;
            return id == obj.id && name.equals(obj.name);
        }
        else return false;
    }

    /*
    finalize() will be called at
    1. while object destruction (assign null)
    2. reassign the object reference
    3. creating anonymous class
    4. creating local inner class
    */
    @Override
    public void finalize() {
        System.out.println("tried to delete unwanted objects");
    }

    public static void main(String[] args) {

        ObjectClassMethods ob1 = new ObjectClassMethods(101, "Vinu");
        ObjectClassMethods ob2 = new ObjectClassMethods(101, "Vinu");

/*        System.out.println(ob1.equals(ob2)); // false => different object

        System.out.println(ob1.hashCode()); // 2065951873
        System.out.println(ob2.hashCode()); // 2065951873  */

        // shallow copy
/*
        First ob3 = ob1;
        System.out.println(ob1.id + " : " + ob3.id);
        System.out.println(ob3.name + " : " + ob3.name);
        System.out.println(ob1.hashCode()); //
        System.out.println(ob3.hashCode()); // shares same memory
        System.out.println(ob1.equals(ob3));    // same object
*/

        // deep copy
/*        First ob4 = new First(ob2);
        System.out.println(ob2.id);
        System.out.println(ob4.id);
        System.out.println(ob2.hashCode());
        System.out.println(ob4.hashCode()); // created separate memory
        */

        // clone method
/*        First ob5 = null;
        try {
            ob5 = (First) ob2.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        ob5.id = 105; // will not affect the original
        System.out.println(ob2.id);
        System.out.println(ob5.id);
*/

/*        String s1 = new String("Code");
        String s2 = new String("Code");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);          */

/*
        System.out.println(ob1.toString());
        System.out.println(ob2); // toString() will be called internally

        System.out.println(ob1.getClass());
        System.out.println(ob2.getClass());

        System.out.println(ob1.equals(ob2)); // overridden => so true;
    */

        ob1 = null; // 1st time call
        ObjectClassMethods ob3 = new ObjectClassMethods();
        ob3 = ob2; // 2nd time
        new Object(); // 3rd time
        Object ob = new Object() { // anonymous class

        };
        method();
        System.gc();

    }

    private static void method() {
        Object ob = new Object();
    }
}
