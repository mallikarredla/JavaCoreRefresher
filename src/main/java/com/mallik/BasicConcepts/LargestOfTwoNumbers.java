package main.java.com.mallik.BasicConcepts;

import java.util.Scanner;
import java.util.Scanner;

public class LargestOfTwoNumbers {

    static int a;
    static int b;

    public static void LargeNumber() {
        if (a > b) {
            System.out.println("The biggest number is " + a);
        } else if (a < b) {
            System.out.println("The biggest number is " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        b = scanner.nextInt();

        LargeNumber();

        scanner.close();
    }
}
