package oops.abstraction.abstractclass;

abstract class Account {
    double balance;
    public abstract double balance();
    public abstract String displayAccountType();
    public abstract double applyInterest(double rate, double years);
    public abstract double calculateInterest(double years);
}

class SavingsAccount extends Account {
    double rate = 4;
    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return balance;
    }

    public String displayAccountType() {
        return "Savings Account";
    }

    @Override
    public double applyInterest(double rate, double years) {
        return (balance * years * rate ) / 100;
    }

    @Override
    public double calculateInterest(double years) {
        return (balance * years * rate ) / 100;
    }
}

class CurrentAccount extends Account {
    double rate = 0;
    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return balance;
    }

    public String displayAccountType() {
        return "Current Account";
    }

    @Override
    public double applyInterest(double rate, double years) {
        return (balance * years * rate ) / 100;
    }

    @Override
    public double calculateInterest(double years) {
        return rate;
    }
}

class FixedDepositAccount extends Account {
    double rate = 6.5;
    public FixedDepositAccount(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return balance;
    }

    public String displayAccountType() {
        return "Fixed Deposit Account";
    }

    @Override
    public double applyInterest(double rate, double years) {
        return (balance * years * rate ) / 100;
    }

    @Override
    public double calculateInterest(double years) {
        return (balance * years * rate ) / 100;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account savAcc = new SavingsAccount(10000);
        System.out.println("Balance: " + savAcc.balance());
        System.out.println("Account Type: " + savAcc.displayAccountType());
        System.out.println("Give rate Interest: " + savAcc.applyInterest(10, 2));
        System.out.println("Interest: " + savAcc.calculateInterest(2));
        System.out.println();

        Account curAcc = new CurrentAccount(20000);
        System.out.println("Balance: " + curAcc.balance());
        System.out.println("Account Type: " + curAcc.displayAccountType());
        System.out.println("Give rate Interest: " + curAcc.applyInterest(10, 2));
        System.out.println("Interest: " + curAcc.calculateInterest(2));
        System.out.println();

        Account fixDepAcc = new FixedDepositAccount(30000);
        System.out.println("Balance: " + fixDepAcc.balance());
        System.out.println("Account Type: " + fixDepAcc.displayAccountType());
        System.out.println("Give rate Interest: " + fixDepAcc.applyInterest(10, 2));
        System.out.println("Interest: " + fixDepAcc.calculateInterest(2));

    }
}
