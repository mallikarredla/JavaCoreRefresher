package main.java.com.mallik.BasicConcepts;

import java.util.ArrayList;
import java.util.HashMap;

public class NonRepeatingNumbers {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        HashMap<Integer,Integer>repeatingNumbers=new HashMap<>();
        for(int num:numbers) {
            repeatingNumbers.put(num, repeatingNumbers.getOrDefault(num, 0) + 1);
        }
        System.out.println("Non repeating numbers: ");
        for (int num:numbers){
            
            if(repeatingNumbers.get(num)==1){
                System.out.println(num);
            }
        }


    }
}
