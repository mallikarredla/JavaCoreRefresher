package main.java.com.mallik.BasicConcepts;

public class BankAccount {
    private double balance;


    public void deposit(double amount) {
        if (amount > 0) balance += amount;

    }

    public void withdrawl(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;

    }
    public double getBalance() {
        return balance;

    }


    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(2000);
        acc.withdrawl(1500);
        System.out.println("final Blanace"+acc.getBalance());

    }



}
