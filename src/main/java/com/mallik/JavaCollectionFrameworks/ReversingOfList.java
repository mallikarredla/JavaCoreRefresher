package main.java.com.mallik.JavaCollectionFrameworks;
import java.util.*;

public class ReversingOfList {
    public static void main(String[] args) {
        List<Integer> L1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        Collections.reverse(L1);
        System.out.println(L1);
        List<String> M8 = new ArrayList<>(List.of("AJay","Vijay"));
        Collections.reverse(M8);
        System.out.println(M8);
        Collections.sort(M8);
        System.out.println(M8);
        Collections.shuffle(M8);
        System.out.println(M8);
        Collections.min(L1);
        System.out.println(M8);
        Collections.max(L1);
        System.out.println(M8);
        Collections.replaceAll(M8,"AJay","Vijay");
        System.out.println(M8);


        }
    }
