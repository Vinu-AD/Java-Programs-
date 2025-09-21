package advancedjava.stream.tasks;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student {
    private Integer rollNo;
    private String name;
    private String department;
    private Integer age;
    private Integer sub1;
    private Integer sub2;
    private Integer sub3;
    private Integer sub4;
    private Integer sub5;

    public Student(Integer rollNo, String name, String department, Integer age, Integer sub1, Integer sub2, Integer sub3, Integer sub4, Integer sub5) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.age = age;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSub1() {
        return sub1;
    }

    public Integer getSub2() {
        return sub2;
    }

    public Integer getSub3() {
        return sub3;
    }

    public Integer getSub4() {
        return sub4;
    }

    public Integer getSub5() {
        return sub5;
    }

    @Override
    public String toString() {
        return "[" + rollNo +
                ", " + name +
                ", " + department +
                ", " + age +
                ", " + sub1 +
                ", " + sub2 +
                ", " + sub3 +
                ", " + sub4 +
                ", " + sub5 + "]";
    }
}

public class StudentTask {

    private static final ArrayList<Student> students = new ArrayList<>();

    private static void addStudents() {
        students.add(new Student(101, "Ananthi", "Backend", 21, 190, 199, 190, 185, 195));
        students.add(new Student(102, "Banu", "Backend", 22, 150, 159, 150, 155, 155));
        students.add(new Student(103, "Anu", "Backend", 23, 120, 169, 190, 180, 85));
        students.add(new Student(104, "Charu", "Frontend", 24, 30, 49, 40, 135, 125));
        students.add(new Student(105, "Sneha", "Frontend", 25, 150, 139, 130, 155, 135));
        students.add(new Student(106, "Yashika", "Frontend", 20, 50, 69, 60, 35, 35));
        students.add(new Student(107, "Karthika", "Software", 22, 170, 189, 150, 175, 175));
        students.add(new Student(108, "Dharshini", "Software", 19, 180, 149, 180, 180, 185));
        students.add(new Student(109, "Shuba", "Tester", 18, 190, 169, 30, 195, 155));
        students.add(new Student(110, "Shalini", "Tester", 20, 190, 179, 160, 180, 185));
    }

    private static void studentsByDept() {
        System.out.println("Students by department");
        Map<String, String> toppers  = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.joining(",", "[", "]"))
                ));

        toppers.forEach((key, value)-> System.out.println(key + " => " + value));
    }

    private static void markCategory() {
        System.out.println("Students status list");
        Map<String, String> toppers  = students.stream()
                .collect(Collectors.groupingBy( s -> {
                    int mark = s.getSub1()+s.getSub2()+s.getSub3()+s.getSub4()+s.getSub5();
                    if (mark >= 950) return "Excellent";
                    else if (mark >= 800) return "Very Good";
                    else if (mark >= 500) return "Good";
                    else if (mark >= 300) return "Need Improve";
                    else return "Bad";
                }, Collectors.mapping(Student::getName, Collectors.joining(","))));

        toppers.forEach((key, value) -> System.out.println(key + " => " + value));
    }

    private static void youngStudents() {
        System.out.println("Youngest student per department");
        Map<String, String> youngsters  = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.collectingAndThen(
                        Collectors.minBy(Comparator.comparingInt(Student::getAge)),
                        s -> s.map(Student::getName).orElse("No students")
                        ))
                );

        youngsters.forEach((key, value) -> System.out.println(key + " => " + value));
    }

    private static void passFail() {
        Predicate<Student> isPass = s -> s.getSub1() >= 70 && s.getSub2() >= 70 && s.getSub3() >= 70 && s.getSub4() >= 70 && s.getSub5() >= 70;
        Map<Boolean, String> result = students.stream()
                .collect(Collectors.partitioningBy(
                        isPass,
                        Collectors.mapping(
                                Student::getName,
                                Collectors.joining(",")
                        )
                ));

        result.forEach((x,y)->{
            if(x) {
                System.out.println("Passed Students => " + y);
            } else {
                System.out.println("Failed Students => " + y);
            }
        });
    }

    public static void main(String[] args) {
        addStudents();
//        studentsByDept();
//        markCategory();
//        youngStudents();
        passFail();
    }
}
