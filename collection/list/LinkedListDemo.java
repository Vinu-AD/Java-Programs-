package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        list1();
    }

    public static void list1() {

        LinkedList ll = new LinkedList();
//        System.out.println(ll.capacity()); // not available

        ll.add(5);
        ll.add(10);
//        ll.add(20);
        ll.add(true);
//        ll.add(40);
        ll.add("Java");
        ll.addFirst('5');
        ll.addLast(6.7);

        ll.offer(false);
        ll.offerFirst(true);
        ll.offerLast("last");
        ll.offerFirst("first");

//        ll.pop();
//
//        ll.clear();
//        System.out.println(ll.peek());
//        System.out.println(ll);

/*

        System.out.println(ll.remove());
        System.out.println(ll.removeFirst());

        System.out.println(ll);
        System.out.println(ll.removeLast());
        System.out.println(ll.remove(6.7));

        System.out.println(ll);
        System.out.println(ll.remove(1));
*/
/*
//        ll.clear(); // next line will cause NSEE
        System.out.println(ll.pop());
        ll.clear();
        System.out.println(ll.poll());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll);
*/

/*
        System.out.println(ll.indexOf("java")); // -1
        System.out.println(ll.indexOf("Java")); //  6
        System.out.println(ll.lastIndexOf(false)); // 8
*/

/*
        ll.offerFirst("Vinu");
        ll.offerFirst(20);
        ll.offerFirst(15);
        System.out.println("* : " + ll);*/

/*        System.out.println(ll.removeFirstOccurrence(15));
        System.out.println(ll.removeLastOccurrence(false));
        System.out.println(ll);*/

/*
        System.out.println(ll.set(2, "Five"));
        System.out.println(ll);
        */

//        ll.clear();
//        System.out.println(ll.get(4)); // IOOBE
//        System.out.println(ll.element()); // IOOBE
//        System.out.println(ll.peek()); // first element
//        System.out.println(ll.peekFirst()); // first element
//        System.out.println(ll.peekLast()); // last element
//        System.out.println(ll);


//        System.out.println(ll.set(10, 50)); // IOOBE
/*        System.out.println(ll.set(2, 50));
        System.out.println(ll);
*/

/*        System.out.println(ll);
        System.out.println(ll.reversed()); // do not change in original
        System.out.println(ll);*/

        //================================================================


        // subList
//        ArrayList<Integer> subl = new ArrayList<Integer> (ll.subList(3, ll.size()));
        ArrayList<Integer> subl = new ArrayList<Integer> (ll);
        System.out.println(subl);

        List subList = ll.subList(3, ll.size());
        subList.set(2, 50);
        System.out.println(subList);

        LinkedList newList = ll;
        newList.add(3);
        System.out.println(newList);

        System.out.println(ll);

/*        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        LinkedList<String> sub = new LinkedList<>(list);
        System.out.println(list);
        System.out.println(sub);*/

        // array -> LinkedList
/*        Integer[] ar = {2, 8, 4, 9, 2, 1};
        LinkedList num = new LinkedList<>(List.of(ar));
//        LinkedList num = new LinkedList(Arrays.asList(ar));
        System.out.println(num);*/


        // LinkedList -> array
/*
        Object[] num =  ll.toArray();
        System.out.println(Arrays.toString(num));
*/

/*
        LinkedList<String> sub = new LinkedList<>();
        sub.add("A");
        sub.add("B");
        sub.add("C");
        sub.add("D");
        sub.add("E");
        System.out.println(sub);

        ArrayList<String> list = new ArrayList<>(sub);
        System.out.println(list);
*/


    }
}
