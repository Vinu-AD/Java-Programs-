package oops.inheritance;

import java.util.Scanner;

class Student {
	
	String name;
	int rollNumber;
	int tamilMark;
	int englishMark;
	int mathsMark;
	int science;
	int socialScience;
	
	public Student(String name, int rolNo, int t, int e, int m, int s, int ss) {
		this.name = name;
		rollNumber = rolNo;
		tamilMark = t;
		englishMark = e;
		mathsMark = m;
		science = s;
		socialScience = ss;
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public int getTamilMark() {
		return tamilMark;
	}

	public int getEnglishMark() {
		return englishMark;
	}

	public int getMathsMark() {
		return mathsMark;
	}

	public int getScience() {
		return science;
	}

	public int getSocialScience() {
		return socialScience;
	}

	
}

class Logic extends Student {
	
	public Logic(String name, int rolNo, int t, int e, int m, int s, int ss) {
		super(name, rolNo, t, e, m, s, ss);
	}
	
	boolean checkFail() {
		return getTamilMark() < 35 || getEnglishMark() < 35 || getMathsMark() < 35 ||
			   getScience() < 35 || getSocialScience() < 35;
	}
	
	public int totalMarks() {
		return getTamilMark() + getEnglishMark() + getMathsMark() + getScience() + getSocialScience();
	}
	
	public char checkGrade(int mark) {
		if(mark >= 450) return 'A';
		else if(mark >= 350) return 'B';
		else if(mark >= 250) return 'C';
		else return 'D';
	}
	
}

public class School {
	
	static void choices(int choice) {
		System.out.println("What do you want to check for the student - " + choice);
		System.out.println("Enter 1 to check PASS/FAIL");
		System.out.println("Enter 2 to check GRADE");
		System.out.println("Enter 3 to check BOTH");
		System.out.println("Enter 4 to stop");
		System.out.print("Enter your choice: ");
	}
	
	static void response(int choice, Logic obj) {
		char grade;
		switch (choice) {
		case 1: 
			System.out.println("\nResult: " + (obj.checkFail() ? "Fail" : "Pass") + "\n");
			break;
		case 2: 
			grade = obj.checkFail() ? 'F' : ' ';
			System.out.println("\nGrade: " + (grade == 'F' ? 'F' : obj.checkGrade(obj.totalMarks())) + "\n");
			break;
		case 3: 
			grade = obj.checkFail() ? 'F' : ' ';
			System.out.println("\nTotal Marks: " + obj.totalMarks());
			System.out.println("Grade: " + (grade == 'F' ? 'F' : obj.checkGrade(obj.totalMarks())) + "\n");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice + "\n");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Logic[] student = new Logic[5];
		student[0] = new Logic("Adam", 219, 90, 95, 93, 95, 90);
		student[1] = new Logic("Brinda", 105, 40, 65, 43, 55, 45);
		student[2] = new Logic("Celina", 107, 80, 70, 83, 75, 80);
		student[3] = new Logic("Danil", 200, 35, 35, 43, 34, 45);
		student[4] = new Logic("Erica", 150, 45, 55, 43, 55, 65);
		
		
		int order = 0;
		while(order <= student.length) {
			
			if(order == student.length) {
				System.out.println("Reached end of the list...");
				break;
			}
			choices(order+1);
			int choice = scan.nextInt();
			if(choice == 4) {
				System.out.println("\nExited...");
				break;
			}
			
			response(choice, student[order]);
			
			order++;
		}

	}

}
