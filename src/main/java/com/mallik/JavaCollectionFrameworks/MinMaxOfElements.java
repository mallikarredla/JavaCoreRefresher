package main.java.com.mallik.JavaCollectionFrameworks;

import main.java.com.mallik.StringConcepts.Integers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MinMaxOfElements {
    public static void main(String[] args) {

        //List<Integer> nums=List.of(1,2,3,4,5,6,7);
        List<Integer>num=new ArrayList<>(List.of(1,2,3,4,5,6,7));
       // Collections.max(num);
        System.out.println(Collections.max(num));
        //Collections.min(num);
        System.out.println(Collections.min(num));
    }
}
//Finding the Max and Min Values using Sout(Collections.max(num));