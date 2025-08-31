package collection.problemsolving;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
//        firstRepeatingChar();
//        firstNonRepeatingChar();
//        wordFrequency();
        charFrequency();
//        sortByKey();
//        sortByValue();
    }

    private static void firstRepeatingChar() {
        String str = "Apple";

        HashMap<Character, Integer> container = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            container.put(ch, container.getOrDefault(ch, 0) + 1);
        }

        boolean found = false;
        for(Character ch : str.toCharArray()) {
            if(container.get(ch) > 1) {
                System.out.println("First non-repeating character is: " + ch);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("No non-repeating character");

    }

    private static void firstNonRepeatingChar() {
        String str = "go green before green goes";

        HashMap<Character, Integer> container = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            container.put(ch, container.getOrDefault(ch, 0) + 1);
        }

        boolean found = false;
        for(Character ch : str.toCharArray()) {
            if(container.get(ch) == 1) {
                System.out.println("First repeating character is: " + ch);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("No repeating character");

    }

    private static void wordFrequency() {
        String str = "Zero one two two three three three";
        String[] nums = str.split(" ");
        HashMap<String, Integer> fr = new HashMap<>();

        for (String n : nums) {
            fr.put(n, fr.getOrDefault(n, 0) + 1);
        }

        for (String s : fr.keySet())
            System.out.println(s + " : " + fr.get(s));
    }

    private static void charFrequency() {
        String str = "Zero one two two three three three";
        TreeMap<Character, Integer> fr = new TreeMap<>();

        for (Character n : str.toCharArray()) {
            fr.put(n, fr.getOrDefault(n, 0) + 1);
        }

        for (Character s : fr.keySet())
            System.out.println(s + " : " + fr.get(s));
    }

    private static void sortByKey() {
        HashMap<String, Integer> contact = new HashMap<>();
        contact.put("Gokul", 1122334455);
        contact.put("Vijay", 1557280524);
        contact.put("Gopi", 1552849524);
        contact.put("Vinu", 1548480524);
//        contact.put("Vinu", 1234592805);
        contact.put("Mukesh", 1557285824);

        TreeMap<String, Integer> sorted = new TreeMap<>(contact);
        for (String name : sorted.keySet())
            System.out.println(name + " : " + sorted.get(name));

/*        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(contact.entrySet());
        sorted.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, Integer> s : sorted)
            System.out.println(s.getKey() + " : " + s.getValue());*/
    }

    private static void sortByValue() {
        HashMap<String, Integer> contact = new HashMap<>();
        contact.put("Gokul", 123456789);
        contact.put("Vijay", 213456789);
        contact.put("Gopi", 312456789);
        contact.put("Vinu", 412356789);
//        contact.put("Vinu", 1234592805);
        contact.put("Mukesh", 512346789);

        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(contact.entrySet());

        sorted.sort(Map.Entry.comparingByKey());

        for (Map.Entry<String, Integer> con : sorted)
            System.out.println(con.getKey() + " : " + con.getValue());
    }
}
