package main.java.com.mallik.JavaCollectionFrameworks;
import javax.naming.NamingEnumeration;
import java.util.*;
public class SortAMapByValues {
    public static void main(String[] args) {
        Map<String, Integer>map=new HashMap<>(Map.of("A",10,"B",8,"C",15));
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e-> System.out.println(e.getKey()+" ->" +e.getValue()));
    }
}
//Sorting by using custom compaartor, ComparingByValue()