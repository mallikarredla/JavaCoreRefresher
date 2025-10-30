package main.java.com.mallik.StringConcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Integers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,5,4,1);
        Collections.sort(numbers);
        Collections.max(numbers);
        Collections.min(numbers);
        Collections.reverse(numbers);
        Collections.shuffle(numbers);
        System.out.println("the numbers are "+numbers);
    }

}
