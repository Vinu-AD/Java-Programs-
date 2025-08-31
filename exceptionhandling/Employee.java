package exceptionhandling;

class InvalidExperienceFoundException extends RuntimeException {
    InvalidExperienceFoundException(String msg) {
        super(msg);
    }
}
class InvalidSalaryFoundException extends RuntimeException {
    InvalidSalaryFoundException(String msg) {
        super(msg);
    }
}
class InvalidDepartmentFoundException extends RuntimeException {
    InvalidDepartmentFoundException(String msg) {
        super(msg);
    }
}
class InvalidIdFoundException extends RuntimeException {
    InvalidIdFoundException(String msg) {
        super(msg);
    }
}

public class Employee {
    public int id;
    public String name;
    public int exp;
    public double salary;
    public String department;
    public static String[] departments = {"Java", "React", "DBMS", "Python", "Dotnet", "C#", "JS"};

    public Employee() {}

    public Employee(int id, String name, int exp, double salary, String department) {
        this.id = id;
        this.name = name;
        this.exp = exp;
        this.salary = salary;
        this.department = department;

        if(id < 1)
            throw new InvalidIdFoundException("ID cannot be negative like " + id);
        if(exp < 0)
            throw new InvalidExperienceFoundException("Experience cannot be negative");
        if(salary < 30000)
            throw new InvalidSalaryFoundException("Salary should be > 30000");

        boolean deptFound = false;
        for(String dept : departments) {
            if(department.equalsIgnoreCase(dept)) {
                deptFound = true;
            }
        }
        if(!deptFound) {
            throw new InvalidDepartmentFoundException("Department " + department + " is not available in our company");
        }
    }

    public void printDetails() {
        System.out.println("Emp ID: " + this.id);
        System.out.println("Emp Name: " + this.name);
        System.out.println("Experience: " + this.exp);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: " + this.department);
        System.out.println();
    }

    public static void findEmployee(Employee[] employees, int startExp, int endExp) {
        System.out.println("Employee details of emperience between " + startExp + " to " + endExp + " are...");
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].exp >= startExp && employees[i].exp < endExp)
                employees[i].printDetails();
        }
    }

    public static void findId(Employee[] employees, int id) {

        if(id > 8 || id < 1)
            throw new InvalidIdFoundException("There is no id like " + id);

        boolean idFound = false;
        int i;
        for(i = 0; i < employees.length; i++) {
            if(employees[i].id == id) {
                idFound = true;
                break;
            }
        }
        if (idFound) {
            employees[i].printDetails();
        }
        else {
            employees[id - 1] = new Employee(id, "New User1", 4, 50000, "Java");
            System.out.println("Given id : " + id + " is not there, so I added you");
            System.out.println("Your details are...");
            employees[id - 1].printDetails();
        }
    }

    public static void printEmployee(Employee[] employees, String dept) {

        boolean deptFound = false;
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].id == 0) continue;
            if(employees[i].department.equalsIgnoreCase(dept)) {
                employees[i].printDetails();
                deptFound = true;
            }
        }
        if(!deptFound) {
            throw new InvalidDepartmentFoundException("Given department " + dept + " is invalid.");
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[8];
        employees[0] = new Employee(1, "Name1", 6, 30000, "Java");
        employees[1] = new Employee(2, "Name2", 3, 120000, "React");
        employees[2] = new Employee(3, "Name3", 5, 90000, "Dotnet");
        employees[3] = new Employee(4, "Name4", 2, 110000, "C#");
        employees[4] = new Employee();
        employees[5] = new Employee(6, "Name6", 3, 150000, "JS");
        employees[6] = new Employee(7, "Name7", 8, 250000, "Java");
        employees[7] = new Employee(8, "Name8", 4, 80000, "DBMS");

        findEmployee(employees, 4, 5); // 1
//        findId(employees, 5); // 2
//        printEmployee(employees, "C");  // 3
    }
}
