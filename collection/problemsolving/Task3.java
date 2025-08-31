package collection.problemsolving;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
//        secondLargest();
//        sortByLength();
//        charFrequency();
//        firstNonRepeatChar();
//        findDuplicates();
//        findNumString();
    }
    private static void secondLargest() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 8, 9, 5, 1, 7, 8, 9));
        Integer max = Integer.MIN_VALUE;
        int max2 = max;
        for (Integer num : list) {
            if (num.compareTo(max) > 0) {
                max2 = max;
                max = num;
            } else if (num.compareTo(max2) > 0 && num.compareTo(max) < 0) {
                max2 = num;
            }
        }
        System.out.println("First Max: " + max);
        System.out.println("Second Max: " + max2);
    }

    private static void sortByLength() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello", "Hi", "Hey", "Hope"));
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("Hi", "Hey", "Hope", "Hello"));

        for(int i = 0; i < list.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if(list.get(j).length() < list.get(j+1).length()) {
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        System.out.println(list);

    }

    private static void charFrequency() {
        String str = "Go green before green goes";
//        str = "Hello";
        TreeMap<Character, Integer> freq = new TreeMap<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!freq.containsKey(c)) {
                freq.put(c, 1);
            }
            else
                freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for (Character ch : freq.keySet()) {
            System.out.println(ch + " => " + freq.get(ch));
        }
    }

    private static void firstNonRepeatChar() {
        String str = "go green before green goes";
//        str = "";
        HashMap<Character, Integer> container = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if(container.containsKey(ch)) {
                container.put(ch, container.getOrDefault(ch, 0) + 1);
            }
            else
                container.put(ch, 1);
        }

        boolean found = false;
        for(Character ch : str.toCharArray()) {
            if(container.get(ch) == 1) {
                System.out.println("First non-repeating character is: " + ch);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("No non-repeating character");

    }

    private static void findDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 5};

        HashMap<Integer, Integer> fr = new HashMap<>();
        for (Integer n : arr) {
            if(fr.containsKey(n))
                fr.put(n, fr.getOrDefault(n, 0) + 1);
            else
                fr.put(n, 1);
        }

        for (Integer n : fr.keySet()) {
            if (fr.get(n) > 1) {
                System.out.print(n + " ");
            }
        }
    }

    private static void findNumString() {
        LinkedList<String> strings = new LinkedList<>();
        strings.addAll(Arrays.asList("One1", "2Two", "3Three", "Four4"));
        for (String str : strings) {
            if(Character.isDigit(str.charAt(0))) {
                System.out.print(str + " ");
            }
        }
    }
}
