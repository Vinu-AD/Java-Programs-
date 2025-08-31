package collection.list;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {

        ArrayList al = new ArrayList();
        al.add('a');
        al.add('b');
//        al.add('c');

        Vector v = new Vector(al);

//        System.out.println("Capacity: " + v.capacity()); // 5;
        v.add(8);
//        v.addAll(al);
        v.add(1, 9);
        v.addFirst(3);
//        System.out.println("Capacity: " + v.capacity()); // when add 6th element 10;
        v.addLast(10);
//        v.addAll(0, al);
//        v.addElement("Name");
        v.addElement("Vinu");
//        System.out.println(v);

//        v.setSize(30);
//        v.ensureCapacity(50);
//        System.out.println(v.size());
//        System.out.println(v.capacity());

        // create
/*        Vector vv = new Vector();
        vv = (Vector) v.clone();*/

        // read
/*
        System.out.println(v.contains(8));
//        System.out.println(v.containsAll(vv));
        System.out.println(v.containsAll(al));

        System.out.println("------------------");
        System.out.println(v.get(10));
        System.out.println(v.elementAt(10));
        System.out.println("------------------");
        System.out.println(v.getFirst());
        System.out.println(v.firstElement());
        System.out.println("------------------");
        System.out.println(v.getLast());
        System.out.println(v.lastElement());
        System.out.println("------------------");
        System.out.println(v.isEmpty());
*/
//        System.out.println(v.size());


/*        // update
        v.setSize(20);
        System.out.println("Size: " + v.size());
        v.set(0, "Apple");
        System.out.println(v);
        v.setElementAt("Banana", 1);
        System.out.println(v);
        */

        // delete

/*        System.out.println(v.remove("Name"));
        System.out.println(v.remove(2));
        System.out.println(v.removeFirst());
        System.out.println(v.removeLast());
        System.out.println(v.removeElement(8));
*/
//        v.removeElementAt(0); // void return type

//        v.removeAllElements();
//        v.clear();
//        System.out.println(v);


//        v.ensureCapacity(10);

/*        v.setSize(10);
        System.out.println(v);
        v.add("New");
        System.out.println("Size: " + v.size());
        v.remove(null);
        System.out.println("Size: " + v.size());
        System.out.println(v);

        System.out.println(v.reversed()); // do not change in original
        System.out.println(v);*/

        //================================================================


        // subList
/*        System.out.println(v);
        v.add("New");
        Vector<Integer> subl = new Vector<> (v.subList(1, v.size()));
        System.out.println(subl);

        List subList = v.subList(1, v.size());
        System.out.println(subList);*/

/*        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        v.add("E");
        Vector subl = new Vector(list);
        System.out.println(list);
        System.out.println(subl);*/

        // array -> Vector
/*        Integer[] ar = {2, 8, 4, 9, 2, 1};
//        Vector num = new Vector<>(List.of(ar));
        Vector num = new Vector(Arrays.asList(ar));
        System.out.println(num);*/


        // Vector -> array
/*
        Object[] num =  v.toArray();
        System.out.println(Arrays.toString(num));
*/

    }
}
