package main.java.com.mallik.BasicConcepts;

import java.util.Scanner;

public class LengthOfRectangle {
 static    int length;
     static int breadth;
    public static void main(String[]  args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length of rectangle " +length);
        int length=scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.println("enter the breadth value " +breadth);
        int breadth=scanner.nextInt();
        int AreaOfRectangle=length*breadth;
        System.out.println("the area of rectangle is " +AreaOfRectangle);
        int PerimeterOfRectangle=2*(length+breadth);
        System.out.println("perimeter of rectangle " +PerimeterOfRectangle);
scanner.close();

    }

}
