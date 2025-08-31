package collection.cursorgenerics;

import java.util.*;

class Employee {
    Integer id;
    String name;
    String role;
    Double salary;
    Integer experience;

//    EmployeeList() {}

    Employee(Integer id, String name, String role, Double salary, Integer experience) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.experience = experience;
    }

    public String toString() {
        return id + " " + name + " " + role + " " + salary + " " + experience + " ";
    }
}
public class Generics {
    private static void employeeList() {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Vinu", "Java Developer", 150000d, 5));
        empList.add(new Employee(102, "Ajan", "Cloud Services", 180000d, 6));
        empList.add(new Employee(103, "Subash", "SQL Developer", 120000d, 3));

        Iterator emp = empList.iterator();
        while(emp.hasNext())
            System.out.println(emp.next());
    }

    private static <T extends Comparable<T>> void bSort(ArrayList<T> list) {
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    T t = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, t);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(list);
    }

    private static void bubbleSort() {
        ArrayList<Character> charList = new ArrayList();
        charList.add('z');
        charList.add('u');
        charList.add('e');
        charList.add('o');
        charList.add('a');
        charList.add('y');
        charList.add('i');
        charList.add('x');

        ArrayList<String > strList = new ArrayList();
        strList.add("Ajan");
        strList.add("Subash");
        strList.add("Vetri");
        strList.add("Jegan");
        strList.add("Pandi");
        strList.add("Vinu");
        strList.add("Alpho");
        strList.add("Arun");


        bSort(strList);
    }

    public static void main(String[] args) {

//        employeeList();
        bubbleSort();

//        temp();

    }

    private static void temp(Collection<?> ob) {
    }
    private static void temp1(List<? extends Number> ob) {
        // only for read operations
    }
    private static void temp2(List<? super Number> ob) {
        // only for write operations
    }
    private static <T extends Number> void temp3(List<T> ob) {
        // for both read and write operations
    }


}
