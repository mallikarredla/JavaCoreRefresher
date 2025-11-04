package main.java.com.mallik.JavaCollectionFrameworks;
import java.util.*;
public class SortUsingTreeSet {
    public static void main(String[] args) {
        Set<String>words=new TreeSet<>(List.of("Dog","apple","cat"));
        System.out.println(words);
    }
}
//Here in the TreeSet, Treeset follows case sensitive, and Caps Letters had more preference that small Letters.