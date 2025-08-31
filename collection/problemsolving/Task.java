package collection.problemsolving;

import java.util.*;

public class Task {
    public static void main(String[] args) {
//        minMax();  // task 1
//        reversedSortList();  // task 2
//        removeDuplicate();  // task 3
//        copyList();  // task 4
//        combineList();  // task 5
//        secondLarge();  // task 6
//        sortStringLengthBased();  // task 7
//        numberString();  // task 8
//        numberFrequency();  // task 9
//        characterFrequency();  // task 10
    }

    private static void minMax() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(50);
        al.add(90);
        al.add(70);
        al.add(30);

        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;

        for (Integer e : al) {
            if (e > max)
                max = e;
            if (e < min)
                min = e;
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }

    private static void reversedSortList() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(50);
        al.add(10);
        al.add(90);
        al.add(70);
        al.add(30);

/*        TreeSet ts = new TreeSet(Collections.reverseOrder());

        for(Integer i : al)
            ts.add(i);

        al = new ArrayList<>(ts);
        System.out.println(al);*/

        for(int i = 0; i < al.size() - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < al.size() - (i + 1); j++) {
                if(al.get(j) > al.get(j+1)) {
                    Integer temp = al.get(j);
                    al.set(j, al.get(j+1));
                    al.set(j+1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(al);
    }

    private static void removeDuplicate() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(10);
        al.add(10);
        al.add(20);
        al.add(20);
        al.add(30);
        al.add(30);
        al.add(40);
        al.add(50);

/*        LinkedHashSet set = new LinkedHashSet<>(al);
        al = new ArrayList<>(set);*/

        for (int i = 0; i < al.size() - 1; i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if(al.get(i) == al.get(j)) {
                    al.remove(al.get(j));
                    j--;
                }
            }
        }
        System.out.println(al);
    }

    private static void copyList() {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);

        System.out.println("List 1 : " + al1);

//        Method 1
/*        ArrayList<Integer> al2 = new ArrayList<>(al1);
        System.out.println("List 2 : " + al2);*/

//        Method 2
/*        ArrayList<Integer> al3 = new ArrayList<>();
        al3.addAll(al1);
        System.out.println("List 3 : " + al3);*/

//        Method 3
/*        ArrayList<Integer> al4 = new ArrayList<>();
        for(Integer e : al1)
            al4.add(e);
        System.out.println("List 4 : " + al4);*/

//        Method 4
/*        ArrayList al5 = (ArrayList) al1.clone();
        System.out.println("List 5 : " + al5);*/
    }

    private static void combineList() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(50);
        list1.add(10);
        list1.add(90);
        list1.add(30);
        list1.add(60);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(80);
        list2.add(50);
        list2.add(70);
        list2.add(40);
        list2.add(50);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        for(int i = 0; i < list3.size(); i++) {
            for(int j = 0; j < list3.size(); j++) {
                if(list3.get(i) < list3.get(j)) {
                    Integer temp = list3.get(i);
                    list3.set(i, list3.get(j));
                    list3.set(j, temp);
                }
            }
        }
        System.out.println(list3);
    }

    private static void secondLarge() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(75);
        al.add(10);
        al.add(50);
        al.add(90);
        al.add(90);
        al.add(70);
        al.add(30);

        Integer max = Integer.MIN_VALUE;
        Integer max2 = Integer.MAX_VALUE;

        for (Integer e : al) {
            if (e > max) {
                max2 = max;
                max = e;
            }
            else if (e > max2 && e < max)
                max2 = e;
        }
        System.out.println("First Max : " + max);
        System.out.println("Second max : " + max2);
    }

    private static void sortStringLengthBased() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Vinu");
        list.add("Hi");
        list.add("World!");
        list.add("Java");
        list.add("Program");
        list.add("Language");
        list.add("I");

        for(int i = 0; i < list.size() - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < list.size() - (i + 1); j++) {
                if(list.get(j).length() > list.get(j+1).length()) {
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

    private static void numberString() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Vinu");
        list.add("2Hi");
        list.add("8World!");
        list.add("Java");
        list.add("3Program");
        list.add("Language");
        list.add("1I");

        for (String str : list) {
            if(str.charAt(0) >= '0' && str.charAt(0) <= '9')
                System.out.println(str);
        }
    }

    private static void numberFrequency() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(30);
        list.add(40);
        list.add(50);

        for(int i = 0; i < list.size(); i++) {
            int count = 1;
            for(int j = 0; j < list.size(); j++) {
                if(i == j) continue;
                if(Objects.equals(list.get(i), list.get(j))) {
                    count++;
                    list.remove(j);
                }
            }
            System.out.println(list.get(i) + " " + count + " occurence");
        }
    }

    private static void characterFrequency() {

        String s = "Java is a Programming Language";

        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Integer> freq = new ArrayList<>();

        int count;
        for(int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            count = 1;
            for(int j = 0; j < s.length(); j++) {
                if(i == j) continue;
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if(!list.contains(ch)) {
                list.add(ch);
                freq.add(count);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " - " + freq.get(i) + " occurence");
        }
    }

}
