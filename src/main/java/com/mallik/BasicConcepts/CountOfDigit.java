package main.java.com.mallik.BasicConcepts;

public class CountOfDigit {
        public static void main(String[] args) {
            int num = 987654;
            int count = 0;
            while (num != 0) {
                num /= 10;
                count++;
            }
            System.out.println("Number of digits: " + count);
        }
    }
