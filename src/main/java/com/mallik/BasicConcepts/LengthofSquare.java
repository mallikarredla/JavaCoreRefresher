package main.java.com.mallik.BasicConcepts;

import java.util.Scanner;

public class LengthofSquare {
    static int side1;
  static   int side2;

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the first side " +side1);
        int side1=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("enter the second side" +side2);
        int side2=scanner1.nextInt();
        System.out.println("total length of the square " +side1*side2);
    }
}
