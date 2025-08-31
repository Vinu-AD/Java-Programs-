package collection.cursorgenerics;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // option 1
        System.out.print("Print: ");
        al.remove(Integer.valueOf(40));
        System.out.println(al);

        // option 2
        System.out.print("for (index): ");
        for(int i = 0; i < al.size(); i++) {

            if(al.get(i).equals(20)) {
                al.add(i+1, 200);
                i++;
            }
//                al.set(i, 200);
//                al.remove(al.get(i));

            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println(al);

        // option 3
        Iterator it = al.iterator();
        System.out.print("Enh for: ");
        for(Object ob : al) {
            if(ob.equals(20)) {
                //it.remove(ob); // we cannot remove element in enhanced for loop
//                it.add(); // no method called add()
            }
            System.out.print(ob + " ");
        }
        System.out.println();

        // option 4
        System.out.print("Iterator: ");
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            Object el = itr.next();
            if (el.equals(20)) {
                itr.remove(); // possible
//                itr.add(); // no method called add()
            } else
                System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(al);

        // option 5
        System.out.print("List itr forward: ");
        ListIterator litr = al.listIterator();
        while(litr.hasNext()) {
            Object el = litr.next();
            if(el.equals(20))
                litr.add(200); // add element next to the current element
//                litr.set(200); // update with current element
//                litr.remove(); // remove the current element
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(al);

        // option 5 reverse
        System.out.print("List itr backward: ");
        ListIterator litrr = al.listIterator(al.size());
        while(litrr.hasPrevious()) {
            Object el = litrr.previous();
            if(el.equals(20))
//                litrr.add(200); // add element previous to the current element
//                litrr.set(200); // update with current element
                litrr.remove(); // remove the current element
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(al);


        // option 6
        System.out.print("Enumeration: ");
        Vector v = new Vector<>(al);
        Enumeration en = v.elements();

        while(en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }

        System.out.println();
        System.out.println(al);

    }
}
