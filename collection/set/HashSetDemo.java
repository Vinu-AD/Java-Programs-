package collection.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        hasSet();
    }
    private static void hasSet() {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(8);
        al.add(6);
        al.add(3);

        // *********   CREATE   ********************
        HashSet hs = new HashSet();  // 4 constructors(public) are there
        hs.add(10);
        hs.add(70);
        hs.add(30);
        hs.add(90);
        hs.add(80);
        hs.add(50);
//        hs.addAll(al);

//        HashSet obj = (HashSet) hs.clone();

//        System.out.println(obj);

//        System.out.println(hs.isEmpty());
//        System.out.println(hs); // order is not maintained


        //  *********   READ   ********************
/*        Iterator itr = hs.iterator();
        while(itr.hasNext())
            System.out.print(itr.next() + " ");*/
/*        for(Object ob : hs) {
            System.out.print(ob + " ");
        }*/
//        System.out.println(hs.contains(20));
//        System.out.println(hs.containsAll(al));
//        System.out.println(hs.equals(hs));
//        System.out.println(hs.equals(10)); false
//        System.out.println(hs.size());


        //  *********   UPDATE   ********************
        // no methods
        // to achieve we have to remove and then add (alternate)


        //  *********   DELETE   ********************
//        hs.clear();
//        hs.remove(80);
//        System.out.println(hs);
//        hs.removeAll(al);
//        System.out.println(hs);

    }

}
