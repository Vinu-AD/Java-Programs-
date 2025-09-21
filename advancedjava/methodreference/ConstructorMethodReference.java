package advancedjava.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Student {

    int id;
    String fName;
    String lName;

    Student() {}

    Student(int id) {
        this.id = id;
    }

    Student(String fName) {
        this.fName = fName;
    }

    Student(int id, String fName) {
        this.id = id;
        this.fName = fName;
    }

    Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", FName='" + fName + '\'' +
                ", LName='" + lName;
    }
}
public class ConstructorMethodReference {

    public static void main(String[] args) {
        BiFunction<Integer, String, Student> obj = (id, fName) -> new Student(id, fName);
        System.out.println(obj.apply(1001, "Vinu"));

        Supplier<Student> id = Student::new;
        System.out.println(id.get());

        Function<Integer, Student> ob1 = Student::new;
        System.out.println(ob1.apply(101));

        Function<String, Student> ob2 = Student::new;
        System.out.println(ob2.apply("Vinu"));

        BiFunction<Integer, String, Student> ob3 = Student::new;
        System.out.println(ob3.apply(103, "Kutty"));

        BiFunction<String, String, Student> ob4 = Student::new;
        System.out.println(ob4.apply("Vinu", "Kutty"));

    }
}
