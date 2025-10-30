package main.java.com.mallik.BasicConcepts;

public class LargestOfThreeNumbers {

        public static void main(String[] args) {
            int a = 25, b = 52, c = 19;
            int d=42, e=43,f=44;
            int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int    largest1 = (d>e)?(d>e?d:f):(e>f?e:d);
                    System.out.println("Largest number is: " + largest);
            System.out.println("Largest number is: " + largest1);

        }
    }






