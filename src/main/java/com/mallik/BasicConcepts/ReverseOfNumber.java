package main.java.com.mallik.BasicConcepts;

public class ReverseOfNumber {

    public static void main(String[] args) {



        int n =12345;
        int reversed=0;
        int digit=0;
        while(n>0){
            digit=n%10;
            reversed=reversed*10+digit;
            n/=10;

        }
        System.out.println("The reversed number is " +reversed);
    }





}
