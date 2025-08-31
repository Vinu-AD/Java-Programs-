package oops.polymorphism;


// Aggregation (loosely coupled)

class Student {
	int rollNumber;
	String name;
	int age;

	void init(int rollNumber, String name, int age) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Student Details...\n------------------");
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	
}

class StudentDetails {
	String location;
	Student student ;
	
	void setValue(String location, Student student) {
		this.location = location;
		this.student = student;
		student.init(101, "Java", 22);
	}
	
	void display() {
		student.display();
		System.out.println("Location: " + location);
	}
}
public class Overload {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.studentData(101, "Java", 22);
		
//		StudentDetails s = new StudentDetails();
//		s.setValue("Chennai", new Student());
//		s.display();
		
		
		main(); 
	}
	
	public static void main() {
		int a = -10;
		System.out.print(~a);
	}

}
