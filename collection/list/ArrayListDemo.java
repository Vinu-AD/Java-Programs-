package collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

        /*
        add(object)
        add(index, element)
        addAll(collection)
        addAll(index, collection)
        addFirst(object)
        addLast(object)
        */

        ArrayList<Integer> al = new ArrayList<>();
//        System.out.println(al.capacity()); // not available

        al.add(10);
        al.add(20);
//        System.out.println(al);

        al.add(1, 15);
//        System.out.println(al);

        al.addFirst(5);
        al.addLast(25);
//        System.out.println(al);

/*        ArrayList al2 = new ArrayList();
        al2.addAll(al);
        System.out.println(al);
        System.out.println(al2);*/

/*        al2.addAll(1, al);
        System.out.println(al);
        System.out.println(al2);*/

       /*
        remove(object)
        remove(index, element)
        remove(collection)
        removeFirst(object)
        removeLast(object)

        retainAll(collection);
        clear();  // void return type
        */
//        System.out.println(al);
/*        System.out.println(al.removeFirst());
        System.out.println(al);
        System.out.println(al.removeLast());
        System.out.println(al);*/

        ArrayList al2 = new ArrayList<>();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.addAll(al);

//        al2.removeAll(al);
//        System.out.println(al2);
/*        System.out.println(al2);
        al2.retainAll(al);
        System.out.println(al2);*/

/*        System.out.println(al2.set(2, 100));
        System.out.println(al2);

        System.out.println(al2.get(1)); // 1 - index*/

//        System.out.println(al2.contains(20));
//        System.out.println(al2.contains(200));

//        al.add("Hi");
//        System.out.println(al);

//        System.out.println(al.reversed());

/*        al.clear();
        System.out.println(al);*/

/*        System.out.println(al2);
        System.out.println(al2.getFirst());
        System.out.println(al2.getLast());
        System.out.println(al2.getClass());

        System.out.println(al2.indexOf(30));
        System.out.println(al2.lastIndexOf(40));

        */

/*        System.out.println(al.equals(al));
        System.out.println(al.equals(al2));*/

/*        al.clear();
        System.out.println(al.isEmpty());                 */

/*        ArrayList al3 = (ArrayList) al.clone();
        System.out.println(al3);                          */

/*        Field field;
        try {
            field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        try {
            int capacity = ((Object[])field.get(al)).length;
            System.out.println(capacity);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }*/
/*
        System.out.println(al);
        System.out.println(al.reversed()); // do not change in original
        System.out.println(al);
*/

        // subList
//        al.add("Vinu");
//        ArrayList<Integer> subl = new ArrayList<Integer> (al.subList(3, al.size()));
//        System.out.println(subl);

//        List subl = al.subList(3, al.size());
//        System.out.println(subl);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");

/*        al.add("E");
        List<Integer> sub =  al.subList(1, al.size()); // Includes B, C, D
        ArrayList<Integer> subl = new ArrayList<>(sub);
        System.out.println(sub);
        System.out.println(subl);*/

        // array -> arrayList
/*        Integer[] ar = {2, 8, 4, 9, 2, 1};
//        ArrayList num = new ArrayList(List.of(ar));
        ArrayList num = new ArrayList(Arrays.asList(ar));
        System.out.println(num);*/


        // arrayList -> array
        Integer[] num = al.toArray(new Integer[]{});
        System.out.println(Arrays.toString(num));


    }
}
