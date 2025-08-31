package projects;

class Account {

    private static int order = 0;

    private int accNumber;
    private String accHolderName;
    private double balance;

    public void setAccNumber(int num) {
        accNumber = num;
    }
    public int getAccNumber() {
        return accNumber;
    }

    public void setAccHolderName(String name) {
        accHolderName = name;
    }
    public String getAccHolderName() {
        return accHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    // constructors
    Account() {
        this(100000);
        order++;
    }

    Account(int acNo) {
        this(acNo, "user" + order);
        accNumber = acNo;
    }

    Account(int acNo, String name) {
        this(acNo, name, 1);
        accNumber = acNo;
        accHolderName = name;
    }

    Account(int acNo, String name, double balance) {
        accNumber = acNo;
        accHolderName = name;
        this.balance = balance;
    }

    // methods
    public void deposit(double amount) {
        System.out.println("====== Deposit ======");
        display();
        if(amount < 0) {
            System.out.println("Can't deposit in negative " + amount);
        }
        else  {
            System.out.println("Current balance: " + balance);
            System.out.println("Deposit amount: " + amount);
            balance = balance + amount;
            System.out.println("New balance: " + balance);
        }
        System.out.println();
    }

    public void withdraw(double amount) {
        System.out.println("====== Withdraw ======");
        display();
        System.out.println("Current balance: " + balance);
        System.out.println("Withdrawal amount: " + amount);

        if(balance >= amount) {
            balance = balance - amount;
            System.out.println("New balance: " + balance);
        }
        else System.out.println("Insufficient balance");
        System.out.println();
    }

    public void checkBalance() {
        System.out.println("====== Balance Checking =====");
        System.out.println("AC number: " + getAccNumber());
        System.out.println("Name: " + getAccHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println();
    }

    public void display() {
        System.out.println("AC number: " + getAccNumber());
        System.out.println("Name: " + getAccHolderName());
        System.out.println();
    }
}

public class Bank {

    public static void main(String[] args) {

        Account u1 = new Account(484822, "Account Holder 1", 10000);
        u1.checkBalance();
        u1.deposit(1000);
        u1.withdraw(5000);
        u1.withdraw(10000);

    }
}