package main.java.com.mallik.BasicConcepts;

public  class SBIBank {

     private double balance;

     public void setBalance(double balance) {
         if (balance > 0) this.balance = balance;
     }

     public double getBalance() {
         return balance;
     }
 }
 class BankClass{
    public static void main(String[] args) {
        SBIBank Bank=new SBIBank();
        Bank.setBalance(1000);
        System.out.println(Bank.getBalance());
    }

    }


