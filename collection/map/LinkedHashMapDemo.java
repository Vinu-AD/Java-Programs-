package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> numbers = new LinkedHashMap<>();
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.putFirst(1, "One");
        numbers.putLast(5, "Five");

        System.out.println(numbers);

//        System.out.println(numbers.putFirst(0, "Zero")); return ??

//        numbers.pollFirstEntry();
//        numbers.pollLastEntry();

//        numbers.remove(4);
//        numbers.remove(2, "Two");

//        System.out.println(numbers.firstEntry());
//        System.out.println(numbers.lastEntry());

//        System.out.println(numbers.sequencedEntrySet().getFirst());
//        System.out.println(numbers.sequencedEntrySet().getLast());

//        System.out.println(numbers.reversed());

//        System.out.println(numbers);

       /* for (Integer key : numbers.keySet())
            System.out.print(key + " ");
        System.out.println();

        for (String value : numbers.values())
            System.out.print(value + " ");
        System.out.println();

        for (Integer n : numbers.keySet())
            System.out.println(n + " : " + numbers.get(n));

        for (Map.Entry<Integer, String> numPair : numbers.entrySet())
//            System.out.println(numPair);
            System.out.println(numPair.getKey() + " : " + numPair.getValue());*/

//        Map.Entry<Integer, String> first = numbers.firstEntry();
//        System.out.println(first.getKey() + " = " + first.getValue());

//        Map.Entry<Integer, String> last = numbers.lastEntry();
//        System.out.println(last.getKey() + " = " + last.getValue());

//        System.out.println(numbers.reversed());
//        System.out.println(numbers.sequencedKeySet());
//        System.out.println(numbers.sequencedValues());
//        System.out.println(numbers.sequencedEntrySet());

//        System.out.println(LinkedHashMap.newLinkedHashMap(3));

        System.out.println(numbers);
    }
}
