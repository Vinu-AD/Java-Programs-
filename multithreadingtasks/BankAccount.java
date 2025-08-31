package multithreadingtasks;

class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends RuntimeException {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class Account {
    double balance;
    public synchronized void withdraw(String name, double amount) {
        if(amount <= balance && amount > 500) {
            System.out.println("Welcome " + name);
            System.out.println("Current balance: " + balance);
            System.out.println("Withdraw: " + amount);
            balance -= amount;
            System.out.println("New balance: " + balance);
            System.out.println("--------------------------------");
        }
        else {
            throw new InsufficientBalanceException("Provide < " + balance + " but given: " + amount);
        }
    }
    public synchronized void deposit(String name, double amount) {
        if(amount > 0) {
            System.out.println("Welcome " + name);
            System.out.println("Current balance: " + balance);
            System.out.println("Deposit: " + amount);
            balance += amount;
            System.out.println("New balance: " + balance);
            System.out.println("--------------------------------");
        }
        else {
            throw new InvalidAmountException("Provide > 0");
        }
    }

}

class GPay extends Thread {
    Account account;
    double amount;
    String name;

    public GPay(Account account, String name, double amount) {
        super(name);
        this.account = account;
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void run() {
        account.deposit(name, amount);
    }
}

class Paytm extends Thread {
    Account account;
    double amount;
    String name;

    public Paytm(Account account, String name, double amount) {
        super(name);
        this.account = account;
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void run() {
        account.withdraw(name, amount);
    }
}

public class BankAccount {  // task 3

    public static void main(String[] args) {

        Account account = new Account();

        GPay user1 = new GPay(account, "Adam", 5000);
        Paytm user2 = new Paytm(account, "Bob", 2000);
        GPay user3 = new GPay(account, "Charlie", 2000);
        Paytm user4 = new Paytm(account, "Dany", 3000);
        GPay user5 = new GPay(account, "Eric", 5000);
        Paytm user6 = new Paytm(account, "Faruk", 5000);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();

    }
}