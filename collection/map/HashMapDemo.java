package collection.map;

// Map is not a sub-interface of the collection interface

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String , Integer> contacts = new HashMap<>();
        contacts.put("Gokul", 1122334455);
        contacts.put("Vijay", 1557280524);
        contacts.put("Gopi", 1552849524);
        contacts.put("Vinu", 1548480524);
//        contacts.put("Vinu", 1234567890);
        contacts.put("Mukesh", 1557285824);

//        System.out.println(contacts.isEmpty());
//        System.out.println(contacts.size());

//        System.out.println(contacts);

        contacts.replace("Vinu", 950882368);

//        for (Map.Entry<String, Integer> entry : contacts.entrySet())
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        System.out.println();

//        System.out.println(contacts.get("vinu"));
//        System.out.println(contacts.get("Vinu"));

//        System.out.println(contacts.keySet());
//        System.out.println(contacts.values());

//        System.out.println(contacts.clone());
//        HashMap<String, Integer> cloned = (HashMap<String, Integer>) contacts.clone();
//        System.out.println(cloned);

//        System.out.println(contacts.containsKey("Vinu"));
//        System.out.println(contacts.containsValue(950882368));

//        System.out.println(contacts.size());
//        System.out.println(contacts.remove("Vinu"));
//        System.out.println(contacts.size());

//        contacts.clear();
//        System.out.println(contacts.size());
//        System.out.println(contacts.isEmpty());

//        System.out.println(contacts.entrySet());

        for (String name : contacts.keySet())
            System.out.println(name + " : " + contacts.get(name));


    }
}
