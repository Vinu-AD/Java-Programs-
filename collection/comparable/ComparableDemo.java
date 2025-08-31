package collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    Integer id;
    String name;
    String address;
    Double mark;
    Character grade;

    public Student(int id, String name, String address, Double mark, char grade) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mark = mark;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mark=" + mark + '\'' +
                ", grade=" + grade + '\n' ;
    }

    @Override
    public int compareTo(Student o) {
//        return this.id - o.id;
//        return this.name.compareTo(o.name);
        return o.mark.compareTo(this.mark);
//        return this.grade.compareTo(o.grade);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Student> stud = new ArrayList<>();
        stud.add(new Student(101, "Gopi", "Thiruvannamalai", 450.0, 'B'));
        stud.add(new Student(103, "Vijay", "kanchipuram", 480.0, 'A'));
        stud.add(new Student(105, "Gokul", "Salem", 485.0, 'A'));
        stud.add(new Student(102, "Hari", "Erode", 350.5, 'C'));
        stud.add(new Student(104, "Vinu", "Kallakurichi", 489.1, 'A'));

        System.out.println(stud);

        Collections.sort(stud);

        System.out.println(stud);
    }
}
