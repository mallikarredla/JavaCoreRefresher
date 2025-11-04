package main.java.com.mallik.JavaCollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


   public class ListOfNames{
       public static void main(String[] args) {
           List<String> names=new ArrayList<>();
           names.add("Bob");
           names.add("Cat");
           names.add("Cat");
           names.add("Alice");
           names.add("dany");
           Collections.sort(names);
           System.out.println(names);

           Collections.sort(names,(a,b)->a.compareTo(b));
           System.out.println(names);
       }
   }


   //Sorting can be done by two ways in collections, First one is by natural Ordering (Comparable) second one is Using Comparator. Custom one
//In this we use Collections.sort( names, (a,b)->b.compareTo(a));