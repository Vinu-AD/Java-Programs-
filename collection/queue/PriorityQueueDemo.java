package collection.queue;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(3);
        ll.add(6);
        ll.add(9);

        // ***************  CREATE  *******************

//        Queue pq = new PriorityQueue(ll);
//        PriorityQueue pq = new PriorityQueue(10); // 7 constructors are there
        PriorityQueue pq = new PriorityQueue(Collections.reverseOrder()); // PriorityQueue(Comparator)
        pq.add(10);
        pq.add(50);
        pq.add(30);
        pq.offer(80);
        pq.offer(60);
        pq.offer(40);
        pq.addAll(ll);

//        System.out.println(pq.size());
        System.out.println(pq);

        // ***************  READ  **********************
//        System.out.println(pq.peek()); // first element or null
//        System.out.println(pq.contains(30));
//        System.out.println(pq.containsAll(ll));

/*        Iterator itr = pq.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();*/

//        System.out.println(pq.element()); // return first element or NSEE

//        System.out.println(Arrays.toString(pq.toArray())); // array
//        System.out.println(pq);

        // ***************  UPDATE  **********************
        //  there’s no direct “update” method like set(index, value)

        // ***************  DELETE  **********************
//        pq.clear();
//        System.out.println(pq.poll()); // remove & returns first element or null
//        System.out.println(pq.remove()); // removes first element
//        System.out.println(pq.remove(20)); // false
//        System.out.println(pq.removeAll(ll));
//        System.out.println(pq.retainAll(ll));

//        System.out.println(pq);
    }
}
