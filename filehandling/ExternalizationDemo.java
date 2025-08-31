package filehandling;

import java.io.*;

class CollegeStudent implements Externalizable {
    @Serial
    private static final long serialVersionUID = 1L;

    int stdId;
    String name;
    String dept;

    public CollegeStudent() {}

    public CollegeStudent(int stdId, String name, String dept) {
        this.stdId = stdId;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(stdId);
//        out.writeUTF(name);
        out.writeUTF(dept);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        stdId = in.readInt();
//        name =  in.readUTF();
        dept = in.readUTF();
    }

    public void display() {
        System.out.println("ID: " + this.stdId);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.dept);
        System.out.println();
    }
}

public class ExternalizationDemo {

    private static void externalization() {

        CollegeStudent s1 = new CollegeStudent(101, "Name1", "CSE");
        CollegeStudent s2 = new CollegeStudent(102, "Name2", "IT");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\ExternalizationObjects.txt")));

            oos.writeObject(s1);
            oos.writeObject(s2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deSerialization() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\ExternalizationObjects.txt"))))
            {
            try {
                while (true) {

                    Object ob = ois.readObject();

                    if (ob instanceof CollegeStudent s)
                        s.display();
                }
            } catch (EOFException | ClassNotFoundException e) { System.out.println("Reached end of the file"); }

        } catch (IOException e) { throw new RuntimeException(e); }
    }

    public static void main(String[] args) {
        externalization();
        deSerialization();
    }
}
