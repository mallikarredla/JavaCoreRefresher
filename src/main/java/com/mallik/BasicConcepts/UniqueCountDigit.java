package main.java.com.mallik.BasicConcepts;

import java.util.HashSet;
import java.util.Set;

public class UniqueCountDigit {


    public static void main(String[] args) {
        int num = 1122334455;
        System.out.println("the given number is " +num);
        System.out.println("The unique elemts are "+UniqueElements( num));

    }
    public static int UniqueElements(int num) {
        Set<Integer> digits = new HashSet<>();
        while (num != 0) {
            int digit = num % 10;
            digits.add(digit);
            num /= 10;
        }
        return digits.size();
    }
}