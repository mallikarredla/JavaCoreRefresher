package main.java.com.mallik.BasicConcepts;

import java.util.Collection;
import java.util.Scanner;

public class SwapNumbers {

   static   int m;
   static int n;
   static int swap;
   public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the first number " +m);
       int m =scanner.nextInt();
       scanner = new Scanner(System.in);
       System.out.println("Enter the second number " +n);
       int n=scanner.nextInt();
       System.out.println("\n Before swapping");
       System.out.println("m " +m+ " n " +n);


       int temp;
       temp=m;
       m=n;
       n=temp;

       System.out.println("After Swapping " );
       System.out.println("m " +m+ " n " +n);
   }

  }