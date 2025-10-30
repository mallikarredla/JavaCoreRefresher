package main.java.com.mallik.StringConcepts;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Malli");
        names.add("Malli");
        names.add("Shiva");
        names.add("neel");
        names.add("kumar");


        System.out.println(names);
    }

}

//List is an Interface where it may implements ArrayList, LinkedList, Vector and stack.
//Duplicates are allowed
//Fast random access
//Stores in an order
//Slow for insertion and deletion.
