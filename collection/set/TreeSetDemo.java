package collection.set;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        method();
    }
    private static void method() {

        ArrayList al = new ArrayList();
        al.add("Ajan");
        al.add("Vinu");
        al.add("Subah");

        //  *********   CREATE   ********************
//        TreeSet t = new TreeSet(al);
//        System.out.println(t);
//        TreeSet ts = new TreeSet(Collections.reverseOrder()); // 4 - constructors(public) are there
        TreeSet ts = new TreeSet();
        ts.add("S");
        ts.add("V");
        ts.add("V"); // duplicates will not be added
        ts.add("A");
//        ts.add(null); // NPE

//        ts.addLast("Z");   can't be used this method in this class
//        ts.addFirst("AA"); can't be used this method in this class
        ts.addAll(al);

        System.out.println(ts);


        //  *********   READ   ********************
//        System.out.println(ts.size());
//        System.out.println(ts.contains("Vinu"));
//        System.out.println(ts.isEmpty()); // false
//        System.out.println(ts.containsAll(al));
//        System.out.println(ts.first()); // if empty, NSEE
//        System.out.println(ts.last()); // if empty, NSEE
//        System.out.println(ts.ceiling("A"));
//        System.out.println(ts.floor('s'));// CCE
//        System.out.println(ts.floor("V"));
//        System.out.println(ts.headSet("S"));
//        System.out.println(ts.headSet("S", true));
//        System.out.println(ts.tailSet("S"));// inclusive by default
//        System.out.println(ts.tailSet("S", true));
//        System.out.println(ts.tailSet("S", false));
//        System.out.println(ts.higher("Subash")); // next element
//        System.out.println(ts.lower("S")); // previous element
//        System.out.println(ts.descendingSet()); // reverse order
//        System.out.println(ts.reversed());

//        System.out.println(ts.subSet("S", "V"));
//        System.out.println(ts.subSet("S", true, "V", true));

/*        Iterator itr = ts.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");*/
/*
        Iterator itr = ts.descendingIterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");*/

        // ***************   UPDATE   *************************
        // no method for updation, to achieve do remove first
        // and then add by checking the list using contains and for-each or iterator


        // ***************   DELETE   *************************
//        System.out.println(ts.pollFirst());
//        System.out.println(ts.pollLast());
//        System.out.println(ts.remove("S"));
//        System.out.println(ts.removeAll(al));
//        System.out.println(ts.removeFirst());
//        System.out.println(ts.removeLast());
//        ts.clear();
//        System.out.println(ts.retainAll(al));
//        System.out.println(ts);


//        System.out.println(ts.headSet("A"));
    }
}
