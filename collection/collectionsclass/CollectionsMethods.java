package collection.collectionsclass;

import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Gokul");
        list.addAll(Arrays.asList("Vinu", "Vijay", "Gopi")); // 1
        list.addAll(Arrays.asList("Sukish", "Dinesh", "Vinu"));

//        Collections.sort(list); // 2

        System.out.println(list);
//        Collections.reverse(list); // 3
//        Collections.sort(list, Comparator.naturalOrder()); // 4
//        Collections.sort(list, Comparator.reverseOrder());
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println(Collections.min(list)); // 5
//        System.out.println(Collections.min(list, Comparator.naturalOrder()));
//        System.out.println(Collections.min(list, Comparator.reverseOrder()));
//        System.out.println(Collections.max(list)); // 6

//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(Collections.binarySearch(list, "Vijay")); // 7
//        System.out.println(Collections.binarySearch(list, "Marwan"));

//        Collections.reverse(list);
//        System.out.println(Collections.binarySearch(list, "Vinu", Comparator.naturalOrder()));
//        System.out.println(Collections.binarySearch(list, "Vinu", Comparator.reverseOrder()));

//        List<String> synList = Collections.synchronizedList(list); // 8
//        System.out.println("Sync: " + synList);

//        List<String> unModify = Collections.unmodifiableList(list); // 9
//        System.out.println("Immutable: " + unModify);
//        unModify.add("New Data"); // UnsupportedOperationException

//        ArrayList<String> temp = new ArrayList<>(list);
//        list.add("Hi");
//        Collections.copy(list, temp); // 10

//        System.out.println(Collections.nCopies(3, "ONE")); // 11

//        System.out.println(Collections.frequency(list, "Vinu")); // 12
//        Collections.shuffle(list); // 13
//        Collections.rotate(list, -1); // 14

        System.out.println(Collections.checkedList(list, String.class)); // 15
        System.out.println(list);
    }
}
