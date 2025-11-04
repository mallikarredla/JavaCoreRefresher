package main.java.com.mallik.JavaCollectionFrameworks;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.Callable;

public class RemoveDuplicates {
    public static void main(String[] args) {
      List<String>M1=new ArrayList<>(List.of("ANIL","ANIL","Anil","AnIL","Bob","Danny"));
      Set<String>M2=new LinkedHashSet<>(M1);
      List<String>M3=new ArrayList<>(M2);
        System.out.println("the Original List :" +M1 );
        System.out.println("After sorting using Map :" +M2);
        System.out.println("Final Strings After Sorting : " +M3);

Collections.sort(M3);
        System.out.println(M3);

        };

    }

//After sorting using Collections.sort
//after Merging Using add.All
//after Removing duplicates using Set<String> S1=new LinkedHashSet<>(M1);