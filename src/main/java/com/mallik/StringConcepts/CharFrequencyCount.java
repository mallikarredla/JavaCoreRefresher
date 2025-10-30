package main.java.com.mallik.StringConcepts;

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyCount {
    public static void main(String[] args) {
        String str="Thiruvananthapuram";

        Map<Character, Integer> freq=new HashMap<>();

        for(char c:str.toCharArray())
            freq.put(c, freq.getOrDefault(c,0)+1);
        System.out.println(freq);
    }
}