package exceptionhandling;

import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class MissingRequiredFields extends RuntimeException {
    MissingRequiredFields(String msg) {
        super(msg);
    }
}
class InvalidEmailFormatException extends RuntimeException {
    InvalidEmailFormatException(String msg) {
        super(msg);
    }
}
class UserAlreadyExistsException extends RuntimeException {
    UserAlreadyExistsException(String msg) {
        super(msg);
    }
}
class InvalidAgeFoundException extends RuntimeException {
    InvalidAgeFoundException(String msg) {
        super(msg);
    }
}
class Account {
    double balance = 0;
    public void deposit(double balance) {
        this.balance += balance;
    }
    public void withdraw(double balance) {
        if(this.balance < balance) {
            throw new InsufficientBalanceException("deposit money before withdraw");
        }
        else
            this.balance -= balance;
    }
}

class FormSubmission {
    String userName;
    String password;
    char gender;
    int age;
    double totalMarks;

    FormSubmission() {}
    public FormSubmission(String userName, String password, char gender, int age, double totalMarks) {
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.totalMarks = totalMarks;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void submit() {
        if(this.userName == null)
            throw new MissingRequiredFields("UserName is required");
        else if(this.password == null)
            throw new MissingRequiredFields("Password is required");
        else if(this.gender == '\u0000')
            throw new MissingRequiredFields("Gender is required");
        else if(this.age == 0)
            throw new MissingRequiredFields("Age is required");
        else if(this.totalMarks == 0)
            throw new MissingRequiredFields("Total Marks is required");

        System.out.println("Submitted Successfully");
        System.out.println("User Name: " + this.userName);
        System.out.println("Password: " + this.password);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age);
        System.out.println("Total Marks: " + this.totalMarks);
    }

}

public class CustomHandling {

    private static void atmWithdrawal() {
        Account ac = new Account();
        ac.deposit(1000);
        ac.withdraw(2000);
    }

    private static void formSubmission() {
        FormSubmission form = new FormSubmission();
        form.setUserName("Vinu");
        form.setPassword("1234");
        form.setGender('M');
//        form.setAge(22);
        form.setTotalMarks(489);
        form.submit();
    }

    private static void invalidEmail() {
        System.out.print("Enter your mail ID: ");
        String mail = new Scanner(System.in).nextLine();

        if(!mail.contains("@")) {
            throw new InvalidEmailFormatException("Mail ID should contains @ symbols");
            }
        else if(!mail.contains("gmail.com"))
            throw new InvalidEmailFormatException("Mail ID should contains gmail.com");
        else if(mail.matches(".*^[0-9].*"))
            throw new InvalidEmailFormatException("Mail ID should not starts with digits");
//        else if(!mail.matches(".*[a-z].*"))
//            throw new InvalidEmailFormatException("Mail ID should contains lowercase letters");
        else if(!mail.matches(".*^[^A-Z].*"))
            throw new InvalidEmailFormatException("Mail ID should not starts with uppercase letters");
        else if(mail.matches(".*[^A-Z].*"))
            throw new InvalidEmailFormatException("Mail ID should not contains uppercase letters");
        else
            System.out.println("Your email ID is in correct format");
    }

    public static void userExistCheck() {
        String[] users = {"Java", "JSP", "Servlet", "Spring boot", "React", "MySQL", "JavaScript", "HTML", "CSS"};

        String user = "Java";
//        String user = "DSA";

        boolean found = false;
        for(String s : users) {
            if(s.equalsIgnoreCase(user)) {
                found = true;
            }
        }
        if(found)
            throw new UserAlreadyExistsException("\"" + user + "\" already exist in the users list");
        else
            System.out.println("You are successfully added to the users list");
    }

    public static void invalidAge() {
//        int age = 22;
        int age = 17;
        if(age >= 18 && age <= 100) {
            System.out.println("Age " + age + " is valid");
        }
        else
            throw new InvalidAgeFoundException("age " + age + " is not valid");
    }

    public static void main(String[] args) {
        atmWithdrawal();  // task 1
//        formSubmission();  // task 2
//        invalidEmail();  // task 3
//        userExistCheck();  // task 4
//        invalidAge();  // task 5
    }
}
