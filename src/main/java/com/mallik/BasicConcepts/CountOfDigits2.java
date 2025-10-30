package main.java.com.mallik.BasicConcepts;

public class CountOfDigits2 {


    public static void main(String[] args){
        int number =34566789;
        int count=0;
        while(number!=0) {
            number /= 10;
            count++;
        }
            System.out.println("the count od given number is " +count);

        }
    }

