package string;

import exceptionhandling.Employee;

import java.util.Date;

public class StringPlaceholder {
    public static void main(String[] args) {

        String name = "Vinu";
        String s = String.format("Hi %s,%ngo green before green goes%nThe quick brown fox jumps over the lazy dog", name);
        System.out.printf("%,f %n", 4853464.79);
        System.out.printf("%,d %n", 48534647865659L);
        System.out.printf("%.2f %n", 48.284279);
        System.out.printf("%2$.2f %n", 48.284279, 224.3242);
        System.out.printf("%#x %n", 43242);
        System.out.printf("%h %n", 43242);
        System.out.printf("%a %n", 43.242);
        System.out.printf("%A %n", 43.242);
        System.out.printf("%#o %n", 43);
        System.out.println();

        System.out.printf("|%5d| %n", 10); // right align
        System.out.printf("|%-5d| %n", 10); // left align
        System.out.printf("|%+5d| %n", +10); // print sign for positive and negative numbers
        System.out.printf("|%+5d| %n", -10); // print sign for positive and negative numbers (default)

        System.out.println();
        System.out.printf("%%%% %n");
        System.out.printf("%%n \n");
        System.out.printf("%d %n", 5, 5);
//        System.out.printf("%d %d %d %n", 5, 5); // MissingFormatArgumentException
        System.out.printf("%d %n",(byte)130);
        System.out.printf("%d %n",(short)32768);
        System.out.printf("%d %n",2147483647); // by default int type
        System.out.printf("%d %n", 527052075204L); // for long also %d
        System.out.printf("%f %n", 5.5f);
        System.out.printf("%f %n", 5425.555); // for double also %f only
        System.out.printf("%g %n", 404.489); // %g also used for floating point values
        System.out.printf("%a %n", 404.489); // %a also used for floating point values
        System.out.printf("%A %n", 404.489); // %a also used for floating point values
        System.out.printf("%o %n", 8); // %a also used for floating point values
        System.out.printf("%x %n", 0x8942442); // %a also used for floating point hexadecimal values
        System.out.printf("%c %n", 'V');
        System.out.printf("%b %n", true, false);
        System.out.printf("%s %n", "Hello");
        System.out.printf("%s %n", new Object()); // reference


        /*Employee[] emp = new Employee[5];
        Employee ob = new Employee();
        emp[0] = new Employee(101, "Vinu", 1, 100000, "Java");
        emp[1] = new Employee(102, "Gokul", 2, 110000, "C#");
        emp[2] = new Employee(103, "Vijay", 3, 120000, "Dotnet");
        emp[3] = new Employee(104, "Mukesh", 5, 150000, "React");
        emp[4] = new Employee(105, "Unknow", 7, 250000, "Java");

        for (Employee employee : emp) {
            System.out.printf("%-5d %-10s %-3d %-12.2f %-10s %n", employee.id, employee.name, employee.exp, employee.salary, employee.department);
        }*/
    }
}
