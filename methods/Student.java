package methods;

public class Student {
	
	int id;
	String name;
	int age;
	int std;
	
	Student() {
		this(100);
		System.out.println("No parameter constructor");
	}
	
	Student(int id) {
		this(id, "Name1");
		System.out.println("One parameter constructor");
		this.id = id;
	}
	
	Student(String name) {
		this(100, name);
		System.out.println("One parameter constructor");
		this.name = name;
	}
	
	Student(int id, String name) {
		this(id, name, 15);
		System.out.println("Two parameter constructor");
		this.name = name;
		this.id = id;
	}

	Student(int id, String name, int age) {
		this(id, name, age, 12);
		System.out.println("Three parameter constructor");
	}
	
	Student(int id, String name, int age, int std) {
		System.out.println("Four parameter constructor");
		this.id = id;
		this.name = name;
		this.age = age;
		this.std = std;
	}
	
	void display() {
		System.out.println("\nStudent details: ");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Standard: " + std);
		
		System.out.println(Stud.name);
	}

	public static void main(String[] args) {
		stud();
	}
	
	static void stud() {
		Student s = new Student("Vinu");
		s.display();
	}
	
	private class Stud {
		
		static String name = "VINU";
		private Stud() {
			System.out.println("Stud");
		}
		public static void main(String[] args) {
			System.out.println(new Student().name);
		}
	}

}
