package collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<String, Integer> cities = new TreeMap<>();
        cities.put("Kallai", 606202);
        cities.put("Kallai", 606203);
        cities.put("Salem", 606392);
        cities.put("Salem", 606393);
        cities.put("Erode", 239582);
        cities.put("Chennai", 600001);
        cities.put("Chennai", 600002);
        cities.put("Bangalore", 493820);
        cities.put("Kovai", null);
        cities.put("Hyderabad", null);
//        cities.put(null, null); null key is not allowed (NPE)
        System.out.println(cities);
        System.out.println();

//        System.out.println(cities.get("kallai"));
//        System.out.println(cities.firstKey());
//        System.out.println(cities.firstEntry());
//        System.out.println(cities.lastKey());
//        System.out.println(cities.lastEntry());

//        System.out.println(cities.headMap("Erode")); // <
//        System.out.println(cities.tailMap("Kovai")); // >=
//        System.out.println(cities.subMap("Chennai", "Kovai")); // >= - <

//        System.out.println(cities.ceilingKey("Kovai")); // >=
//        System.out.println(cities.floorKey("Kallai"));  // <=

//        System.out.println(cities.higherKey("Erode")); // >
//        System.out.println(cities.lowerKey("Erode"));  // <

//        System.out.println(cities.ceilingEntry("Erode")); // >=
//        System.out.println(cities.floorEntry("Erode"));   // <=

//        System.out.println(cities.higherEntry("Erode")); // >
//        System.out.println(cities.lowerEntry("Erode"));  // <

//        System.out.println(cities.firstEntry());
//        System.out.println(cities.lastEntry());

//        System.out.println(cities.pollFirstEntry());
//        System.out.println(cities.pollLastEntry());

        System.out.println(cities.descendingMap());
        System.out.println(cities.descendingKeySet());

//        System.out.println(cities.ceilingEntry("Erode"));

        System.out.println();
        for (Map.Entry<String, Integer> city : cities.entrySet())
            System.out.println(city);
    }
}
