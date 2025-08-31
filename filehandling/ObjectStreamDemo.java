package filehandling;

import java.io.*;

class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;
    int id;
    String name;
    int experience;
    transient double salary;  // salary will not be encrypted
    transient String role;    // role will not be stored in file

    public Employee(int id, String name, int experience, double salary, String role) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
        this.role = role;
    }

    public void display() {
        System.out.println("Emp ID: " + this.id);
        System.out.println("Emp Name: " + this.name);
        System.out.println("Experience: " + this.experience);
        System.out.println("Salary: " + this.salary);
        System.out.println("Role: " + this.role);
        System.out.println();
    }
}

class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 5L;

    int rollNo;
    String name;
    String department;

    public Student(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("Student rollNum: " + this.rollNo);
        System.out.println("Student Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println();
    }
}

class CustomAppendObjectOutputStream extends ObjectOutputStream {
    CustomAppendObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException {}
}

public class ObjectStreamDemo { //}  implements Serializable{

    private static void serialization() {

        Employee e1 = new Employee(101, "Employee1", 3, 100000, "Java");
//        Employee e2 = new Employee(102, "Employee2", 4, 80000, "React");

        Student s1 = new Student(1001, "Student1", "CSE");
//        Student s2 = new Student(1002, "Student2", "IT");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\SerializationObjects.txt")));

            oos.writeObject(e1);
//            oos.writeObject(e2);
//            oos.writeObject(s1);
//            oos.writeObject(s2);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
//            File file = new File("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\SerializationObjects.txt");
//            FileOutputStream fos = new FileOutputStream(file, true);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

            CustomAppendObjectOutputStream oos = new CustomAppendObjectOutputStream(new FileOutputStream(new File("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\SerializationObjects.txt"), true));

//            oos.writeObject(e1);
//            oos.writeObject(e2);
            oos.writeObject(s1);
//            oos.writeObject(s2);

            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deSerialization() {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\SerializationObjects.txt")));

            Employee e1 = (Employee) ois.readObject();
            e1.display();
            Employee e2 = (Employee) ois.readObject();
            e2.display();
            Student s1 = (Student) ois.readObject();
            s1.display();
            Student s2 = (Student) ois.readObject();
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deSerializationAuto() {

            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\SerializationObjects.txt")));

                try {

                    try {
                        while (true) {

                            Object ob = ois.readObject();

                            if (ob instanceof Employee ) {
                                Employee e1 = (Employee) ob;
                                e1.display();
                            }
                            if (ob instanceof Student s)
                                s.display();
                        }
                    }
                    catch(EOFException e){ System.out.println("Reached the end of file"); }
                } catch (IOException | ClassNotFoundException e) {throw new RuntimeException(e); }
            } catch (IOException e) { throw new RuntimeException(e); }
    }

    public static void main(String[] args) {

        serialization();
//        externalization();
//        deSerialization();
        deSerializationAuto();
    }
}
