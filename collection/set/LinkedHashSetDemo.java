package collection.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(1);
        al.add(8);
        al.add(6);
        al.add(3);

        //  *********   CREATE   ********************
        LinkedHashSet lhs = new LinkedHashSet(); // 4 constructors(public) are there
//        System.out.println(lhs.isEmpty());
        lhs.add(15);
        lhs.add(5);
        lhs.add(10);
        lhs.add(15);
        lhs.addAll(al);
        lhs.addFirst(20);
        lhs.addLast(30);
        System.out.println(lhs);


        //  *********   READ   ********************
//        System.out.println(lhs.getFirst());
//        System.out.println(lhs.getLast());
//        System.out.println(lhs.contains(30));
//        System.out.println(lhs.size());
/*        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }*/
        System.out.println(lhs.reversed());

        // ********* UPDATE ********************
        // no method for updation, to achieve do remove first
        // and then add by checking the list using contains and for-each or iterator


        // ********* DELETE ********************
//        System.out.println(lhs.remove(30));
//        System.out.println(lhs.removeFirst()); // 20
//        System.out.println(lhs.removeLast()); // 30
//        System.out.println(lhs.removeAll(al)); // true
//        System.out.println(lhs);

    }
}
