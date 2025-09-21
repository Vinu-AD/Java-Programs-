package advancedjava.optionalclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee {
    int id;
    String name;
    String department;
    double salary;
    String city;
    int age;

    Employee() {}

    public Employee(int id, String name, String department, double salary, String city, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return id +
                ", " + name +
                ", " + department +
                ", " + salary +
                ", " + city +
                ", " + age + "\n";
    }
}

public class EmployeeTask {

    static List<Employee> employees = Arrays.asList(
            new Employee(101, "Gopi", "Frontend", 30000, "Truvannamalai", 19),
            new Employee(102, "Vijay", "Frontend", 70000, "Salem", 19),
            new Employee(109, "Surya", "Frontend", 30000, "Truvannamalai", 28),
            new Employee(105, "Vinu", "Fullstack", 100000, "Kallai", 21),
            new Employee(104, "Gokul", "Fullstack", 80000, "Salem", 23),
            new Employee(110, "Sukish", "Backend", 90000, "Truvannamalai", 20),
            new Employee(106, "Dinesh", "Backend", 100000, "Erode", 21),
            new Employee(114, "Mukesh", "Software", 40000, "Trichi", 32)
    );

    private static void displayEmp() {
        System.out.println("Employee details...");
        for (Employee emp : employees)
            System.out.print(emp);
    }

    private static Optional<Employee> getEmpById(int id) {
        Optional<Employee> employee = Optional.ofNullable(null);
        for (Employee emp : employees) {
            if (emp.id == id) {
                employee = Optional.of(emp);
                break;
            }
        }
        return employee;
    }

    private static Optional<ArrayList<Employee>> getEmpByDept(String dept) {
        ArrayList<Employee> employeeByDept = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.department.equals(dept)) {
                employeeByDept.add(emp);
            }
        }
        return Optional.ofNullable(employeeByDept);
    }

    public static void main(String[] args) {
//        displayEmp();

        Optional<Employee> emp = getEmpById(105);
        emp.ifPresent(System.out::println);

        Optional<ArrayList<Employee>> roles = getEmpByDept("Fullstack");
        roles.ifPresent(System.out::println);
    }

}
