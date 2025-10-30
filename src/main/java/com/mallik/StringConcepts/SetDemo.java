package main.java.com.mallik.StringConcepts;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String>names=new LinkedHashSet<>();
        List<String>names1=new ArrayList<>();
        names1.add("Malli");
        names1.add("Malli2");
        names.add("Malli");
        names.add("Malli3");
        names.add("Malli4");
        System.out.println("the names are " +names);
        System.out.println("the names are " +names1);

    }

}
//Hashset doesnot allow the duplicates and doesnot maintain insertion order
//LinkedHashSet doesnot allow the duplicates but maintain insertion order
//ArryaList is for fast random access slow for insertion and deletion
//LinkedList is for insertion and deletion, slower for fast random access
