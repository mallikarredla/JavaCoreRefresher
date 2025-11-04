package main.java.com.mallik.JavaCollectionFrameworks;
import java.util.*;

public class SortByKeys {

    public static void main(String[] args) {
        Map< Integer, String> smallmap=new TreeMap<>();
        smallmap.put(80, "Adam");
        smallmap.put(79, " Laurie");
        smallmap.put(88," mark");
        System.out.println(smallmap);

    }
}
//Sorting by using TreeMap
// taking a map Interface with Integer and String, and mapping them as key value pairs using TreeMap(); and sorting.