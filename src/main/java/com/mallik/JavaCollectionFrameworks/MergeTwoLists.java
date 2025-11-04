package main.java.com.mallik.JavaCollectionFrameworks;
import java.util.*;
public class MergeTwoLists {
    public static void main(String[] args) {
        List<Integer> L1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> L2 = new ArrayList<>(List.of(6, 7, 8));
        List<String>S1=new ArrayList<>(List.of("Alice","Bob","Catthy","Dany"));
        List<String>S2=new ArrayList<>(List.of("Elon"));
       // L1.addAll(L2);
        //S1.addAll(S2);
        L2.addAll(L1);
        S2.addAll(S1);
        L1.addAll(L2);
        S1.addAll(S2);
        System.out.println(L1);
        System.out.println(S1);
        System.out.println(L2);
        System.out.println(S2);
    }
}


//here we are using MergeSort
//Mergesort using the utility method as addAll.
//List<String>S6=new ArrayList<>(List.of("Anil","Sunil");