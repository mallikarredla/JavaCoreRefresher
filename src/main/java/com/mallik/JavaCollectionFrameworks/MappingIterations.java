package main.java.com.mallik.JavaCollectionFrameworks;
import javax.swing.*;
import java.util.*;

public class MappingIterations {
    public static void main(String[] args) {
        Map<String, Integer>map=Map.of("A",1,"B",2,"C",3);
      for(Map.Entry<String, Integer>e: map.entrySet()){
          System.out.println(e.getKey()+ " ->" + e.getValue());
      }
Map<Integer, String>map1=Map.of(1,"Alpha Male", 2, "Beta Male", 3, "Gamma Male");
      for(Map.Entry<Integer, String>e1:map1.entrySet()){
          System.out.println(e1.getKey()+ " ->" +e1.getValue());
      }
    }
}
//In this case, we take some list of Strings and Integers via map and we will map Strings to Integers and Vice versa. we use for loop here.