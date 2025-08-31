package collection.problemsolving;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String role;
    Double salary;

    public Employee(int id, String name, String role, Double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String toString() {
        return String.format("%5s | %20s | %30s |    %,15.2f\n", id, name, role, salary);
    }
}

public class EmployeeManagement {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    private static void create() {
        employees.add(new Employee(101, "Gokul", "Frontend Developer", 100000.0));
        employees.add(new Employee(102, "Hari", "Backend Developer", 60000.0));
        employees.add(new Employee(103, "Kala", "SQL Developer", 70000.0));
        employees.add(new Employee(104, "Gopi", "Server Management", 80000.0));
        employees.add(new Employee(105, "Ajan", "Cloud Management", 90000.0));
        employees.add(new Employee(106, "Nila", "Deployment Team", 100000.0));
        employees.add(new Employee(107, "Subash", "Testing", 50000.0));
        employees.add(new Employee(108, "Vijay", "Software Developer", 150000.0));
        employees.add(new Employee(109, "Gopi", "Associate Software developer", 120000.0));
        employees.add(new Employee(110, "Vinu", "Fullstack Developer", 150000.0));
    }

    private static void options() {
        System.out.println("""
                
                1. Add Employee with details (id, name, role, sal)
                2. Search Employee by Id or name
                3. Count of the Employee
                4. Count of Employee based on role
                5. Remove Employee by Id
                6. Update employee details
                7. Display all Employee
                8. Display Employee by id
                9. Exit""");
    }

    private static boolean validate(int id) {
        for(Employee emp : employees) {
            if(emp.id == id) {
                return true;
            }
        }
        return false;
    }

    private static void addEmp() {
        boolean idFound;
        int id;
        while(true) {
            System.out.print("Enter employee id: ");
            try {
                id = scan.nextInt();
                scan.nextLine();
                idFound = validate(id);

            } catch (InputMismatchException e) {
                System.out.println("Enter valid ID");
                scan.nextLine();
                continue;
            }
            if(idFound) System.out.println("Id already exist");
            else break;
        }

        String name;
        while (true) {
            System.out.print("Enter employee name: ");
            if(scan.hasNextInt()) {
                System.out.println("Enter valid name");
                scan.nextLine();
            }
            else {
                name = scan.nextLine();
                break;
            }
        }

        String role;
        while (true) {
            System.out.print("Enter employee role: ");
            if(scan.hasNextInt()) {
                System.out.println("Enter valid role");
                scan.nextLine();
            }
            else {
                role = scan.nextLine();
                break;
            }
        }


        double salary;
        while (true) {
            System.out.print("Enter employee salary: ");
            try {
                salary = scan.nextDouble();
                scan.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter valid salary");
                scan.nextLine();
            }
        }

        System.out.println("Employee details added successfully\n");
        employees.add(new Employee(id, name, role, salary));
        System.out.printf("%5s | %20s | %30s |    %13s\n", "ID", "Name", "Role", "Salary");
        System.out.println("======|======================|================================|===================");
        System.out.printf("%5s | %20s | %30s |    %,15.2f\n", id, name, role, salary);

    }

    private static void searchByIdOrName() {
        boolean empFound;
        do {
            empFound = false;
            System.out.print("Enter employee Id or name: ");
            if (scan.hasNextInt()) {
                int id = scan.nextInt();
                scan.nextLine();
                System.out.printf("%5s | %20s | %30s |    %13s\n", "ID", "Name", "Role", "Salary");
                System.out.println("======|======================|================================|===================");
                for (Employee emp : employees) {
                    if (emp.id == id) {
                        empFound = true;
                        System.out.print(emp);
                    }
                }
                System.out.println();
                if(!empFound) System.out.println("Employee not found with this ID.\n");
            }
            else {
                String name = scan.nextLine().trim();
                System.out.printf("%5s | %20s | %30s |    %13s\n", "ID", "Name", "Role", "Salary");
                System.out.println("======|======================|================================|===================");
                for (Employee emp : employees) {
                    if (emp.name.equalsIgnoreCase(name)) {
                        empFound = true;
                        System.out.print(emp);
                    }
                }
                System.out.println();
                if(!empFound) System.out.println("Employee not found with this name.\n");

            }
        }while(!empFound);
    }

    private static void displayById() {
        boolean idFound;
        do {
            idFound = false;
            System.out.print("Enter employee id: ");
            int id;
            if(scan.hasNextInt()) {
                id = scan.nextInt();
                scan.nextLine();
            }
            else {
                System.out.println("Enter valid input(ID)");
                scan.nextLine();
                continue;
            }
            for (Employee emp : employees) {
                if (emp.id == id) {
                    idFound = true;
                    System.out.printf("%5s | %20s | %30s |    %13s\n", "ID", "Name", "Role", "Salary");
                    System.out.println("======|======================|================================|===================");
                    System.out.println(emp);

                }
            }
            if(!idFound) System.out.println("Employee not found\nEnter valid ID");
        }while(!idFound);
    }

    private static void countByRole() {
        boolean roleFound;
        do {
            roleFound = false;
            System.out.print("Enter employee role: ");
            String role = scan.nextLine();
            int roleCount = 0;
            for (Employee emp : employees)
                if (emp.role.toLowerCase().contains(role.toLowerCase())) {
                    roleFound = true;
                    roleCount++;
                }

            if(!roleFound) System.out.println("\nEmployee not found with the role \"" + role + "\"");
            else System.out.println("\n\"" + role + "\" role count is: " + roleCount);
        }while(!roleFound);
    }

    private static void removeEmp() {
        boolean deleted;
        do {
            deleted = false;
            System.out.print("Enter employee id to remove: ");
            int id;
            if(scan.hasNextInt()) {
                id = scan.nextInt();
                scan.nextLine();
            }
            else {
                System.out.println("Enter valid ID");
                scan.nextLine();
                continue;
            }
            Iterator<Employee> itr = employees.iterator();
            while (itr.hasNext()) {
                Employee emp = itr.next();
                if (emp.id == id) {
                    System.out.printf("%5s | %20s | %30s |    %13s\n", "ID", "Name", "Role", "Salary");
                    System.out.println("======|======================|================================|===================");
                    System.out.println(emp);
                    itr.remove();
                    deleted = true;
                    break;
                }
            }
            if(deleted) System.out.println("Employee data deleted successfully");
            else {
                System.out.println("Employee not found");
            }
            if(!deleted) System.out.println("Enter valid ID");
        }while(!deleted);
    }

    private static void updateEmp() {
        boolean idFound;
        Employee emp = null;
        do {
            idFound = false;
            System.out.print("Enter employee id to update: ");
            int id;
            if(scan.hasNextInt()) {
                id = scan.nextInt();
                scan.nextLine();
            }
            else {
                System.out.println("Enter valid input(ID)");
                scan.nextLine();
                continue;
            }
            for (Employee employee : employees) {
                if (employee.id == id) {
                    emp = employee;
                    idFound = true;
                    break;
                }
            }
            if(!idFound) System.out.println("Employee not found\nEnter valid ID");
        }while(!idFound);

        while(true) {
            System.out.println("What do you want to update");
            System.out.println("""
                    1. ID
                    2. Name
                    3. Role
                    4. Salary""");
            System.out.print("Enter your choice: ");
            if (scan.hasNextInt()) {
                int option = scan.nextInt();
                scan.nextLine();
                switch (option) {
                    case 1:
                        System.out.print("Enter new ID: ");
                        emp.id = scan.nextInt();
                        scan.nextLine();
                        System.out.println("ID successfully updated");
                        break;
                    case 2:
                        System.out.print("Enter new name: ");
                        emp.name = scan.nextLine();
                        System.out.println("Name successfully updated");
                        break;
                    case 3:
                        System.out.print("Enter new Role: ");
                        emp.role = scan.nextLine();
                        System.out.println("Role successfully updated");
                        break;
                    case 4:
                        System.out.print("Enter new Salary: ");
                        emp.salary = scan.nextDouble();
                        System.out.println("Salary successfully updated");
                        break;
                    default:
                        System.out.println("Enter valid option.");
                        continue;
                }
                System.out.printf("%5s | %20s | %30s |    %13s\n", "ID", "Name", "Role", "Salary");
                System.out.println("======|======================|================================|===================");
                System.out.println(emp);
                break;
            }
            else {
                System.out.println("Enter valid option.");
                scan.nextLine();
            }
        }
        System.out.println();
    }

    private static void caller(int option) {
        switch (option) {
            case 1:
                addEmp();
                break;
            case 2:
                searchByIdOrName();
                break;
            case 3:
                System.out.println("\nEmployee Count : " + employees.size());
                break;
            case 4:
                countByRole();
                break;
            case 5:
                removeEmp();
                break;
            case 6:
                updateEmp();
                break;
            case 7:
                System.out.printf("%5s | %20s | %30s |    %13s\n", "ID", "Name", "Role", "Salary");
                System.out.println("======|======================|================================|===================");
                for(Employee emp : employees)
                    System.out.print(emp);
                System.out.println();
                break;
            case 8:
                displayById();
                break;
            case 9:
                System.out.println("Thank you...");
                System.exit(0);
            default:
                System.out.println("Enter valid input.");
        }
    }

    private static void start() {
        create();
        do {
            options();
            System.out.print("Enter your option: ");
            int option;
            try {
                option = scan.nextInt();
                scan.nextLine();
                caller(option);
            } catch (InputMismatchException e) {
                System.out.println("Enter valid input");
                scan.nextLine();
            }
        } while (true);
    }
    public static void main(String[] args) {
        start();
    }
}
