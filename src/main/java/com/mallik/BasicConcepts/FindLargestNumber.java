package main.java.com.mallik.BasicConcepts;

import java.util.Arrays;

public class FindLargestNumber {
        public static void main(String[] args) {
            int[] s = {100, 200, 300, 400};

            int largest = s[0]; // assume first element is the largest initially

            for (int i = 1; i < s.length; i++) {
                if (s[i] > largest) {
                    largest = s[i];
                }
            }

            System.out.println("The largest number is: " + largest);
        }
    }
