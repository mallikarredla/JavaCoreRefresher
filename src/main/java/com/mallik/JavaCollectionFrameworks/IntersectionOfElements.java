package main.java.com.mallik.JavaCollectionFrameworks;
import java.util.*;
public class IntersectionOfElements {
    public static void main(String[] args) {
        List<String>fruits1=new ArrayList<>(List.of("Apple","Banana","Carrot","dates"));
        List<Integer>nums1=new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer>nums2=new ArrayList<>(List.of(2,3,4,5));
        List<String>fruits2=new ArrayList<>(List.of("Banana","Dates"));
        fruits1.retainAll(fruits2);
        System.out.println(fruits1);
        nums1.retainAll(nums2);
        System.out.println(nums1);
        nums2.retainAll(nums1);
        System.out.println(nums2);
        nums2.retainAll(nums1);
        System.out.println(nums1);

    }
}
//Retaining is a concept of Picking the common properties, sorting and printing them all.
