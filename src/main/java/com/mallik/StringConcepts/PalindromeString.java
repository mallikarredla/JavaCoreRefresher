package main.java.com.mallik.StringConcepts;

public class PalindromeString {

    public static void main(String[] args) {
        String abc= "malayalam";
        String reversed=new StringBuilder(abc).reverse().toString();
        if(abc.equalsIgnoreCase(reversed))
            System.out.println("The given string " +abc+ " is a palindrome");
        else
            System.out.println("the given string " +abc+ " is not a palindrome");


    }
}
