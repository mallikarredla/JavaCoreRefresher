package main.java.com.mallik.BasicConcepts;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){



    Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number ");
        int num=scanner.nextInt();
        if(num>0){
            System.out.println("the given number " +num+ "is positive");
        }
      else   if(num<0){
            System.out.println("the given number " +num+ "is negative");


        }else{

                System.out.println("the given number is zero");

            }


        }



    }

