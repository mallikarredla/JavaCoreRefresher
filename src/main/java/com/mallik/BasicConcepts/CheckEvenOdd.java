package main.java.com.mallik.BasicConcepts;

import java.util.Scanner;

public class CheckEvenOdd {
    static int m;

    public static void EvenOdd(){
        if(m%2==0) {
            System.out.println("the given number is Even");
        }else{
            System.out.println("the given number is Odd");
        }


        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number ");
             m=scanner.nextInt();
            EvenOdd();
    }
}
