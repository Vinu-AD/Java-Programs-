package projects;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String city;
    private int age;

    public Employee(int id, String name, String department, double salary, String city, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.city = city;
        this.age = age;
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
    public String getCity() {
        return city;
    }
    public int getAge() {
        return age;
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
    public void setSalary() {
        this.salary = salary;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + id +
                ", " + name +
                ", " + department +
                ", " + salary +
                ", " + city +
                ", " + age + "]";
    }
}

public class EmployeeManagement {

    private static Scanner scan = new Scanner(System.in);

    private static ArrayList<Employee> employees = new ArrayList<>();

    private static void addEmployees() {
        employees.add(new Employee(101, "Gopi", "Frontend", 30000, "Truvannamalai", 19));
        employees.add(new Employee(102, "Hari", "Frontend", 70000, "Salem", 19));
        employees.add(new Employee(109, "Surya", "Frontend", 30000, "Truvannamalai", 28));
        employees.add(new Employee(111, "Janani", "Frontend", 60000, "Chennai", 20));
        employees.add(new Employee(113, "Sandhiya", "Frontend", 60000, "Chennai", 20));
        employees.add(new Employee(105, "Vinu", "Fullstack", 100000, "Kallai", 21));
        employees.add(new Employee(104, "Gokul", "Fullstack", 80000, "Salem", 23));
        employees.add(new Employee(110, "Sukish", "Backend", 90000, "Truvannamalai", 20));
        employees.add(new Employee(106, "Dinesh", "Backend", 100000, "Erode", 21));
        employees.add(new Employee(114, "Mukesh", "Software", 40000, "Trichi", 32));
        employees.add(new Employee(115, "Mani", "Software", 80000, "Truvannamalai", 25));
        employees.add(new Employee(112, "Sharmila", "Software", 50000, "Chennai", 28));
        employees.add(new Employee(103, "Vijay", "HR", 60000, "Kanchipuram", 25));
        employees.add(new Employee(107, "Rahul", "HR", 50000, "Trichi", 28));
        employees.add(new Employee(108, "Marwan", "HR", 40000, "Erode", 27));
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("1. High-pay employee/dept");
        System.out.println("2. Average salary of employees/city");
        System.out.println("3. Employee by dept and city");
        System.out.println("4. Youngest employee");
        System.out.println("5. Employee who earns >= 60000k");
        System.out.println("6. All employees are > 25yrs old");
        System.out.println("7. Employees name list(ASC)");
        System.out.println("8. Employee salary > 70000k and <= 70000;");
        System.out.println("9. Top 3 high-pay employee");
        System.out.println("10. Average age of employees/department");
        System.out.println("11. Exit");
        System.out.print("Enter: ");
    }

    private static void highPayEmpByDept() {
        HashMap<String, Double> highPay = new HashMap<>();
        for (Employee emp : employees) {
            String dept = emp.getDepartment();
            Double newSal = emp.getSalary();
            if(highPay.containsKey(dept)) {
                Double oldSal = highPay.get(dept);
                if(newSal > oldSal)
                    highPay.put(dept, newSal);
            }
            else
                highPay.put(dept, newSal);
        }
        System.out.printf("\n%-15s -> Salary\n", "Department");
        System.out.println("-----------        ---------");
        for (String dept : highPay.keySet())
            System.out.printf("%-15s -> %.2f\n", dept, highPay.get(dept));
    }

    private static void avgSalByCity() {
        HashMap<String, Integer> cityCount = new HashMap<>();
        HashMap<String, Double> sumOfSal = new HashMap<>();
        for (Employee emp : employees) {
            cityCount.put(emp.getCity(), cityCount.getOrDefault(emp.getCity(), 0) + 1);
        }
        for (Employee emp : employees) {
            String city = emp.getCity();
            Double oldSal = sumOfSal.getOrDefault(city, 0.0);
            Double newSal = emp.getSalary();
            sumOfSal.put(city, oldSal + newSal);
        }

        System.out.printf("\n%-15s -> Average Salary\n", "City Name");
        System.out.println("-----------        --------------");
        for (String city : sumOfSal.keySet())
            System.out.printf("%-15s -> %.2f\n", city, sumOfSal.get(city)/cityCount.get(city));
    }

    private static void groupEmpByDeptThenCity() {
        HashMap<String, ArrayList<Employee>> empByDept = new HashMap<>(); // String - dept

        for (Employee emp : employees) {
            String dept = emp.getDepartment();
            ArrayList<Employee> employees = empByDept.getOrDefault(dept, new ArrayList<>());
            employees.add(emp);
            empByDept.put(dept, employees);
        }

        for (String dept : empByDept.keySet()) {
            ArrayList<Employee> employees = empByDept.get(dept);
            HashMap<String, HashSet<String>> namesByCity = new HashMap<>(); // String -> city, set -> names

            for (Employee emp : employees) {
                String city = emp.getCity();
                HashSet<String> names = namesByCity.getOrDefault(city, new HashSet<>());
                names.add(emp.getName());
                namesByCity.put(city, names);
            }

            System.out.println("\nDepartment: " + dept);
            for (String city : namesByCity.keySet()) {
                System.out.printf("\t%-13s => %s\n", city, namesByCity.get(city));
            }
        }
    }

    private static void youngestEmp() {
        int youngAge = employees.getFirst().getAge();
        for (Employee emp : employees) {
            if (emp.getAge() < youngAge)
                youngAge = emp.getAge();
        }
        System.out.println("\nYoungest Employees are... ");
        for (Employee emp : employees)
            if (emp.getAge() == youngAge)
                System.out.println(emp);
    }

    private static void highSalaryEmp() {

        ArrayList<Employee> highSalEmp = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getSalary() >= 60000)
                highSalEmp.add(emp);
        }
        highSalEmp.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(Double.compare(o2.getSalary(), o1.getSalary()) == 0)
                    return Integer.compare(o1.getId(), o2.getId());
                else
                    return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });
        System.out.println("\nEmployees list who earns >= 60000");
        for (Employee emp : highSalEmp)
            System.out.println(emp);
    }

    private static void checkAgeGreater() {
        for (Employee emp : employees)
            if (emp.getAge() <= 25) {
                System.out.println("%nFalse -> employee found <= 25");
                return;
            }
        System.out.println("%nTrue -> All are > 25");
    }

    private static void listAllNameByAsc() {
        ArrayList<String> names = new ArrayList<>();
        for (Employee emp : employees)
            names.add(emp.getName());

        Collections.sort(names);
        System.out.println("\nEmployee names are... ");
        for (String name : names)
            System.out.print(name + ", ");
        System.out.println();
    }

    private static void empPartition() {
        ArrayList<Employee> group1 = new ArrayList<>();
        ArrayList<Employee> group2 = new ArrayList<>();
        for (Employee emp : employees)
            if(emp.getSalary() > 70000)
                group1.add(emp);
            else
                group2.add(emp);

        System.out.println("\nGroup 1 (Sal>70k) Employees are... ");
        for (Employee emp : group1)
            System.out.println(emp);

        System.out.println("\nGroup 2 (Sal<=70k) Employees are... ");
        for (Employee emp : group2)
            System.out.println(emp);
        System.out.println();
    }

    private static void topThreeEmp() {

        ArrayList<Employee> highSalEmp = new ArrayList<>(employees);

        highSalEmp.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(Double.compare(o2.getSalary(), o1.getSalary()) == 0)
                    return Integer.compare(o1.getId(), o2.getId());
                else
                    return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });

        System.out.println("\nTop 3 High-Pay Employees are...");
        for (int i = 0; i < 3 && i < highSalEmp.size(); i++)
            System.out.println(highSalEmp.get(i));
    }

    private static void avgAgeByDept() {
        HashMap<String, Integer> deptCount = new HashMap<>();
        HashMap<String, Integer> sumOfAge = new HashMap<>();
        for (Employee emp : employees) {
            deptCount.put(emp.getDepartment(), deptCount.getOrDefault(emp.getDepartment(), 0) + 1);
        }
        for (Employee emp : employees) {
            String dept = emp.getDepartment();
            int oldAge = sumOfAge.getOrDefault(dept, 0);
            int newAge = emp.getAge();
            sumOfAge.put(dept, oldAge + newAge);
        }

        System.out.printf("\n%-15s -> Average Age\n", "Department Name");
        System.out.println("---------------    -----------");
        for (String dept : sumOfAge.keySet())
            System.out.printf("%-15s -> %d\n", dept, sumOfAge.get(dept)/deptCount.get(dept));
    }

    private static void run() {

        while(true) {
            showMenu();
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    highPayEmpByDept();
                    break;
                case 2:
                    avgSalByCity();
                    break;
                case 3:
                    groupEmpByDeptThenCity();
                    break;
                case 4:
                    youngestEmp();
                    break;
                case 5:
                    highSalaryEmp();
                    break;
                case 6:
                    checkAgeGreater();
                    break;
                case 7:
                    listAllNameByAsc();
                    break;
                case 8:
                    empPartition();
                    break;
                case 9:
                    topThreeEmp();
                    break;
                case 10:
                    avgAgeByDept();
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    public static void main(String[] args) {
        addEmployees();
        run();
    }
}
