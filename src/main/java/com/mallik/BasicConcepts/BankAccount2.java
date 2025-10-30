package main.java.com.mallik.BasicConcepts;

public class BankAccount2 {
    int accountNumber;
    String accountHolder;
    double balance;
//constructor to initialize the obj
    //invoking the object
public BankAccount2(int accountNumber, String accountHolder, double balance){
    this.accountHolder=accountHolder;
    this. accountNumber=accountNumber;
    this.balance=balance;

}
public double getBalance(){
    return balance;

}
public void deposit(double amount) {
    if (amount < 0) {
        System.out.println("deposite amount must be positive");

    } else {
        balance += amount;
        System.out.println("Deposited $" + amount + "new Amount" + balance);

    }

}
    // Withdraw money from account
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Current Balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", Remaining Balance: $" + balance);
        }
    }
    public static void main(String[] args){
    BankAccount2 myAccount=new BankAccount2(12345,"mallikarjuna",6000);
    myAccount.deposit(1000);
    myAccount.withdraw(200);
    myAccount.withdraw(10000);
    System.out.println("finalBalance" +myAccount.balance);

    }

}
