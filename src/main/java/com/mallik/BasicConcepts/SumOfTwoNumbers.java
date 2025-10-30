package main.java.com.mallik.BasicConcepts;

import com.sun.jdi.Value;

import java.util.Scanner;

public   class SumOfTwoNumbers {
    public static void main(String[] args){
         int a;
         int b;
         int c;


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number");
        a = scanner.nextInt();
        System.out.println("enter the second number");
        b = scanner.nextInt();
        c = a + b;
        System.out.println("the sum is " + c);


    }

}
