package main.java.com.mallik.JavaCollectionFrameworks;
import java.util.*;

import java.util.*;

public class CountWordFrequency {
    public static void main(String[] args) {
        String text = "apple,banana,apple,banana,orange,dates";
        Map<String, Integer> rare = new HashMap<>();

        for (String word : text.split(",")) { // split by comma
            rare.put(word, rare.getOrDefault(word, 0) + 1);
        }

        System.out.println(rare);
    }
}
//for(String word : text.split(",")){
//rare.put(word,rare.getOrDefault(word, 0)+1);
//}
//sout(rare);