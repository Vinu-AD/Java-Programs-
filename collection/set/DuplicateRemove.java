package collection.set;

import java.util.HashSet;
import java.util.Objects;

class Emp {
    int id;
    String name;
    String role;
    Double salary;
    int experience;

    public Emp() {}

    public Emp(int id, String name, String role, Double salary, int experience) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Id=" + id +
                "Name='" + name +
                "Role='" + role +
                "Salary=" + salary +
                "Experience=" + experience + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return emp.id == id &&
                Objects.equals(emp.name, name) &&
                Objects.equals(emp.role, role) &&
                Objects.equals(emp.salary, salary) &&
                emp.experience == experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, salary, experience);
    }
}

public class DuplicateRemove {
    public static void main(String[] args) {
        HashSet<Emp> employees = new HashSet<>();
        employees.add(new Emp(101, "Name1", "SD1", 10000.0, 2));
        employees.add(new Emp(102, "Name2", "SD2", 20000.0, 3));
        employees.add(new Emp(103, "Name3", "SD3", 30000.0, 4));
        employees.add(new Emp(104, "Name4", "FD", 40000.0, 2));
        employees.add(new Emp(105, "Name5", "BD", 50000.0, 3));
        employees.add(new Emp(104, "Name4", "FD", 40000.0, 2));
        employees.add(new Emp(105, "Name5", "BD", 50000.0, 3));

        System.out.println("Employee Details");
        for (Emp employee : employees) {
            System.out.print(employee);
        }
    }
}
