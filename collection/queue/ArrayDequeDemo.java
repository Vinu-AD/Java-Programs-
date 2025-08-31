package collection.queue;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        method();
    }
    private static void method() {

        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.offer(100);
        p.offer(200);
        p.offer(300);

        // ************  CREATE  *******************
//        ArrayDeque<Integer> dq = new ArrayDeque<>(p); // 3 constructors are there
//        ArrayDeque<Integer> dq = new ArrayDeque<>(10);
        ArrayDeque dq = new ArrayDeque();
        dq.add(20); // internally addLast()
        dq.addFirst(40);
        dq.addLast(50);

        dq.offer(30); // internally offerLast();
        dq.offerFirst(10);
        dq.offerLast(80);

        dq.push(5); // internally addFirst()
        dq.addAll(p); // add at the end

        dq.push("First Element");
        dq.offer("Last Element");

        System.out.println(dq);

        // ************  READ  *******************

/*        System.out.println(dq.size());
        System.out.println(dq.isEmpty());*/

//        System.out.println(dq.element()); // getFirst()

//        System.out.println(dq.contains(50));
//        System.out.println(dq.containsAll(p));

/*        System.out.println(dq.getFirst()); // first element or NSEE
        System.out.println(dq.getLast()); // first element or NSEE*/

/*        System.out.println(dq.peek()); // first element or null
        System.out.println(dq.peekFirst()); // first element or null
        System.out.println(dq.peekLast()); // last element or null*/

//        System.out.println(Arrays.toString(dq.toArray()));
/*
        // forward
        Iterator itr = dq.iterator();
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();

        // backward
        Iterator revItr = dq.descendingIterator();
        while(revItr.hasNext())
            System.out.print(revItr.next() + " ");
*/

/*        ArrayDeque q2 = dq.clone();
        System.out.println(q2);*/

//        System.out.println(dq);

        // ************  UPDATE  *******************
        // doesn’t have a direct method like set(index, element)
        // (because it’s not index-based

        // ************  DELETE  *******************

        dq.clear();

//        System.out.println(dq.pop()); // remove & return first element or NSEE
//        System.out.println(dq.poll()); // remove & return first or null
//        System.out.println(dq.pollFirst()); // remove & return first or null
//        System.out.println(dq.pollLast()); // remove & return last or null

//         System.out.println(dq.remove()); // remove & return first element or NSEE
//        System.out.println(dq.remove(50)); // return true

//         System.out.println(dq.removeFirst()); // remove & return first element or NSEE
//         System.out.println(dq.removeLast()); // remove & return last element or NSEE

//        System.out.println(dq.removeAll(p)); // return true

//        System.out.println(dq.removeFirstOccurrence(60)); // false
//        System.out.println(dq.removeLastOccurrence(60)); // false


        System.out.println(dq);

    }
}
