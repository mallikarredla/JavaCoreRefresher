package main.java.com.mallik.BasicConcepts;

import java.util.Scanner;

public class SwapNumbersUsingMethod {
    static int m;
    static int n;
    public static void swapnumbers(int m, int n){
        System.out.println("Before Swapping  " +m+  n);
        int temp;
        temp=m;
        m=n;
        n= temp;
        System.out.println("AFter Swapping " +m+ n);


    }
    public static void main(String[] args){
        SwapNumbersUsingMethod m1=new SwapNumbersUsingMethod();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number "+m);
        int m=scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.println("Enter the second number "+n);
        int n=scanner.nextInt();
swapnumbers(m,n);
scanner.close();
    }

}
