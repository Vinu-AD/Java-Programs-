package advancedjava.stream.tasks;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[" + id +
                ", " + name +
                ", " + department +
                ", " + salary + "]";
    }
}

public class EmployeeTask {
    private static ArrayList<Employee> employees = new ArrayList<>();

    private static void addEmployees() {
        employees.add(new Employee(101, "Gopi", "Frontend", 30000));
        employees.add(new Employee(102, "Hari", "Frontend", 70000));
        employees.add(new Employee(109, "Surya", "Frontend", 30000));
        employees.add(new Employee(105, "Vinu", "Fullstack", 100000));
        employees.add(new Employee(104, "Gokul", "Fullstack", 80000));
        employees.add(new Employee(110, "Sukish", "Backend", 90000));
        employees.add(new Employee(106, "Dinesh", "Backend", 100000));
        employees.add(new Employee(114, "Mukesh", "Software", 50000));
        employees.add(new Employee(106, "Manikumar", "Software", 45000));
    }

    private static void empBySalary() {
        List<Employee> emp = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .toList();
        emp.forEach(System.out::println);
    }

    private static void groupByDept() {
        Map<String, String> empDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.joining(",","[","]")
                        )
                ));

        empDept.forEach(
                (key, value) -> System.out.println(key + " => " + value)
        );
    }

    private static void highPayEmp() {
        System.out.println("High pay employee...");
        Map<String, String> empDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)),
                                e -> e.map(Employee::getName).orElse("No data")
                        )
                ));

        empDept.forEach(
                (key, value) -> System.out.println(key + " -> " + value)
        );
    }

    private static void avgSalary() {
        Map<String, Double> avg =  employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)

                ));

        avg.forEach(
                (k,v) -> System.out.println(k + " => " + v)
        );
    }

    public static void main(String[] args) {
        addEmployees();
//        empBySalary();
//        groupByDept();
//        highPayEmp();
        avgSalary();
    }
}
