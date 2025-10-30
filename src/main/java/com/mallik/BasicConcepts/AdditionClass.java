package main.java.com.mallik.BasicConcepts;

import java.util.Scanner;

public class AdditionClass {
 static    int a;
 static    int b;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number" +a);

        int a=scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Enter the first number" +b);
        int b=scanner.nextInt();
        int Addition=a+b;
        System.out.println("the total of given 2 numbers is " +Addition);
        int subtraction=a-b;

        if(a-b>0){
            System.out.println("the subtracted valuve is " +subtraction);

        }else{
            System.out.println("subtarctions is not possible");
        }
int multiplication=a*b;
        if(a*b>0) {
            System.out.println("the multiplied valuve is " + multiplication);
        }else{
                System.out.println("Multiplication is not possible");
            }
        }


    }




