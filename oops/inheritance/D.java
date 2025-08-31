package oops.inheritance;

class A {
	private static String name;
	private static int id;
	private char gender;
	private String role;
	private String address;
	private double salary;
	
	public A(String name, int id, char gender, String role, String address, double salary) {
		A.name = name;
		A.id = id;
		this.gender = gender;
		this.role = role;
		this.address = address;
		this.salary = salary;
	}

	public static void setName(String name) {
		A.name = name;
	}

	public static void setId(int id) {
		A.id = id;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static String getName() {
		return name;
	}

	public static int getId() {
		return id;
	}

	public char getGender() {
		return gender;
	}

	public String getRole() {
		return role;
	}

	public String getAddress() {
		return address;
	}

	public double getSalary() {
		return salary;
	}
	
}
class B extends A {
	B() {
		super("Employee1", 1234, 'M', "FSD", "Kallai", 150000);
	}

}
class C extends B{
	void display() {
		System.out.println("Name: " + getName());
		System.out.println("ID: " + getId());
		System.out.println("Gender: " + getGender());
		System.out.println("Role: " + getRole());
		System.out.println("Address: " + getAddress());
		System.out.println("Salary: " + getSalary());
	}
}
public class D extends C{

	public static void main(String[] args) {
		D obj = new D();
		obj.setRole("Full Stack Developer");
		obj.display();
	}

}
