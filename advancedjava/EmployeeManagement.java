package advancedjava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
create Employee class with id, name, role, salary, dateOfJoining, experience.
Ask user input to do the operations based on below methods.

create method like addEmployee, addAllEmployee, getEmployees, getEmployeeById,
getEmployeeByRole, getEmployeeBySalary(start & end) getEmployeeByDOJ(start & end),
deleteEmployeeById, updateEmployeeById using collection and java;
*/

class Employee {
    private int id;
    private String name;
    private String role;
    private int salary;
    private LocalDate  doj;
    private int experience;

    public Employee(int id, String name, String role, int salary, LocalDate doj, int experience) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.doj = doj;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public int getExperience() {
        return experience;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return id +
                ", " + name +
                ", " + role +
                ", " + salary +
                ", " + doj +
                ", " + experience;
    }
}

public class EmployeeManagement {
    static Scanner scan = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList<>();

    private static void addAllEmployee() {
        employees.add(new Employee(101, "Adam", "Software", 130000, LocalDate.of(2010, 10, 10), 3));
        employees.add(new Employee(102, "Bob", "Frontend", 120000, LocalDate.of(2012, 6, 20), 2));
        employees.add(new Employee(103, "Cerina", "Software", 120000, LocalDate.of(2012, 8, 30), 2));
        employees.add(new Employee(104, "David", "Frontend", 160000, LocalDate.of(2010, 10, 15), 4));
        employees.add(new Employee(105, "Eric", "Backend", 175000, LocalDate.of(2020, 3, 25), 5));
        employees.add(new Employee(106, "Fazil", "Fullstack", 300000, LocalDate.of(2020, 7, 12), 8));
        employees.add(new Employee(107, "Danie", "HR", 150000, LocalDate.of(2015, 5, 17), 4));
        employees.add(new Employee(108, "Peter", "Fullstack", 250000, LocalDate.of(2025, 8, 22), 4));
        employees.add(new Employee(109, "Jokey", "HR", 125000, LocalDate.of(2015, 1, 1), 2));
        employees.add(new Employee(110, "Julia", "Backend", 200000, LocalDate.of(2025, 9, 28), 6));
    }

    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Employee Role: ");
        String role = scan.nextLine();
        System.out.print("Enter Employee Salary: ");
        int salary = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Employee experience: ");
        int experience = scan.nextInt();
        employees.add(new Employee(id, name, role, salary, LocalDate.now(), experience));
    }

    private static void getEmployee() {
        employees.forEach(System.out::println);
    }

    private static void getEmployeeById() {
        System.out.print("Enter Employee ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        employees.stream()
                .filter(emp -> emp.getId() == id)
                .forEach(System.out::println);
    }

    private static void getEmployeeByName() {
        System.out.print("Enter Employee Name: ");
        String name = scan.nextLine();

        employees.stream()
                .filter(emp -> emp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    private static void getEmployeeByRole() {
        System.out.print("Enter Employee Role: ");
        String role = scan.nextLine();

        employees.stream()
                .filter(emp -> emp.getRole().equalsIgnoreCase(role))
                .forEach(System.out::println);
    }

    private static void getEmployeeBySalary() {
        System.out.print("Enter Employee Salary (start): ");
        int start = scan.nextInt();
        System.out.print("Enter Employee Salary (end): ");
        int end = scan.nextInt();

        employees.stream()
                .filter(emp -> emp.getSalary() >= start && emp.getSalary() <= end)
                .forEach(System.out::println);
    }

    private static void getEmployeeByDate() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Enter Employee Start Date (dd-mm-yyyy): ");
        LocalDate startDate = LocalDate.parse(scan.next(), format);
        System.out.print("Enter Employee End Date (dd-mm-yyyy): ");
        LocalDate endDate = LocalDate.parse(scan.next(), format);

        employees.stream()
                .filter(emp -> emp.getDoj().isAfter(startDate) && emp.getDoj().isBefore(endDate))
                .forEach(System.out::println);
    }

    private static void deleteEmployeeById() {
        System.out.print("Enter Employee ID to delete: ");
        int id = scan.nextInt();
        scan.nextLine();

        boolean empFound = employees.stream().anyMatch(emp -> emp.getId() == id);

        if(empFound) {
            employees = employees.stream()
                    .filter(emp -> emp.getId() != id)
                    .collect(Collectors.toCollection(
                            ArrayList::new
                    ));
            System.out.println("Employee(ID:" + id + ") deleted");
        }
        else
            System.out.println("Employee ID : " + id + " not found");

    }

    private static void updateEmployeeById() {
        System.out.print("Enter Employee ID to update: ");
        int id = scan.nextInt();
        scan.nextLine();

        boolean empFound = employees.stream().anyMatch(emp -> emp.getId() == id);

        if(!empFound) {
            System.out.println("Employee ID : " + id + " not found");
        }
        else {
            System.out.println();
            System.out.println("1. Name update");
            System.out.println("2. Role update");
            System.out.println("3. Salary update");
            System.out.println("4. DOJ update");
            System.out.println("5. Experience update");
            System.out.print("Enter: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Employee name: ");
                    String name = scan.nextLine();
                    employees = employees.stream()
                            .map( emp -> {
                                if (emp.getId() == id) {
                                    emp.setName(name);
                                    return emp;
                                }
                                return emp;
                            })
                            .collect(Collectors.toCollection(ArrayList::new));
                }
                case 2 -> {
                    System.out.print("Enter Employee role: ");
                    String role = scan.nextLine();
                    employees = employees.stream()
                            .map( emp -> {
                                if (emp.getId() == id) {
                                    emp.setRole(role);
                                    return emp;
                                }
                                return emp;
                            })
                            .collect(Collectors.toCollection(ArrayList::new));
                }
                case 3 -> {
                    System.out.print("Enter Employee salary: ");
                    int salary = scan.nextInt();
                    employees = employees.stream()
                            .map( emp -> {
                                if (emp.getId() == id)
                                    emp.setSalary(salary);
                                return emp;
                            })
                            .collect(Collectors.toCollection(ArrayList::new));
                }
                case 4 -> {
                    System.out.print("Enter Employee DOJ (dd-mm-yyyy): ");
                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate doj = LocalDate.parse(scan.next(), format);
                    employees = employees.stream()
                            .map( emp -> {
                                if (emp.getId() == id)
                                    emp.setDoj(doj);
                                return emp;
                            })
                            .collect(Collectors.toCollection(ArrayList::new));
                }
                case 5 -> {
                    System.out.print("Enter Employee experience: ");
                    int experience = scan.nextInt();
                    employees = employees.stream()
                            .map( emp -> {
                                if (emp.getId() == id)
                                    emp.setExperience(experience);
                                return emp;
                            })
                            .collect(Collectors.toCollection(ArrayList::new));
                }
                default -> {
                    System.out.println("Invalid input");
                }
            }
        }
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("1. Add Employee");
        System.out.println("2. Get Employee");
        System.out.println("3. Get Employee by ID");
        System.out.println("4. Get Employee by Name");
        System.out.println("5. Get Employee by Role");
        System.out.println("6. Get Employee by Salary");
        System.out.println("7. Get Employee by Date");
        System.out.println("8. Delete Employee by ID");
        System.out.println("9. Update Employee by ID");
        System.out.println("10. Exit");
        System.out.print("Enter: ");
    }

    private static void start() {
        while (true) {
            showMenu();
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> getEmployee();
                case 3 -> getEmployeeById();
                case 4 -> getEmployeeByName();
                case 5 -> getEmployeeByRole();
                case 6 -> getEmployeeBySalary();
                case 7 -> getEmployeeByDate();
                case 8 -> deleteEmployeeById();
                case 9 -> updateEmployeeById();
                case 10 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
    public static void main(String[] args) {
        addAllEmployee();
        start();
    }
}
