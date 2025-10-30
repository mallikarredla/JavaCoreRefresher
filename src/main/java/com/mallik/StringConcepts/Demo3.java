package main.java.com.mallik.StringConcepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
       List<Integer>num= Arrays.asList(8,9,7,6,5);
       Integer i=num.stream().sorted(Comparator.comparing(Integer:: intValue).reversed()).skip(1).findFirst().get();
        System.out.println(i);
    }

}

