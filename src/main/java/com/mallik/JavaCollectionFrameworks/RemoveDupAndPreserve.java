package main.java.com.mallik.JavaCollectionFrameworks;
import java.util.*;

public class RemoveDupAndPreserve {
    public static void main(String[] args) {
        List<Integer>L9=new ArrayList<>(List.of(1,1,2,2,3,4,5,6,6,5,4,3));
        Set<Integer> S1=new HashSet<>(L9);
        List<Integer>S2=new ArrayList<>(S1);
        System.out.println("The elements before removing duplicates are : " +L9);
        System.out.println("The elements after removing duplicates are :" +S2);
    }
}
//Removed the duplicates and preserved the order.