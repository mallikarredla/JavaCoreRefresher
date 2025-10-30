package main.java.com.mallik.BasicConcepts;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (temp == reversed)
            System.out.println("the number is palindrome ");
            else
            System.out.println("the number is not a palindrome");

        }
    }
