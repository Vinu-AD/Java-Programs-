package collection.list;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {

        Stack s = new Stack();
//        System.out.println(s.capacity());

        s.push(1);
        s.push(6);
        s.push(2);
        s.push(3);
        s.push(5);
        s.push(4);
//        s.push('3');
//        s.push("4");
//        s.push(5.0);
//        s.add(6.0f);

//        System.out.println(s);
/*
        System.out.println(s.empty());
        System.out.println(s.isEmpty());
*/

        // read
//        System.out.println(s.peek()); // returns the last value

        // update
/*        System.out.println(s.set(2, 333));
        s.setSize(10); // remaining will be null*/

        // delete
//        System.out.println(s.pop());
//        System.out.println(s.remove(Integer.valueOf(1)));
//        System.out.println(s);

        // search
//        System.out.println(s.search('3')); // returns position from top

/*        System.out.println(s);
        System.out.println(s.reversed()); // do not change in original
        System.out.println(s);*/


        //================================================================


        // subList
/*        System.out.println(s);
//        s.push("New");
//        Stack<Integer> subl = (Stack<Integer>) s.subList(1, s.size());
//        System.out.println(subl);

        List subList = s.subList(1, s.size());
        System.out.println(subList);*/


        // List => Stack
/*        ArrayList al = new ArrayList();
        al.add(1);
        al.add(4);
        al.add(2);
        al.add(3);
        Stack stack = new Stack();
//        stack.addAll(al); // working....
//        stack = (Stack) al.clone(); // not possible
        System.out.println(al);
        System.out.println(stack);*/

        // array -> Stack
//         not possible using constructor
/*        Integer[] ar = {2, 8, 4, 9, 2, 1};
        Stack num = new Stack();
        for(Integer n : ar)
            num.push(n);
        System.out.println(num);*/

        // Stack -> array
/*        Object[] num =  s.toArray();
        System.out.println("Arr: " + Arrays.toString(num));*/
    }
}
