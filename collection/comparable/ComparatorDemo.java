package collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Emp implements Comparator<Emp> {
    int id;
    String name;
    String role;
    Double salary;

    public Emp(int id, String name, String role, Double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public Emp() {}

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary + '\n' ;
    }

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.id - o2.id;
//        return (int) (o1.salary - o2.salary);
//        return o1.name.compareTo(o2.name);
//        return o1.role.compareTo(o2.role);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {


        ArrayList<Emp> employees = new ArrayList<>();
        employees.add(new Emp(101, "Gopi", "Full Stack Developer", 50000.0));
        employees.add(new Emp(103, "Vijay", "SQL Developer", 90000.0));
        employees.add(new Emp(105, "Gokul", "Frontend Developer", 60000.0));
        employees.add(new Emp(102, "Hari", "Backend Developer", 80000.0));
        employees.add(new Emp(104, "Vinu", "Software Developer", 100000.0));

        System.out.println(employees);
        Collections.sort(employees,  new Emp());
        System.out.println(employees);
    }
}
